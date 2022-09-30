show user;


/*
[1���� ����]
1. ����Ŭ ����Ʈ���� �ٿ�ε�
https://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html

2. Oracle Database 11g Release 2 Express Edition for Windows 64 (���ἳġ)

3. Oracle ��ġ(SYS, SYSTEM ������ ���� ��ȣ : 1004)

4.Sqlplus ���α׷� ����(CMD) : GUI ȯ�� �Ϲݰ����� ��� ����

5.������ Tool ��ġ ����(SqlDeveloper , https://dbeaver.io/)  ,
                 ����(��� , ������ , SqlGate) ������Ʈ�� ��ġ Ȱ�� ^^

6. SqlDeveloper ���� ���ؼ� Oracle Server ���� ....
   >> HR ���� : ��ȣ 1004 , Unlock 2���� ��밡�� .... (������� �ǽ� ���̺�)
   >> ���ο� ���� : KOSA

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


7. ���� ���� ���� Ȯ�� : show user;   >> USER��(��) "KOSA"�Դϴ�.


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
�ǽ��ڵ�

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

--������ ������ �߸� �Ǿ��� ��� ...
delete from dept;
commit;
--�ٽ� insert �ϰ� commit
-----------------------------------------------------------------------------
--1. ��� ���̺��� ��� �����͸� ����ϼ���
--������ ��ҹ��� ����(X) 
select * from emp; 
SELECT * FROM emp;

--2. Ư�� �÷� ������ ����ϱ�
select empno, ename, sal
from emp;

select ename from emp;

--3. �÷��� ����Ī(alias) ��Ī �ο��ϱ�
select empno ���, ename �̸�
from emp;

--select empno ��   ��, ename ��   ��
--from emp;

select empno "��     ��", ename "��     ��"
from emp;

--SQL ǥ�� ���� (ANSI ����) >> ǥ�� > oracle or Ms-sql or Mysql ���� ��� ����
select empno as"��     ��", ename as"��     ��"
from emp;

--Oracle���� ���ڿ� �����ʹ� ' ' ����ؼ� ǥ��
--Oracle�� ���ڿ� �����Ϳ� ���ؼ��� �����ϰ� ��ҹ��� ����
/*
JAVA: ���� 'A', ���ڿ� "AAA"
Oracle : ���ڿ� 'A', 'AA', 'AAA'  --��� ���� ���ڿ��̴�
Oracle : A, a >> �ٸ� ���ڷ� ����
*/

select empno, ename
from emp
where ename ='king';

select empno, ename
from emp
where ename ='KING';

/* �߿�
select  ��  3��
from ��     1��
where ��    2��
*/

--Oracle query(���Ǿ�) : ���
--������ 
--JAVA : + ����(�������)
--JAVA : + ���ڿ�(���տ���)
--Oracle : ������ : ���հ� ����� �и�
--oracle ���� ������: || (������ �ΰ���)
--oracle ��� ������: + (���)
--Tip) Ms-SQL + (����, ���)

select '����� �̸���' || ename || '�Դϴ�' as "�������"
from emp;

desc emp;

/*
Ÿ��
java    class Emp {private int empno, private String ename}
oracle  creat table Emp(empno number, ename varchar2(20));
oracle(�÷�) : ����, ���ڿ�, ��¥
varchar2(10) >> 10 > 10byte > ���ڿ� �������� ũ�� > �ѱ� 1�� 2byte, ������, Ư������, ������ 1byte
--�ѱ� 5��, ���� 10��
*/

select empno || deptno 
from emp;

