# 连接信息

   | 参数 | 值 |
   |:--|:--|
   | 地址 | jdbc:mysql://127.0.0.1:3306/client |
   | 用户 | root@localhost |
   | 数据库| MySQL - 5.6 |
   | 构架模式 | null |
   | 表模式 | t_dc_infectdisrep% |

# 表信息

## 表 `t_dc_infectdisrep` 

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | ID | VARCHAR | java.lang.String | false | 记录ID |
   | INFECT_RECORD_NO | VARCHAR | java.lang.String | false | 传染病报告卡编号: |
   | REPORT_CARD_CD | VARCHAR | java.lang.String | true | 报卡类别代码:1.初次报告 2.订正报告 |
   | NAME | VARCHAR | java.lang.String | false | 姓名: |
   | HH_NAME | VARCHAR | java.lang.String | true | 家长姓名: |
   | GENDER_CD | VARCHAR | java.lang.String | false | 性别代码:取值：性别代码GB/T2261.1-2003 |
   | BIRTH_DATE | DATETIME | java.sql.Timestamp | false | 出生日期:默认值：1800-01-01 |
   | ID_NO_CD | VARCHAR | java.lang.String | false | 身份证件类别代码:取值：身份证件类别代码 CV02.01.101 |
   | ID_NO | VARCHAR | java.lang.String | false | 身份证件号码: |
   | MEDICARE_CD | VARCHAR | java.lang.String | true | 医疗保险类别代码:取值：医疗保险类别代码CV02.01.204 |
   | MEDICAL_INSURANCE_NO | VARCHAR | java.lang.String | true | 医疗保险号码: |
   | HR_ID | VARCHAR | java.lang.String | true | 健康档案编号: |
   | NH_CARD | VARCHAR | java.lang.String | true | 新农合卡号: |
   | SSCID | VARCHAR | java.lang.String | true | 社会保障卡号: |
   | WORKING_UNIT_NAME | VARCHAR | java.lang.String | true | 工作单位名称: |
   | PERSON_TEL_NO | VARCHAR | java.lang.String | true | 本人电话号码: |
   | HH_TEL_NO | VARCHAR | java.lang.String | true | 家人电话号码: |
   | WORKING_TEL_NO | VARCHAR | java.lang.String | true | 工作单位电话号码: |
   | PROVINCE_NAME | VARCHAR | java.lang.String | true | 现住地址-省（自治区、直辖市）: |
   | CITY_NAME | VARCHAR | java.lang.String | true | 现住地址-市（地区、州）: |
   | AREA_NAME | VARCHAR | java.lang.String | true | 现住住址-县(区): |
   | STREET_ID | VARCHAR | java.lang.String | true | 现住地址-乡（镇、街道办事处）: |
   | VILLAGE_NAME | VARCHAR | java.lang.String | true | 现住地址-村(街、路、弄等): |
   | HOUSE_NO | VARCHAR | java.lang.String | true | 现住地址-门牌号码: |
   | AR_CD | VARCHAR | java.lang.String | true | 行政区划代码:取值：行政区划代码GB/T2260 |
   | POST_CD | VARCHAR | java.lang.String | true | 邮政编码: |
   | CENSUS_PROVIENCE | VARCHAR | java.lang.String | true | 户籍地址-省: |
   | CENSUS_CITY | VARCHAR | java.lang.String | true | 户籍地址-市（地区、州）: |
   | CENSUS_COUNTRY | VARCHAR | java.lang.String | true | 户籍地址-县(区): |
   | CENSUS_TOWN | VARCHAR | java.lang.String | true | 户籍地址-乡（镇、街道办事处): |
   | CENSUS_VILLAGE | VARCHAR | java.lang.String | true | 户籍地址-村(街、路、弄等): |
   | CENSUS_HOUSE_NO | VARCHAR | java.lang.String | true | 户籍地址-门牌号码: |
   | WORKING_PROVINCE_NAME | VARCHAR | java.lang.String | true | 工作单位地址-省（自治区、直辖市）: |
   | WORKING_CITY_NAME | VARCHAR | java.lang.String | true | 工作单位地址-市（地区、州）: |
   | WORKING_AREA_NAME | VARCHAR | java.lang.String | true | 工作单位地址-县(区): |
   | WORKING_STREET_ID | VARCHAR | java.lang.String | true | 工作单位地址-乡(镇、街道办事处): |
   | WORKING_VILLAGE | VARCHAR | java.lang.String | true | 工作单位地址-村(街、路、弄等): |
   | WORKING_HOUSE_NO | VARCHAR | java.lang.String | true | 工作单位地址-门牌号: |
   | PATIENT_OWNERSHIP_CD | VARCHAR | java.lang.String | true | 传染病患者归属代码:取值：传染病患者归属代码CV02.01.104 |
   | PATIENT_OCCU_CD | VARCHAR | java.lang.String | true | 传染病患者职业代码:取值：传染病患者职业代码表CV02.01.202 |
   | OTHER_OCCC_DESCR | VARCHAR | java.lang.String | true | 其他职业描述: |
   | FI_SYMPTOM_DATE | DATETIME | java.sql.Timestamp | true | 首次出现症状日期 |
   | INFECT_ATT_CD | VARCHAR | java.lang.String | true | 传染病发病类别代码:1.急性 2.慢性 |
   | CASE_TYPE_CD | VARCHAR | java.lang.String | true | 诊断状态代码:取值：诊断状态代码CV05.01.002 |
   | DIAG_DATE | DATETIME | java.sql.Timestamp | true | 诊断日期 |
   | DEATH_DATE | DATETIME | java.sql.Timestamp | true | 死亡日期 |
   | OTHER_INFECT_NAME | VARCHAR | java.lang.String | true | 其他法定管理以及重点监测传染病名称: |
   | CORRCT_INFECT_NAME | VARCHAR | java.lang.String | true | 订正诊断: |
   | UNQUALIFIED_CARD_REASON | VARCHAR | java.lang.String | true | 退卡原因: |
   | REPORT_DATE | DATETIME | java.sql.Timestamp | false | 填报日期: |
   | REPORT_DOC_NAME | VARCHAR | java.lang.String | false | 报告医师姓名: |
   | REPORTING_DOC_CODE | VARCHAR | java.lang.String | true | 报告医生代码: |
   | REPORT_ORG_CODE | VARCHAR | java.lang.String | false | 填报机构代码: |
   | REPORT_ORG_TEL_NO | VARCHAR | java.lang.String | true | 填报单位电话号码: |
   | REMARK | VARCHAR | java.lang.String | true | 备注: |
   | SEND_TIME | DATETIME | java.sql.Timestamp | false | 上报日期:默认值：当前日期 |
   | SEND_ORG_CODE | VARCHAR | java.lang.String | false | 上报机构: |
   | SEND_SYSTEM | VARCHAR | java.lang.String | false | 上报系统: |
   | PROVIDER_NAME | VARCHAR | java.lang.String | false | 系统开发商:《中华人民共和国组织机构代码证》上的机构名称 |
   | PROVIDER_ORG_CODE | VARCHAR | java.lang.String | false | 开发商机构代码:《中华人民共和国组织机构代码证》上的代码 |
   | CREATETIME | DATETIME | java.sql.Timestamp | false | 创建日期:默认值：当前日期 |
   | LASTUPTIME | DATETIME | java.sql.Timestamp | true | 最终修改日期:默认值：当前日期 |
   | STATE | DECIMAL | java.math.BigDecimal | false | 上传状态:默认值：0 |
   | FLAG | VARCHAR | java.lang.String | true | 状态标识 |
   | PERSON_ID | VARCHAR | java.lang.String | false |  |
   | RELATION_PK | VARCHAR | java.lang.String | true |  |
   | UPLOAD_ORG_CODE | VARCHAR | java.lang.String | false | 上传机构代码 |

