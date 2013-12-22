package cn.guoyukun.util.xml2map.convert;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.guoyukun.util.xml2map.ConvertException;


/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 3, 2013
 * 
 */
public class ConverterHolder {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(ConverterHolder.class);

	private static volatile Map<String, Converter> holder = null;

	public static Converter getConvert(String type) throws ConvertException {
		initIfNeeded();
		Converter converter = holder.get(type);
		if (converter == null) {
			throw new ConvertException(
					"\n无法取得["
							+ type
							+ "]转换器实例\n"
							+"\t请检查META-INF/services/"
							+Converter.class.getCanonicalName()
							+"及转换器getType方法\n\t已经加载的类型："+
							getAllCovertType());
		}
		return converter;
	};

	private synchronized static void  initIfNeeded() {
		if (holder == null) {
			load();
		}
	}

	private static void load() {
		holder = new HashMap<String, Converter>();
		ServiceLoader<Converter> converters = ServiceLoader
				.load(Converter.class);
		for (Converter converter : converters) {
			logger.debug("LOAD CONVERTER:{}", converter.getType());
			holder.put(converter.getType(), converter);
		}
	}
	
	private static String getAllCovertType(){
		Set<String> type = holder.keySet();
		return type.toString();
		
	}
}
