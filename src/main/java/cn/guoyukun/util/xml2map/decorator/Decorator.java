package cn.guoyukun.util.xml2map.decorator;


/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-24
 *
 */
public interface Decorator {
	String getType();
	Object decorate(Object obj, Object... params);
}