--����ȯ (���������� ���� (���ڿ�) �ڵ� ����ȯ
select empno || ename -- ���� || ���ڿ� ����
from emp;

select empno + ename --ORA-01722: invalid number
from emp;

--���߽�
--�����..
--����� said: �츮 ȸ�翡 ������ ��� �ֳ�?
select job from emp;
--�ߺ� �����͸� �����ϴ� Ű����: distinct
select distinct job from emp;

--discintct ����
--��̷� ... (grouping)
select distinct job, deptno 
from emp
order by job;

select distinct deptno, job
from emp
order by deptno;
?
--Oracle������
--java ���� ���� (+, -, *, /) ������%
--Oracle ���� (+, -, *, /) ������ �������� ���� >> �Լ��� ���ؼ� Mod() 
--ename like '%��%'

--������̺��� ����� �޿��� 100�޷� �λ��� ����� ����ϼ���
select empno, ename, sal, sal+100  as "�λ�޿�"
from emp;

desc emp;

--dual �ӽ� ���� ���̺�
select 100 + 100 from dual; --200
select 100 || 100 from dual; --100100
select '100' + 100 from dual; --'1234' ������ ���� (����ȯ ����) ***** ' ' ����� ���� �Ǵ� ����
select 'A100' + 100 from dual; --������(����): ORA-01722: invalid number

show user;

--�� ������
--<   >   <=
--����
--java ���� (==) �Ҵ�(=) , javascript (==, ===)
--oracle ����(=) ���� �ʴ�(!=)

--��������
--AND, OR, NOT

select empno, ename, sal
from emp
where sal >= 2000;

--����� 7788���� ����� ���, �̸�, ����, �Ի����� ����ϼ���
select empno, ename, job, hiredate         --3
from emp                                   --1 (�������)
where empno =7788;                         --2

--������ : CRUD (Creat, Read, Update, Delete)
-- >> Creat(insert), Read(select), Update, delete
-- DB �۾�: Read(select) 70% ����, ���� �߿�

--������ : �������� ����� ����, ���(��Ʈ��ũ, ����) ����, ����(����� ����, ��ȣȭ)
--Ʃ�� (����Ʃ��, �ϵ����) >> ����Ʃ�� >> �ð��� ���̴� �۾�
--���� (�𵨷�) : ����(�䱸���� ����, �м�) : erd

--����� �̸��� king�� ����� ���, �̸�, �޿� ������ ����ϼ���
select empno, ename, sal
from emp
where ename = 'KING'; --���ڿ� ã�� ��' ' ��� �ϰ� oracle�� ������ ��ҹ��� �����Ѵ�

--�޿��� 2000�޷� �̻��̸鼭 ������ manager�� ����� ��� ������ ����ϼ���
select *
from emp
where sal>=2000 and job = 'MANAGER';


--�̻�, ���� (=)
--�ʰ�, �̸�
/*
0
0
1
1 1      1     1
*/

--�޿��� 2000�޷� �ʰ��̸鼭 ������ manager�� ����� ��� ������ ����ϼ���
select *
from emp
where sal>2000 and job = 'MANAGER';

--����Ŭ ��¥ (DB ������ ��¥)
--����Ŭ ��¥ (sysdate)
select sysdate from dual;
--22/09/27

select * from nls_session_parameters; --�ý��� ���̺�
--���� ������ �����(session)�� ������ ȯ������
--NLS_DATE_FORMAT	RR/MM/DD
--NLS_DATE_LANGUAGE	KOREAN
--NLS_TIME_FORMAT	HH24:MI:SSXFF

--�Ϲ������� 2022-09-27 
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';

select sysdate from dual; --2022-09-27 09:52:46
--���� ������ ���� ����Ŭ ������ ������ ������� �۾� ȯ�� ����
--�׷��� ������ �����ٰ� �ٽ� �����ϸ� ���� ���·� �����Ǿ� �ִ�. (RR-MM-DD)

select hiredate from emp;

select *
from emp
where hiredate = '1980-12-17';

/*
��� �ý����� ��¥ �ʼ� ����
�Խ���
����
�۾���, ����, ����, ��ȸ��, �ۼ���¥
insert into board(writer, title, content, hit, regdate)
           values('ȫ�浿', 'ó���氡', '������', 0, sysdate)
regdate: �÷��� �����ʹ� ������ �ð�(DB ����)
--TIP) ms-sql : select getdate()
       Mysql  : curdate(), curtime(), now(), sysdate()
*/

select *
from emp
where hiredate = '1980/12/17';  -- /����

select *
from emp
where hiredate = '1980.12.17';  -- .����

select *
from emp
where hiredate = '1980,12,17';  -- ,����

select *
from emp
where hiredate = '80/12/17';   --�ȵſ� ���� format (yyyy-MM-dd)

--����� �޿��� 2000�̻��̰� 4000������ ��� ����� ������ ����ϼ���
select *
from emp
where sal>=2000 and sal<=4000; --���� column �� �ݺ��Ǵ°� �Ⱦ��Ѵ�.

--������: column�̸� between A and B (= ����)
select *
from emp
where sal between 2000 and 4000;

--����� �޿��� 2000�ʰ� 4000�̸� �� ��� ����� ������ ����ϼ��� ( '=' ���� ���Ϸ��� �׳� �� ����Ѵ�)
select *
from emp
where sal >2000 and sal<4000;

--�μ���ȣ�� 10�� �Ǵ� 20�� �Ǵ� 30���� ����� ���, �̸�, �޿�, �μ���ȣ�� ����ϼ���
select empno, ename, deptno
from emp
where deptno = 10 or deptno = 20 or deptno = 30;

--������ (IN ������)
select *
from emp
where deptno in(10, 20, 30);

--�μ���ȣ�� 10�� �Ǵ� 20���� �ƴ� ����� ���, �̸�, �޿�, �μ���ȣ�� ����ϼ���
select *
from emp
where deptno!=10 and deptno !=20; --�ΰ��� ������ ��� �����ϴ� ������

--IN ���� >> NOT IN >> ������ and >> != ..and
select *
from emp
where deptno not in(10, 20);

--POINT: null >> oracle '���� ����'�� �ǹ� >> �ʿ��

create table member(
 userid varchar2(20) not null, --���� user id�� null�� ������� �ʰڴ� (�ʼ��Է�)
 name varchar2(20) not null,  --���� client�κ��� �̸��� �ʼ��� �Է¹ްڴ�
 hobby varchar2(50) -- default�� null ���: ������ �Է� ����
);
--begin

select * from member;
insert into member(userid, hobby) values('hong', 'basketball');
--ORA-01400: cannot insert NULL into ("KOSA"."MEMBER"."NAME")
insert into member(userid, name) values('hong', 'gildongHong');
select * from member;
--hobby >> null

--�����ϰ�
--DB �������� ����;
--DML(������ ���۾�): insert, update, delete
--oracle ���� �ݿ��� ���ؼ� �����ڿ���: commit, rollback ����
--MS-sql, Mysql�� default�� commit �ɾ����. >> begin ��� DML �۾� ... commit, rollback ����

commit; --��� (insert, update, delete) ���� �ݿ�

--����(comn)�� ���� �ʴ� ��� ����� ������ ����ϼ���
--0�� ������(������ �޴� ��������)
select comm from emp;

select comn from emp where comm = null;  --�̷� ������ �������� �ʾƿ�

--null �񱳴� (is null, is not null) �ϱ�...
select comm from emp where comm is null;

--������ �޴� ����� (0�� ���� �޴� ������)
select * from emp where comm is not null;

--��� ���̺��� ���, �̸�, �޿�, ����, �ѱ޿��� ����ϼ���
--�ѱ޿� ����(�޿�+����)
select empno, ename, sal, comm, sal+comm as "�ѱ޿�"
from emp;

/*
null �̶� �༮ ...
1. null���� ��� ������ ����� null ex) 100+null > null, 100-null > null
2. �� ������ �ذ��ϱ� ���ؼ� �Լ��� ���� >> nvl() , nvl2()  >> �ϱ�
ex) nvl(column name, ��ü��) >> ġȯ

Tip) ms-sql > null > convert()
     Mysql > null > IFNULL() 

*/
select empno, ename, sal, comm, sal + nvl(comm, 0) as "�ѱ޿�"
from emp;

select 1000 + null from dual;

select 1000 + nvl(null, 0) from dual;

select comm, nvl(comm, 111111) from emp;

select nvl(null, 'hello world') from dual;

--����� �޿��� 1000�̻��̰� ������ ���� �ʴ� ����� ���, �̸�, ����, �޿�, ������ ����ض�\
select empno, ename, sal, comm 
from emp 
where sal>=1000 and comm is null;


--DQL(Data Query Language): select
--DBL(Data Definition Language): ���Ǿ�: creat, alter, drop(Table ����, ����, ����)
--DML(Date Manuplation Language): ���۾�: insert, update, delete(�ݵ�� commit, rollback)

--java: class Board{private int boardno()}
--DB: create table Board(boardno number)

create table Board(
 boardid number not null, --���� �̸鼭 �ʼ� �Է�
 title varchar2(50) not null, --������ (�ѱ� 25��, ������ 50��), �ʼ� �Է�
 content varchar2(2000) not null, --�� ����(�ѱ� 1000��, ������ 2000) �ʼ� �Է�
 hp varchar2(20) --default�� null�� ����ϰڴ� (���û���)
);
desc board;
select *from board;
insert into Board(boardid, title, content)
values(100, 'oracle', 'missedit^^');

select * from  board; 
--������ �߸� �־���
--�ٽ� ����
rollback;

select * from board;
commit ; --�ǹݿ�

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

--���ڿ� �˻�
--�ּ� �˻�: �˻���: ���� -> �����̶�� �ܾ �� �ִ� ��� �ּҰ� ���
--Like ���ϰ˻�

--Like (���ڿ� ���� �˻� ������)

--like ������ (���ϵ� ī�� ����: 1. %(��� ��), _(�� ����) �����ؼ� ������ ���� ��ġ...
--�˻��� ������ >> java�� ������ ���� ǥ������ ����Ŭ�� ����

select *
from emp
where ename like '%A%'; --ename�÷��� �������� A�� ����ִ� ��� �����͸� �̾ƶ�

select *
from emp
where ename like '%a%'; --��ҹ��� �����ϰ� ����

select *
from emp
where ename like 'A%'; --A�� �����ϴ� �� �� �̾ƶ�

select *
from emp
where ename like '%E';

--�ּҰ˻�
--select * from zip where dong like '%����%';
--ȸ���˻�
--select * from member where name like '��%';

select *
from emp
where ename like '%LL%'; --Allen, MILLER

select *
from emp
where ename like '%A%A%'; --A�� �پ� �ֵ� ����� �ֵ� 2�� �ִ� ������ --Adams, ABABA, AAAAA

select ename
from emp
where ename like '_A%'; --ù���ڴ� � ���� �͵� ��� ���� �� ��° ���ڸ� A�� ���� --WARD, MARTIN, JAMES

--���� regexp_like ������ (���Խ�)
select * from emp where regexp_like(ename, '[A-C]');
--regexp_like ��� ����ǥ�� �˻� 5�� ����� (��� EMP)


--������ �����ϱ�
--order by �÷���: ����, ����, ��¥ ����
--�������� : asc: ������: default
--�������� : desc: ������
--���(cost) ���� ��� �۾�

select *
from emp
order by sal; --default asc

select *
from emp
order by sal desc;

--�Ի����� ���� ���� ������ �����ؼ� ���, �̸�, �޿�, �Ի����� ����ϼ��� (�Ի����� �������� ���ڴ� �� ũ��)
--���� �ֱٿ� �Ի��� ������
select empno, ename, sal, hiredate
from emp
order by hiredate desc;

select empno, ename
from emp
order by ename asc; --���ĺ���


/*
select ��     3
from ��       1
where ��      2
order by ��   4 (select ����� ����)
*/
select empno, ename, sal, job, hiredate
from emp
where job='MANAGER'
order by hiredate desc;
--emp�����Ϳ��� manager������ ���� ����� ���, �̸�, �޿�, ����, �Ի����� �Ի����� ���� ������ ����ض�

select job, deptno
from emp
order by job asc, deptno desc; --job�� asc �ϰ� ������ job �׷� �ȿ��� deptno desc
--order by colmnname asc, colmn name asc...
--�Խ���... �亯 �Խ���

--������
--������(union) : ���̺�� ���̺��� �����͸� ��ġ�� �� (�ߺ��� ����)
--������(union all) : �ߺ��� ���

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
--ut ���� uta �������� ��� ��

--union 
--1. �����Ǵ� column�� type�� �����ؾ� �Ѵ�.
select empno, ename from emp --����, ���ڿ� ��
union 
select dname , deptno from dept; --���ڿ�, ����
--emp�� ���� dept�� �ڱ� �ı����� ������ ���

select empno, ename from emp --����, ���ڿ� ��
union 
select deptno , dname from dept; --���ڿ�, ����

--2. �����Ǵ� column�� ������ ����
--�ʿ���̾��� null�� column�� ��ü
select empno, ename, job, sal from emp  --����, ���ڿ� ��
union 
select deptno , dname , loc , null from dept;  --���ڿ�, ����

----------------------------------------------------------------------------------
--�ʺ� �����ڰ� �ǹ������� �ؾ��ϴ� �ڵ�(���� ���̺� select)
---------------------------------------------------------------------------------
--�Լ�
--����Ŭ �Լ� ����ϱ�
/*
���� �� �Լ��� ���� 
1) ������ �Լ� : ���ڸ� �Է� �ް� ���ڿ� ���� �� ��θ� RETURN �� �� �ִ�.
2) ������ �Լ� : ���ڸ� �Է� �ް� ���ڸ� RETURN �Ѵ�.
3) ��¥�� �Լ� : ��¥���� ���� �����ϰ� ���ڸ� RETURN �ϴ� MONTHS_BETWEEN �Լ���
�����ϰ� ��� ��¥ ���������� ���� RETURN �Ѵ�.
4) ��ȯ�� �Լ� : � ���������� ���� �ٸ� ������������ ��ȯ�Ѵ�.
5) �Ϲ����� �Լ� : NVL, DECODE
*/ 
--���ڿ� �Լ�
select initcap('the super man') from dual; --The Super Man

select lower('AAA'), upper('aaa') from dual;

select ename, lower(ename)as "ename" from emp

select * from emp where lower(ename) = 'king'; 

select length('abcd') from dual; -- ���ڿ��� ����
select length('ȫ�浿') from dual; --3��

select length('       ȫ �� ��a') from dual; --���鵵 ���ڴ�

select concat('a', 'b') from dual;
select concat('a', 'b', 'c') from dual; --�̷� �� ����(error). parameter �� 2���� ����
select 'a' || 'b' || 'c' from dual;
select ename || '       ' || job from emp;�� --������ ǥ��
select concat(ename, job) from emp; 

--�κ� ���� ����
--java : substring 
--oracle : substr 
select substr('ABCDE', 2, 3) from dual; --BCD
select substr('ABCDE', 1, 1) from dual --A
select substr('ABCDE', 3, 3) from dual --C

select substr('abcdesdfaefsdcwserfes', 10)
from dual;

select substr('ABCDE', -2, 1) from dual; --D
select substr('ABCDE', -2, 2) from dual; --DE

--������̺��� ename colum�� �����Ϳ� ���ؼ� ù ���ڴ� �ҹ���, ������ ���ڴ� �빮��
--����ϵ� �ϳ��� column���� ����� ����Ͻð� column�� ��Ī�� fullname���� �ϰ� ù ���ڿ� ������
--���� ���̿��� ���� �ϳ��� ��������
-->>SMITH >> s MITH �̷��� �ǵ��� �ض�
select lower(substr(ename, 1, 1)) from emp;
select upper(substr(ename, 2)) from emp;

select lower(substr(ename, 1, 1)) || ' ' || upper(substr(ename, 2)) as fullname from emp;

select lpad('ABC', 10, '*') from dual; --*******ABC

select rpad('ABC', 10, '%') from dual; --ABC%%%%%%%

--������� ��� : hong1007 or k1234
--ȭ��: �� �� ���� >> ho******
--                  k1***

select rpad(substr('hong1007', 1, 2), length('hong1007'),'*') from dual;
select rpad(substr('k1234', 1, 2), length('k1234'),'*') from dual;

--emp ���̺��� ename column�� �����͸� ����ϵ� ù ���ڸ� ����ϰ� �������� *
select rpad(substr(ename, 1, 1), length(ename),'*') from emp; 

--����
create table member2(
 id number, --null�� ����ϰڴ�
 jumin varchar2(14)
);

insert into member2(id, jumin) values(100, '123456-1234567');
insert into member2(id, jumin) values(200, '234567-1234567');
commit;

select * from member2;
--��°��
--100: 123456-*******
--200: 235467-*******
--����Ī�� "juminnumber"
select id || ' : ' || rpad(substr(jumin, 1, 7), length(jumin), '*') as juminnumber
from member2;

--rtrim �Լ�
--������ ���ڸ� ������
select rtrim('MILLER', 'ER') from  dual; --MILL

--ltrim �Լ�
--���� ���ڸ� ������
select ltrim('MILLLLLLLLLLLLLER', 'MIL')from  dual; --ER

--���������Լ��� ���� ����
select '>' || rtrim('MILLER          ',' ') || '<' from dual;
select '>' || ltrim('          MILLER',' ') || '<' from dual;

--ġȯ�Լ�
select ename, replace(ename, 'A', 'WOW') from emp;

--�����Լ�
--round (�ݿø� �Լ�)
--trunc (�����Լ�)(����)
--mod() �������� ���ϴ� �Լ���
select round(12.345, 0) as "r" from dual;  --(�Ǽ�, 0) >> ���� �κи� ���ܶ� --12
select round(12.945, 0) as "r" from dual;  --(�Ǽ�, 0) >> ���� �κи� ���ܶ� --13

select round(12.345, 1) as "r" from dual;  --(�Ǽ�, 1) >> ù°�ڸ����� ���ܶ� --12.3
select round(12.565, 1) as "r" from dual;  --(�Ǽ�, 1) >> ù°�ڸ����� ���ܶ� --12.6

select round(12.345, -1) as "r" from dual; --10
select round(15.345, -1) as "r" from dual; --20
select round(15.345, -2) as "r" from dual; --0
-------------------------------------------------------------------------------
select trunc(12.345, 0) as "t" from dual;  --(�Ǽ�, 0) >> ���� �κи� ���ܶ� --12
select trunc(12.567, 0) as "t" from dual;  --(�Ǽ�, 0) >> ���� �κи� ���ܶ� --12

select trunc(12.345, 1) as "t" from dual;  --(�Ǽ�, 1) >> ù°�ڸ����� ���ܶ� --12.3
select trunc(12.565, 1) as "t" from dual;  --(�Ǽ�, 1) >> ù°�ڸ����� ���ܶ� --12.6

select trunc(12.345, -1) as "t" from dual; --10
select trunc(15.345, -1) as "t" from dual; --20
select trunc(15.345, -2) as "t" from dual; --0

--������
select 12/10 from dual; --1.2
select mod(12,10) from dual; --2
select mod(0, 0) from dual;
---------------------------------------------------------------------�����Լ� ��
--[��¥ �Լ�]
--alter session set nls_date_format = 'YYYY-MM-DD HH24:MI:SS'; ����
select sysdate from dual; --2022-09-27 16:00:38

--POINT (��¥ ����)
--1. Date + Number >> Date
--2. Date - Number >> Date
--3. Date - Date >> Number (�ϼ�)

select sysdate + 100 from dual; --2023-01-05 16:04:32
select sysdate + 1000 from dual; --2025-06-23 16:05:15

select hiredate from emp;
select months_between('2022-09-27', '2020-09-27') from dual;
select trunc (months_between(sysdate, '1999-05-29'), 0) from dual; --279����

select '2022-01-01' +100 from dual; --error: '2022-01-01'�� ��¥ ������ ������ ���� , 100�� ����
--POINT ��ȯ�Լ�  to_date()

select to_date('2022-01-01') + 100 from dual;

--��� ���̺��� ������� �Ի��Ͽ��� ���� ��¥ ������ �ټ� ���� ���
--����̸�, �Ի���, �ټӿ��� ���
--��, �ټ� ������ ���� �κи� ����ض�(�ݿø����� ����)
select ename, hiredate, trunc (months_between(sysdate, hiredate), 0) as "�ټӿ���"
from emp;

--2. �� ���� 31�� �̶�� ���ؿ��� �ټ� ������ ���ض�
--�ݿø� ���� ������, �Լ� ���(X) >> ��¥ - ��¥ 150�� 
select ename, hiredate, trunc(((sysdate - hiredate)/31),0) as "�ټӿ���"
from emp;

-----------------------------------------------------------------------------------
--������� �Լ�(����, ����, ��¥) ����
--------------------------------------------------------------------------------------
--[��ȯ�Լ�] Today POINT
--Oracle ������: ���ڿ�, ����, ��¥
--to_char() : ���� -> ���� (1000 -> $100,000) >> format ��� ���� ����  
--                  ��¥ -> ���� ('2022-09-29' -> 2022�� 09�� 29��

--to_date : ���� -> ��¥ 
--select to_date('2022-01-01') + 100 from dual;

--to_number(): ���� -> ���� >> �ڵ�����ȯ
--select '100' + 100 from dual;
--select to_number('100') + 100 from dual;
--1. 
select '1' + 1 from dual; -- '1'���ڸ� -> ���ڷ�(����ȯ)
--��Ģ
select to_number('1')+ 1 from dual;

--2.
select sysdate, to_char(sysdate, 'YYYY') ||'��' as "YYYY",
to_char(sysdate, 'YEAR') as "YEAR",
to_char(sysdate, 'MM') as "MM",
to_char(sysdate, 'DD') as "DD",
to_char(sysdate, 'DAY') as "DAY",
to_char(sysdate, 'DY') as "DY"
from dual;

--�Ի����� 12���� ����� ���, �̸�, �Ի���, �Ի�⵵, �Ի���� ����ض�
select empno, ename, hiredate, to_char(hiredate, 'YYYY') as YYYY, 
    to_char(hiredate, 'MM') as MM
from emp
where to_char(hiredate, 'MM')='12';

select to_char(hiredate, 'YYYY MM DD') from emp;
--to_char() : ��¥ -> ���� ���� ��ȯ
--����Ŭ.pdf 68page ǥ����

--to_char: ���� -> ���Ĺ��� ��ȯ
--����Ŭ.pdf 63 ǥ����
--1000000  -> $10,000,000

select '>' || to_char(12345, '999999999999999') || '<' from dual;
select '>' || ltrim(to_char(12345, '999999999999999')) || '<' from dual;

select '>' || to_char(12345, $999,999,999,999') || '<' from dual;

select sal, to_char(sal, '$999,999') from emp;

----------------------------------------------------------------------------------
--HR �������� ����
show user;
--USER��(��) "HR"�Դϴ�.
select * from employees;
select sysdate from dual;
/*
������̺�(employees)���� ����� �̸��� last_name , first_name ���ļ� fullname ��Ī 
�ο��ؼ� ����ϰ� �Ի�����  YYYY-MM-DD �������� ����ϰ� ����(�޿� *12)�� ���ϰ� 
������ 10%(���� * 1.1)�λ��� ����
����ϰ� �� ����� 1000���� �޸� ó���ؼ� ����ϼ���
�� 2005�� ���� �Ի��ڵ鸸 ����ϼ��� �׸��� ������ ���� ������  ����ϼ���
*/

--�ݵ�� select* from emp; �ؼ� ��ü ����̶� column�� Ȯ�� �ϰ� �������� �ʿ��� ������ �����ϴ� �ڵ� �ۼ��ϱ�!

select LAST_NAME || FIRST_NAME as fullname,
    to_char(HIRE_DATE, 'YYYY-MM-DD') as �Ի���, 
    (SALARY*12) as ����,
    to_char((salary*12)*1.1, '$999,999,999') as �λ��
from employees
where to_char(hire_date, 'YYYY')>='2005' --substr(hire_date, 1, 4)>2005
--order by (salary*12) desc;
order by ���� desc;
--order by ���� select ������ �����Ѵ� >> select�� ��� column�� ��� ����(����Ī ��� ����)

--�����Լ�, �����Լ�, ��¥�Լ�
--��ȯ�Լ� (to_char())

--�Ϲ��Լ� (nvl, nvl2...)
--�����Լ� (avg(), sum(), min(), max())
--------------------------------------------------------------------------------
--22.09.28
show user;
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';
select sysdate from dual;

--------------------------------------------------------------------------------
--create table ���̺�� (column�� Ÿ��, column�� Ÿ��)
create table member3(age member);
--1�� �Ǵ� 100��
insert into member3 (age) values(100);
insert into member3 (age) values(200);
insert into member3 (age) values(300);
insert into member3 (age) values(400);
--------------------------------------------------------------------------------
/*Java
class member3{
 private int age;
}
--1���� �����͸� ������
member3 m = new member3();
m.setAge(100);

--100�� ������ �־��
List <member3> mlist = new ArrayList<member3>();
mlist.add(new member(100));
mlist.add(new member(200));
mlist.add(new member(300));
mlist.add(new member(400));

������ Ÿ��
���ڿ� Ÿ��
char(10)     >> 10byte >> �ѱ� 5��, ������, Ư������, ���� 10�� >> �������� ���ڿ�
varchar2(10) >> 10byte >> �ѱ� 5��, ������, Ư������, ���� 10�� >> �������� ���ڿ�

>>
char(10)     >> 'abc' (3byte) >> [a] [b] [c] [] [] [] [] [] [] [] >> ������ ��ȭ�� �����
varchar2(10) >> 'abc' (3byte) >> [a] [b] [c] ... >> ������ ũ�� ��ŭ�� ���� Ȯ��

����� �̸�
create table member (name char(30))
create table member (name varchar2(30))  (O)

���� (�� �Ǵ� ��)
create table member (name char(3))
create table member (name varchar2(3))   (X)

���: �������� ���ڿ� (��/��, ...��/��/�� ... �ֹι�ȣ) �� ���� ���ڿ��� ���̰� ������ ���� ��� char() ���  -> ����
     �������� ���ڿ� (����� �̸�, ���, �ּ�) varchar2()
     
char(), varchar2() ���: �ѱ۰� ���� ȥ��.
varchar2(10)

unicode (2byte) : �ѱ�, ������, Ư������, ���� >> 2byte

nchar(20)     >> 20��(�� �� �ִ� ������ ����) >>ũ�� 20*2byte = 40byte
nvarchar2(20) >> 20��
*/

--����Ŭ �Լ� ......
select * from SYS.NLS_DATABASE_PARAMETERS;
--NLS_CHARACTERSET  : 	AL32UTF8  �ѱ� 3byte �ν�
--KO16KSC5601 2Byte (���� ��ȯ�ϸ� �ѱ� �ٱ���)
select * from nls_database_parameters where parameter like '%CHAR%';
------------------------------------------------------------------------------
create table test2(name varchar2(2));

insert into test2(name) values('a');
insert into test2(name) values('aa');
insert into test2(name) values('��'); --�ѱ� 1�� 3byte ����
-------------------------------------------------------------------------------
?--�Ϲ��Լ� (���α׷� ������ ���� ���� �Լ�)
--nvl(), nvl2() >> null ó���ϴ� �Լ�
--decode() >> jaba if ��
--case() >> java�� switch ��

--����Ŭ SQL (����, ��� ������ ����.)
--����Ŭ PL-SQL ( ����, ���) ��� ����

select comm, nvl(comm, 0) from emp;

create table t_emp(
 id number(6), -- j--���� 6�ڸ�
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

select decode(id, 100, '����Ƽ', 
                      200, '������', 
                      '��Ÿ�μ�') as �μ��̸�
from t_emp;

select empno, ename, deptno, decode(deptno,
                                            10, '�λ��',
                                            20, '������',
                                            30, 'ȸ���',
                                            40, '�μ�',
                                            'ETC') as �μ��̸�                                            
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
t_emp2 ���̺��� id, jumin �����͸� ����ϵ� jumin �÷��� ���ڸ��� 1�̸�
'����' ��� 2�̸� '����' 3�̸� '�߼�' �׿ܴ�  '��Ÿ' ��� ����ϼ���
�÷����� '����'
*/

select * from t_emp2;


select id, decode(substr(jumin,1,1),    
                                1, '����',
                                  2, '����',
                                    3, '�߼�',
                                    '��Ÿ') as "����"
from t_emp2;

/*
���빮��: hint) if�� �ȿ� if��
�μ���ȣ�� 20���� ��� �߿��� SMITH��� �̸��� ���� ����̶�� HELLO���� ����ϰ�
�μ� ��ȣ�� 20���� ��� �߿��� SMITH��� �̸��� ���� ����� �ƴ϶�� WORLD ���� ����ϰ�
�μ� ��ȣ�� 20���� ����� �ƴ϶�� ETC��� ���ڸ� ����ϼ���
EMP���̺�����...
*/
select empno, ename, deptno, decode(deptno, 20, decode(ename, 'SMITH', 'HELLO', 'WORLD'), 'ETC')
from emp;

--decode �پ��� ��迡 �̿�

/*
--CASE�� ����
CASE ���ǽ� WHEN ���1 THEN ���1
           WHEN ���2 THEN ���2
           WHEN ���3 THEN ���3
           ELSE ���4
END "�÷���'
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
������̺��� ����޿��� 1000�޷� ���ϸ� 4��
1001�޷� 2000�޶� ���ϸ� 3��
2001�޷� 3000�޶� ���ϸ� 2��
3001�޷� 4000�޶� ���ϸ� 1��
4000�޷� �̻��̸� 'Ư��'�̶�� �����͸� ����ϼ���
--1. case Į���� when ��� the ���
--2. �񱳽��� �ʿ��ϴٸ�
     case when ���Ǻ񱳽� then
          when ...
          when ...
*/
select case when sal <= 1000  then 'class 4'
 when sal between 1001 and 2000  then 'class 3'
  when sal between 2001 and 3000  then 'class 2'
   when sal between 3001 and 4000  then 'class 1'
   else 'Ư��'
end "�޼�" , empno, ename
from emp;
--------------------------------------------------------------------------------
--�����Լ�, �����Լ�, ��¥�Լ�, ��ȯ�Լ�(to_char, to_number, to_date)
--�Ϲ��Լ� (nvl, decode() , case����)
--�⺻�Լ� end
--------------------------------------------------------------------------------
--�����Լ�(�׷�) �Լ�
--����Ŭ.pdf (p68)
/*
1. count(*) >> row��, count(�÷���) >> ������ �Ǽ� > (null�� �������� �ʾƿ�)
2. sum()
3. ave()
4. mac()
5. min()
--��Ÿ

1. �����Լ��� group by ���� ���� ���
2. ��� ���� �Լ��� null���� �����Ѵ�.
3. select ���� �����Լ� �̿ܿ� �ٸ� �÷��� ���� �ݵ�� �� �÷��� group by ���� ���
*/

select count(*) from emp; --14���� row

select count(empno) from emp;

select count(comm) from emp; --6
selelct comm from emp;

select count(nvl(comm, 0)) from emp;  --POINT
--�޿��� ��
select sum(sal) as �޿����� from emp;

select round(avg(sal),0) as �޿������ from emp;

--����� "�츮 ȸ���� �� ������ �󸶳� ���� �Ǿ���??"
select sum(comm) from emp;

--������ ���?
select trunc(avg(comm), 0) from emp; --721�޷�  (null ����)
select (300+200+30+300+3500+0) /6 from dual;

select trunc(avg(nvl(comm, 0))) from emp; -- 309�޷�

--�� ��
--������ 721 , 309 �� �� �´�
--ȸ���� ���� (��ü ����� ����) >> 309 ����
--ȸ���� ���� (�޴� ����� ����) >> 721 ����

select max(sal) from emp;
select min(sal) from emp;
select empno, count(empno) from emp; --ORA-00937: not a single-group group function
--     14��,      1��

select sum(sal), avg(sal), max(sal), min(sal), count(sal) from emp;

--�μ��� ��� �޿� ���ض�
select deptno, avg(sal)
from emp
group by deptno;

--������ ��� �޿��� ���ض�
select job, avg(sal)
from emp
group by job;

--������, ��� �޿�, �޿���, �ִ�޿�, �ּұ޿�, �Ǽ��� ����ϼ���
select job, avg(sal), sum(sal), max(sal), min(sal), count(sal)
from emp
group by job;

/*
�׷�
distinct �÷���1. �÷���2

order by �÷���1, �÷���2

group by �÷���1, �÷���2
*/
--�μ���, ������ �޿��� ���� ���ϼ���
select deptno, job, sum(sal)
from emp
group by deptno, job;

/*
select ��        4
from ��          1
where ��         2
group by ��      3
order by ��      5
*/

--������ ��� �޿��� 3000�޷� �̻��� ����� ������ ��� �޿��� ����ض�
select job, avg(sal) as avgsal
from emp
--where ���� --����� ����� �������� ���ؿ�
group by job
having avg(sal) >=3000;       --group by ������
                              --having �������� select���� ������ ����Ī ������� ���Ѵ�(������� ������)
                              
/*
1. from�� ������ where
2. group by ������ having
select   6
from     1
where    2
group by 4
having   5
order by 7
*/

/* 1.������̺��� ������ �޿����� ����ϵ� ������ ���� �ް� �޿��� ���� 5000 �̻��� 
������� ����� ����ϼ���
�޿��� ���� ���� ������ ����ϼ��� */
select job, sum(sal) as sumsal
from emp
where comm is not null --comm�� null�� �ƴ� �� �Ÿ�
group by job
having sum(sal)>=5000
order by sumsal asc;

/* 2. ������̺��� �μ� �ο��� 4���� ���� �μ��� �μ���ȣ ,�ο��� , �޿��� ���� ����ϼ��� */
select deptno, count(*) as "�μ����ο�", sum(sal) as "�μ��� �޿��� ��"
from emp
group by deptno
having count(*)>4 ;


/* 3. ������̺��� ������ �޿��� ���� 5000�� �ʰ��ϴ� ������ �޿��� ���� ����ϼ���
�� �Ǹ�����(salesman) �� �����ϰ� �޿������� �������� �����ϼ��� */
select job, sum(sal) as "sumsal"
from emp
where job != 'SALESMAN'
group by job
having (sum(sal))>5000
order by sum(sal) desc;

---------------------------------------------------------------------------------
--���� ���̺� �����͸� �������� ���� END--------------------------------------------
---------------------------------------------------------------------------------
--�������� ���̺��� ���ϴ� �����͸� �����ϴ� ���
--JOIN(����)---------------------------------------------------------------------
--���� ���̺�κ��� ������ �˻�
/* 
Cartesian Product ��� ������ ����� Join
Equijoin Join ������ ��Ȯ�� ��ġ�ϴ� ��� ���(�Ϲ������� PK �� FK ���)
Non-Equijoin Join ������ ��Ȯ�� ��ġ���� �ʴ� ��쿡 ���(���,����)
Outer Join Join ������ ��Ȯ�� ��ġ���� �ʴ� ��쿡�� ��� ����� ���
Self Join �ϳ��� ���̺��� ����� Join �ϰ��� �� ��쿡 ���
Set Operators ���� ���� SELECT ������ �����Ͽ� �ۼ��Ѵ� */

--RDBMS (������)
/*
���� (���̺�� ���̺���� ����)

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
1. ����� (equi join)
�����̺�� �����Ǵ� ���̺� �ִ� �÷��� �����͸� 1:1 ����
1.1 ����
-SQL JOIN ����(����Ŭ ����) > ����
-ASNI����(ǥ��) ���� > [inner] join on ������
*/

select m.m1, m.m2, s.s2
from m, s
where m.m1 = s.s1;  --������� �ƴϴ�

--ANSI ���� (ǥ�ع���)
select *
from m inner join s --[inner] ���� ���� > from m join s �̷��� �ᵵ �ȴ�.
on m.m1 = s.s1;

select m.m1, m.m2, s.s2
from m join s --����
on m.m1 = s.s1 ;--on ������ ������

--�����ȣ, ����̸�, �μ���ȣ, �μ��̸��� ����ϼ���
select emp.empno, emp.ename, emp.deptno, dept.dname
from emp join dept
on emp.deptno = dept.deptno;

--����Ī���� �ٲٸ�
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
--ANSI ���� (����)
select *
from m join s on m.m1 = s.s1
       join x on s.s1 = x.x1;
       
--HR�������� �̵�
show user; --USER ��(��) "HR" �Դϴ�.
select * from employees;
select * from departments;
select * from locations;

--����: ���, �̸�(last_name), �μ���ȣ, �μ��̸��� ����ϼ���
select count(*)
from employees; --107��

select e.employee_id,
       e.last_name,
       e.department_id,
       d.department_name
from employees e join departments d
on e.department_id = d.department_id;
--������
--����� ���� 107���ε� ������ �����Ǿ��ִ�.
select * from employees where department_id is null; --null�� join���� �ȵ� > ����
--����� null ó�� �Ұ� >> �ٸ� join ����Ѵ� >> ��� �Ŀ�

--1. ���, �̸�(last_name), �μ���ȣ, �μ��̸�, �����ڵ�, ���ø�
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
show user; --USER��(��) "KOSA"�Դϴ�.

--2. �� ���� (non-equi join) => 1:1�� ���� column�� ���� ���
--�ǹ̸� ���� >> ������� ������ �״�� ���
--1:1���� on emp.deptno = dept.deptno
select * from emp;
select * from salgrade;

select e.empno, e.ename, e.sal, s.grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal;

--3. outer join (equi join ���� �����ϰ� ���� + �����ִ� �����͸� �������� �ſ�)
--outer join �������踦 �ľ�
--������ �Ǵ� ���̺��� ���� �����͸� ������ �� �ִ�.
--����
/*
3.1 left outer join (������ ����)
3.2 right out join (�������� ����)
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


--HR�������� �̵�
show user; --USER ��(��) "HR" �Դϴ�.
select * from employees;
select * from departments;
select * from locations;

--����: ���, �̸�(last_name), �μ���ȣ, �μ��̸��� ����ϼ���
select count(*)
from employees; --107��

select e.employee_id,
       e.last_name,
       e.department_id,
       d.department_name
from employees e left join departments d
on e.department_id = d.department_id; -- �̷��� �ϸ� 107�� ����� �� ���´� (null �����ؼ�)
--������
--����� ���� 107���ε� ������ �����Ǿ��ִ�.
select * from employees where department_id is null; --null�� join���� �ȵ� > ����
--����� null ó�� �Ұ� >> �ٸ� join ����Ѵ� >> ��� �Ŀ�

---------------------------------------------------------------------------------
select * from emp;
--3. self join (�ڱ�����) -> ����(X) �ǹ̸� ���� >> �����(����)
--�ϳ��� ���̺� �ִ� column �� �ڽ��� ���̺� �ִ� �ٸ� column�� �����ϴ� ���
--Emp >> Mgr(������)
select e.empno, e.ename, m.empno, m.ename
from emp e join emp m
on e.mgr = m.empno; --������ ����: ��� ���� 14���ε� 13�� �ۿ� �ȳ���.. 

select * from emp where ename = 'KING';

select e.empno, e.ename, m.empno, m.ename
from emp e left join emp m
on e.mgr = m.empno; --���� �ذ�� join �տ� left �ٿ���

/*
1. ������� �̸�, �μ���ȣ, �μ��̸��� ����϶�.
2. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸��� ����϶�.
3. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�.
4. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������ ����ϴµ� ������ 3000�̻��� ����� ����϶�.
5. ����(����)�� 'SALESMAN'�� ������� ������ �� ����̸�, �׸��� �� ����� ���� �μ� �̸��� ����϶�.
6. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�, �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
'����','�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.(�� ) 1 : 1 ���� ��� �÷��� ����
7. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�.
8. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�. �׸��� �� ��µ�
������� �μ���ȣ�� ���� ������, ������ ���� ������ �����϶�.
9. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� �������� �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
'����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����϶�.
SELF JOIN (�ڱ� �ڽ����̺��� �÷��� ���� �ϴ� ���)
*/
show user;
select * from emp;
select * from dept;
select * from salgrade;

--1.������� �̸�, �μ���ȣ, �μ��̸��� ����϶�.
select e.ename, e.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno;

--2. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸��� ����϶�.
select e.ename, e.job, d.deptno, d.dname
from emp e join dept d
on e.deptno = d.deptno
where d.loc = 'DALLAS';


--3. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�.
select e.ename, d.dname
from emp e join dept d
on e.deptno = d.deptno
where e.ename like '%A%';


--4. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������ ����ϴµ� ������ 3000�̻��� ����� ����϶�.
select e.ename, d.dname, e.sal
from emp e join dept d
on e.deptno = d.deptno
where e.sal>=3000;


--5. ����(����)�� 'SALESMAN'�� ������� ������ �� ����̸�, �׸��� �� ����� ���� �μ� �̸��� ����϶�.
select e.job, e.ename, d.dname
from emp e join dept d
on e.deptno = d.deptno
where e.job = 'SALESMAN';


--6. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�, �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
--'����','�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.(�� ) 1 : 1 ���� ��� �÷��� ����
select e.empno as "�����ȣ", 
       e.ename as "����̸�", 
       (e.sal)*12 as "����", 
       -- (e.sal)*12 + nvl(comm, 0) as "�Ǳ޿�",
       (e.sal)*12+comm as "�Ǳ޿�",
       s.grade as "�޿����"
from emp e join salgrade s on e.sal between s.losal and s.hisal
where e.comm is not null;


--7.�μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�.
select e.deptno, d.dname, e.ename, e.sal, s.grade
from emp e join dept d on e.deptno=d.deptno
           join salgrade s on e.sal between s.losal and s.hisal
where e.deptno= 10;

select * from salgrade;

--8. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�, ����̸�, ����, �޿������ ����϶�. �׸��� �� ��µ�
--������� �μ���ȣ�� ���� ������, ������ ���� ������ �����϶�.
select e.deptno, d.dname, e.ename, e.sal, s.grade
from emp e join dept d on e.deptno = d.deptno
        join salgrade s on e.sal between s.losal and s.hisal
where e.deptno<=20 
order by e.deptno asc, e.sal dest;
--where e.deptno in (10,20) 
--e.deptno = 10 or 

--9. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� �������� �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
--'����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����϶�.
--SELF JOIN(�ڱ� �ڽ� ���̺긣�� Į���� �����ϴ� ���)

select e.empno, e.ename, m.empno, m,ename
from emp e left outer join emp m
on e.MGR = m.empno;


--------------------------------------------------------------------------------
--22.09.29
--��Ÿ
--NATURAL JOIN
--Equijoin�� �����ϴٰ� ���ø� �˴ϴ�.
-- [�� ���̺�]�� [������ �̸�]�� ������ Į���� [��� ����]�� �˴ϴ�.
SELECT empno, ename, deptno , dname FROM emp NATURAL JOIN dept ;

--JOIN ~ USING 
--NATURAL JOIN�� ������ ������ �̸��� ������ Į���� ��� ������ �Ǿ��µ� 
--USING ���� ����ϸ� �÷��� �����ؼ� ������ �� ���� �ֽ��ϴ�.
SELECT e.empno, e.ename, deptno , dname FROM emp e JOIN dept d USING(deptno);

--���� ������ ���� ���ΰ��
select * from emp , dept;

select * from emp cross join dept;
--------------------------------------------------------------------------------
--�ذ� (�ʱް�����) �ݵ�� 
--------------------------------------------------------------------------------
/*
subquery
����Ŭ.pdf(7�� 100page)

sql�� �� ...sql�� ���� �ذ��

1. �Լ� > ���� ���̺�, ���� ���̺� (join, union) >> subquery


*/
--��� ���̺��� ������� ��� ���޺��� �� ���� ������ �޴� ����� ���, �̸�, �޿��� ����ض�
select *
from emp;

select avg(sal) from emp;

select empno, ename, sal
from emp e
where e.sal > 2073;

--2���� query �� �ϳ��� ����
select empno, ename, sal
from emp e
where e.sal > (select avg(sal) from emp); --subquery: (select avg(sal) from emp)

--subqery
/*
1. single row subquery : �������� ���� row ���� column�� ��� (�� ���� �� ��ȯ�ϴ� ���) 
ex) select avg(sal) from emp
������ ����: (= | != | < | > )

2. multi row subquery: �������� ���� column row �������� ���
ex) select sal from emp
������: IN, NOT IN, ANY, ALL
ALL: sal > 1000 and sal > 4000 and ...
ANY: sal > 1000 or sal > 4000 or

����)
1. subquery�� �ݵ�� ��ȣ �ȿ� �־�� �Ѵ�. >> (select max(sal) from emp)
2. ���� �÷����� ���� >> select max(sal), sum(sal) from emp(X)
3. �ܵ����� ���� ����

�������
1. subquery ���� ����
2. ����� ������ ���� query ����
--TIP)
select ...(subquery) >> �� ���� �ุ ��ȯ�� ��� (Scala subquery)
from (subquery)      >> inline view(�������̺�) ..... ^^
where (subquery)     >> ����

*/
--������̺��� jones �� �޿����� �� ���� �޿��� �޴� ����� ���, �̸�, �޿��� ����ض�
select sal 
from emp
where ename = 'JONES'; --result: 2975

select empno, ename, sal
from emp
where sal> (select sal from emp where ename = 'JONES'); 

select *
from emp
where sal IN (select sal from emp where deptno = 30);
--ORA-01427: single-row subquery returns more than one row
--sal = 1600 or sal = 1250 or sal = 2850 or sal = 1500 or sal = 950

select *
from emp
where sal NOT IN (select sal from emp where deptno = 30);
--sal != 1600 and sal != 1250 and sal != 2850 and sal != 1500 and sal != 950 

--���������� �ִ� ����� ����� �̸��� ����ϼ���
--�� ����� mgr �÷��� ������..
select mgr from emp;
select *
from emp
where empno in (select mgr from emp);
--where empno = 7902 or empno = 7788 or empno = null (or���꿡�� null�� ���� X)

--���������� ���� ����� ����� �̸��� ����ϼ���
select mgr from emp;
select *
from emp
where empno not in (select nvl(mgr,0) from emp);
--where empno != 7902 and empno != 7788 and empno != null
--and ���꿡 null�� ������ ����� null

--king���� �����ϴ� �� ���ӻ���� king�� ����� ���, �̸�, ����, �����ڻ��
--�� ����ϼ���
select empno from emp where ename = 'KING';

select empno, ename, mgr
from emp
where mgr = (select empno from emp where ename = 'KING');

--20�� �μ��� ��� �߿��� ���� ���� �޿��� �޴� ������� �� ���� �޿��� �޴� ����� 
--���, �̸�, �޿�, �μ���ȣ�� ����ϼ���
select max(sal) from emp where deptno = 20;

select empno, ename, sal, deptno 
from emp
where sal > (select max(sal) from emp where deptno = 20);

---------------------------------------------------------------------------------
--Scala subquery
SELECT a.empno
     , a.ename
     , a.deptno
     , (SELECT dd.dname
          FROM dept dd
         WHERE dd.deptno = a.deptno) AS dept_name
  FROM emp a
 WHERE a.sal >= 3000;
 --JOIN �ذ� ���� ...^^
 
 -- �ڽ� ���޿����� �ش� ������ ��� ���޿� ���̸� ����ϴ� ����
 SELECT a.empno
     , a.ename
     , a.job
     , a.sal
     , a.sal - (SELECT ROUND(AVG(aa.sal))
                FROM emp aa
                WHERE aa.job = a.job) AS avg_sal_diff
 FROM emp a
 WHERE a.deptno = 20
 ORDER BY 3, 1;
 --order by a.job , a.empno

--------------------------------------------------------------------------------
--subquery test
--1. 'SMITH'���� ������ ���� �޴� ������� �̸��� ������ ����϶�.
select sal from emp where ename = 'SMITH'; --subquery
select ename, sal 
from emp 
where sal>(select sal from emp where ename = 'SMITH');

--2. 10�� �μ��� ������ ���� ������ �޴� ������� �̸�, ����, �μ���ȣ�� ����϶�.
select sal from emp where deptno = 10; --subquery
select ename, sal, deptno 
from emp 
where sal in (select sal from emp where deptno = 10);

/*
select *
from emp
where empno in (select mgr from emp);  */


--3. 'BLAKE'�� ���� �μ��� �ִ� ������� �̸��� ������� �̴µ� 'BLAKE'�� ���� ����϶�.
select deptno from emp where ename = 'BLAKE'; --subquery --deptno of BLAKE: 30
--select * from dept;
select ename, hiredate
from emp
where deptno = (select deptno from emp where ename = 'BLAKE') 
and ename !='BLAKE';

--4. ��ձ޿����� ���� �޿��� �޴� ������� �����ȣ, �̸�, ������ ����ϵ�, ������ ���� ��� ������ ����϶�.
select avg(sal) as avgsal from emp; --subquery
select empno, ename, sal
from emp
where sal>(select avg(sal) as avgsal from emp)
order by sal desc;
?

--5. �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ����� �ٹ��ϰ� �ִ� ����� �����ȣ�� �̸��� ����϶�.
SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
                       FROM EMP
                       WHERE ENAME LIKE '%T%');
--where deptno = 20 or deptno= 30


--6. 30�� �μ��� �ִ� ����� �߿��� ���� ���� ������ �޴� ������� 
-- ���� ������ �޴� ������� �̸�, �μ���ȣ, ������ ����϶�. (��, ALL(and) �Ǵ� ANY(or) �����ڸ� ����� ��)
select max(sal) from emp where deptno = 30; --subquery
select ename, deptno, sal
from emp
where sal > all (select max(sal) from emp where deptno = 30);

--7. 'DALLAS'���� �ٹ��ϰ� �ִ� ����� ���� �μ����� ���ϴ� ����� �̸�, �μ���ȣ, ������ ����϶�.
select * from dept;
select deptno from dept where loc = 'DALLAS';
select ename, deptno, job 
from emp 
where deptno in (select deptno from dept where loc = 'DALLAS');

--8. SALES �μ����� ���ϴ� ������� �μ���ȣ, �̸�, ������ ����϶�.
select deptno from dept where dname = 'SALES';--subquery

select empno, ename
from emp
where deptno = (select deptno from dept where dname = 'SALES');

--9. 'KING'���� �����ϴ� ��� ����� �̸��� �޿��� ����϶� king �� ����� ��� (mgr �����Ͱ� king ���)
select empno from emp where ename = 'KING'; --subquery
select ename, sal 
from emp 
where mgr = (select empno from emp where ename = 'KING');

--10. �ڽ��� �޿��� ��� �޿����� ����, �̸��� 'S'�� ���� ����� ������ �μ����� �ٹ��ϴ� 
--��� ����� �����ȣ, �̸�, �޿��� ����϶�.
select avg(sal) from emp ; --subquery
select ename, deptno, empno, sal from emp where ename like '%S%'; --subquery

select empno, ename, sal 
from emp 
where (sal>(select avg(sal) from emp)) and ename in (select ename from emp where ename like '%S%');

--11. Ŀ�̼��� �޴� ����� �μ���ȣ, ������ ���� ����� �̸�, ����, �μ���ȣ�� ����϶�.
select deptno, sal from emp where comm is not null; --subquery

select ename, sal, deptno
from emp
where (deptno, sal) IN (select deptno, sal from emp where comm is not null);

--12. 30�� �μ� ������ ���ް� Ŀ�̼��� ���� ���� ������� �̸�, ����, Ŀ�̼��� ����϶�.
select sal, comm from emp where deptno = 30; --subquery

select ename, sal, nvl(comm, 0)
from emp 
where (sal, nvl(comm, 0)) not in (select sal, nvl(comm, 0) from emp where deptno = 30);
/*
where
group by
having
order by



+
DML
*/

--������ ���۾�(�ϱ�) >> DML
--����Ŭ.pdf(168page)
--insert, update, delete (�ݵ�� �ϱ�)

/*
����Ŭ ����
DDL(Data Definition Language): [creat, alter, drop, truncate] , rename, modify
DML(Data Modifying Language): insert, update, delete
DQL(Data Query Lauguage) : select (�Լ�, ����, ��������)
DCL(Data Contorl Language): ������: grant, revoke
TCL(Transaction): commit, rollback, savepoint

*/
--DML (insert, update, delete) �۾�
--transaction: �ϳ��� ������ �۾� ����

--A��� ���¿��� B��� ���·� ��ü(100����)

--���� �� ���� �ݾ�
--A���� 1000����
--B���� 1000����

--A��� ���� (100����) ���: update ���� set �ݾ�...
--1000���� -> 900����
--B���� (100����) �Ա�: update ���� set �ݾ�...
--1000���� -> 1100����
-----------------------------------------------------------------------------------
--A ���¿��� ����ؼ� B ���·� �ԱݵǴ� ���� >> [�ϳ��� ������ ����]�� ��� ó�� >> 
-- �� �� ���� or �� �� ����
--ó���ϴ� ���(commit, rollback)

desc emp; --�÷���, null ����, type

select * from tab; --(���� ���� ������ ������ �ִ� ���̺� ���)

--create table �̸�
select * from tab where tname = 'BOARD';
select * from tab where tname = 'BOARD2';

select * from col where tname = 'EMP';
--------------------------------------------------------------------------------
--1. INSERT

create table temp (
    id number primary key, --null(X), �ߺ� ������ ���(X)
    name nvarchar2(20)
);

desc temp;
select * from tab where tname = 'TEMP';
select * from col where tname = 'TEMP';

--1. ���� �Ϲ����� insert
insert into temp(id, name)
values(100, 'Dayeong');

select * from temp;
commit;

--2. �÷� ����� ������ �� �ִ�. (�ǵ��� ���� �ʵ��� �Ѵ�. ������ �������� �������� �ϱ� �����)
insert into temp
values(200, '������');

select * from temp;
rollback;

--3. ���� (insert)
insert into temp (name) --ORA-01400: cannot insert NULL into ("KOSA"."TEMP"."ID")
values ('stuff');  --id pk ���� �ɾ���� null�̳� �ߺ� ������ ���� �Ұ�

insert into temp(id, name) --ORA-00001: unique constraint (KOSA.SYS_C007064) violated
values(100, '������'); --primary�� ����ִ� �÷� ������ 100 �̶�� �ߺ� id ������

---------------------------------------------------------------------------------------
--TIP
--�Ϲ����� SQL�� ���α׷����� ��� X
--PL-SQL(����, ���)

create table temp2(id varchar2(50));
/*
BEGIN 
    FOR i IN 1..100 LOOP
    insert into temp2(id) values('A' || to_char(i));
    END LOOP;
END;
*/
select * from temp2;

create table temp3(
 memberid number(3) not null, --3�ڸ� ����
 name varchar2(10), --null���
 regdate date default sysdate --�ʱⰪ ���� (�⺻��) (�ý��� ��¥�� �⺻�� ���)
);

select * from col where tname = 'TEMP3';

select sysdate from dual;
alter session set nls_date_format='YYYY-MM-DD HH24:MI:SS';

insert into temp3(memberid, name, regdate)
values(100, 'Dayeong', '2022-09-29');

select * from temp3;
commit;

insert into temp3(memberid, name) 
values(200, '������');

select * from temp3;
commit;

insert into temp3(memberid)
values(300);

select * from temp3;
commit;

insert into temp3(name) --ORA-01400: cannot insert NULL into ("KOSA"."TEMP3"."MEMBERID")
values('someone');
rollback;

select * from temp3;
------------------------------------------------------------------------------------
--TIP)
--1. �뷮 ������ �����ϱ�
create table temp4(id number);
create table temp5(num number);

insert into temp4(id) values(1);
insert into temp4(id) values(2);
insert into temp4(id) values(3);
insert into temp4(id) values(4);
insert into temp4(id) values(5);
insert into temp4(id) values(6);
insert into temp4(id) values(7);
insert into temp4(id) values(8);
insert into temp4(id) values(9);
insert into temp4(id) values(10);

commit;
select * from temp4;
select * from temp5;

--�䱸����: temp4�� �ִ� ��� �����͸�  temp5 �� �ְ� �;��
--insert into ���̺��(�÷�����Ʈ) values
--insert into ���̺��(�÷�����Ʈ) select ��

insert into temp5(num)
select id from temp4; --�뷮 ������ ����...

select * from temp5;

--2. �뷮 insert
--���� ���̺��� ���� ��� >> ���̺� ���� (����: ��Ű��) + ������ ����)
--��, ���� ������ �������� �ʴ´�. (PK, FK)
--������ ������ ������ ���� + ������ ����

create table copyemp
as 
 select * from emp; --copyemp��� ���̺� �����ϰ� emp ���̺��� ���� + ��������Ͽ� ���Ե�
 
 select * from copyemp;
 
 create table copyemp2
 as
 select empno, ename, sal
 from emp
 where deptno = 30;
 
select * from copyemp2;
--����
--Ư(����)�� �����ϰ� �����ʹ� �����ϰ� ���� �ʾƿ�
create table copyemp3
as 
 select * from emp where 1=2; --1=2�� �����̱� ������ ������ �ƹ��͵� ���� �ʴ´�.(�ͼ��� �����)

select * from copyemp3;
-----------------------------------INSERT END------------------------------------
---------------------------------------------------------------------------------
--update
/*
update ���̺��
set �÷���1 = ��, �÷���2 = ��2....
where ������

update ���̺�
set �÷� = (subquery)
where �÷��� = (subquery)
*/

select * from copyemp;

update copyemp
set sal = 0;
rollback; --���� �ȵ� Ŀ�� ���Ϸ���..

update copyemp
set sal = 1111
where deptno = 20;
rollback;

update copyemp
set sal = (select sum(sal) from emp);
rollback;

update copyemp
set ename = 'AAAA', job = 'BBB', hiredate = sysdate, sal = (select sum(sal) from emp)
where empno = 7369;
select * from copyemp where empno = 7369;

-----------------------------------[UPDATE END]--------------------------------
--delete
delete from  copyemp;

select * from copyemp;
rollback;

delete from copyemp where deptno = 10; --�μ���ȣ�� 10���� ������ ������
select * from copyemp where deptno = 10;
rollback;
--------------------------[DELETE END]--------------------------------------------
/*
������(SQL) >> 
1. CRUD �������� ����(create > insert, Read > select, update, delete)
2. APP(JAVA) -  JDBC API   - ORACLE
3. insert, update, delete, select (70%)


�ϳ��� ���̺� ���ؼ� �۾�
-- Java ����: Java���� EMP ���̺��� CRUD �۾�
App(java) ���忡��
1. ��ü ��ȸ (�Լ�)   >> public List<Emp> getEmpList(){select * from emp}
2. ���� ��ȸ (�Լ�)   >> public Emp getEmpListByEmpno(int empno){select * from emp where=7788}
3. ������ ���� (�Լ�) >> public int insertEmp(Emp emp) {insert into(...) values(...)}
4. ���� (�Լ�) >>
5. ���� (�Լ�) >>
���� >> JAVA �ڵ� >> DAO
*/ ------------------------------------------------------DML END----------------
--DD(create, alter, dro, rename) ���̺�� ����, ����, ����
--����Ŭ.pdf 9�� 130p

select*from board;
drop table board;
create table board(
 boardid number,
 title nvarchar2(50),
 content nvarchar2(2000),
 regdate date
);

desc board;

select * from user_tables where lower(table_name) ='board';
select * from col where lower(tname) = 'board'; --������
--��������
select * from user_constraints where lower(table_name) = 'board';

--Oracle 11g >> �����÷�(�����÷�)
--�л��� ������ ��� ���̺� : ����, ����, ���� ����

create table vtable(
 no1 number,
 no2 number,
 no3 number GENERATED ALWAYS as (no1 + no2) VIRTUAL
);
select * from col where lower(tname) = 'vtable';
insert into vtable(no1, no2) values(100, 50);

select * from vtable;

-- insert into vtable(no1, no2, no3) values(10, 20, 30); --SQL ����: ORA-54013: INSERT operation disallowed on virtual columns
-- �ǹ����� Ȱ��Ǵ� �ڵ�  
-- ��ǰ���� (�԰�) : �б⺰ ������ ����(4�б�) 
-- �԰���(2022-09-10) 
create table vtable2(
 no number, --����
 p_code char(4) , --��ǰ�ڵ� (A001, B002)
 p_date char(8), --�԰���(20220922)
 p_qty number, --�԰� ����
 p_bungi number(1) GENERATED ALWAYS as (
                                        CASE WHEN substr(p_date, 5, 2) in ('01', '02', '03') THEN 1
                                             WHEN substr(p_date, 5, 2) in ('04', '05', '06') THEN 2
                                             WHEN substr(p_date, 5, 2) in ('07', '08', '09') THEN 3
                                             ELSE 4
                                       END ) VIRTUAL
) ;

insert into vtable2(p_date) values('20190101');
insert into vtable2(p_date) values('20190501');
insert into vtable2(p_date) values('20190601');
insert into vtable2(p_date) values('20191101');
insert into vtable2(p_date) values('20191201');
commit;

select * from vtable2;
select * from vtable2 where p_bungi = 1;

---------------------------------------------------------------------------------
--DDL ���̺� ����� ����, ����
--1. ���̺� �����ϱ�
create table temp6(id number);

desc temp6;

--2. ���̺� ���� �Ŀ� �÷� �߰��ϱ�
alter table temp6
add ename varchar2(20);

desc temp6;

--3. ���� ���̺� �ִ� �÷� �̸��� �߸� ǥ��(ename -> username)
--���� ���̺� �ִ� ���� �÷��� �̸��� �ٲٱ� (rename)
alter table temp6
rename column ename to username;

desc temp6;

--4. ���� ���̺� �ִ� ���� �÷��� Ÿ�� ũ�� ���� (���) modify
alter table temp6
modify (username varchar2(2000));

desc temp6;

--5. ���� ���̺� �ִ� ���� �÷� ����
alter table temp6
drop column username;

desc temp6;

--�� ��� �۾��� ���� ����ؼ� �۾� ����.....

--6. ���̺� ��ü�� �ʿ� �����
--6.1 delete : �����͸� ����.. �� ������ ��������
--���̺� ó�� ����� ó�� ũ�� >> �����͸� ������ ���� Ŀ��  >> ������ ũ�⸸ŭ ���̺��� ũ�⵵ ����
--ex) ó�� 1M >> �����Ͱ� 10���� >> 100M >> delete �ؼ� 10���� ���� >> ���̺��� ũ��� �þ ũ�⿡�� ������ ����ٰ� �ٽ� �پ���� ���� >> ������ 100M

--���̺� (������) ������ ������ ũ�⵵ ���� ���� �� ������
--truncate (����: where���� ������� ���Ѵ�)
--ex) ó�� 1M >> �����Ͱ� 10���� >> 100M >> delete �ؼ� 10���� ���� >> ���̺� ũ�� �پ��� 1M
--trunc table emp

