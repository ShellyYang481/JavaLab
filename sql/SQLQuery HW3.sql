1.
select getdate() as ¨t²Î¤é´Á;
2.
select empno, ename, sal, convert(int,sal*1.15 ) "New Salary" from emp
3.
select empno, ename, sal, convert(int,sal*1.15 ) 'New Salary',sal*0.15 'Increase' from emp
4. 
select ename, datediff(month,hiredate,getdate()) as Months_Worked from emp;
5.
select concat (ename,' earns ',sal,' monthly but wants ' ,  sal*3)'Dream Salaries' from emp;
7.
select ename,(sal, 16) from emp
8.
select ename, comm, iif(comm is null,'No Commision',comm)
from emp
9.
select ename,
replicate('*', sal/100) 'EMPLOYEE_AND_THEIR_SALARIES'
from emp

	
