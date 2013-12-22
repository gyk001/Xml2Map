##匹配上的列

   | 源列名 | 目标列名 | 源类型 | 目标类型 | 源desc | 目标desc |
   |:--:|:--:|:--:|:--:|:--:|:--:|
   | START_DATE | FI_SYMPTOM_DATE | DATE | DATETIME | 发病日期 | 首次出现症状日期 |  
   | USERID | REPORTING_DOC_CODE | VARCHAR2 | VARCHAR | 报告人id | 报告医生代码: |  
   | OCCUPATION | OTHER_OCCC_DESCR | VARCHAR2 | VARCHAR | 具体的其他职业信息 | 其他职业描述: |  
   | CASETYPE2 | INFECT_ATT_CD | VARCHAR2 | VARCHAR | 病例分类2,0-未分类,1-急性病,2-慢性病 | 传染病发病类别代码:1.急性 2.慢性 |  
   | FLAG | FLAG | VARCHAR | NUMBER | 状态标识 | 审核状态 0-未审核，1-县级审核，2-市级审核，3-终审 |  
   | CASETYPE | CASE_TYPE_CD | VARCHAR2 | VARCHAR | 病例分类，1-临床诊断病例、2-实验室诊断病例、3-疑似病例、4-病原携带者、5-阳性检测，码表-card_casetype | 诊断状态代码:取值：诊断状态代码CV05.01.002 |  
   | TELP | PERSON_TEL_NO | VARCHAR2 | VARCHAR | 联系电话 | 本人电话号码: |  
   | NOTES | REMARK | VARCHAR2 | VARCHAR | 备注 | 备注: |  
   | SEX1 | GENDER_CD | VARCHAR2 | VARCHAR | 性别 | 性别代码:取值：性别代码GB/T2261.1-2003 |  
   | PATIENT_NAME | NAME | VARCHAR2 | VARCHAR | 患者姓名 | 姓名: |  
   | RPTORGCODE | SEND_ORG_CODE | VARCHAR2 | VARCHAR | 报告单位 | 上报机构: |  
   | PARENT_NAME | HH_NAME | VARCHAR2 | VARCHAR | 患儿家长姓名 | 家长姓名: |  
   | UNIT | WORKING_UNIT_NAME | VARCHAR2 | VARCHAR | 患者工作单位 | 工作单位名称: |  
   | BIRTHDAY_DATE | BIRTH_DATE | DATE | DATETIME | 出生日期 | 出生日期:默认值：1800-01-01 |  
   | ID | ID_NO | VARCHAR2 | VARCHAR | 身份证号 | 身份证件号码: |  
   | OTHER_DISEASE | OTHER_INFECT_NAME | VARCHAR2 | VARCHAR | 具体的其他疾病信息 | 其他法定管理以及重点监测传染病名称: |  
   | GROUP_ID | PATIENT_OCCU_CD | NUMBER | VARCHAR | 职业,码表personrole | 传染病患者职业代码:取值：传染病患者职业代码表CV02.01.202 |  
   | DEADDATE | DEATH_DATE | DATE | DATETIME | 死亡日期 | 死亡日期 |  
   | DIAGNOSEDATE | DIAG_DATE | DATE | DATETIME | 诊断日期 | 诊断日期 |  