--���̺� ����
drop table temp6; --������� ������ ������ �� ����.
----------------------------------------------------------------------------------
--���̺��� ���Ἲ
--���̺� ���� �����ϱ�
--����Ŭ .pdf (136p)
PRIMARY KEY(PK) �����ϰ� ���̺��� ������ �ĺ�(NOT NULL �� UNIQUE ������ ����)
--where empno = 7788 >> ������ 1�� ���� >> ���� >> ��ȸ >> index �ڵ� ����

--������ ����� ��� (create table �ȿ��� ����)
--���̺��� ������ ���� �߰� (alter table add constraint ...) ���� ��� >> ��..

--TIP)
--���� ���� Ȯ��
select * from user_constraints where table_name = 'EMP';

create table temp7(
 --id number primary key --�������� �ʾƿ� (���� �̸� �ڵ� ���� >> SYS_C006997
                       --���� ������ ������ ã�� �������(���������ϱ� �����)
    id number constraint pk_temp7_id primary key, --pk_temp7_id ������
    name varchar(20) not null, --constraint ǥ�� ���� ������
    addr varchar2(50)
);

c

--pk (not null �ϰ� unique�� ����)
--�ߺ� ������ ������� �ʰ� null�� ���� �ʴ´�.
--PK ���̺� �� 1���� ��� (�÷� 1��, �������� �÷��� ��� 1��: ����Ű)
insert into temp7(name, addr) values('ȫ�浿', '����� ������');
--ORA-01400: cannot insert NULL into ("KOSA"."TEMP7"."ID")

insert into temp7(id, name, addr) values (10, 'Dayeong', 'Seoul GangNam');
select * from temp7;
commit;

insert into temp7(id, name, addr) values (10, 'somethingelse', 'Seoul GangNam');
--ORA-00001: unique constraint (KOSA.PK_TEMP7_ID) violated 

--UNIQUE key(UK) ���̺��� ��� ���� �����ϰ� �ϴ� ���� ���� �� (NUL�� ���)
--�÷��� �� ��ŭ ���� ����
--null ���
--not null , unique 
create table temp8(
 id number constraint pk_temp8_id primary key,
 name nvarchar2(20) not null,
 jumin nchar(6) constraint uk_temp8_jumin unique, --null ���
 addr nvarchar2(1000)
);
select * from user_constraints where lower(table_name) ='temp8';

insert into temp8 (id, name, jumin, addr)
values(10, 'Dayeong', '123456', 'Incheon');

select * from temp8;
commit;

insert into temp8 (id, name, jumin, addr)
values(20, 'Hyunjeong', '123456', 'Seoul');
--ORA-00001: unique constraint (KOSA.UK_TEMP8_JUMIN) violated (�ֹι�ȣ 123456 �� Dayeong�̶� ���ļ� unique ���� ���� ����)

insert into temp8 (id, name, addr)
values(20, 'Hyunjoong', 'Gyeyang'); --unique null ���

select * from temp8;

--�׷� null�� �ߺ� üũ�� �ұ�?
insert into temp8 (id, name, addr)
values(30, 'Mr.Lee', 'Gyeyang'); --null�� �ߺ� ���

select * from temp8;
--������ 
--jumn nchar(6) not null constraint uk_temp8_jumin unique,

--���̺� ���� �Ŀ� ���� �ɱ�
create table temp9 (id number);
--���� ���̺� ���� �߰��ϱ�
--���� �߰��� ���̺� �ִ� �����͸� �˻� >> �ߺ������� >> ������ >> �ߺ������� ���� ����
alter table temp9
add constraint pk_temp9_id primary key(id);

--add constraint pk_temp9_primary key(id, jumin); ����Ű
select * from user_constraints where lower(table_name)='temp9';

alter session set nls_date_format = 'YYYY-MM-DD HH24:MI:SS';
select sysdate from dual; --2022-09-30 09:04:11

select * from user_constraints where lower(table_name) = 'temp9';

desc temp9;

alter table temp9
add ename varchar2(50);

desc temp9;

--ename not null ���� �߰�
alter table temp9
modify(ename not null);

desc temp9;

select * from user_constraints where lower(table_name) = 'temp9';
---------------------------------------------------------------unique ���� end---

FOREIGN KEY(FK) ���� ������ �� ������ �ܷ�Ű ���踦 �����ϰ� �����մϴ�.


UNIQUE key(UK) ���̺��� ��� ���� �����ϰ� �ϴ� ���� ���� ��(NULL �� ���)

---NOT NULL---------------------------------------------------------------------
NOT NULL(NN) ���� NULL ���� ������ �� �����ϴ�.
--ename not null ���� �߰�
alter table temp9
modify(ename not null);

desc temp9;


select * from user_constraints where lower(table_name)='temp9';


---CHECK----------------------------------------------------------------------
CHECK(CK)       ���̾�� �ϴ� ������ ������(��κ� ���� ��Ģ�� ����)
--where ���ǰ� ������ ������ ����
--where gender in ('��','��')
create table temp10(
 id number constraint pk_temp10_id primary key,
 name varchar2(20) not null,
 jumin char(6) constraint uk_temp10_jumin unique,
 addr varchar2(20), 
 age number constraint ck_temp10_age check(age >= 19) -- where age >= 19
);

select * from user_constraints where lower(table_name)='temp10';

insert into temp10(id,name,jumin,addr,age)
values(100,'ȫ�浿','123546','�����',25);

select * from temp10;
commit;

insert into temp10(id,name,jumin,addr,age)
values(200,'ȫ�浿','123546','�����',15);
--check constraint (KOSA.CK_TEMP10_AGE) violated


--FOREIGN KEY(FK) ���� ������ �� ������ �ܷ�Ű ���踦 �����ϰ� �����մϴ�.
--�������� (���̺�� ���̺��� ���� ����)
create table c_emp -- ()
as
  select empno , ename , deptno from emp where 1=2;  --���̺��� ����(��Ű��)

--create table ���̺�� as  select ...
select * from c_emp;

create table c_dept
as
  select deptno , dname from dept where 1=2;
  
select * from c_emp;
select * from c_dept;

--c_emp ���̺� �ִ� deptno �� c_dept���̺� �ִ� deptno �÷��� �ִ� �����͸�
--���ڴ�

--����(����) fk

alter table c_emp
add constraint fk_c_emp_deptno foreign key(depto) references c_dept(deptno);

--foreign key(depto) �����ϱ� ���ؼ��� >> c_dept(deptno) >> ������ >> �� �����ʹ�
-- ���Ἲ�� (�ߺ�,null) >> pk >> c_dept(deptno) >> unqiue , primary key

--�ݵ�� c_dept �� PK �����Ǿ� �־�� �Ѵ�
alter table c_dept
add constraint pk_c_dept_deptno primary key(deptno); --�ſ�Ȯ��

select * from user_constraints where lower(table_name)='c_dept';

--pk����ǰ� ����
alter table c_emp
add constraint fk_c_emp_deptno foreign key(deptno) references c_dept(deptno);

--����
insert into c_dept(deptno,dname) values(100,'�λ���');
insert into c_dept(deptno,dname) values(200,'������');
insert into c_dept(deptno,dname) values(300,'ȸ����');
commit;

select * from c_dept;
select * from c_emp;
--���Ի�� �Ի�
insert into c_emp(empno, ename) values(100,'ȫ�浿');
----------------------------------------------------------------------
--deptno �÷��� FK �����Ǿ� �־ not null �������� ������ null ���
--�䱸���� ���ǿ� ���� ....
--�Ի�� �μ��� ������ ���� �� �� �ִ�

--���Ի���� �ݵ�� �μ��� ������ �Ѵ�
--create table c_emp(deptno not null  ...fk)

insert into c_emp(empno, ename ,deptno) values(1,'ȫ�浿',100);
select * from c_emp;

insert into c_emp(empno, ename ,deptno) values(2,'������',600); 
--ORA-02291: integrity constraint (KOSA.FK_C_EMP_DEPTNO) violated - parent key not found 
commit; 

---------------------------------------------------------------------------���⼭����2����
/*
������
���̺���� ��������(�θ�, �ڽ�)
c_emp, c_dept [deptno] ����� �ؼ��ϸ�
�θ� (master) -> PK (deptno)
�ڽ� (detail) ->  FK (deptno) 

c_dept���� 100�� �μ��� ������ �� �������
���������� ������µ� �׷��� �����ϰ�ʹٸ�
100�� ����... �������...
*/
select * from c_emp;
select * from c_dept;
delete from c_dept whee deptno = 100;
--�����޼���

--�ڽĿ��� ....
delete from c_emp where empno=1;
delete from c_dept where deptno=100;
rollback;

select * from c_emp;
select * from c_dept;

/*
column datatype [CONSTRAINT constraint_name]
 REFERENCES table_ name (column1[,column2,..] [ON DELETE CASCADE])
column datatype,
. . . . . . . ,
[CONSTRAINT constraint_name] FOREIGN KEY (column1[,column2,..])
 REFERENCES table_name (column1[,column2,..] [ON DELETE CASCADE])


ON DELETE CASCADE : �θ����̺�� ������ ���� �ϰڴ�
--100 �� �μ� ���� : ��
--delete from c_dept where deptno=100
--�����ϴ� �ڽ������� ���� ����
*/
alter table c_emp
drop constraint fk_c_emp_deptno;

alter table c_emp
add constraint fk_c_emp_deptno foreign key(deptno) references c_dept(deptno)
ON DELETE CASCADE;

select * from user_constraints where lower(table_name)='c_dept';

select  * from c_emp;
delete from c_emp where deptno=100;
commit;



select * from user_constraints where lower(table_name)='c_emp';
select * from user_constraints where lower(table_name)='c_dept';

select * from c_dept;
select * from c_emp;

insert into c_emp(empno, ename, deptno) values(1,'������',100);
commit;

delete from c_dept where deptno=100;

--TIP)
--MS-SQL
--ON DELETE CASCADE
--ON UPDATE CASCADE
--------------------------------------------------------------------------------
--EMP empno  pk
--DEPT deptno pk
--EMP deptno FK
--------------------------------------------------------------------------------
/*
--�������̺� , ���� �÷���
--[�л� ���� ���̺�]
--�й��� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�
--�̸� NULL ���� ������� �ʴ´�
--����
--����
--���� ���� �÷��� ���� Ÿ���̰� NULL ���� ���
--���� �Է����� ������ default�� 0���� ���´�
--���� ,��� �÷��� �����÷�����(�����÷�) �����Ѵ�
--�а��ڵ�� �а� ���̺� �а��ڵ带 �����Ѵ�
--�й� , �̸� , ���� , ���� , ���� , ���� , ��� , �а��ڵ�


--�а� ���̺�
--�а��ڵ� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�,
--�а��� �� null���� ������� �ʴ´�

--�а��ڵ� , �а���

--���� ������ insert ..
--�׸��� select �����
--�й� , �̸� , ����, ��� , �а��ڵ� , �а��� �� ����ϼ���

create table grade(
  s_number number ,
  s_name varchar2(20) not null,
  k_score number default 0,
  e_score number default 0,
  m_score number default 0,
  m_code number ,
  avg_score number GENERATED always as (round((k_score + e_score + m_score)/3,2)) VIRTUAL,
  sum_score number GENERATED always as (k_score + e_score + m_score) VIRTUAL,
  
  constraint pk_grade_snum primary key(s_number),
  constraint fk_grade_mcode foreign key(m_code) references major(m_code) 
  --���߿� �ɰų� (���̺� ���� �Ŀ�)
);
 
create table major(
  m_code number,
  m_name varchar2(20) not null,
  constraint pk_major_mcode primary key(m_code)
);
select * from emp;


/* ��� */
CREATE TABLE EMP (
	empno NUMBER NOT NULL, /* ��� */
	ename VARCHAR2(20), /* �̸� */
	sal NUMBER, /* �޿� */
	deptno NUMBER /* �μ���ȣ */
);



