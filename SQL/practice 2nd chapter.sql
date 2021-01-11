select *from employees;

select last_name,phone_number,salary as sal
from employees;

select job_id 
from employees

select last_name,salary
from employees
where salary>12000

select last_name,department_id
from employees
where employee_id = 176;
 
 select last_name,salary
 from employees
 where salary not between 5000 and 12000;
 
 select last_name,job_id,hire_date
 from employees
 where last_name in ('matos','taylor')
 order by hire_date;
 
 select last_name,department_id
 from employees
 where department_id in(20,50)
 order by last_name asc;
 
 select last_name as employee,salary as monthlysalary
 from employees
 where salary between 5000 and 12000 
 and department_id in(20,50);
 
 select last_name,hire_date
 from employees
 where hire_date like '%94';
 
 select last_name,job_id
 from employees
 where manager_id is null;
 
 select last_name,salary,commission_pct
 from employees
 where commission_pct is not null
 order by 2 desc,3 desc;