## 表 `t_dc_infectdisrep_effc` 

   | 列名 | 类型 | Java类 | 可空 | 备注 |
   |:--|:--|:--|:--:|:---|
   | ID | VARCHAR | java.lang.String | false | 记录ID |
   | CREATETIME | DATETIME | java.sql.Timestamp | false | 创建日期:默认值：当前日期 |
   | LASTUPTIME | DATETIME | java.sql.Timestamp | true | 最终修改日期:默认值：当前日期 |
   | STATE | DECIMAL | java.math.BigDecimal | false | 上传状态:默认值：0 |
   | FLAG | VARCHAR | java.lang.String | true | 状态标识 |
   | INFECT_CD | VARCHAR | java.lang.String | true | 传染病类别代码 取值：1.甲类 2.乙类 3.丙类 |
   | INFECT_NAME_CD | VARCHAR | java.lang.String | true | 传染病名称代码 取值：传染病名称代码CV05.01.017 |
   | UPLOAD_ORG_CODE | VARCHAR | java.lang.String | false | 上传机构代码 |
   | ID_FK | VARCHAR | java.lang.String | false | T_DC_INFECTDISREP 的ID |
   | RELATION_PK | VARCHAR | java.lang.String | true |  |
   | PERSON_ID | VARCHAR | java.lang.String | true |  |

