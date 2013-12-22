package cn.guoyukun.util.xml2map.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * 
 * @author 郭玉昆(<a href="mailto:gyk001@gmail.com">gyk001@gmail.com</a>)
 * @version 2013-12-22
 * 
 */
public class XmlLoadUtilTest {
	private static final String DEMO0 = "/convert/0/src.xml";
	//日志对象
	private static final Logger logger = LoggerFactory.getLogger(XmlLoadUtilTest.class);
	
	@Test
	public void testLoadDemoXml() throws JDOMException, IOException {
		SAXBuilder builder = new SAXBuilder();
		InputStream is = XmlLoadUtilTest.class.getResourceAsStream(DEMO0);
		Document dataXml = builder.build(is);
		Element root = dataXml.getRootElement(); // 取得根节点
		List<Element> objectives = root.getChildren("objective");
		getSlotValue(objectives.get(0), "咽");
	}
	
	private static String getSlotValue(Element objective,String slotName){
		List<Element> list = objective.getChildren("slot");
		for(Element slot: list){
			String xmlSlotName = slot.getChildText("slotName");
			String xmlSlotValue = slot.getChildText("slotValue");
			
			logger.debug("{} -> {}", xmlSlotName, xmlSlotValue);
		}
		return null;
	}
	
	/*

insert into T_MS_PHYEXA
  (
  UPLOAD_ORG_CODE,
  ID,
  NAME,
  BODY_HEIGHT,
  BODY_WEIGHT,
  BODY_TEMPERATURE,
  PULSE_RATE,
  BREATHE_FREQ,
  LEFT_SBP,
  LEFT_DBP,
  --一般情况
  OTHER_SKIN_DESCR,
  OTHER_LN_DESCR,
  --结膜
  --角膜
  OTHER_SCLERA_DESCR,
  --瞳孔
  AUDI_CD,
  --鼻
  --舌
  PHARYNX_VALUE,
  --双侧扁桃体
  --支气管
  --颈静脉
  --颈动脉搏动
  OXG_DESCR,
  --甲状腺
  --胸廓
  OTHER_BREAST_DESCR,
  LUNG_ABC_DESCR,
  OXZ_DESCR,
  DRE_RESULT_DN,
  --脊柱
  --生理反射
  --病理反射
  BBV_DIS_VALUE,
  HEALTH_PROBLEM_DN,
  
  FIELD_PK_FK,
  FIELD_PK
  
  
  )
  values
  (
  'yuxing',
  '1',
  '杨秀兰',
  '155',
  '58',
  '37',
  '70',
  '18',
  '173',
  '120',
  '未见黄染、皮疹、出血点',
  '全身浅表淋巴结无肿大',
  '无染黄',
  '听力正常，无流脓，乳突无压痛',
  '无充血',
  '未闻及',
  '对称，未及肿块',
  '双侧呼吸运动对称，双肺呼吸音清，未闻及干湿罗音',
  '心前区无隆起，心尖部无震颤，无摩擦感及抬举性心尖搏动，心率     次/分，律齐，各瓣膜听诊区未闻及病理性杂音',
  '未查',
  '阴性',
  '平和质、阴虚质、阳虚质、气虚质、痰湿质、湿热质、血淤质、气郁质、特禀质等',
  
  
  
  '1ae675c0-329a-4cb5-bddf-dbb40cccf68a',
  'phesicalexa001'
  
  );


	 */
}
