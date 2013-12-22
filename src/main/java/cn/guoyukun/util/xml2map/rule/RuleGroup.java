package cn.guoyukun.util.xml2map.rule;

import java.util.Arrays;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 4, 2013
 *
 */
@XStreamAlias("group")
public class RuleGroup extends Rule{
	private List<Rule> rules;
	
	
	public List<Rule> getRules() {
		return rules;
	}
	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((rules == null) ? 0 : rules.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RuleGroup other = (RuleGroup) obj;
		if (rules == null) {
			if (other.rules != null)
				return false;
		} else if (!equalsRules(other.rules))
			return false;
		return true;
	}
	
	public boolean equalsRules(List<Rule> otherRules){
		if(this.rules.size()!= otherRules.size()){
			return false;
		}
		if(!this.rules.containsAll(otherRules)){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "RuleGroup [rules=" + rules + ", getId()=" + getId()
				+ ", getKey()=" + getKey() + ", getConverter()="
				+ getConverter() + ", getParams()="
				+ Arrays.toString(getParams()) + "]";
	}
	
	
	
	
	
}
