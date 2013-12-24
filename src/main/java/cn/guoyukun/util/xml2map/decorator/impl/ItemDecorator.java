package cn.guoyukun.util.xml2map.decorator.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.guoyukun.util.xml2map.decorator.Decorator;

public class ItemDecorator implements Decorator{
	//日志对象
	private static final Logger logger = LoggerFactory.getLogger(ItemDecorator.class);
	public static final String TYPE = "item";
	
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public Object decorate(Object obj, Object... params) {
		logger.debug("ITEM--> {},{}", obj, params);
		if(obj instanceof Object[]){
			Integer index =(Integer)params[0];
			Object[] arr = (Object[])obj;
			if(arr.length <= index){
				return null;
			}
			return arr[index];
		}else if(obj instanceof Map){
			String key = (String) params[0];
			return ((Map)obj).get(key);
		}
		throw new RuntimeException("不支持的类型："+obj.getClass());
	}

}
