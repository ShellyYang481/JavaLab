use mydb
exec sp_help emp;


select 50*6, 50-6;

select 8
from emp;

select empno, 'ename'
from emp;


select ename + ' is a ' + job from emp;

select ename, job, sal, comm, sal + isnull (comm,100)  from emp;

select ename AS EmployeeName, job, sal "Monthly salary", sal*12 ¦~Á~ from emp;

select ename, sal job from emp;

select job from emp;

select distinct job from emp;

select dept from 

select ename as "Employee ,", job as "Employee and Title" from emp; 

select ename + 'is a' + job from emp;