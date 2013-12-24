package cn.guoyukun.util.xml2map.decorator.impl;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.guoyukun.util.xml2map.decorator.Decorator;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-24
 *
 */
public class RegexDecorator implements Decorator{
	//日志对象
	private static final Logger logger = LoggerFactory.getLogger(RegexDecorator.class);
	public static final String TYPE="regex";
	
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public Object decorate(Object obj, Object... params) {
		logger.debug("{},{},{}",params);
		String str = String.valueOf(obj);
		String regex = (String) params[0];
		return Pattern.compile(regex).split(str);
	}

}
