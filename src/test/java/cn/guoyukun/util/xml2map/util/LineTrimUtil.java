package cn.guoyukun.util.xml2map.util;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-22
 *
 */
public class LineTrimUtil {
	//日志对象
	private static final Logger logger = LoggerFactory.getLogger(LineTrimUtil.class);
	
	public static String trim(String mutliLine){
		StringBuffer s = new StringBuffer();
		String[] string = mutliLine.split("\n");
		for(String line : string){
			String trimd = line.trim();
			logger.trace("-> @{}$", line);
			logger.trace("L> @{}$", trimd);
			if(! trimd.isEmpty()){
				s.append(trimd).append("\n");
			}
		}
		return  s.toString();
	};
}