/* �μ� */
CREATE TABLE DEPT (
	deptno NUMBER, /* �μ���ȣ */
	dname VARCHAR2(20) /* �μ��� */
);

ALTER TABLE EMP
ADD CONSTRAINT PK_EMP_EMPNO	PRIMARY KEY (empno);

ALTER TABLE DEPT
ADD CONSTRAINT PK_DEPT_DEPTNO 	PRIMARY KEY (deptno);

ALTER TABLE EMP
ADD CONSTRAINT FK_DEPT_TO_EMP 	FOREIGN KEY (deptno)	REFERENCES DEPT (deptno);

select * from user_constraints where lower(table_name)='emp';
--
--������ �ʱ� ���� �Ϸ�
--------------------------------------------------------------------------------
--�߱�( View )
--View ��ü (�������̺�)
--create ���� ... ������ view ���������� ����
/*
CREATE [OR REPLACE] [FORCE | NOFORCE] VIEW view_name [(alias[,alias,...])]
AS Subquery 
[WITH CHECK OPTION [CONSTRAINT constraint ]]
[WITH READ ONLY]

OR REPLACE       �̹� �����Ѵٸ� �ٽ� �����Ѵ�.
FORCE            Base Table ������ ������� VIEW �� �����.
NOFORCE          �⺻ ���̺��� ������ ��쿡�� VIEW �� �����Ѵ�.
view_name         VIEW �� �̸�
Alias Subquery �� ���� ���õ� ���� ���� Column ���� �ȴ�.
Subquery SELECT ������ ����Ѵ�.
WITH CHECK OPTION VIEW �� ���� �׼��� �� �� �ִ� �ุ�� �Է�,���ŵ� �� �ִ�. 
Constraint CHECK OPTON ���� ���ǿ� ���� ������ �̸��̴�.
WITH READ ONLY �� VIEW ���� DML �� ����� �� ���� �Ѵ�
*/
create  view view001
as
  select * from emp;
  
