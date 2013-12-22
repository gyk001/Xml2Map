# 连接信息

   | 参数 | 值 |
   |:--|:--|
   | 地址 | jdbc:oracle:thin:@192.168.120.146:1521:orcl |
   | 用户 | YSYJ |
   | 数据库| Oracle - 11.2 |
   | 构架模式 | JSYJ |
   | 表模式 | INFECTIONCARD% |

# 表信息

## 表 `JSYJ.INFECTIONCARD` 

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | CARD_ID | NUMBER | java.math.BigDecimal | false | 卡片id |
   | APANAGECODE | VARCHAR2 | java.lang.String | true | 报告地区编码 |
   | CARD_CODE | VARCHAR2 | java.lang.String | true | 卡片编号 |
   | PATIENT_NAME | VARCHAR2 | java.lang.String | true | 患者姓名 |
   | PARENT_NAME | VARCHAR2 | java.lang.String | true | 患儿家长姓名 |
   | SEX1 | VARCHAR2 | java.lang.String | false | 性别 |
   | SEX2 | VARCHAR2 | java.lang.String | true | null |
   | TELP | VARCHAR2 | java.lang.String | true | 联系电话 |
   | ID | VARCHAR2 | java.lang.String | true | 身份证号 |
   | UNIT | VARCHAR2 | java.lang.String | true | 患者工作单位 |
   | ADDR | VARCHAR2 | java.lang.String | true | 现住详细地址 |
   | ADDRCODE | VARCHAR2 | java.lang.String | false | 现住地址国标 |
   | AREATYPE | VARCHAR2 | java.lang.String | false | 现住址类型选择 |
   | GROUP_ID | NUMBER | java.math.BigDecimal | true | 职业,码表personrole |
   | START_DATE | DATE | java.sql.Timestamp | false | 发病日期 |
   | DIAGNOSEDATE | DATE | java.sql.Timestamp | true | 诊断日期 |
   | DEADDATE | DATE | java.sql.Timestamp | true | 死亡日期 |
   | CASETYPE | VARCHAR2 | java.lang.String | true | 病例分类，1-临床诊断病例、2-实验室诊断病例、3-疑似病例、4-病原携带者、5-阳性检测，码表-card_casetype |
   | INPUTDOCTOR | VARCHAR2 | java.lang.String | true | 填卡医生 |
   | DISEASE_ID1 | NUMBER | java.math.BigDecimal | false | 疾病编码-码表-diseasecode |
   | DISEASE_ID2 | NUMBER | java.math.BigDecimal | true | 订正病种 |
   | VALID_DATE2 | DATE | java.sql.Timestamp | true | 订正终审时间 |
   | VALID_DATE1 | DATE | java.sql.Timestamp | true | 死亡终审时间 |
   | USERID | VARCHAR2 | java.lang.String | true | 报告人id |
   | NOTES | VARCHAR2 | java.lang.String | true | 备注 |
   | STATUS | VARCHAR2 | java.lang.String | true | 状态,0-原始卡，2-订正卡 |
   | BIRTHDAY_DATE | DATE | java.sql.Timestamp | true | 出生日期 |
   | FILLTIME | DATE | java.sql.Timestamp | true | 医生填卡日期 |
   | BASE_ID | NUMBER | java.math.BigDecimal | true | null |
   | FLAG | NUMBER | java.math.BigDecimal | true | 审核状态 0-未审核，1-县级审核，2-市级审核，3-终审 |
   | INTIME | DATE | java.sql.Timestamp | true | 录入时间 |
   | VALID_TIME5 | DATE | java.sql.Timestamp | true | 县级审核时间 |
   | VALID_TIME4 | DATE | java.sql.Timestamp | true | 市级审核时间 |
   | VALID_TIME3 | DATE | java.sql.Timestamp | true | 省级审核时间 |
   | DELETETIME | DATE | java.sql.Timestamp | true | 删除时间 |
   | RPTORGCODE | VARCHAR2 | java.lang.String | false | 报告单位 |
   | AFTER_FILL_DATE | DATE | java.sql.Timestamp | true | 补报填卡日期 |
   | CONTACTFLAG | VARCHAR2 | java.lang.String | false | null |
   | CURRMGMTORG | VARCHAR2 | java.lang.String | true | 收治机构-肺结核系统使用 |
   | DATASOURCE | VARCHAR2 | java.lang.String | true | 数据来源：00-大疫情、99-单病专病、77-his接口、01-肺结核、02-鼠疫、03-艾滋病、04-流感 |
   | MGMTSTATUS | VARCHAR2 | java.lang.String | true | 收治状态-肺结核系统使用 |
   | CASETYPE2 | VARCHAR2 | java.lang.String | true | 病例分类2,0-未分类,1-急性病,2-慢性病 |
   | SYNPROC | VARCHAR2 | java.lang.String | true | null |
   | OCCUPATION | VARCHAR2 | java.lang.String | true | 具体的其他职业信息 |
   | DELETEUSERID | VARCHAR2 | java.lang.String | true | 删除用户id |
   | DELTYPE | VARCHAR2 | java.lang.String | true | 删除原因类型：1.重卡、2.其他 |
   | DELMESSAGE | VARCHAR2 | java.lang.String | true | 具体的删除原因 |
   | LASTMODIFYUSER | VARCHAR2 | java.lang.String | true | 最后一次修改用id |
   | AUDITINTIME | DATE | java.sql.Timestamp | true | 订正报告时间 |
   | FOREIGNCODE | NUMBER | java.math.BigDecimal | true | null |
   | OTHER_DISEASE | VARCHAR2 | java.lang.String | true | 具体的其他疾病信息 |

