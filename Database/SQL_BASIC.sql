show user;


/*
[1일차 수업]
1. 오라클 소프트웨어 다운로드
https://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html

2. Oracle Database 11g Release 2 Express Edition for Windows 64 (무료설치)

3. Oracle 설치(SYS, SYSTEM 계정의 대한 암호 : 1004)

4.Sqlplus 프로그램 제공(CMD) : GUI 환경 일반개발자 사용 불편

5.별도의 Tool 설치 무료(SqlDeveloper , https://dbeaver.io/)  ,
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
*/

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


--이상, 이하 (=)
--초과, 미만
/*
0
0
1
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
where sal>=2000 and sal<=4000; --같은 column 명 반복되는거 싫어한다.

--연산자: column이름 between A and B (= 포함)
select *
from emp
where sal between 2000 and 4000;

--사원의 급여가 2000초과 4000미만 인 모든 사원의 정보를 출력하세요 ( '=' 포함 안하려면 그냥 다 써야한다)
select *
from emp
where sal >2000 and sal<4000;

--부서번호가 10번 또는 20번 또는 30번인 사원의 사번, 이름, 급여, 부서번호를 출력하세요
select empno, ename, deptno
from emp
where deptno = 10 or deptno = 20 or deptno = 30;

--연산자 (IN 연산자)
select *
from emp
where deptno in(10, 20, 30);

--부서번호가 10번 또는 20번이 아닌 사원의 사번, 이름, 급여, 부서번호를 출력하세요
select *
from emp
where deptno!=10 and deptno !=20; --두가지 조건을 모두 만족하는 데이터

--IN 부정 >> NOT IN >> 부정의 and >> != ..and
select *
from emp
where deptno not in(10, 20);

--POINT: null >> oracle '값이 없다'는 의미 >> 필요악

create table member(
 userid varchar2(20) not null, --나는 user id에 null을 허용하지 않겠다 (필수입력)
 name varchar2(20) not null,  --나는 client로부터 이름을 필수로 입력받겠다
 hobby varchar2(50) -- default로 null 허용: 선택적 입력 사항
);
--begin

select * from member;
insert into member(userid, hobby) values('hong', 'basketball');
--ORA-01400: cannot insert NULL into ("KOSA"."MEMBER"."NAME")
insert into member(userid, name) values('hong', 'gildongHong');
select * from member;
--hobby >> null

--간단하게
--DB 서버마다 설정;
--DML(데이터 조작어): insert, update, delete
--oracle 실제 반영을 위해서 개발자에게: commit, rollback 강제
--MS-sql, Mysql은 default로 commit 걸어놨다. >> begin 명시 DML 작업 ... commit, rollback 강제

commit; --명령 (insert, update, delete) 실제 반영

--수당(comn)을 받지 않는 모든 사원의 정보를 출력하세요
--0도 데이터(수당을 받는 조건으로)
select comm from emp;

select comn from emp where comm = null;  --이런 문법은 존재하지 않아요

--null 비교는 (is null, is not null) 암기...
select comm from emp where comm is null;

--수당을 받는 사원들 (0도 수당 받는 것으로)
select * from emp where comm is not null;

--사원 테이블에서 사번, 이름, 급여, 수당, 총급여를 출력하세요
--총급여 정의(급여+수당)
select empno, ename, sal, comm, sal+comm as "총급여"
from emp;

/*
null 이란 녀석 ...
1. null과의 모든 연산의 결과는 null ex) 100+null > null, 100-null > null
2. 위 문제를 해결하기 위해서 함수를 만듬 >> nvl() , nvl2()  >> 암기
ex) nvl(column name, 대체값) >> 치환

Tip) ms-sql > null > convert()
     Mysql > null > IFNULL() 

*/
select empno, ename, sal, comm, sal + nvl(comm, 0) as "총급여"
from emp;

select 1000 + null from dual;

select 1000 + nvl(null, 0) from dual;

select comm, nvl(comm, 111111) from emp;

select nvl(null, 'hello world') from dual;

--사원의 급여가 1000이상이고 수당을 받지 않는 사원의 사번, 이름, 직종, 급여, 수당을 출력해라\
select empno, ename, sal, comm 
from emp 
where sal>=1000 and comm is null;


--DQL(Data Query Language): select
--DBL(Data Definition Language): 정의어: creat, alter, drop(Table 생성, 수정, 삭제)
--DML(Date Manuplation Language): 조작어: insert, update, delete(반드시 commit, rollback)

--java: class Board{private int boardno()}
--DB: create table Board(boardno number)

create table Board(
 boardid number not null, --숫자 이면서 필수 입력
 title varchar2(50) not null, --글제목 (한글 25자, 영문자 50지), 필수 입력
 content varchar2(2000) not null, --글 내용(한글 1000자, 영문자 2000) 필수 입력
 hp varchar2(20) --default로 null을 허용하겠다 (선택사항)
);
desc board;
select *from board;
insert into Board(boardid, title, content)
values(100, 'oracle', 'missedit^^');

select * from  board; 
--데이터 잘못 넣었네
--다시 복원
rollback;

select * from board;
commit ; --실반영

