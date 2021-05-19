select max (sal) as Maximum , min(sal) as Minimum , sum(sal) as Sum, avg(sal) as Average from emp;

select job, min(sal) as Minimum, max (sal) as Maximum, sum(sal) as Sum, avg(sal) as Average from emp
group by job;

select job, count(*) from EMP
group by job;

select count(*) as Number_of_Managers from EMP
where job like 'Manager%';

select max (sal) - min (sal) as Difference from EMP;

select m.empno, min(e.sal)
from emp e join emp m on m.deptno = e.mgr
where e.mgr is not null
group by m.empno
having min(e.sal)<1000
order by min(e.empno) desc

select e.empno, e.mgr, min(e.sal) "Lowest Salary" from emp e
where e.mgr is not NULL
group by e.empno, e.mgr
having min(e.sal)>1000
order by min(e.empno) desc

select e.hiredate, count(*) "Number of Employee" from emp e
where year(e.hiredate) in (1980, 1981, 1982, 1983)
group by e.hiredate






