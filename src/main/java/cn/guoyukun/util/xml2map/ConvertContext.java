package cn.guoyukun.util.xml2map;

import java.util.HashMap;
import java.util.Map;

import org.jdom2.Document;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-22
 *
 */
public class ConvertContext extends HashMap<String, Object>{
	private static final long serialVersionUID = 479314898213673840L;
	
	public ConvertContext(Document sourceDocument) {
		super();
		this.sourceDocument = sourceDocument;
		this.targetMap = new HashMap<String, Object>();
	}
	final private Document sourceDocument;
	final private Map<String,Object> targetMap ;
	
	public Document getSourceDocument() {
		return sourceDocument;
	}
	
	public Map<String, Object> getTargetMap() {
		return targetMap;
	}
	
}
