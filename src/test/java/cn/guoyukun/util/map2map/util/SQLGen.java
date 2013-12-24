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
public class SQLGen {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(SQLGen.class);
	
	@DataProvider(name = "test")
	public Object[][] createData1() {
		return new Object[][] {
				{"demo0","0"},
				{"demo1","1"},
			};
	}

	@Test(dataProvider="test")
	private void doTestConvert(String xml, String type) throws Exception{
		
		Document doc = XmlLoadUtil.loadXmlFromResource("/sqlgen/" +xml+".xml");
		Assert.assertNotNull(doc, "加载测试xml失败！");
		ConvertContext ctx = new ConvertContext(doc);
		RuleGroup group = RuleLoadUtil.loadRuleGroupFromResource("/convert/"
				+ type + "/rules.xml");
		Assert.assertNotNull(group, "加载规则失败！");
		Map<String, Object> actualMap = ConvertUtil.convert(ctx, doc.getRootElement(),
				group);
		
		String sqlTpl = load4String("/convert/" + type + "/tpl.sql");
		
		logger.trace(">> {}", sqlTpl);
		String parsedSQL = parseToSQL(sqlTpl, actualMap);
		logger.warn("\n=========== XML：{},类型：{} ========\n", xml, type);
		logger.warn("{}",parsedSQL);
		logger.warn("\n===================\n", xml, type);
	}
	
	
	private String parseToSQL(String sqlTpl, Map<String, Object> params){
		StringTemplateParser stp = new StringTemplateParser();
		String sql = stp.parse(sqlTpl,  StringTemplateParser.createMapMacroResolver(params));
		logger.debug(sql);
		return sql;
	}
	
	private String load4String(String resource) throws IOException{
		String sql = IOUtils.toString(SQLGen.class.getResourceAsStream(resource),Charset.forName("UTF-8"));
		return sql;
	}
}
