insert into T_DM_DIABETFOL(
  ID,
  CREATETIME,
  NAME,
  FIELD_PK,
  FIELD_PK_FK
) values(
'${T1.ID}',   --  ID,   TODO:
to_date('${T1.CREATETIME}','yyyy-MM-dd'),   --   CREATETIME,
'${T1.NAME}',   --   NAME, TODO:
'${T1.FIELD_PK}',   --   FIELD_PK, TODO:
'${T1.FIELD_PK_FK}'   --   FIELD_PK_FK : TODO
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
'${ID}',   -- ID,  TODO:
'${FIELD_PK}',   -- FIELD_PK,  TODO:
'${FIELD_PK_FK}',   -- FIELD_PK_FK,  TODO:
'${OTHER_SYMPTOM_DESC}',   -- OTHER_SYMPTOM_DESC,  TODO:
  ${SBP},   -- SBP,
  ${DBP},   -- DBP,
  ${BODY_HEIGHT},   -- BODY_HEIGHT,
  ${BODY_WEIGHT},   -- BODY_WEIGHT,
  '${DAILY_SMOKING_NOWADAY}',   -- DAILY_SMOKING_NOWADAY,
  '${TARGET_DAILY_SMOKING}',   -- TARGET_DAILY_SMOKING,
  ${DAILY_DRINK},   -- DAILY_DRINK,
  ${TARGET_DAILY_DRINK},   -- TARGET_DAILY_DRINK,
  ${ACTIVITY_FREQ},   -- ACTIVITY_FREQ,
  ${DAILY_EATING},   -- DAILY_EATING,
  ${NEXT_DAILY_EATING},   -- NEXT_DAILY_EATING,
  ${FBS_VALUE},   -- FBS_VALUE,
  ${BS_2H_AF_EATING_VALUE},   -- BS_2H_AF_EATING_VALUE,
  '${INSTEP_ATPM_CD}',   -- INSTEP_ATPM_CD,
to_date('${NEXT_FOLLOWUP_DATE}','yyyy-MM-dd'),   -- NEXT_FOLLOWUP_DATE,
  '${EMOTION_ADJUST_CD}',   -- EMOTION_ADJUST_CD,     
  '${COMPLIANCE_CD}',   -- COMPLIANCE_CD,  
  '${FOLLOWUP_ORG_CODE}',   -- FOLLOWUP_ORG_CODE,
  '${DRUG_SIDE_EFF_DESCR}',   -- DRUG_SIDE_EFF_DESCR,
  '${FOLLOWUP_DOCTOR_NAME}',   -- FOLLOWUP_DOCTOR_NAME,
to_date('${CUR_FOLLOWUP_DATE}','yyyy-MM-dd'),   -- CUR_FOLLOWUP_DATE, 
  '${ID_FK}',   -- ID_FK
  '${ASSIST_OTHER_DESCR}'   -- ASSIST_OTHER_DESCR	
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
  '${T3.ID}',   --   ID,
  '${T3.FIELD_PK}',   --   FIELD_PK,
  '${T3.FIELD_PK_FK}',   --   FIELD_PK_FK,
  to_date('${T3.CREATETIME}','yyyy-MM-dd'),   --   CREATETIME,
  '${T3.DRUG_NAME}',   --   DRUG_NAME,
  '${T3.DRUG_USAGE}',   --   DRUG_USAGE,
  ${T3.DOSE_SINGLE},   --   DOSE_SINGLE,
  '${T3.ID_FK}'   --   ID_FK
)








