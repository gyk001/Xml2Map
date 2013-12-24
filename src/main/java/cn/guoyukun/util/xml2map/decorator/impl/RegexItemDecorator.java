package cn.guoyukun.util.xml2map.decorator.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.decorator.Decorator;
import cn.guoyukun.util.xml2map.decorator.DecoratorHolder;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-24
 *
 */
public class RegexItemDecorator implements Decorator{
	public static final String TYPE="regex-item";
	//日志对象
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RegexItemDecorator.class);
	private Decorator regex;
	private Decorator item;
	
	public RegexItemDecorator(){
		try {
			regex = DecoratorHolder.getDecorator(RegexDecorator.TYPE);
			item = DecoratorHolder.getDecorator(ItemDecorator.TYPE);
		} catch (ConvertException e) {
			throw new RuntimeException("asdfds");
		}
	}
	
	
	
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public Object decorate(Object obj, Object... params) {
		Object x =  regex.decorate(obj, params[0]);
		return item.decorate(x, params[1]);
	}

}
