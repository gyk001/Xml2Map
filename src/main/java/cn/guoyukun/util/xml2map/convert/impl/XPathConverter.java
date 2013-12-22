package cn.guoyukun.util.xml2map.convert.impl;

import java.util.List;

import org.jdom2.Content;
import org.jdom2.Element;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.jdom2.xpath.jaxen.JaxenXPathFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.convert.Converter;
import cn.guoyukun.util.xml2map.rule.Rule;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-22
 *
 */
public class XPathConverter implements Converter{
	//日志对象
	private static final Logger logger = LoggerFactory.getLogger(XPathConverter.class);
	public static final String TYPE="xpath";
	private static final XPathFactory factory = JaxenXPathFactory.instance();  
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public Object convert(ConvertContext cxt, Rule rule)
			throws ConvertException {
		String xpath = (String ) rule.getParams()[0];
		logger.debug("xpath: {}",xpath);
		XPathExpression<Object> objs = factory.compile(xpath); 
		List<Object> objList = objs.diagnose(cxt.getSourceDocument(), false).getResult();
		logger.debug(">> {}",objList);
		if(objList==null){
			return null;
			
		}
		for(Object obj :objList){
			if(obj instanceof Element){
				return ((Element) obj).getValue();
			}else if(obj instanceof Content){
				return ((Content) obj).getValue();
			}
		}
		return "XXXX";
	}

	@Override
	public int getMinParamsCount() {
		return 1;
	}

}