## 表 `JSYJ.INFECTIONCARD_BASIC_INFO` 

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | CARD_ID | NUMBER | java.math.BigDecimal | false | null |
   | APANAGECODE | VARCHAR2 | java.lang.String | true | null |
   | CARD_CODE | VARCHAR2 | java.lang.String | true | null |
   | PATIENT_NAME | VARCHAR2 | java.lang.String | true | null |
   | PARENT_NAME | VARCHAR2 | java.lang.String | true | null |
   | SEX1 | VARCHAR2 | java.lang.String | false | null |
   | SEX2 | VARCHAR2 | java.lang.String | true | null |
   | TELP | VARCHAR2 | java.lang.String | true | null |
   | ID | VARCHAR2 | java.lang.String | true | null |
   | UNIT | VARCHAR2 | java.lang.String | true | null |
   | ADDR | VARCHAR2 | java.lang.String | true | null |
   | ADDRCODE | VARCHAR2 | java.lang.String | false | null |
   | AREATYPE | VARCHAR2 | java.lang.String | false | null |
   | GROUP_ID | NUMBER | java.math.BigDecimal | true | null |
   | START_DATE | DATE | java.sql.Timestamp | false | null |
   | DIAGNOSEDATE | DATE | java.sql.Timestamp | true | null |
   | DEADDATE | DATE | java.sql.Timestamp | true | null |
   | CASETYPE | VARCHAR2 | java.lang.String | true | null |
   | INPUTDOCTOR | VARCHAR2 | java.lang.String | true | null |
   | DISEASE_ID1 | NUMBER | java.math.BigDecimal | false | null |
   | DISEASE_ID2 | NUMBER | java.math.BigDecimal | true | null |
   | VALID_DATE2 | DATE | java.sql.Timestamp | true | null |
   | VALID_DATE1 | DATE | java.sql.Timestamp | true | null |
   | USERID | VARCHAR2 | java.lang.String | true | null |
   | NOTES | VARCHAR2 | java.lang.String | true | null |
   | STATUS | VARCHAR2 | java.lang.String | true | null |
   | BIRTHDAY_DATE | DATE | java.sql.Timestamp | true | null |
   | FILLTIME | DATE | java.sql.Timestamp | true | null |
   | BASE_ID | NUMBER | java.math.BigDecimal | true | null |
   | FLAG | NUMBER | java.math.BigDecimal | true | null |
   | INTIME | DATE | java.sql.Timestamp | true | null |
   | VALID_TIME5 | DATE | java.sql.Timestamp | true | null |
   | VALID_TIME4 | DATE | java.sql.Timestamp | true | null |
   | VALID_TIME3 | DATE | java.sql.Timestamp | true | null |
   | DELETETIME | DATE | java.sql.Timestamp | true | null |
   | RPTORGCODE | VARCHAR2 | java.lang.String | false | null |
   | AFTER_FILL_DATE | DATE | java.sql.Timestamp | true | null |
   | CONTACTFLAG | VARCHAR2 | java.lang.String | false | null |
   | CURRMGMTORG | VARCHAR2 | java.lang.String | true | null |
   | DATASOURCE | VARCHAR2 | java.lang.String | true | null |
   | MGMTSTATUS | VARCHAR2 | java.lang.String | true | null |
   | CASETYPE2 | VARCHAR2 | java.lang.String | true | null |
   | SYNPROC | VARCHAR2 | java.lang.String | true | null |
   | MODY_TIME | DATE | java.sql.Timestamp | true | null |
   | OPT_DATA | DATE | java.sql.Timestamp | true | null |
   | DATA_OWNERSHIP | VARCHAR2 | java.lang.String | true | null |

