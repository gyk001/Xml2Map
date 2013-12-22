/**
 * 
 */
package cn.guoyukun.util.map2map.util;

import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

/**
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version Dec 2, 2013
 * 
 */
public class TestResourceLoadUtil {

	private static final Gson GSON = new Gson();
	
	/**
	 * 加载测试表数据
	 * @param jsonFile
	 * @return
	 * @throws Exception
	 */
	public static Map<String,Object> loadTestTableData(String jsonFile) throws Exception{
		@SuppressWarnings("serial")
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		String json = loadStringFromResource(jsonFile);
		Map<String,Object> objColInfo = GSON.fromJson(json, type);
		changeType(objColInfo);
		return objColInfo;
	}
	
	public static void changeType(Map<String,Object> objColInfo){
		for(Entry<String, Object> entry : objColInfo.entrySet()){
			Object value = entry.getValue();
			if(value instanceof Double){
			  Double doubleValue = (Double)value;
			  int intValue = doubleValue.intValue();
			  if(doubleValue.equals(intValue)){
				  BigDecimal bd = new BigDecimal(intValue);
				  entry.setValue(bd);
			  }else{
				  BigDecimal bd = new BigDecimal(doubleValue);
				  entry.setValue(bd);
			  }
			}else if(value instanceof Map){
				@SuppressWarnings("unchecked")
				Map<String, Object> childMap = (Map<String, Object>) value;
				changeType(childMap);	
			}
	}}
	
	/**
	 * 加载测试 表匹配结果
	 * @param jsonFile
	 * @return
	 * @throws Exception
	 */
	//public static MatchResult loadDemoMatchResult(String jsonFile) throws Exception{
	//	return MatchTable.jsonToMatchResult(loadStringFromResource(jsonFile));
	//}
	
	/**
	 * 加载资源文件为字符串
	 * @param resource
	 * @return
	 * @throws Exception
	 */
	public static String loadStringFromResource(String resource) throws Exception{
		InputStream is = TestResourceLoadUtil.class.getResourceAsStream(resource);
		StringWriter writer = new StringWriter();
		IOUtils.copy(is, writer, "UTF-8");
		return writer.toString();
	}
}
