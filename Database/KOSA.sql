select * from memo;

create table mvcregister(
    id number constraint pk_mvcregister_id primary key,
    pwd varchar2(20) not null,
    email varchar2(50) not null
);

desc mvcregister;

select * from mvcregister;

CREATE TABLE koreaMember
(
    id VARCHAR2(50) PRIMARY KEY ,
    pwd VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(50) NOT NULL,
    age NUMBER ,
    gender CHAR(4),
    email VARCHAR2(50),
    ip   VARCHAR2(50)
) 

desc koreaMember;
select * from koreaMember;