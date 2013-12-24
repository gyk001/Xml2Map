package cn.guoyukun.util.xml2map.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Element;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.convert.Converter;
import cn.guoyukun.util.xml2map.convert.ConverterHolder;
import cn.guoyukun.util.xml2map.decorator.Decorator;
import cn.guoyukun.util.xml2map.decorator.DecoratorHolder;
import cn.guoyukun.util.xml2map.rule.Rule;
import cn.guoyukun.util.xml2map.rule.RuleGroup;



/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 2, 2013
 * 
 */
public class ConvertUtil {
	public static Map<String, Object> convert(ConvertContext cxt,
			Element element, RuleGroup group) throws ConvertException {
		Map<String, Object> target = new HashMap<String, Object>();
		List<Rule> rules = group.getRules();
		for (Rule rule : rules) {
			Object val = convert(cxt, element, rule);
			target.put(rule.getKey(), val);
		}
		return target;
	}

	public static Object convert(ConvertContext cxt, Element element,
			Rule rule) throws ConvertException {
		// 取得配置的转换器类型
		String converterType = rule.getConverter();
		// 取得配置的参数个数
		int paramsCount = rule.getParams() == null ? 0 : rule.getParams().length;

		if (converterType == null || converterType.trim().isEmpty()) {
			switch (paramsCount) {
			case 0:
				// 不配置转换器,没有参数约定为nope转换器
				converterType = "nope";
				break;
			case 1:
				// 不配置转换器，有一个参数约定为name转换器
				converterType = "name";
				break;
			default:
				// 不配置转换器，有一个以上的参数认为配置有误！
				throw new ConvertException("规则转换器不能为空:"+rule);
			}
		}
		Converter converter = ConverterHolder.getConvert(converterType);
		if (paramsCount < converter.getMinParamsCount()) {
			throw new ConvertException("参数不够，最少需要"
					+ converter.getMinParamsCount() + "个，实际有" + paramsCount + "个");
		}
		Object value = converter.convert(cxt, rule);
		Rule.Decorator[] decorators = rule.getDecorators();
		if(decorators!=null){
			for (Rule.Decorator decorator: decorators){
				Decorator d = DecoratorHolder.getDecorator(decorator.getType());
				value = d.decorate(value, decorator.getParams());
			}
		}
		return value;
	}
}