select * from view001;  

--view�� ���̺�ó�� ��밡���� �������̺� : �����͸� ������ ���� �ʾƿ�
--view �޸𸮻󿡸� �����ϴ� �������̺�
--subquery -> in line view > from (.....)

--view �������̺� 
--���� : �Ϲ����̺�� ������ ���� (select , insert , update , delete)
--�� view�� ���� �ִ� �����Ϳ� ���ؼ�
--DML(insert , update , delete) -> �������̺� ���� view > DML����

create OR REPLACE view v_001
as 
   select empno , ename from emp;

select * from v_001; --view�� ������ �ִ� sql ������ ����

--view  ����
--1. ������ ���� : join, subquery >> view ��� >> ����(x) >> ������ ����
--2. ���� �ܼ�ȭ (����) : ������ ������ �̸� ����� �ΰ� ���
--3. ���ȼ� (Ư�� �÷��� ����)

--���Ի�� �Ի� >> DBA ���� �ο� ��Ź >> �λ����� >> Ư�� �÷��� ���� >> view
create or replace view v_emp
as
   select empno , ename , job , hiredate from emp;
   
--���
select * from v_emp;

select * from v_emp where empno=7902;

select * from v_emp where job='CLERK';

--����
create  or replace view v_002
as
  select e.empno, e.ename, e.deptno , d.dname
  from emp e join dept d
  on e.deptno = d.deptno;

