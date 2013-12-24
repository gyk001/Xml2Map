package cn.guoyukun.util.map2map.convert.impl;

import junit.framework.Assert;

import org.testng.annotations.Test;

import cn.guoyukun.util.xml2map.convert.impl.UUIDConverter;
/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-24
 *
 */
public class UUIDConverterTest {

	UUIDConverter c = new UUIDConverter();

	@Test
	public void getNextUUID() throws Exception {
		String next = c.getNextUUID();
		String index0 = c.getUUIDByPositon(0);
		Assert.assertEquals(index0, next);
	}

	@Test
	public void getUUIDByPositon() throws Exception {
		String index1 = c.getUUIDByPositon(1);
		c.dropAnUUID();
		String next = c.getNextUUID();
		Assert.assertEquals(index1, next);

	}
}
