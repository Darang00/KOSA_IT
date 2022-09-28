show user;


/*
[1일차 수업]
1. 오라클 소프트웨어 다운로드
https://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html

2. Oracle Database 11g Release 2 Express Edition for Windows 64 (무료설치)

3. Oracle 설치(SYS, SYSTEM 계정의 대한 암호 : 1004)

3. Oracle 설치(SYS, SYSTEM 계정의 대한 암호 : 1004)

4.별도의 Tool 설치 무료(SqlDeveloper , https://dbeaver.io/)  ,
                 유료(토드 , 오렌지 , SqlGate) 프로젝트시 설치 활용 ^^

6. SqlDeveloper 툴을 통해서 Oracle Server 접속 ....
   >> HR 계정 : 암호 1004 , Unlock 2가지 사용가능 .... (사원관리 실습 테이블)
   >> 새로운 계정 : KOSA

-- USER SQL
ALTER USER "HR" IDENTIFIED BY 1004 
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP"
ACCOUNT UNLOCK ;

-- QUOTAS
ALTER USER "HR" QUOTA UNLIMITED ON USERS;

-- ROLES
ALTER USER "HR" DEFAULT ROLE "RESOURCE","CONNECT";

-- SYSTEM PRIVILEGES


7. 현재 접속 계정 확인 : show user;   >> USER이(가) "KOSA"입니다.


-- USER SQL
CREATE USER "KOSA" IDENTIFIED BY "1004"  
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP";

-- QUOTAS

-- ROLES
GRANT "CONNECT" TO "KOSA" WITH ADMIN OPTION;
GRANT "RESOURCE" TO "KOSA" WITH ADMIN OPTION;
ALTER USER "BITUSER" DEFAULT ROLE "CONNECT","RESOURCE";

-- SYSTEM PRIVILEGES


*/

show user;

/*
실습코드

CREATE TABLE EMP
(EMPNO number not null,
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR number ,
HIREDATE date,
SAL number ,
COMM number ,
DEPTNO number );
--alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';

INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,null,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,200,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,'1981-04-02',2975,30,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,300,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,'1981-04-01',2850,null,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,'1981-06-01',2450,null,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,'1982-10-09',3000,null,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',null,'1981-11-17',5000,3500,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,'1981-10-03',950,null,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,'1981-10-3',3000,null,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

COMMIT;

CREATE TABLE DEPT
(DEPTNO number,
DNAME VARCHAR2(14),
LOC VARCHAR2(13) );

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

COMMIT;



CREATE TABLE SALGRADE
( GRADE number,
LOSAL number,
HISAL number );

INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
COMMIT;

*/

select * from emp;
select * from dept;
select * from salgrade;

--데이터 삽입이 잘못 되었을 경우 ...
delete from dept;
commit;
--다시 insert 하고 commit
-----------------------------------------------------------------------------
--1. 사원 테이블에서 모든 데이터를 출력하세요
--쿼리는 대소문자 구분(X) 
select * from emp; 
SELECT * FROM emp;

--2. 특정 컬럼 데이터 출력하기
select empno, ename, sal
from emp;

select ename from emp;

--3. 컬럼명 가명칭(alias) 별칭 부여하기
select empno 사번, ename 이름
from emp;

--select empno 사   번, ename 이   름
--from emp;

select empno "사     번", ename "이     름"
from emp;

--SQL 표준 문법 (ANSI 문법) >> 표준 > oracle or Ms-sql or Mysql 에서 사용 가능
select empno as"사     번", ename as"이     름"
from emp;

--Oracle에서 문자열 데이터는 ' ' 사용해서 표현
--Oracle은 문자열 데이터에 대해서는 엄격하게 대소문자 구분
/*
JAVA: 문자 'A', 문자열 "AAA"
Oracle : 문자열 'A', 'AA', 'AAA'  --모든 것이 문자열이다
Oracle : A, a >> 다른 문자로 인지
*/

select empno, ename
from emp
where ename ='king';

select empno, ename
from emp
where ename ='KING';

/* 중요
select  절  3번
from 절     1번
where 절    2번
*/

--Oracle query(질의어) : 언어
--연산자 
--JAVA : + 숫자(산술연산)
--JAVA : + 문자열(결합연산)
--Oracle : 연산자 : 결합과 산술을 분리
--oracle 결합 연산자: || (파이프 두개ㅐ)
--oracle 산술 연산자: + (산술)
--Tip) Ms-SQL + (결합, 산술)

select '사원의 이름은' || ename || '입니다' as "사원정보"
from emp;

desc emp;
/*
타입
java    class Emp {private int empno, private String ename}
oracle  creat table Emp(empno number, ename varchar2(20));
oracle(컬럼) : 숫자, 문자열, 날짜
varchar2(10) >> 10 > 10byte > 문자열 데이터의 크기 > 한글 1자 2byte, 영문자, 특수문자, 공백은 1byte
--한글 5자, 영문 10자
*/-

