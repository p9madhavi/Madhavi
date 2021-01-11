SELECT last_name, hire_date
FROM employees
WHERE department_id = (
    SELECT DEPARTMENT_ID
    FROM DEPARTMENTS
    WHERE DEPARTMENT_NAME = 'Executive'
  );
  
SELECT last_name, hire_date
FROM employees
WHERE department_id in (
    SELECT DEPARTMENT_ID
    FROM DEPARTMENTS
    WHERE DEPARTMENT_NAME LIKE '%ing'
  );

-------- 1 -----
select last_name,hire_date 
from employees
where department_id=
      (select department_id
       from employees
       where last_name='&&Enter_Name')
AND LAST_NAME<>'&Enter_Name';
--------   2  ----
select employee_id,last_name,salary
from employees
where salary >(
                select avg(salary)
                from employees)
order by salary ;

--------   3 -----
select employee_id,last_name
from employees
where DEPARTMENT_ID IN (select department_id
                        from employees
                        where last_name like '%u%');

------ 4 ------
select last_name,job_id,department_id
from employees
where department_id IN(
                        select department_id
                        from departments
                        where location_id = 1700);

----- 5 ------
select last_name ,salary
from employees
where manager_id=(
                  select employee_id
                  from employees
                  where last_name = 'king');
                  
------ 6 -----
select department_id,last_name,job_id
from employees
where department_id IN (
select department_id
from departments
where  department_name = 'Executive');

------ 7 ------
select last_name
from employees
where salary > ANY  (
              select salary 
              from employees
              where department_id= 60
              );
              
----- 8 -------
select last_name,employee_id,salary
from employees 
where department_id IN (
                          select department_id
                          from employees
                          where last_name LIKE '%u%'
                        )
AND salary>(
    select avg(salary)
      from employees
      ) 
ORDER BY salary  ;

              