package cn.guoyukun.util.xml2map.decorator;

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
public class DecoratorHolder {
	// 日志对象
	private static final Logger logger = LoggerFactory
			.getLogger(DecoratorHolder.class);

	private static volatile Map<String, Decorator> holder = null;

	public static Decorator getDecorator(String type) throws ConvertException {
		initIfNeeded();
		Decorator decorator = holder.get(type);
		if (decorator == null) {
			throw new ConvertException(
					"\n无法取得["
							+ type
							+ "]装饰器实例\n"
							+"\t请检查META-INF/services/"
							+Decorator.class.getCanonicalName()
							+"及转换器getType方法\n\t已经加载的类型："+
							getAllCovertType());
		}
		return decorator;
	};

	private synchronized static void  initIfNeeded() {
		if (holder == null) {
			load();
		}
	}

	private static void load() {
		holder = new HashMap<String, Decorator>();
		ServiceLoader<Decorator> decorators = ServiceLoader
				.load(Decorator.class);
		for (Decorator decorator : decorators) {
			logger.debug("LOAD Decorator:{}", decorator.getType());
			holder.put(decorator.getType(), decorator);
		}
	}
	
	private static String getAllCovertType(){
		Set<String> type = holder.keySet();
		return type.toString();
		
	}
}
