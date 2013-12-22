package cn.guoyukun.util.xml2map.convert.impl;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.UUID;

import cn.guoyukun.util.xml2map.ConvertContext;
import cn.guoyukun.util.xml2map.ConvertException;
import cn.guoyukun.util.xml2map.convert.Converter;
import cn.guoyukun.util.xml2map.rule.Rule;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 3, 2013
 *
 */
public class UUIDConverter implements Converter{
	private LinkedList<String> cachedUUID = new LinkedList<String>();
	
	public UUIDConverter() {
		super();
		checkQueueEmpty();
	}

	@Override
	public Object convert(ConvertContext ctx, Rule rule) throws ConvertException{
		try {
			return cachedUUID.remove();
		} catch (NoSuchElementException e) {
			checkQueueEmpty();
			try {
				return cachedUUID.remove();
			} catch (NoSuchElementException e1) {
				throw new ConvertException("UUID缓存队列为空",e1);
			}
		}
	}

	@Override
	public String getType() {
		return "uuid";
	}

	/**
	 * 取得下一个UUID，不会删除
	 * @return
	 * @throws Exception
	 */
	public String getNextUUID(){
		try {
			return cachedUUID.element();
		} catch (NoSuchElementException e) {
			checkQueueEmpty();
			return cachedUUID.element();
		}
	}
	public String dropAnUUID(){
		try {
			return cachedUUID.remove();
		} catch (NoSuchElementException e) {
			checkQueueEmpty();
			return cachedUUID.remove();
		}
	}
	
	/**
	 * 取得特定的UUID
	 * @param index
	 * @return
	 * @throws Exception
	 */
	public String getUUIDByPositon(int index) throws Exception{
		while(cachedUUID.size()<=index){
			checkQueueEmpty(true);
		}
		return cachedUUID.get(index);
	}

	private void checkQueueEmpty(){
		checkQueueEmpty(false);
	}
	
	private void checkQueueEmpty(boolean force){
		if(cachedUUID.size()<1 || force){
			for(int i=0; i<1; i++){
				cachedUUID.offer(UUID.randomUUID().toString());
			}
		}
	}

	@Override
	public int getMinParamsCount() {
		return 0;
	}
	
	
}
