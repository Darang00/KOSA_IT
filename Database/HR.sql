/* 1�� */
--1. Ŀ�̼��� ������ �� �޿��� 10000�� �Ѵ� ����� ���� �μ���ȣ�� ���� ����� 
-- �̸�(Ǯ����), ����, �μ���ȣ, ������ �÷��� ���� ���̺��� ����϶�.

select e.first_name || ' ' || e.last_name as �̸�,
       e.salary as ����,
       e.department_id as �μ���ȣ,
       l.city as ����
from employees e join departments d on e.department_id = d.department_id
                 join locations l on l.location_id = d.location_id
where e.department_id in ( select department_id
                    from employees
                    where salary+(salary * commission_pct) > 10000 );
                    
--2. US���� �ٹ��ϴ� ��� �� adminstration �μ��� �����ϰ� 
--��� �̸�, ����, ����, �μ���ȣ, �μ��̸����� �÷��� ����� ����ض�.
select e.first_name || ' ' || e.last_name as �̸�,
       l.city as ����,
       e.salary*12 as ����,
       e.department_id as �μ���ȣ,
       d.department_name as �μ��̸�
from employees e join departments d on e.department_id = d.department_id
                 join locations l on l.location_id = d.location_id
where l.country_id = 'US' and d.department_name != 'Administration';

--3. Sales �Ҽ��� ��� �� Ŀ�̼� �ݾ��� 3000���� ���� ����� 
--�����ȣ, �̸�, Ŀ�̼Ǳݾ�, �μ��̸�, �ּҶ�� �̸��� �÷��� ����ض�.
select e.employee_id as �����ȣ,
        e.first_name|| e.last_name as �̸�,
        nvl(e.commission_pct,0)*e.salary as Ŀ�̼Ǳݾ�,
        d.department_name as �μ��̸�,
        l.street_Address as �ּ�
from departments d  right join employees e
on d.department_id = e.department_id
join locations l
on l.location_id = d.location_id
where d.department_name ='Sales' and (nvl(e.commission_pct,0)*e.salary) >3000;

/* 2�� */
--1. Location_ID�� 1700�� DEPARTMENT_ID�� ���ϰ� �� �μ��� ���ϸ鼭 
--   �̸��Ͽ� H�� ���� ����� employee_id, 
--   fullname(first name + last name), department_id, email�� ����ϼ���. 
--   (fullname ���� ���ĺ� �� ����)
select employee_id, 
       concat(first_name, last_name) as full_name,
       e.department_id,
       email
from employees e join departments d
on d.department_id = e.department_id
where d.location_id = 1700 and email like '%H%' 
order by full_name;
?
--2. ���� �� ��� �̸��� ����� ��.
-- ���ú��� ������������ ���� �� ��.
--�Ʒ��� ��� ���� �����ϼ���.
  create or replace view email_list
       as select e.email, e.department_id, d.location_id
          from employees e join departments d on e.department_id = d.department_id;
       
       select l.city, e.email
       from email_list e join locations l on e.location_id = l.location_id
       order by l.city;
       
--3. ��� ������ ���� ������ �μ���� ��տ����� ����ϵ�,
-- ��� ������ ������ ����ϼ���.
select d.department_name as �μ���, round(A.avgsal, 0) as ��տ���
from departments d join (select department_id as di, avg(salary) as avgsal
                         from employees
                         group by department_id) A
on d.department_id = A.di
order by ��տ��� desc;
?
/* 3�� */
-- 1. US ��� ���޺��� ���� ������ �޴� UK �Ҽ� ����� ���, �̸�, �μ���, ����, ���� ����
create or replace view test4 (���, �̸�, �μ���, ����, ����)
as
select e.employee_id, e.last_name, d.department_name, e.salary, l.country_id
from employees e join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
where l.country_id = 'UK' and e.salary > (select round(avg(e.salary)) as "US���"
from employees e join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
where l.country_id = 'US')
order by e.salary;

--2�� 
--�μ��̸�, �μ� ��� ������ ��� view�� �����, ������ �÷����� �μ��̸�, �μ���տ������� 
--Alias �ְ� �μ� ��� ������ 5000�޷����� ���� �μ��鸸 �����϶�
create or replace view test3
as
    select d.department_name as "�μ��̸�", round(avg(e.salary)) as "�μ���տ���"
    from employees e join departments d
    on e.department_id = d.department_id
    group by d.department_name
    having avg(e.salary) >= 5000;
select * from test3;

--3. �μ��� �������� �Ի���� �����ϴ� �並 �����  �μ��� �� ��� ������ �Ʒ� �÷��� ���� ����Ͻÿ�. 
--�����̸�, �μ��̸�, ����, ��տ���
CREATE OR REPLACE VIEW DATE_EMP
AS   
    SELECT  SUBSTR(E.HIRE_DATE, 4, 2)AS MON, E.SALARY, D.DEPARTMENT_ID, D.LOCATION_ID, D.DEPARTMENT_NAME
    FROM EMPLOYEES E JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID

SELECT LAST.*
FROM (
SELECT E.DEPARTMENT_NAME,L.CITY, MON,DEPARTMENT_ID, ROUND(AVG(SALARY),0) AS TT
FROM DATE_EMP E JOIN LOCATIONS L
ON E.LOCATION_ID = L.LOCATION_ID
GROUP BY E.MON, E.DEPARTMENT_ID, L.CITY,E.DEPARTMENT_NAME
ORDER BY MON DESC, TT DESC
)LAST