package cn.guoyukun.util.xml2map.decorator.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.decorator.Decorator;
import cn.guoyukun.util.xml2map.decorator.DecoratorHolder;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-24
 *
 */
public class RegexDecoratorTest {
	//日志对象
	private static final Logger logger = LoggerFactory.getLogger(RegexDecoratorTest.class);
	@Test
	public void decorate() throws ConvertException {
		
		Decorator regex = DecoratorHolder.getDecorator(RegexDecorator.TYPE);
		Object x =  regex.decorate("0|0|支", "\\|");
		Decorator item = DecoratorHolder.getDecorator(ItemDecorator.TYPE);
		Object xx = item.decorate(x, 1);
		logger.debug("{}",xx);
	}
}