## 表 `JSYJ.INFECTIONCARD_NOF` 

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | CARD_ID | NUMBER | java.math.BigDecimal | false | ??id |
   | APANAGECODE | VARCHAR2 | java.lang.String | true | ?????? |
   | CARD_CODE | VARCHAR2 | java.lang.String | true | ???? |
   | PATIENT_NAME | VARCHAR2 | java.lang.String | true | ???? |
   | PARENT_NAME | VARCHAR2 | java.lang.String | true | ?????? |
   | SEX1 | VARCHAR2 | java.lang.String | false | ?? |
   | SEX2 | VARCHAR2 | java.lang.String | true | null |
   | TELP | VARCHAR2 | java.lang.String | true | ???? |
   | ID | VARCHAR2 | java.lang.String | true | ???? |
   | UNIT | VARCHAR2 | java.lang.String | true | ?????? |
   | ADDR | VARCHAR2 | java.lang.String | true | ?????? |
   | ADDRCODE | VARCHAR2 | java.lang.String | false | ?????? |
   | AREATYPE | VARCHAR2 | java.lang.String | false | ??????? |
   | GROUP_ID | NUMBER | java.math.BigDecimal | true | ??,??personrole |
   | START_DATE | DATE | java.sql.Timestamp | false | ???? |
   | DIAGNOSEDATE | DATE | java.sql.Timestamp | true | ???? |
   | DEADDATE | DATE | java.sql.Timestamp | true | ???? |
   | CASETYPE | VARCHAR2 | java.lang.String | true | ?????1-???????2-????????3-?????4-??????5-???????-card_casetype |
   | INPUTDOCTOR | VARCHAR2 | java.lang.String | true | ???? |
   | DISEASE_ID1 | NUMBER | java.math.BigDecimal | false | ????-??-diseasecode |
   | DISEASE_ID2 | NUMBER | java.math.BigDecimal | true | ???? |
   | VALID_DATE2 | DATE | java.sql.Timestamp | true | ?????? |
   | VALID_DATE1 | DATE | java.sql.Timestamp | true | ?????? |
   | USERID | VARCHAR2 | java.lang.String | true | ???id |
   | NOTES | VARCHAR2 | java.lang.String | true | ?? |
   | STATUS | VARCHAR2 | java.lang.String | true | ??,0-????2-??? |
   | BIRTHDAY_DATE | DATE | java.sql.Timestamp | true | ???? |
   | FILLTIME | DATE | java.sql.Timestamp | true | ?????? |
   | BASE_ID | NUMBER | java.math.BigDecimal | true | null |
   | FLAG | NUMBER | java.math.BigDecimal | true | ???? 0-????1-?????2-?????3-?? |
   | INTIME | DATE | java.sql.Timestamp | true | ???? |
   | VALID_TIME5 | DATE | java.sql.Timestamp | true | ?????? |
   | VALID_TIME4 | DATE | java.sql.Timestamp | true | ?????? |
   | VALID_TIME3 | DATE | java.sql.Timestamp | true | ?????? |
   | DELETETIME | DATE | java.sql.Timestamp | true | ???? |
   | RPTORGCODE | VARCHAR2 | java.lang.String | false | ???? |
   | AFTER_FILL_DATE | DATE | java.sql.Timestamp | true | ?????? |
   | CONTACTFLAG | VARCHAR2 | java.lang.String | false | ?????????? |
   | CURRMGMTORG | VARCHAR2 | java.lang.String | true | ????-??????? |
   | DATASOURCE | VARCHAR2 | java.lang.String | true | ?????00-????99-?????77-his???01-????02-???03-????04-?? |
   | MGMTSTATUS | VARCHAR2 | java.lang.String | true | ????-??????? |
   | CASETYPE2 | VARCHAR2 | java.lang.String | true | ????2,0-???,1-???,2-??? |
   | SYNMARK | VARCHAR2 | java.lang.String | true | ???? |
   | RPTORGNAME | VARCHAR2 | java.lang.String | true | ?????? |
   | SYNPROC | VARCHAR2 | java.lang.String | true | null |

