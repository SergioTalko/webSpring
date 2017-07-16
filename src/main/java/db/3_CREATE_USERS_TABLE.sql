CREATE TABLE USERS(
 ID NUMBER NOT NULL ENABLE,
 CONSTRAINT USERS_PK PRIMARY KEY(ID),
 TYPE NVARCHAR2(20) NOT NULL ,
 EMAIL NVARCHAR2(20) NOT NULL,
 PASSWORD NVARCHAR2(20) NOT NULL,
 USER_NAME NVARCHAR2(10),
 PHONE NVARCHAR2(20),
 CITY NVARCHAR2(30),
 DATE_REGISTERED TIMESTAMP NOT NULL ,
 LAST_ACTIVE_DATE TIMESTAMP NOT NULL ,
 IS_ACTIVE NUMBER NOT NULL ,
 ATTRIBUTES CLOB
);

CREATE SEQUANCE USERS_SEQ MINVALUE 1000 MAXVALUE 1000000000 START WITH 1001 INCREMENT BY 1;