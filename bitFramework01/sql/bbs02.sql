--------------------------------------------------------
--  ������ ������ - ȭ����-7��-23-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BBS02
--------------------------------------------------------

  CREATE TABLE "SCOTT"."BBS02" 
   (	"NUM" NUMBER, 
	"NAME" VARCHAR2(50 BYTE), 
	"SUB" VARCHAR2(200 BYTE), 
	"CONTENT" VARCHAR2(2000 BYTE), 
	"NALJA" DATE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SCOTT.BBS02
SET DEFINE OFF;
Insert into SCOTT.BBS02 (NUM,NAME,SUB,CONTENT,NALJA) values (1,'�׽���','����1','����1',to_date('19/07/23','RR/MM/DD'));
Insert into SCOTT.BBS02 (NUM,NAME,SUB,CONTENT,NALJA) values (2,'�׽���','����2','����2',to_date('19/07/23','RR/MM/DD'));
Insert into SCOTT.BBS02 (NUM,NAME,SUB,CONTENT,NALJA) values (3,'�׽���','����3','����3',to_date('19/07/23','RR/MM/DD'));
Insert into SCOTT.BBS02 (NUM,NAME,SUB,CONTENT,NALJA) values (4,'�׽���','����4','����4',to_date('19/07/23','RR/MM/DD'));
Insert into SCOTT.BBS02 (NUM,NAME,SUB,CONTENT,NALJA) values (5,'�׽���','����5','����5',to_date('19/07/23','RR/MM/DD'));