select empno || deptno 
from emp;

--형변환 (내부적으로 숫자 (문자열) 자동 형변환
select empno || ename -- 숫자 || 문자열 결합
from emp;

select empno + ename --ORA-01722: invalid number
from emp;

--개발실
--사장님..
--사장님 said: 우리 회사에 직종이 몇개나 있나?
select job from emp;
--중복 데이터를 제거하는 키워드: distinct
select distinct job from emp;

--discintct 원리
--재미로 ... (grouping)
select distinct job, deptno 
from emp
order by job;

select distinct deptno, job
from emp
order by deptno;
?
--Oracle연산자
--java 거의 동일 (+, -, *, /) 나머지%
--Oracle 동일 (+, -, *, /) 나머지 연산지가 없다 >> 함수를 통해서 Mod() 
--ename like '%김%'

--사원테이블에서 사원의 급여를 100달러 인상한 결과를 출력하세요
select empno, ename, sal, sal+100  as "인상급여"
from emp;

desc emp;

--dual 임시 가상 테이블
select 100 + 100 from dual; --200
select 100 || 100 from dual; --100100
select '100' + 100 from dual; --'1234' 숫자형 문자 (형변환 가능) ***** ' ' 벗기면 숫자 되는 문자
select 'A100' + 100 from dual; --못더함(에러): ORA-01722: invalid number

show user;

--비교 연산자
--<   >   <=
--주의
--java 같다 (==) 할당(=) , javascript (==, ===)
--oracle 같다(=) 같지 않다(!=)

--논리연산자
--AND, OR, NOT

select empno, ename, sal
from emp
where sal >= 2000;

--사번이 7788번인 사원의 사번, 이름, 직종, 입사일을 출력하세요
select empno, ename, job, hiredate         --3
from emp                                   --1 (실행순서)
where empno =7788;                         --2

--개발자 : CRUD (Creat, Read, Update, Delete)
-- >> Creat(insert), Read(select), Update, delete
-- DB 작업: Read(select) 70% 비중, 가장 중요

--관리자 : 데이터의 백업과 복원, 장애(네트워크, 성능) 관리, 보완(사용자 권한, 암호화)
--튜닝 (퀴리튜닝, 하드웨어) >> 문장튜닝 >> 시간을 줄이는 작업
--설계 (모델러) : 설계(요구사항 정의, 분석) : erd

--사원의 이름이 king인 사운의 사번, 이름, 급여 정보를 출력하세요
select empno, ename, sal
from emp
where ename = 'KING'; --문자열 찾을 땐' ' 써야 하고 oracle은 엄격히 대소문자 구분한다

--급여가 2000달러 이상이면서 직종이 manager인 사원의 모든 정보를 출력하세요
select *
from emp
where sal>=2000 and job = 'MANAGER';

--이상 , 이하  (=)
--초과 , 미만  
/*      AND    OR
0 0      0     0
0 1      0     1
1 0      0     1
1 1      1     1
*/

--급여가 2000달러 초과이면서 직종이 manager인 사원의 모든 정보를 출력하세요
select *
from emp
where sal>2000 and job = 'MANAGER';

--오라클 날짜 (DB 서버의 날짜)
--오라클 날짜 (sysdate)
select sysdate from dual;
--22/09/27

select * from nls_session_parameters; --시스템 테이블
--현재 접속한 사용자(session)가 가지는 환경정보
--NLS_DATE_FORMAT	RR/MM/DD
--NLS_DATE_LANGUAGE	KOREAN
--NLS_TIME_FORMAT	HH24:MI:SSXFF

--일반적으로 2022-09-27 
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';

select sysdate from dual; --2022-09-27 09:52:46
--변경 정보는 현재 오라클 서버에 접속한 사용자의 작업 환경 설정
--그래서 접속을 끊었다가 다시 연결하면 원래 상태로 복원되어 있다. (RR-MM-DD)

select hiredate from emp;

select *
from emp
where hiredate = '1980-12-17';

/*
모든 시스템은 날짜 필수 구성
게시판
설계
글쓴이, 제목, 내용, 조회수, 작성날짜
insert into board(writer, title, content, hit, regdate)
           values('홍길동', '처음방가', '졸립다', 0, sysdate)
regdate: 컬럼의 데이터는 서버의 시간(DB 서버)
--TIP) ms-sql : select getdate()
       Mysql  : curdate(), curtime(), now(), sysdate()
*/

select *
from emp
where hiredate = '1980/12/17';  -- /인정

select *
from emp
where hiredate = '1980.12.17';  -- .인정

select *
from emp
where hiredate = '1980,12,17';  -- ,인정

select *
from emp
where hiredate = '80/12/17';   --안돼요 현재 format (yyyy-MM-dd)

--사원의 급여가 2000이상이고 4000이하인 모든 사람의 정보를 출력하세요
select *
from emp
where sal>=2000 and sal<=4000;
