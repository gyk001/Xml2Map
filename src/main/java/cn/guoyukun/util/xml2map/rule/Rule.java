package cn.guoyukun.util.xml2map.rule;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 3, 2013
 *
 */
@XStreamAlias("rule")
public class Rule {
	
	private String id;
	// 目标map的键值
	private String key;
	// 转换器标识
	private String converter;
	// 参数
	private Object[] params;
	
	private Decorator[] decorators;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getConverter() {
		return converter;
	}
	public void setConverter(String converter) {
		this.converter = converter;
	}
	
	public Object[] getParams() {
		return params;
	}
	public void setParams(Object[] params) {
		this.params = params.clone();
	}
	

	public Decorator[] getDecorators() {
		return decorators;
	}
	public void setDecorators(Decorator[] decorators) {
		this.decorators = decorators;
	}


	@XStreamAlias("decorator")
	public static class Decorator {
		
		private String type;
		private Object[] params;
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Object[] getParams() {
			return params;
		}
		public void setParams(Object[] params) {
			this.params = params;
		}
		
	}
	
}


