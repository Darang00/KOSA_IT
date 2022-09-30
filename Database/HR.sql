/* 1조 */
--1. 커미션을 포함한 총 급여가 10000이 넘는 사람과 같은 부서번호를 가진 사원의 
-- 이름(풀네임), 월급, 부서번호, 도시의 컬럼을 가진 테이블을 출력하라.

select e.first_name || ' ' || e.last_name as 이름,
       e.salary as 월급,
       e.department_id as 부서번호,
       l.city as 도시
from employees e join departments d on e.department_id = d.department_id
                 join locations l on l.location_id = d.location_id
where e.department_id in ( select department_id
                    from employees
                    where salary+(salary * commission_pct) > 10000 );
                    
--2. US에서 근무하는 사원 중 adminstration 부서를 제외하고 
--사원 이름, 도시, 연봉, 부서번호, 부서이름으로 컬럼을 만들고 출력해라.
select e.first_name || ' ' || e.last_name as 이름,
       l.city as 도시,
       e.salary*12 as 연봉,
       e.department_id as 부서번호,
       d.department_name as 부서이름
from employees e join departments d on e.department_id = d.department_id
                 join locations l on l.location_id = d.location_id
where l.country_id = 'US' and d.department_name != 'Administration';

--3. Sales 소속인 사원 중 커미션 금액이 3000보다 많은 사람의 
--사원번호, 이름, 커미션금액, 부서이름, 주소라는 이름의 컬럼을 출력해라.
select e.employee_id as 사원번호,
        e.first_name|| e.last_name as 이름,
        nvl(e.commission_pct,0)*e.salary as 커미션금액,
        d.department_name as 부서이름,
        l.street_Address as 주소
from departments d  right join employees e
on d.department_id = e.department_id
join locations l
on l.location_id = d.location_id
where d.department_name ='Sales' and (nvl(e.commission_pct,0)*e.salary) >3000;

/* 2조 */
--1. Location_ID가 1700인 DEPARTMENT_ID를 구하고 그 부서에 속하면서 
--   이메일에 H가 들어가는 사원의 employee_id, 
--   fullname(first name + last name), department_id, email를 출력하세요. 
--   (fullname 시작 알파벳 순 정렬)
select employee_id, 
       concat(first_name, last_name) as full_name,
       e.department_id,
       email
from employees e join departments d
on d.department_id = e.department_id
where d.location_id = 1700 and email like '%H%' 
order by full_name;
?
--2. 도시 별 사용 이메일 출력할 것.
-- 도시별로 오름차순으로 정렬 할 것.
--아래의 출력 값을 참고하세요.
  create or replace view email_list
       as select e.email, e.department_id, d.location_id
          from employees e join departments d on e.department_id = d.department_id;
       
       select l.city, e.email
       from email_list e join locations l on e.location_id = l.location_id
       order by l.city;
       
--3. 평균 연봉이 높은 순으로 부서명과 평균연봉을 출력하되,
-- 평균 연봉은 정수로 출력하세요.
select d.department_name as 부서명, round(A.avgsal, 0) as 평균연봉
from departments d join (select department_id as di, avg(salary) as avgsal
                         from employees
                         group by department_id) A
on d.department_id = A.di
order by 평균연봉 desc;
?
/* 3조 */
-- 1. US 평균 월급보다 높은 월급을 받는 UK 소속 사원의 사번, 이름, 부서명, 월급, 나라 추출
create or replace view test4 (사번, 이름, 부서명, 월급, 나라)
as
select e.employee_id, e.last_name, d.department_name, e.salary, l.country_id
from employees e join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
where l.country_id = 'UK' and e.salary > (select round(avg(e.salary)) as "US평균"
from employees e join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
where l.country_id = 'US')
order by e.salary;

--2번 
--부서이름, 부서 평균 월급을 담는 view를 만들고, 각각의 컬럼명을 부서이름, 부서평균월급으로 
--Alias 주고 부서 평균 월급이 5000달러보다 많은 부서들만 추출하라
create or replace view test3
as
    select d.department_name as "부서이름", round(avg(e.salary)) as "부서평균월급"
    from employees e join departments d
    on e.department_id = d.department_id
    group by d.department_name
    having avg(e.salary) >= 5000;
select * from test3;

--3. 부서별 직원들의 입사월을 추출하는 뷰를 만들고  부서별 월 평균 월급을 아래 컬럼에 맞춰 출력하시오. 
--도시이름, 부서이름, 각월, 평균월급
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