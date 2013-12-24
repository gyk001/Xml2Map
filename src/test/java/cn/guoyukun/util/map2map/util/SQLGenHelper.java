package cn.guoyukun.util.map2map.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

import jodd.util.StringTemplateParser;

import org.apache.commons.io.IOUtils;
import org.jdom2.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.rule.RuleGroup;
import cn.guoyukun.util.xml2map.util.ConvertUtil;
import cn.guoyukun.util.xml2map.util.RuleLoadUtil;
import cn.guoyukun.util.xml2map.util.XmlLoadUtil;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 4, 2013
 * 
 */
public class SQLGenHelper {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(SQLGenHelper.class);
	
	

	public static void main(String[] args) throws Exception {
		doTestConvert("demo0", "0");
	}
	
	
	private static void doTestConvert(String xml, String type) throws Exception{
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
	
	
	private static String parseToSQL(String sqlTpl, Map<String, Object> params){
		StringTemplateParser stp = new StringTemplateParser();
		String sql = stp.parse(sqlTpl,  StringTemplateParser.createMapMacroResolver(params));
		logger.debug(sql);
		return sql;
	}
	
	private static String load4String(String resource) throws IOException{
		String sql = IOUtils.toString(SQLGenHelper.class.getResourceAsStream(resource),Charset.forName("UTF-8"));
		return sql;
	}
}
