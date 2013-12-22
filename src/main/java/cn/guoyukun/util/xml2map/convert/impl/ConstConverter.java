package cn.guoyukun.util.xml2map.convert.impl;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.convert.Converter;
import cn.guoyukun.util.xml2map.rule.Rule;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 3, 2013
 *
 */
public class ConstConverter implements Converter{
	
	@Override
	public Object convert(ConvertContext ctx, Rule rule) throws ConvertException{
		try {
			Object constValue = rule.getParams()[0];
			return constValue;
		} catch (Exception e) {
			throw new ConvertException("提取参数常量失败!", e);
		}
	}

	@Override
	public String getType() {
		return "const";
	}

	@Override
	public int getMinParamsCount() {
		return 0;
	}

}
