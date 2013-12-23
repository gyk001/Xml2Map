insert into T_DM_DIABETFOL(
  ID,
  CREATETIME,
  NAME,
  FIELD_PK,
  FIELD_PK_FK
) values(
  'UUID_id',   --  ID,   TODO:
  to_date('2013-01-04','yyyy-MM-dd'),   --   CREATETIME,
  '杨秀兰',   --   NAME, TODO:
  'UUID_FIELD_PK',   --   FIELD_PK, TODO:
  'UUID_FIELD_PK_FK'   --   FIELD_PK_FK : TODO
);



insert into t_dm_diabetfol_rec(
  ID,
  FIELD_PK,
  FIELD_PK_FK,
  OTHER_SYMPTOM_DESC,
  SBP,
  DBP,
  BODY_HEIGHT,
  BODY_WEIGHT,
  --bmi
  DAILY_SMOKING_NOWADAY,
  TARGET_DAILY_SMOKING,
  DAILY_DRINK,
  TARGET_DAILY_DRINK,
  ACTIVITY_FREQ,
  DAILY_EATING,
  NEXT_DAILY_EATING,
  --摄盐
  FBS_VALUE,
  BS_2H_AF_EATING_VALUE,
  INSTEP_ATPM_CD,
  --心率
  NEXT_FOLLOWUP_DATE,
  EMOTION_ADJUST_CD,			
  COMPLIANCE_CD,	
  FOLLOWUP_ORG_CODE,
  DRUG_SIDE_EFF_DESCR,
  FOLLOWUP_DOCTOR_NAME,
  CUR_FOLLOWUP_DATE,
  ID_FK
) values(
'UUID_id',   -- ID,  TODO:
'UUID_FIELD_PK',   -- FIELD_PK,  TODO:
'UUID_FIELD_PK_FK',   -- FIELD_PK_FK,  TODO:
'OTHER_SYMPTOM_DESC',   -- OTHER_SYMPTOM_DESC,  TODO:
	120,   -- SBP,
	80,   -- DBP,
	161,   -- BODY_HEIGHT,
	60,   -- BODY_WEIGHT,
	'0',   -- DAILY_SMOKING_NOWADAY,
	'0',   -- TARGET_DAILY_SMOKING,
	0,   -- DAILY_DRINK,
	0,   -- TARGET_DAILY_DRINK,
	30,   -- ACTIVITY_FREQ,
	300,   -- DAILY_EATING,
	280,   -- NEXT_DAILY_EATING,
	6.0,   -- FBS_VALUE,
	11.3,   -- BS_2H_AF_EATING_VALUE,
	'搏动好',   -- INSTEP_ATPM_CD,
	to_date('2013-04-04','yyyy-MM-dd'),   -- NEXT_FOLLOWUP_DATE,
	'良好',   -- EMOTION_ADJUST_CD,      
	'良好',   -- COMPLIANCE_CD,  
	'永乐店社区服务中心',   -- FOLLOWUP_ORG_CODE,
	'无',   -- DRUG_SIDE_EFF_DESCR,
	'薛楠',   -- FOLLOWUP_DOCTOR_NAME,
	to_date('2013-01-04','yyyy-MM-dd'),   -- CUR_FOLLOWUP_DATE,
	'UUID_ID_FK'   -- ID_FK
)


insert into t_dm_diabetfol_rec_drug(
  ID,
  FIELD_PK,
  FIELD_PK_FK,
  CREATETIME,
  DRUG_NAME,
  DRUG_USAGE,
  DOSE_SINGLE,
  ID_FK
) values(
  'UUID_ID',   --   ID,
  'UUID_FIELD_PK',   --   FIELD_PK,
  'UUID_FIELD_PK_FK',   --   FIELD_PK_FK,
  to_date('2013-01-04','yyyy-MM-dd'),   --   CREATETIME,
  '二甲双胍',   --   DRUG_NAME,
  '3/日',   --   DRUG_USAGE,
  500,   --   DOSE_SINGLE,
  'UUID_ID_FK'   --   ID_FK
)








