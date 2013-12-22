package cn.guoyukun.util.map2map.util;


import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import cn.guoyukun.util.xml2map.rule.Rule;
import cn.guoyukun.util.xml2map.rule.RuleGroup;
import cn.guoyukun.util.xml2map.util.RuleLoadUtil;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 4, 2013
 * 
 */
public class RuleLoadUtilTest {

	@Test
	public void testloadSimpleRule() {
		Rule rule = RuleLoadUtil.loadRuleFromResource("/rule/rule.simple.xml");
		Assert.assertNotNull(rule);
		Assert.assertEquals(rule, buildSimpleRule());
	}
	
	@Test
	public void testloadCascadeRule() {
		Rule rule = RuleLoadUtil.loadRuleFromResource("/rule/rule.cascade.xml");
		Assert.assertNotNull(rule);
		Assert.assertEquals(rule, buildCascadeRule());
	}
	

	@Test
	public void testloadSimpleRuleGroup() {
		RuleGroup group = RuleLoadUtil.loadRuleGroupFromResource("/rulegroup/group.simple.xml");
		Assert.assertNotNull(group);
		Assert.assertEquals(group, buildSimpleRuleGroup());
	}
	
	@Test
	public void testloadRuleGroupWithRules() {
		RuleGroup group = RuleLoadUtil.loadRuleGroupFromResource("/rulegroup/group.withrules.xml");
		Assert.assertNotNull(group);
		Assert.assertEquals(group, buildRuleGroupWithRules());
	}
	
	private RuleGroup buildSimpleRuleGroup(){
		RuleGroup rule = new RuleGroup();
		rule.setConverter("test.converter");
		rule.setKey("test.key");
		rule.setParams(new Object[] { "param000", 14L });
		rule.setId("test.id");
		return rule;
	}
	
	
	private RuleGroup buildRuleGroupWithRules(){
		RuleGroup group = new RuleGroup();
		group.setConverter("p.converter");
		group.setKey("p.key");
		group.setParams(new Object[] { "param000", 14L});
		group.setId("p.id");
		List<Rule> rules = new ArrayList<Rule>();
		rules.add(buildSimpleRule());
		group.setRules(rules);
		return group;
	}
	
	private Rule buildSimpleRule(){
		Rule rule = new Rule();
		rule.setConverter("test.converter");
		rule.setKey("test.key");
		rule.setParams(new Object[] { "param000", 14L });
		rule.setId("test.id");
		return rule;
	}
	
	private Rule buildCascadeRule(){
		Rule rule = new Rule();
		rule.setConverter("p.converter");
		rule.setKey("p.key");
		rule.setParams(new Object[] { "param000", 14L, buildSimpleRule() });
		rule.setId("p.id");
		return rule;
	}
}