select * from v_002;  

create view v_003  --������ ���� ���̺�ó�� ���Ǵµ� (�÷����� �־��)
as
  select deptno , avg(sal) as avgsal
  from emp
  group by deptno;

select * from v_003; --������ ��� �޿��� �� �� �ִ� view
/*
CREATE [OR REPLACE] [FORCE | NOFORCE] VIEW view_name [(alias[,alias,...])]
AS Subquery 
[WITH CHECK OPTION [CONSTRAINT constraint ]]
[WITH READ ONLY]

OR REPLACE              �̹� �����Ѵٸ� �ٽ� �����Ѵ�.
FORCE                  Base Table ������ ������� VIEW �� �����.
NOFORCE                �⺻ ���̺��� ������ ��쿡�� VIEW �� �����Ѵ�.
view_name                    VIEW �� �̸�
Alias Subquery              �� ���� ���õ� ���� ���� Column ���� �ȴ�.
Subquery                    SELECT ������ ����Ѵ�.
WITH CHECK OPTION VIEW      �� ���� �׼��� �� �� �ִ� �ุ�� �Է�,���ŵ� �� �ִ�. 
Constraint CHECK OPTON      ���� ���ǿ� ���� ������ �̸��̴�.
WITH READ ONLY              �� VIEW ���� DML �� ����� �� ���� �Ѵ�
*/
create or replace view v_004
as
  select round(avg(sal),0) as avgsal from emp;
  