##来源表里没有匹配上的列

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | AFTER_FILL_DATE | DATE | java.sql.Timestamp | true | 补报填卡日期 |
   | DELTYPE | VARCHAR2 | java.lang.String | true | 删除原因类型：1.重卡、2.其他 |
   | DISEASE_ID1 | NUMBER | java.math.BigDecimal | false | 疾病编码-码表-diseasecode |
   | DISEASE_ID2 | NUMBER | java.math.BigDecimal | true | 订正病种 |
   | FOREIGNCODE | NUMBER | java.math.BigDecimal | true | null |
   | VALID_TIME5 | DATE | java.sql.Timestamp | true | 县级审核时间 |
   | VALID_TIME4 | DATE | java.sql.Timestamp | true | 市级审核时间 |
   | VALID_TIME3 | DATE | java.sql.Timestamp | true | 省级审核时间 |
   | DELETEUSERID | VARCHAR2 | java.lang.String | true | 删除用户id |
   | ADDR | VARCHAR2 | java.lang.String | true | 现住详细地址 |
   | DELMESSAGE | VARCHAR2 | java.lang.String | true | 具体的删除原因 |
   | DATASOURCE | VARCHAR2 | java.lang.String | true | 数据来源：00-大疫情、99-单病专病、77-his接口、01-肺结核、02-鼠疫、03-艾滋病、04-流感 |
   | ADDRCODE | VARCHAR2 | java.lang.String | false | 现住地址国标 |
   | DELETETIME | DATE | java.sql.Timestamp | true | 删除时间 |
   | CARD_ID | NUMBER | java.math.BigDecimal | false | 卡片id |
   | VALID_DATE1 | DATE | java.sql.Timestamp | true | 死亡终审时间 |
   | AUDITINTIME | DATE | java.sql.Timestamp | true | 订正报告时间 |
   | VALID_DATE2 | DATE | java.sql.Timestamp | true | 订正终审时间 |
   | CONTACTFLAG | VARCHAR2 | java.lang.String | false | null |
   | MGMTSTATUS | VARCHAR2 | java.lang.String | true | 收治状态-肺结核系统使用 |
   | LASTMODIFYUSER | VARCHAR2 | java.lang.String | true | 最后一次修改用id |
   | STATUS | VARCHAR2 | java.lang.String | true | 状态,0-原始卡，2-订正卡 |
   | CARD_CODE | VARCHAR2 | java.lang.String | true | 卡片编号 |
   | FILLTIME | DATE | java.sql.Timestamp | true | 医生填卡日期 |
   | CURRMGMTORG | VARCHAR2 | java.lang.String | true | 收治机构-肺结核系统使用 |
   | AREATYPE | VARCHAR2 | java.lang.String | false | 现住址类型选择 |
   | BASE_ID | NUMBER | java.math.BigDecimal | true | null |
   | INTIME | DATE | java.sql.Timestamp | true | 录入时间 |
   | SYNPROC | VARCHAR2 | java.lang.String | true | null |
   | APANAGECODE | VARCHAR2 | java.lang.String | true | 报告地区编码 |
   | SEX2 | VARCHAR2 | java.lang.String | true | null |
   | INPUTDOCTOR | VARCHAR2 | java.lang.String | true | 填卡医生 |

