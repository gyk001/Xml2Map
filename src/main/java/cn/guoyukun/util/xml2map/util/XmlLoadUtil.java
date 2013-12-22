package cn.guoyukun.util.xml2map.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-22
 * 
 */
public class XmlLoadUtil {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(XmlLoadUtil.class);
	private static final SAXBuilder SAX_BUILDER = new SAXBuilder();

	static public Document loadXmlFromResource(String path) throws Exception {
		InputStream is = XmlLoadUtilTest.class.getResourceAsStream(path);
		
		try {
			Document dataXml = SAX_BUILDER.build(new InputStreamReader(is, "UTF-8"));
			return dataXml;
		} catch (JDOMException e1) {
			logger.warn("解析Xml["+path+"]失败！");
			throw e1;
		} catch (IOException e1) {
			logger.warn("读取Xml["+path+"]失败！");
			throw e1;
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				logger.error("关闭输入流[" + path + "]失败", e);
			}
		}

	}
}