select * from v_004;  

/*
view �� ���� ���̺� �׷��� view���ؼ� insert, update , delete����
�� �������̺�
*/
select * from v_emp;

update v_emp
set sal=0;  --v_emp �� sal�÷��� �����͸� �� �� �����

update v_emp
set job='IT';

select * from v_emp;
select * from emp;
rollback;
/*
create or replace view v_emp
as
   select empno , ename , job , hiredate from emp;
*/
select * from v_emp;


-- 30�� �μ� �������  ����, �̸�, ������ ��� VIEW�� ����µ�,
-- ������ �÷����� ����, ����̸�, �������� ALIAS�� �ְ� ������
-- 300���� ���� ����鸸 �����ϵ��� �϶�.
create or replace view view101(����,����̸�,����)
as
   select job , ename , sal
   from emp
   where deptno=30 and sal > 300;

select * from view101;

--�μ��� ��տ����� ��� VIEW�� �����, ��տ����� 2000 �̻���
--�μ��� ����ϵ��� �϶�.
create or replace view view102
as
  select deptno , avg(sal) as avgsal
  from emp
  group by deptno
  having avg(sal) >=2000;
  
create or replace view view103
as  
  select deptno , avg(sal) as avgsal
  from emp
  group by deptno;

select v.deptno , v.avgsal, d.dname 
from dept d join view103 v
on d.deptno = v.deptno;

----------------------------------------------------------------------------
show user;
--Quiz 
--�Ʒ� 3���� ���̺� �̿��Ͽ�  ���� 3���� ���弼�� 
--�ʼ�����) �Լ� �� JOIN ������ �ݵ�� �ʼ� .....
--���� ������ ���� ������ ���� �ҰԿ� ^^
select * from employees;
select * from departments;
select * from locations;