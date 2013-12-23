package cn.guoyukun.util.xml2map.convert.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.convert.Converter;
import cn.guoyukun.util.xml2map.rule.Rule;

public class RegexConverter implements Converter {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(RegexConverter.class);
	public static final String TYPE = "regex";

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public Object convert(ConvertContext cxt, Rule rule)
			throws ConvertException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMinParamsCount() {
		return 1;
	}

}
