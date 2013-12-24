package cn.guoyukun.util.map2map.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import jodd.util.StringTemplateParser;

import org.apache.commons.io.IOUtils;
import org.jdom2.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.convert.ConverterHolder;
import cn.guoyukun.util.xml2map.convert.impl.UUIDConverter;
import cn.guoyukun.util.xml2map.rule.RuleGroup;
import cn.guoyukun.util.xml2map.util.ConvertUtil;
import cn.guoyukun.util.xml2map.util.LineTrimUtil;
import cn.guoyukun.util.xml2map.util.RuleLoadUtil;
import cn.guoyukun.util.xml2map.util.XmlLoadUtil;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 4, 2013
 * 
 */
public class ConvertUtilTest {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(ConvertUtilTest.class);
	private final static  SimpleDateFormat SDF_DATE = new SimpleDateFormat("yyyy-MM-dd");
	
	@DataProvider(name = "test")
	public Object[][] createData1() {
		return new Object[][] { 
				/*{ "nope" }, 
				{ "name" },
				{ "flat" },
				{ "hierarchy" },
				{"0"},
				{"1"},
				 */
				{"2"},
				{"3"}
			};
	}

	@Test(dataProvider = "test")
	public void convert(String folder) throws Exception {
		doTestConvert(folder);
	}
	
	@Test(enabled=false)
	@SuppressWarnings("serial")	
	public void testUUIDConverter() throws Exception{
		final UUIDConverter c = (UUIDConverter) ConverterHolder.getConvert("uuid");
		// 取得预期的结果,详见测试数据
		Map<String, Object>  overrideExpectedTargetMap = new HashMap<String,Object>(){{
			put("U1", c.getUUIDByPositon(0));
			put("U2", c.getUUIDByPositon(1));
			put("U3", c.getUUIDByPositon(2));
			put("U4", c.getUUIDByPositon(3));
		}};
		doTestConvert("uuid", overrideExpectedTargetMap);
	}
	
	@Test(enabled=false)
	@SuppressWarnings("serial")	
	public void testTargetAndSourceTimeStampConverter() throws Exception{
		//target目标
		final Date d = SDF_DATE.parse("1988-06-06");
		//src目标
		final java.sql.Timestamp dateTime = new java.sql.Timestamp(new Date().getTime());
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//		final Date d = new SimpleDateFormat("yyyy-MM-dd").parse("1988-03-07");
		// 取得预期的结果,详见测试数据
		Map<String, Object>  overrideExpectedTargetMap = new HashMap<String,Object>(){{
			put("TARTDAY", new  Timestamp( d.getTime() ));
		}};
		Map<String, Object>  overrideSourceMap = new HashMap<String,Object>(){{
			put("TARBIRTHDAY", sdf.format(dateTime));
		}};
		doTestConvert( "type-name", overrideExpectedTargetMap, overrideSourceMap);
	}
	
//	@Test
//	@SuppressWarnings("serial")	
//	public void testSrcTimeStampConverter() throws Exception{
//		final java.sql.Timestamp dateTime = new java.sql.Timestamp(new Date().getTime());
//		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		// 取得预期的结果,详见测试数据
//		Map<String, Object>  overrideSourceMap = new HashMap<String,Object>(){{
//			put("TARBIRTHDAY", sdf.format(dateTime));
//		}};
//		doTestConvert("type-name", null, overrideSourceMap);
//	}
	
	
	/**
	 * 以testFolder文件夹下的测试数据进行测试 <br/>
	 * src.json为测试输入数据 <br/>
	 * target.json为预期的输出数据 <br/>
	 * rules.xml为转换规则 <br/>
	 * @param testFolder
	 * @throws Exception
	 */
	private void doTestConvert(String testFolder) throws Exception{
		doTestConvert(testFolder, null);
	}
	
	private void doTestConvert(String testFolder, Map<String, Object> overrideExpectedTargetMap) throws Exception{
		doTestConvert(testFolder, overrideExpectedTargetMap, null);
	}
	
	/**
	 * 以testFolder文件夹下的测试数据进行测试 <br/>
	 * src.json为测试输入数据 <br/>
	 * target.json为预期的输出数据 <br/>
	 * rules.xml为转换规则 <br/>
	 * @param testFolder 测试文件所在的文件夹
	 * @param overrideExpectedTargetMap  需要覆盖的结果,<br/>
	 * 	部分测试结果是动态的，静态json文件无法表达，所以需要进行动态覆盖
	 * @param overrideSourceMap 需要覆盖测试数据,<br/>
	 * 	部分测试结果是动态的，静态json文件无法表达，所以需要进行动态覆盖
	 * @throws Exception
	 */
	private void doTestConvert(String testFolder, Map<String, Object> overrideExpectedTargetMap,  Map<String, Object> overrideSourceMap) throws Exception{
		logger.debug("测试场景：{}", testFolder);
		Document doc = XmlLoadUtil.loadXmlFromResource("/convert/" + testFolder + "/src.xml");
		
		Map<String, Object> expectedTarget = TestResourceLoadUtil
				.loadTestTableData("/convert/" + testFolder + "/target.json");
		
		Assert.assertNotNull(doc, "加载测试xml失败！");
		Assert.assertNotNull(expectedTarget, "加载期望结果失败！");
		// 断言之前先覆盖期望结果里需要覆盖的属性，
		// 比如UUID转换器，结果是动态的，静态json文件无法表达，所以需要进行动态覆盖
		if(overrideExpectedTargetMap!=null){
			for(Entry<String,Object> entry: overrideExpectedTargetMap.entrySet()){
				expectedTarget.put(entry.getKey(), entry.getValue());
			}
		}
		
		/*
		if(overrideSourceMap!=null){
			for(Entry<String,Object> entry: overrideSourceMap.entrySet()){
				srcMap.put(entry.getKey(), entry.getValue());
			}
		}
 */
		
		ConvertContext ctx = new ConvertContext(doc);

		RuleGroup group = RuleLoadUtil.loadRuleGroupFromResource("/convert/"
				+ testFolder + "/rules.xml");
		Assert.assertNotNull(group, "加载规则失败！");
		Map<String, Object> actualMap = ConvertUtil.convert(ctx, doc.getRootElement(),
				group);
		//TODO: 暂时关闭
		//Assert.assertEquals(actualMap, expectedTarget, testFolder+"转换失败");
		
		String sqlTpl = load4String("/convert/" + testFolder + "/tpl.sql");
		String expectedSQL = load4String("/convert/" + testFolder + "/target.sql");
		
		logger.trace(">> {}", sqlTpl);
		String parsedSQL = parseToSQL(sqlTpl, actualMap);
		Assert.assertEquals(LineTrimUtil.trim(parsedSQL), LineTrimUtil.trim(expectedSQL), "转化侯sql不符");
	}
	
	
	private String parseToSQL(String sqlTpl, Map<String, Object> params){
		StringTemplateParser stp = new StringTemplateParser();
		String sql = stp.parse(sqlTpl,  StringTemplateParser.createMapMacroResolver(params));
		logger.debug(sql);
		return sql;
	}
	
	private String load4String(String resource) throws IOException{
		String sql = IOUtils.toString(ConvertUtilTest.class.getResourceAsStream(resource),Charset.forName("UTF-8"));
		return sql;
	}
}
