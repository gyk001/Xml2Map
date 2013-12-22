package cn.guoyukun.util.xml2map.rule;

import java.util.Arrays;

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
	@Override
	public String toString() {
		return "Rule [id=" + id + ", key=" + key + ", converter=" + converter
				+ ", params=" + Arrays.toString(params) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((converter == null) ? 0 : converter.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + Arrays.hashCode(params);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rule other = (Rule) obj;
		if (converter == null) {
			if (other.converter != null)
				return false;
		} else if (!converter.equals(other.converter))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (!Arrays.equals(params, other.params))
			return false;
		return true;
	}
	
	
	
}
