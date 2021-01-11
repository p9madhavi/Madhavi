----------  Example 1  -------------
SELECT MANAGER_ID,COUNT(*) AS TOTAL
FROM EMPLOYEES
GROUP BY MANAGER_ID
ORDER BY TOTAL

---------  Example 1A  -------------
SELECT EMP.MANAGER_ID, MAN.FIRST_NAME, MAN.LAST_NAME, count(*) AS TOTAL
FROM EMPLOYEES EMP
  INNER JOIN EMPLOYEES MAN
   ON ( EMP.MANAGER_ID = MAN.EMPLOYEE_ID )
GROUP BY EMP.MANAGER_ID, MAN.FIRST_NAME, MAN.LAST_NAME
ORDER BY TOTAL DESC

-------------PRACTICE LESSON-5 --------

------  4 -----
SELECT ROUND(MAX(SALARY),0) MAXIMUM,
       ROUND(MIN(SALARY),0) MINIMUM,
       ROUND(SUM(SALARY),0) SUM,
       ROUND(AVG(SALARY),0) AVERAGE
FROM EMPLOYEES

SELECT SUM(SALARY) FROM EMPLOYEES -----4A
--------------- 5----------
SELECT JOB_ID,MAX(SALARY) HIGHSAL,
              MIN(SALARY) LOWSAL,
              SUM(SALARY) SUMSAL,
              AVG(SALARY) AVGSAL
FROM EMPLOYEES
GROUP BY JOB_ID

---- 6 ------------
SELECT JOB_ID,COUNT(*)
FROM EMPLOYEES
GROUP BY JOB_ID

-----  7  ------- 
-- "ENTER IT_PROG WHEN PROMPTED" AND RETURNS
---IT_PROG  5 (JOB_ID, COUNT(*))

SELECT JOB_ID,COUNT(*)
FROM EMPLOYEES
WHERE JOB_ID = '&JOB_TITLE'
GROUP BY JOB_ID            

------ EXAMPLE 1 ANS:: NUMBER OF MANGAERS 108----
SELECT COUNT(MANAGER_ID) AS "NUMBER OF MANAGERS" 
FROM EMPLOYEES  

select count(*) 
from employees
------ EXAMPLE 2 --------
SELECT COUNT(*) AS "NUMBER OF MANAGERS"        
FROM EMPLOYEES                                 
GROUP BY MANAGER_ID

------ 8 -----
SELECT COUNT(DISTINCT MANAGER_ID) AS "NUMBER OF MANAGERS" 
FROM EMPLOYEES
GROUP BY MANAGER_ID

SELECT COUNT(*) AS "NUMBER OF MANAGERS"
FROM (
  SELECT DISTINCT MANAGER_ID
  FROM EMPLOYEES
  WHERE MANAGER_ID IS NOT NULL
)

----- 9 -----
SELECT (MAX(SALARY)-MIN(SALARY)) AS "DIFFERENCE"
FROM EMPLOYEES

----- 10 ------
SELECT MANAGER_ID,MIN(SALARY)
FROM EMPLOYEES
WHERE MANAGER_ID IS NOT NULL
GROUP BY MANAGER_ID
HAVING MIN(SALARY) > 6000
ORDER BY MIN(SALARY) DESC

------- 11 ----
SELECT COUNT(*) TOTAL,
   SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'),2001,1,0)) "2001",
   SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'),2002,1,0)) "2002",
   SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'),2003,1,0)) "2003",
   SUM(DECODE(TO_CHAR(HIRE_DATE,'YYYY'),2004,1,0)) "2004"
FROM EMPLOYEES
   
------ 12 ----
SELECT JOB_ID JOB,
      SUM(DECODE(DEPARTMENT_ID,20,SALARY)) "DEPT 20",
      SUM(DECODE(DEPARTMENT_ID,50,SALARY)) "DEPT 50",
      SUM(DECODE(DEPARTMENT_ID,80,SALARY)) "DEPT 80",
      SUM(DECODE(DEPARTMENT_ID,90,SALARY)) "DEPT 90",
      SUM(SALARY) TOTAL      
FROM EMPLOYEES
GROUP BY JOB_ID
       
       




