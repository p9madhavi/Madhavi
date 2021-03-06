---------Lesson-2 (Where and group by sql commands) -------------

SELECT LAST_NAME,SALARY
FROM EMPLOYEES WHERE SALARY>12000

SELECT LAST_NAME,DEPARTMENT_ID
FROM EMPLOYEES WHERE EMPLOYEE_ID=176

SELECT LAST_NAME,SALARY
FROM EMPLOYEES WHERE SALARY NOT BETWEEN 5000 AND 12000

SELECT LAST_NAME,JOB_ID,HIRE_DATE
FROM EMPLOYEES WHERE 
LAST_NAME IN ('Matos' ,'Taylor')
--LAST_NAME = 'Matos'
--OR LAST_NAME = 'Taylor'
ORDER BY HIRE_DATE

-------------------ASC FOR ASCENDING,DESC FOR DESCENDING ORDERS-------------
--------IN (20,50) **** IN('Matos','Taylor')------------------

SELECT LAST_NAME,DEPARTMENT_ID
FROM EMPLOYEES WHERE DEPARTMENT_ID IN(20,50)
ORDER BY LAST_NAME

SELECT LAST_NAME AS EMPLOYEE,SALARY "MONTHLY SALARY"
FROM EMPLOYEES WHERE SALARY BETWEEN 5000 AND 12000 AND DEPARTMENT_ID IN(20,50)

------------------------ LIKE '%07' [ year 2007 ]------------------------
SELECT LAST_NAME,HIRE_DATE
FROM EMPLOYEES WHERE HIRE_DATE LIKE '%03'

----  07-FEB-07 = '%07'

--------------------------- IS NULL,IS NOT NULL-----------------------
SELECT LAST_NAME,JOB_ID
FROM EMPLOYEES WHERE MANAGER_ID IS NULL

---9
SELECT LAST_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES WHERE COMMISSION_PCT IS NOT NULL
ORDER BY 2 DESC,3 DESC,1 DESC

----10---IT WILL OPENT THE PopUP WIndow with the heading "ENTER Substitution Variable" 
-----and Input Box "Enter Value for SAL_AMT " and enter 10,000 and o/p will be lastname who has >10,000----
SELECT LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY>&SAL_AMT

------11
SELECT EMPLOYEE_ID,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES
WHERE MANAGER_ID =  & MANAERID

----12
SELECT LAST_NAME 
FROM EMPLOYEES
WHERE LAST_NAME LIKE '__a%'

------13
SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%a%'
AND LAST_NAME LIKE '%e%'

-------14
SELECT LAST_NAME,JOB_ID,SALARY
FROM EMPLOYEES
WHERE JOB_ID IN ('SA_REP','ST_CLERK')
AND SALARY NOT IN(2500,3500,7000)

----15
SELECT LAST_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES WHERE COMMISSION_PCT = '.2'
