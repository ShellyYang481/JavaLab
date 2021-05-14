1.
select ename, sal from EMP
where sal > 2850
2.
select ename, empno, deptno from EMP
where empno = 7566;
3.
select ename, sal from EMP
where sal not between 1500 and 2850;
4.
select ename, job, hiredate from EMP
where hiredate between '19810220' and '19810501'
order by hiredate;
5.
select ename, deptno from EMP
where deptno in (10, 30)
order by ename
6.
select ename as Employee, sal as Monthly_Salary, deptno from EMP
where sal>1500 and deptno in (10, 30)
7.
select ename, job, hiredate from EMP
where hiredate between '19820101' and '19821230';
8.
select ename, job from EMP
where mgr is null;
9.
select ename, sal, comm from EMP
where comm is not null and comm>0
order by sal desc, comm desc;
10.
select ename, job from EMP
where ename like '__A%'
11.
select ename, mgr, deptno from EMP
where ename like '%ll%' and (deptno=30 or mgr = 7782)
12.
select ename, job, sal from EMP
where job in ('clerk','analyst') and sal not in (1000,3000,5000) 
13.
select ename, sal, comm from EMP
where comm > sal*1.1


