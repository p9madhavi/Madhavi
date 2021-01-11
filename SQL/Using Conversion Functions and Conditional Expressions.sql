------------Using Conversion Functions and Conditional Expressions ------------
------------LESSON 4--------------

------1--------------
SELECT LAST_NAME  || '  Earns  ' 
        ||  TO_CHAR(SALARY,'fm$99,999.00')
        ||  '  Monthly But Wants  '
        ||  TO_CHAR(SALARY*3,'fm$99,999.00')
        || '.' "DREAM SALARIES"
FROM EMPLOYEES 

SELECT SALARY
FROM EMPLOYEES

-------3-----
SELECT LAST_NAME,HIRE_DATE,
      TO_CHAR(HIRE_DATE,'DAY') DAY
FROM EMPLOYEES
ORDER BY TO_CHAR(HIRE_DATE,'d')


------4--------------
SELECT LAST_NAME,
  NVL(TO_CHAR(COMMISSION_PCT),'NO COMMISSION') COMM
FROM EMPLOYEES

------5------------
SELECT JOB_ID, DECODE (JOB_ID,
 'ST_CLERK', 'E',
 'SA_REP', 'D',
 'IT_PROG', 'C',
 'ST_MAN', 'B',
 'AD_PRES', 'A',
 '0')GRADE
FROM EMPLOYEES; 

--------6 BY USING CASE----
SELECT JOB_ID,CASE(JOB_ID
  