/*
commit or rollback
insert...1
insert...2
commit ...
insert3...
rollback...
*/
select boardid, title, content, nvl(hp, 'empty') as "HP"
from board;

--문자열 검색
--주소 검색: 검색어: 역삼 -> 역삼이라는 단어가 들어가 있는 모든 주소가 출력
--Like 패턴검색

--Like (문자열 패턴 검색 연산자)

--like 연산자 (와일드 카드 문자: 1. %(모든 것), _(한 문자) 결합해서 패턴을 생성 일치...
--검색이 한정적 >> java와 동일한 정규 표현식을 오라클에 적용

select *
from emp
where ename like '%A%'; --ename컬럼의 데이터의 A가 들어있는 모든 데이터를 뽑아라

select *
from emp
where ename like '%a%'; --대소문자 염격하게 구분

select *
from emp
where ename like 'A%'; --A로 시작하는 말 다 뽑아라

select *
from emp
where ename like '%E';

--주소검색
--select * from zip where dong like '%역삼%';
--회원검색
--select * from member where name like '이%';

select *
from emp
where ename like '%LL%'; --Allen, MILLER

select *
from emp
where ename like '%A%A%'; --A가 붙어 있든 띄워져 있든 2개 있는 데이터 --Adams, ABABA, AAAAA

select ename
from emp
where ename like '_A%'; --첫글자는 어떤 것이 와도 상관 없고 두 번째 글자만 A로 시작 --WARD, MARTIN, JAMES

--과제 regexp_like 연산자 (정규식)
select * from emp where regexp_like(ename, '[A-C]');
--regexp_like 사용 정규표현 검색 5개 만들기 (대상 EMP)


--데이터 정렬하기
--order by 컬럼명: 문자, 숫자, 날짜 정렬
--오름차순 : asc: 낮은순: default
--내림차순 : desc: 높은순
--비용(cost) 많이 드는 작업

select *
from emp
order by sal; --default asc

select *
from emp
order by sal desc;

--입사일이 가장 늦은 순으로 정렬해서 사번, 이름, 급여, 입사일을 출력하세요 (입사일이 늦을수록 숫자는 더 크다)
--가장 최근에 입사한 순으로
select empno, ename, sal, hiredate
from emp
order by hiredate desc;

select empno, ename
from emp
order by ename asc; --알파벳순


/*
select 절     3
from 절       1
where 절      2
order by 절   4 (select 결과를 정렬)
*/
select empno, ename, sal, job, hiredate
from emp
where job='MANAGER'
order by hiredate desc;
--emp데이터에서 manager직업을 가진 사람의 사번, 이름, 급여, 직업, 입사일을 입사일이 늦은 순으로 출력해라

select job, deptno
from emp
order by job asc, deptno desc; --job을 asc 하고서 각각의 job 그룹 안에서 deptno desc
--order by colmnname asc, colmn name asc...
--게시판... 답변 게시판

--연산자
--합집합(union) : 테이블과 테이블의 데이터를 합치는 것 (중복값 배제)
--합집합(union all) : 중복값 허용

create table uta(name varchar2(20));
insert into uta(name) values('AAA');
insert into uta(name) values('BBB');
insert into uta(name) values('CCC');
insert into uta(name) values('DDD');
commit; 
select * from uta;

create table ut(name varchar2(20));
insert into ut(name) values('AAA');
insert into ut(name) values('BBB');
insert into ut(name) values('CCC');
commit;

select * from ut
union 
select * from uta;

select * from ut
union all 
select * from uta;
--ut 집에 uta 가족들이 놀러간 것

--union 
--1. 대응되는 column의 type이 동일해야 한다.
select empno, ename from emp --숫자, 문자열 방
union 
select dname , deptno from dept; --문자열, 숫자
--emp네 집에 dept가 자기 식구들을 데리고 놀러감

select empno, ename from emp --숫자, 문자열 방
union 
select deptno , dname from dept; --문자열, 숫자

--2. 대응되는 column의 개수가 동일
--필요악이었던 null이 column을 대체
select empno, ename, job, sal from emp  --숫자, 문자열 방
union 
select deptno , dname , loc , null from dept;  --문자열, 숫자

----------------------------------------------------------------------------------
--초보 개발자가 의무적으로 해야하는 코드(단일 테이블 select)
---------------------------------------------------------------------------------
--함수
--오라클 함수 사용하긔
/*
단일 행 함수의 종류 
1) 문자형 함수 : 문자를 입력 받고 문자와 숫자 값 모두를 RETURN 할 수 있다.
2) 숫자형 함수 : 숫자를 입력 받고 숫자를 RETURN 한다.
3) 날짜형 함수 : 날짜형에 대해 수행하고 숫자를 RETURN 하는 MONTHS_BETWEEN 함수를
제외하고 모두 날짜 데이터형의 값을 RETURN 한다.
4) 변환형 함수 : 어떤 데이터형의 값을 다른 데이터형으로 변환한다.
5) 일반적인 함수 : NVL, DECODE
*/ 
--문자열 함수
select initcap('the super man') from dual; --The Super Man

select lower('AAA'), upper('aaa') from dual;

select ename, lower(ename)as "ename" from emp

select * from emp where lower(ename) = 'king'; 

select length('abcd') from dual; -- 문자열의 개수
select length('홍길동') from dual; --3개

select length('       홍 길 동a') from dual; --공백도 문자다

select concat('a', 'b') from dual;
select concat('a', 'b', 'c') from dual; --이런 건 없다(error). parameter 로 2개만 받음
select 'a' || 'b' || 'c' from dual;
select ename || '       ' || job from emp;ㅡ --유연한 표현
select concat(ename, job) from emp; 

--부분 문자 추출
--java : substring 
--oracle : substr 
select substr('ABCDE', 2, 3) from dual; --BCD
select substr('ABCDE', 1, 1) from dual --A
select substr('ABCDE', 3, 3) from dual --C

select substr('abcdesdfaefsdcwserfes', 10)
from dual;

select substr('ABCDE', -2, 1) from dual; --D
select substr('ABCDE', -2, 2) from dual; --DE

--사원테이블에서 ename colum의 데이터에 대해서 첫 글자는 소문자, 나머지 글자는 대문자
--출력하되 하나의 column으로 만들어 출력하시고 column의 별칭은 fullname으로 하고 첫 글자와 나머지
--문자 사이에는 공백 하나를 넣으세요
-->>SMITH >> s MITH 이렇게 되도록 해라
select lower(substr(ename, 1, 1)) from emp;
select upper(substr(ename, 2)) from emp;

select lower(substr(ename, 1, 1)) || ' ' || upper(substr(ename, 2)) as fullname from emp;

select lpad('ABC', 10, '*') from dual; --*******ABC

select rpad('ABC', 10, '%') from dual; --ABC%%%%%%%

--사용자의 비번 : hong1007 or k1234
--화면: 앞 두 글자 >> ho******
--                  k1***

select rpad(substr('hong1007', 1, 2), length('hong1007'),'*') from dual;
select rpad(substr('k1234', 1, 2), length('k1234'),'*') from dual;

--emp 테이블에서 ename column의 데이터를 출력하되 첫 글자만 출력하고 나머지는 *
select rpad(substr(ename, 1, 1), length(ename),'*') from emp; 

--문제
create table member2(
 id number, --null을 허용하겠다
 jumin varchar2(14)
);

insert into member2(id, jumin) values(100, '123456-1234567');
insert into member2(id, jumin) values(200, '234567-1234567');
commit;

select * from member2;
--출력결과
--100: 123456-*******
--200: 235467-*******
--가명칭은 "juminnumber"
select id || ' : ' || rpad(substr(jumin, 1, 7), length(jumin), '*') as juminnumber
from member2;

--rtrim 함수
--오른쪽 문자를 지워라
select rtrim('MILLER', 'ER') from  dual; --MILL

--ltrim 함수
--왼쪽 문자를 지워라
select ltrim('MILLLLLLLLLLLLLER', 'MIL')from  dual; --ER

--공백제거함수로 많이 쓴다
select '>' || rtrim('MILLER          ',' ') || '<' from dual;
select '>' || ltrim('          MILLER',' ') || '<' from dual;

--치환함수
select ename, replace(ename, 'A', 'WOW') from emp;

--숫자함수
--round (반올림 함수)
--trunc (절삭함수)(버림)
--mod() 나머지를 구하는 함수수
select round(12.345, 0) as "r" from dual;  --(실수, 0) >> 정수 부분만 남겨라 --12
select round(12.945, 0) as "r" from dual;  --(실수, 0) >> 정수 부분만 남겨라 --13

select round(12.345, 1) as "r" from dual;  --(실수, 1) >> 첫째자리까지 남겨라 --12.3
select round(12.565, 1) as "r" from dual;  --(실수, 1) >> 첫째자리까지 남겨라 --12.6

select round(12.345, -1) as "r" from dual; --10
select round(15.345, -1) as "r" from dual; --20
select round(15.345, -2) as "r" from dual; --0
-------------------------------------------------------------------------------
select trunc(12.345, 0) as "t" from dual;  --(실수, 0) >> 정수 부분만 남겨라 --12
select trunc(12.567, 0) as "t" from dual;  --(실수, 0) >> 정수 부분만 남겨라 --12

select trunc(12.345, 1) as "t" from dual;  --(실수, 1) >> 첫째자리까지 남겨라 --12.3
select trunc(12.565, 1) as "t" from dual;  --(실수, 1) >> 첫째자리까지 남겨라 --12.6

select trunc(12.345, -1) as "t" from dual; --10
select trunc(15.345, -1) as "t" from dual; --20
select trunc(15.345, -2) as "t" from dual; --0

--나머지
select 12/10 from dual; --1.2
select mod(12,10) from dual; --2
select mod(0, 0) from dual;
---------------------------------------------------------------------숫자함수 끝
--[날짜 함수]
--alter session set nls_date_format = 'YYYY-MM-DD HH24:MI:SS'; 실행
select sysdate from dual; --2022-09-27 16:00:38

--POINT (날짜 연산)
--1. Date + Number >> Date
--2. Date - Number >> Date
--3. Date - Date >> Number (일수)

select sysdate + 100 from dual; --2023-01-05 16:04:32
select sysdate + 1000 from dual; --2025-06-23 16:05:15

select hiredate from emp;
select months_between('2022-09-27', '2020-09-27') from dual;
select trunc (months_between(sysdate, '1999-05-29'), 0) from dual; --279개월

select '2022-01-01' +100 from dual; --error: '2022-01-01'는 날짜 형식을 가지는 문자 , 100은 숫자
--POINT 변환함수  to_date()

select to_date('2022-01-01') + 100 from dual;

--사원 테이블에서 사원들의 입사일에서 현재 날짜 까지의 근속 월수 출력
--사원이름, 입사일, 근속월수 출력
--단, 근속 월수는 정수 부분만 출력해라(반올림하지 말고)
select ename, hiredate, trunc (months_between(sysdate, hiredate), 0) as "근속월수"
from emp;

--2. 한 달이 31일 이라는 기준에서 근속 월수를 구해라
--반올림 하지 마세요, 함수 사용(X) >> 날짜 - 날짜 150일 
select ename, hiredate, trunc(((sysdate - hiredate)/31),0) as "근속월수"
from emp;

-----------------------------------------------------------------------------------
--여기까지 함수(문자, 숫자, 날짜) 까지
--------------------------------------------------------------------------------------
--[변환함수] Today POINT
--Oracle 데이터: 문자열, 숫자, 날짜
--to_char() : 숫자 -> 문자 (1000 -> $100,000) >> format 출력 형식 정의  
--                  날짜 -> 문자 ('2022-09-29' -> 2022년 09월 29일

--to_date : 문자 -> 날짜 
--select to_date('2022-01-01') + 100 from dual;

--to_number(): 문자 -> 숫자 >> 자동형변환
--select '100' + 100 from dual;
--select to_number('100') + 100 from dual;
--1. 
select '1' + 1 from dual; -- '1'문자를 -> 숫자로(형변환)
--원칙
select to_number('1')+ 1 from dual;

--2.
select sysdate, to_char(sysdate, 'YYYY') ||'년' as "YYYY",
to_char(sysdate, 'YEAR') as "YEAR",
to_char(sysdate, 'MM') as "MM",
to_char(sysdate, 'DD') as "DD",
to_char(sysdate, 'DAY') as "DAY",
to_char(sysdate, 'DY') as "DY"
from dual;

--입사일이 12월인 사원의 사번, 이름, 입사일, 입사년도, 입사월을 출력해라
select empno, ename, hiredate, to_char(hiredate, 'YYYY') as YYYY, 
    to_char(hiredate, 'MM') as MM
from emp
where to_char(hiredate, 'MM')='12';

select to_char(hiredate, 'YYYY MM DD') from emp;
--to_char() : 날짜 -> 형식 문자 변환
--오라클.pdf 68page 표참조

--to_char: 숫자 -> 형식문자 변환
--오라클.pdf 63 표참조
--1000000  -> $10,000,000

select '>' || to_char(12345, '999999999999999') || '<' from dual;
select '>' || ltrim(to_char(12345, '999999999999999')) || '<' from dual;

select '>' || to_char(12345, $999,999,999,999') || '<' from dual;

select sal, to_char(sal, '$999,999') from emp;

----------------------------------------------------------------------------------
--HR 계정으로 변경
show user;
--USER이(가) "HR"입니다.
select * from employees;
select sysdate from dual;
/*
사원테이블(employees)에서 사원의 이름은 last_name , first_name 합쳐서 fullname 별칭 
부여해서 출력하고 입사일은  YYYY-MM-DD 형식으로 출력하고 연봉(급여 *12)을 구하고 
연봉의 10%(연봉 * 1.1)인상한 값을
출력하고 그 결과는 1000단위 콤마 처리해서 출력하세요
단 2005년 이후 입사자들만 출력하세요 그리고 연봉이 높은 순으로  출력하세요
*/

--반드시 select* from emp; 해서 전체 목록이랑 column명 확인 하고서 문제에서 필요한 데이터 추출하는 코드 작성하긔!

select LAST_NAME || FIRST_NAME as fullname,
    to_char(HIRE_DATE, 'YYYY-MM-DD') as 입사일, 
    (SALARY*12) as 연봉,
    to_char((salary*12)*1.1, '$999,999,999') as 인상분
from employees
where to_char(hire_date, 'YYYY')>='2005' --substr(hire_date, 1, 4)>2005
--order by (salary*12) desc;
order by 연봉 desc;
--order by 절은 select 다음에 실행한다 >> select된 결과 column값 사용 가능(가명칭 사용 가능)

--문자함수, 숫자함수, 날짜함수
--변환함수 (to_char())

--일반함수 (nvl, nvl2...)
--집계함수 (avg(), sum(), min(), max())
--------------------------------------------------------------------------------
--22.09.28
show user;
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';
select sysdate from dual;

--------------------------------------------------------------------------------
--create table 테이블명 (column명 타입, column명 타입)
create table member3(age member);
--1건 또는 100건
insert into member3 (age) values(100);
insert into member3 (age) values(200);
insert into member3 (age) values(300);
insert into member3 (age) values(400);
--------------------------------------------------------------------------------
/*Java
class member3{
 private int age;
}
--1건의 데이터를 만들어라
member3 m = new member3();
m.setAge(100);

--100건 데이터 넣어라
List <member3> mlist = new ArrayList<member3>();
mlist.add(new member(100));
mlist.add(new member(200));
mlist.add(new member(300));
mlist.add(new member(400));

데이터 타입
문자열 타입
char(10)     >> 10byte >> 한글 5자, 영문자, 특수문자, 공백 10자 >> 고정길이 문자열
varchar2(10) >> 10byte >> 한글 5자, 영문자, 특수문자, 공백 10자 >> 가변길이 문자열

>>
char(10)     >> 'abc' (3byte) >> [a] [b] [c] [] [] [] [] [] [] [] >> 공간의 변화가 없어요
varchar2(10) >> 'abc' (3byte) >> [a] [b] [c] ... >> 데이터 크기 만큼만 공간 확보

사람의 이름
create table member (name char(30))
create table member (name varchar2(30))  (O)

성별 (남 또는 여)
create table member (name char(3))
create table member (name varchar2(3))   (X)

약속: 고정길이 문자열 (남/여, ...대/중/소 ... 주민번호) 와 같이 문자열의 길이가 정해져 있을 경우 char() 사용  -> 성능
     가변길이 문자열 (사람의 이름, 취미, 주소) varchar2()
     
char(), varchar2() 고민: 한글과 영어 혼합.
varchar2(10)

unicode (2byte) : 한글, 영문자, 특수문자, 공백 >> 2byte

nchar(20)     >> 20자(들어갈 수 있는 문자의 개수) >>크기 20*2byte = 40byte
nvarchar2(20) >> 20자
*/

--오라클 함수 ......
select * from SYS.NLS_DATABASE_PARAMETERS;
--NLS_CHARACTERSET  : 	AL32UTF8  한글 3byte 인식
--KO16KSC5601 2Byte (현재 변환하면 한글 다깨짐)
select * from nls_database_parameters where parameter like '%CHAR%';
------------------------------------------------------------------------------
create table test2(name varchar2(2));

insert into test2(name) values('a');
insert into test2(name) values('aa');
insert into test2(name) values('가'); --한글 1자 3byte 인지
-------------------------------------------------------------------------------
?--일반함수 (프로그램 성격이 가장 강한 함수)
--nvl(), nvl2() >> null 처리하는 함수
--decode() >> jaba if 문
--case() >> java의 switch 문

--오라클 SQL (변수, 제어문 개념이 없다.)
--오라클 PL-SQL ( 변수, 제어문) 고급 가능

select comm, nvl(comm, 0) from emp;

create table t_emp(
 id number(6), -- j--정수 6자리
 job nvarchar2(20)
);

select * from t_emp;

insert into t_emp(id, job) values(100, 'IT');
insert into t_emp(id, job) values(200, 'sales');
insert into t_emp(id, job) values(300, 'MGR');
insert into t_emp(id, job) values(400);
insert into t_emp(id, job) values(500, 'MGR');
commit;

select * from t_emp;

select decode(id, 100, '아이티', 
                      200, '영업부', 
                      '기타부서') as 부서이름
from t_emp;

select empno, ename, deptno, decode(deptno,
                                            10, '인사부',
                                            20, '관리부',
                                            30, '회계부',
                                            40, '부서',
                                            'ETC') as 부서이름                                            
from emp;


CREATE TABLE t_emp2(
id NUMBER(2),
jumin CHAR(7)
);
INSERT INTO t_emp2(id, jumin) VALUES(1,'1234567');
INSERT INTO t_emp2(id, jumin) VALUES(2,'2234567');
INSERT INTO t_emp2(id, jumin) VALUES(3,'3234567');
INSERT INTO t_emp2(id, jumin) VALUES(4,'4234567');
INSERT INTO t_emp2(id, jumin) VALUES(5,'5234567');
COMMIT;

/*
t_emp2 테이블에서 id, jumin 데이터를 출력하되 jumin 컬럼의 앞자리가 1이면
'남성' 출력 2이면 '여성' 3이면 '중성' 그외는  '기타' 라고 출력하세요
컬럼명은 '성별'
*/

select * from t_emp2;


select id, decode(substr(jumin,1,1),    
                                1, '남성',
                                  2, '여성',
                                    3, '중성',
                                    '기타') as "성별"
from t_emp2;

/*
응용문제: hint) if문 안에 if문
부서번호가 20번인 사원 중에서 SMITH라는 이름을 가진 사원이라면 HELLO문자 출력하고
부서 번호가 20번인 사원 중에서 SMITH라는 이름을 가진 사원이 아니라면 WORLD 문자 출력하고
부서 번호가 20번인 사원이 아니라면 ETC라는 문자를 출력하세요
EMP테이블에서요...
*/
select empno, ename, deptno, decode(deptno, 20, decode(ename, 'SMITH', 'HELLO', 'WORLD'), 'ETC')
from emp;

--decode 다양한 통계에 이용

/*
--CASE문 문법
CASE 조건식 WHEN 결과1 THEN 출력1
           WHEN 결과2 THEN 출력2
           WHEN 결과3 THEN 출력3
           ELSE 출력4
END "컬럼명'
*/

create table t_zip
(
    zipcode number(10)
);

select * from t_zip;

insert into t_zip(zipcode) values(2);
insert into t_zip(zipcode) values(31);
insert into t_zip(zipcode) values(32);
insert into t_zip(zipcode) values(41);
commit;

select * from t_zip;

select '0' || to_char(zipcode), case zipcode when 2 then 'Seoul'
                                             when 31 then 'GyeongGi'
                                             when 41 then 'JEju'
                                             else 'local ETC'
                                end "Local Name"
from t_zip;

/*
사원테이블에서 사원급여가 1000달러 이하면 4급
1001달러 2000달라 이하면 3급
2001달러 3000달라 이하면 2급
3001달러 4000달라 이하면 1급
4000달러 이상이면 '특급'이라는 데이터를 출력하세요
--1. case 칼럼명 when 결과 the 출력
--2. 비교식이 필요하다면
     case when 조건비교식 then
          when ...
          when ...
*/
select case when sal <= 1000  then 'class 4'
 when sal between 1001 and 2000  then 'class 3'
  when sal between 2001 and 3000  then 'class 2'
   when sal between 3001 and 4000  then 'class 1'
   else '특급'
end "급수" , empno, ename
from emp;
--------------------------------------------------------------------------------
--문자함수, 숫자함수, 날짜함수, 변환함수(to_char, to_number, to_date)
--일반함수 (nvl, decode() , case구문)
--기본함수 end
--------------------------------------------------------------------------------
--집계함수(그룹) 함수
--오라클.pdf (p68)
/*
1. count(*) >> row수, count(컬럼명) >> 데이터 건수 > (null은 포함하지 않아요)
2. sum()
3. ave()
4. mac()
5. min()
--기타

1. 집계함수는 group by 절과 같이 사용
2. 모든 집계 함수는 null값을 무시한다.
3. select 절에 집계함수 이외에 다른 컬럼이 오면 반드시 그 컬럼은 group by 절에 명시
*/

select count(*) from emp; --14개의 row

select count(empno) from emp;

select count(comm) from emp; --6
selelct comm from emp;

select count(nvl(comm, 0)) from emp;  --POINT
--급여의 합
select sum(sal) as 급여의합 from emp;

select round(avg(sal),0) as 급여의평균 from emp;

--사장님 "우리 회사의 총 수당이 얼마나 지급 되었나??"
select sum(comm) from emp;

--수당의 평균?
select trunc(avg(comm), 0) from emp; --721달러  (null 무시)
select (300+200+30+300+3500+0) /6 from dual;

select trunc(avg(nvl(comm, 0))) from emp; -- 309달러

--둘 다
--개발자 721 , 309 둘 다 맞다
--회사의 규정 (전체 사원수 기준) >> 309 정답
--회사의 규정 (받는 사원수 기준) >> 721 정답

select max(sal) from emp;
select min(sal) from emp;
select empno, count(empno) from emp; --ORA-00937: not a single-group group function
--     14건,      1건

select sum(sal), avg(sal), max(sal), min(sal), count(sal) from emp;

--부서별 평균 급여 구해라
select deptno, avg(sal)
from emp
group by deptno;

--직종별 평균 급여를 구해라
select job, avg(sal)
from emp
group by job;

--직종별, 평균 급여, 급여합, 최대급여, 최소급여, 건수를 출력하세요
select job, avg(sal), sum(sal), max(sal), min(sal), count(sal)
from emp
group by job;

/*
그룹
distinct 컬럼명1. 컬럼명2

order by 컬럼명1, 컬럼명2

group by 컬럼명1, 컬럼명2
*/
--부서별, 직종별 급여의 합을 구하세요
select deptno, job, sum(sal)
from emp
group by deptno, job;

/*
select 절        4
from 절          1
where 절         2
group by 절      3
order by 절      5
*/

--직종별 평균 급여가 3000달러 이상인 사원의 직종과 평균 급여를 출력해라
select job, avg(sal) as avgsal
from emp
--where 조건 --집계된 결과를 조건으로 못해요
group by job
having avg(sal) >=3000;       --group by 조건절
                              --having 절에서는 select에서 설정한 가명칭 사용하지 못한다(실행순서 때문에)
                              
/*
1. from의 조건절 where
2. group by 조건절 having
select   6
from     1
where    2
group by 4
having   5
order by 7
*/

/* 1.사원테이블에서 직종별 급여합을 출력하되 수당은 지급 받고 급여의 합이 5000 이상인 
사원들의 목록을 출력하세요
급여의 합이 낮은 순으로 출력하세요 */
select job, sum(sal) as sumsal
from emp
where comm is not null --comm이 null이 아닌 것 거름
group by job
having sum(sal)>=5000
order by sumsal asc;

/* 2. 사원테이블에서 부서 인원이 4명보다 많은 부서의 부서번호 ,인원수 , 급여의 합을 출력하세요 */
select deptno, count(*) as "부서별인원", sum(sal) as "부서별 급여의 합"
from emp
group by deptno
having count(*)>4 ;


/* 3. 사원테이블에서 직종별 급여의 합이 5000를 초과하는 직종과 급여의 합을 출력하세요
단 판매직종(salesman) 은 제외하고 급여합으로 내림차순 정렬하세요 */
select job, sum(sal) as "sumsal"
from emp
where job != 'SALESMAN'
group by job
having (sum(sal))>5000
order by sum(sal) desc;

---------------------------------------------------------------------------------
--단일 테이블에 데이터를 가져오는 것은 END--------------------------------------------
---------------------------------------------------------------------------------
--여러개의 테이블에서 원하는 데이터를 추출하는 방법
--JOIN(조인)---------------------------------------------------------------------
--다중 테이블로부터 데이터 검색
/* 
Cartesian Product 모든 가능한 행들의 Join
Equijoin Join 조건이 정확히 일치하는 경우 사용(일반적으로 PK 와 FK 사용)
Non-Equijoin Join 조건이 정확히 일치하지 않는 경우에 사용(등급,학점)
Outer Join Join 조건이 정확히 일치하지 않는 경우에도 모든 행들을 출력
Self Join 하나의 테이블에서 행들을 Join 하고자 할 경우에 사용
Set Operators 여러 개의 SELECT 문장을 연결하여 작성한다 */

--RDBMS (관계형)
/*
관계 (테이블과 테이블과의 관계)

1:1
1:N (70%)
M:N
*/

/*
create table M (M1 char(6) , M2 char(10));
create table S (S1 char(6) , S2 char(10));
create table X (X1 char(6) , X2 char(10));

insert into M values('A','1');
insert into M values('B','1');
insert into M values('C','3');
insert into M values(null,'3');
commit;

insert into S values('A','X');
insert into S values('B','Y');
insert into S values(null,'Z');
commit;

insert into X values('A','DATA');
commit;
*/

select * from m;
select * from s;
select * from x;

/*
1. 등가조인 (equi join)
원테이블과 대응되는 테이블에 있는 컬럼의 데이터를 1:1 매핑
1.1 문법
-SQL JOIN 문법(오라클 문법) > 간단
-ASNI문법(표준) 권장 > [inner] join on 조건절
*/

select m.m1, m.m2, s.s2
from m, s
where m.m1 = s.s1;  --권장사항 아니다

--ANSI 문법 (표준문법)
select *
from m inner join s --[inner] 생략 가능 > from m join s 이렇게 써도 된다.
on m.m1 = s.s1;

select m.m1, m.m2, s.s2
from m join s --구문
on m.m1 = s.s1 ;--on 조인의 조건절

--사원번호, 사원이름, 부서번호, 부서이름을 출력하세요
select emp.empno, emp.ename, emp.deptno, dept.dname
from emp join dept
on emp.deptno = dept.deptno;

--가명칭으로 바꾸면
select e.empno, e.ename, e.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno;

select *
from m join x
on m.m1 = x.x1;

select m.m1, m.m2, x.x2
from m join x
on m.m1 = x.x1;
--??
select m.m1, m.m2, s.s2, x.x2
from m , s, x
on m.m1 = s.s1 and s.s1 = x.x1;

--a=b, b=c, a=c
--ANSI 문법 (권장)
select *
from m join s on m.m1 = s.s1
       join x on s.s1 = x.x1;
       
--HR계정으로 이동
show user; --USER 이(가) "HR" 입니다.
select * from employees;
select * from departments;
select * from locations;

--문제: 사번, 이름(last_name), 부서번호, 부서이름을 출력하세요
select count(*)
from employees; --107명

select e.employee_id,
       e.last_name,
       e.department_id,
       d.department_name
from employees e join departments d
on e.department_id = d.department_id;
--문제점
--사원수 원래 107명인데 누군가 누락되어있다.
select * from employees where department_id is null; --null은 join조건 안됨 > 누락
--등가조인 null 처리 불가 >> 다른 join 써야한다 >> 잠시 후에

--1. 사번, 이름(last_name), 부서번호, 부서이름, 지역코드, 도시명
select e.employee_id,
       e.last_name, 
       e.department_id, 
       d.department_name, 
       d.location_id, 
       l.city
from employees e join departments d
on e.department_id = d.department_id
join locations l on d.location_id = l.location_id;
---------------------------------------------------------------------------------
show user; --USER이(가) "KOSA"입니다.

--2. 비등가 조인 (non-equi join) => 1:1로 비교할 column이 없는 경우
--의미만 존재 >> 등가조인의 문법을 그대로 사용
--1:1매핑 on emp.deptno = dept.deptno
select * from emp;
select * from salgrade;

select e.empno, e.ename, e.sal, s.grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal;

--3. outer join (equi join 먼저 선행하고 나서 + 남아있는 데이터를 가져오면 돼요)
--outer join 주종관계를 파악
--주인이 되는 테이블의 남은 데이터를 가져올 수 있다.
--문법
/*
3.1 left outer join (왼쪽이 주인)
3.2 right out join (오른쪽이 주인)
3.3 full outer join (left, right >> union)
*/
select * 
from m left join s 
on m.m1 = s.s1;

select *
from m right join s
on m.m1 = s.s1;

select *
from m full outer join s
on m.m1 = s.s1;


--HR계정으로 이동
show user; --USER 이(가) "HR" 입니다.
select * from employees;
select * from departments;
select * from locations;

--문제: 사번, 이름(last_name), 부서번호, 부서이름을 출력하세요
select count(*)
from employees; --107명

select e.employee_id,
       e.last_name,
       e.department_id,
       d.department_name
from employees e left join departments d
on e.department_id = d.department_id; -- 이렇게 하면 107명 사원들 다 나온다 (null 포함해서)
--문제점
--사원수 원래 107명인데 누군가 누락되어있다.
select * from employees where department_id is null; --null은 join조건 안됨 > 누락
--등가조인 null 처리 불가 >> 다른 join 써야한다 >> 잠시 후에

---------------------------------------------------------------------------------
select * from emp;
--3. self join (자기참조) -> 문법(X) 의미만 존재 >> 등가조인(문법)
--하나의 테이블에 있는 column 이 자신의 테이블에 있는 다른 column을 참조하는 경우
--Emp >> Mgr(관리자)
select e.empno, e.ename, m.empno, m.ename
from emp e join emp m
on e.mgr = m.empno; --문제가 있음: 사원 원래 14명인데 13명 밖에 안나옴.. 

select * from emp where ename = 'KING';

select e.empno, e.ename, m.empno, m.ename
from emp e left join emp m
on e.mgr = m.empno; --문제 해결됨 join 앞에 left 붙여서

/*
1. 사원들의 이름, 부서번호, 부서이름을 출력하라.
2. DALLAS에서 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 출력하라.
3. 이름에 'A'가 들어가는 사원들의 이름과 부서이름을 출력하라.
4. 사원이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 출력하는데 월급이 3000이상인 사원을 출력하라.
5. 직위(직종)가 'SALESMAN'인 사원들의 직위와 그 사원이름, 그리고 그 사원이 속한 부서 이름을 출력하라.
6. 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉+커미션, 급여등급을 출력하되, 각각의 컬럼명을 '사원번호', '사원이름',
'연봉','실급여', '급여등급'으로 하여 출력하라.(비등가 ) 1 : 1 매핑 대는 컬럼이 없다
7. 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라.
8. 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라. 그리고 그 출력된
결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하라.
9. 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호',
'사원이름', '관리자번호', '관리자이름'으로 하여 출력하라.
SELF JOIN (자기 자신테이블의 컬럼을 참조 하는 경우)
*/
show user;
select * from emp;
select * from dept;

--1.사원들의 이름, 부서번호, 부서이름을 출력하라.
select e.ename, e.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno;

--2. DALLAS에서 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 출력하라.
select e.ename, e.job, d.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno
where d.loc = 'DALLAS';


--3. 이름에 'A'가 들어가는 사원들의 이름과 부서이름을 출력하라.
select e.ename, d.dname
from emp e join dept d
on e.deptno = d.deptno
where e.ename like '%A%';


--4. 사원이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 출력하는데 월급이 3000이상인 사원을 출력하라.
select e.ename, d.dname, e.sal
from emp e join dept d
on e.deptno = d.deptno
where e.sal>=3000;


--5. 직위(직종)가 'SALESMAN'인 사원들의 직위와 그 사원이름, 그리고 그 사원이 속한 부서 이름을 출력하라.
select e.job, e.ename, d.dname
from emp e join dept d
on e.deptno = d.deptno
where e.job = 'SALESMAN';


--6. 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉+커미션, 급여등급을 출력하되, 각각의 컬럼명을 '사원번호', '사원이름',
--'연봉','실급여', '급여등급'으로 하여 출력하라.(비등가 ) 1 : 1 매핑 대는 컬럼이 없다

--7.부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라.



--8. 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 사원이름, 월급, 급여등급을 출력하라. 그리고 그 출력된
--결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하라.
select

--9. 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호',
--'사원이름', '관리자번호', '관리자이름'으로 하여 출력하라.


--------------------------------------------------------------------------------
--기타
--NATURAL JOIN
--Equijoin과 동일하다고 보시면 됩니다.
-- [두 테이블]의 [동일한 이름]을 가지는 칼럼은 [모두 조인]이 됩니다.
SELECT empno, ename, deptno , dname FROM emp NATURAL JOIN dept ;

--JOIN ~ USING 
--NATURAL JOIN의 단점은 동일한 이름을 가지는 칼럼은 모두 조인이 되었는데 
--USING 문을 사용하면 컬럼을 선택해서 조인을 할 수가 있습니다.
SELECT e.empno, e.ename, deptno , dname FROM emp e JOIN dept d USING(deptno);

--조인 조건이 없는 조인결과
select * from emp , dept;

select * from emp cross join dept;
--------------------------------------------------------------------------------