##目标表里没有匹配上的列

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | WORKING_PROVINCE_NAME | VARCHAR | java.lang.String | true | 工作单位地址-省（自治区、直辖市）: |
   | STATE | DECIMAL | java.math.BigDecimal | false | 上传状态:默认值：0 |
   | CENSUS_CITY | VARCHAR | java.lang.String | true | 户籍地址-市（地区、州）: |
   | INFECT_RECORD_NO | VARCHAR | java.lang.String | false | 传染病报告卡编号: |
   | PATIENT_OWNERSHIP_CD | VARCHAR | java.lang.String | true | 传染病患者归属代码:取值：传染病患者归属代码CV02.01.104 |
   | SSCID | VARCHAR | java.lang.String | true | 社会保障卡号: |
   | MEDICAL_INSURANCE_NO | VARCHAR | java.lang.String | true | 医疗保险号码: |
   | SEND_TIME | DATETIME | java.sql.Timestamp | false | 上报日期:默认值：当前日期 |
   | CREATETIME | DATETIME | java.sql.Timestamp | false | 创建日期:默认值：当前日期 |
   | POST_CD | VARCHAR | java.lang.String | true | 邮政编码: |
   | WORKING_CITY_NAME | VARCHAR | java.lang.String | true | 工作单位地址-市（地区、州）: |
   | RELATION_PK | VARCHAR | java.lang.String | true |  |
   | CENSUS_COUNTRY | VARCHAR | java.lang.String | true | 户籍地址-县(区): |
   | CORRCT_INFECT_NAME | VARCHAR | java.lang.String | true | 订正诊断: |
   | REPORT_ORG_TEL_NO | VARCHAR | java.lang.String | true | 填报单位电话号码: |
   | UNQUALIFIED_CARD_REASON | VARCHAR | java.lang.String | true | 退卡原因: |
   | AR_CD | VARCHAR | java.lang.String | true | 行政区划代码:取值：行政区划代码GB/T2260 |
   | WORKING_HOUSE_NO | VARCHAR | java.lang.String | true | 工作单位地址-门牌号: |
   | VILLAGE_NAME | VARCHAR | java.lang.String | true | 现住地址-村(街、路、弄等): |
   | WORKING_VILLAGE | VARCHAR | java.lang.String | true | 工作单位地址-村(街、路、弄等): |
   | ID | VARCHAR | java.lang.String | false | 记录ID |
   | HR_ID | VARCHAR | java.lang.String | true | 健康档案编号: |
   | REPORT_ORG_CODE | VARCHAR | java.lang.String | false | 填报机构代码: |
   | HOUSE_NO | VARCHAR | java.lang.String | true | 现住地址-门牌号码: |
   | WORKING_TEL_NO | VARCHAR | java.lang.String | true | 工作单位电话号码: |
   | CENSUS_TOWN | VARCHAR | java.lang.String | true | 户籍地址-乡（镇、街道办事处): |
   | HH_TEL_NO | VARCHAR | java.lang.String | true | 家人电话号码: |
   | WORKING_AREA_NAME | VARCHAR | java.lang.String | true | 工作单位地址-县(区): |
   | REPORT_DOC_NAME | VARCHAR | java.lang.String | false | 报告医师姓名: |
   | WORKING_STREET_ID | VARCHAR | java.lang.String | true | 工作单位地址-乡(镇、街道办事处): |
   | PROVINCE_NAME | VARCHAR | java.lang.String | true | 现住地址-省（自治区、直辖市）: |
   | CENSUS_VILLAGE | VARCHAR | java.lang.String | true | 户籍地址-村(街、路、弄等): |
   | CENSUS_PROVIENCE | VARCHAR | java.lang.String | true | 户籍地址-省: |
   | NH_CARD | VARCHAR | java.lang.String | true | 新农合卡号: |
   | SEND_SYSTEM | VARCHAR | java.lang.String | false | 上报系统: |
   | CENSUS_HOUSE_NO | VARCHAR | java.lang.String | true | 户籍地址-门牌号码: |
   | CITY_NAME | VARCHAR | java.lang.String | true | 现住地址-市（地区、州）: |
   | PROVIDER_NAME | VARCHAR | java.lang.String | false | 系统开发商:《中华人民共和国组织机构代码证》上的机构名称 |
   | REPORT_CARD_CD | VARCHAR | java.lang.String | true | 报卡类别代码:1.初次报告 2.订正报告 |
   | PERSON_ID | VARCHAR | java.lang.String | false |  |
   | AREA_NAME | VARCHAR | java.lang.String | true | 现住住址-县(区): |
   | PROVIDER_ORG_CODE | VARCHAR | java.lang.String | false | 开发商机构代码:《中华人民共和国组织机构代码证》上的代码 |
   | MEDICARE_CD | VARCHAR | java.lang.String | true | 医疗保险类别代码:取值：医疗保险类别代码CV02.01.204 |
   | STREET_ID | VARCHAR | java.lang.String | true | 现住地址-乡（镇、街道办事处）: |
   | REPORT_DATE | DATETIME | java.sql.Timestamp | false | 填报日期: |
   | ID_NO_CD | VARCHAR | java.lang.String | false | 身份证件类别代码:取值：身份证件类别代码 CV02.01.101 |
   | LASTUPTIME | DATETIME | java.sql.Timestamp | true | 最终修改日期:默认值：当前日期 |
   | UPLOAD_ORG_CODE | VARCHAR | java.lang.String | false | 上传机构代码 |