homework
select e.ename, e.deptno, d.dname, d.loc
from emp as e join dept d on (e.deptno=d.deptno)

select e.ename, e.comm, d.dname, d.loc
from emp as e left join dept d on (e.deptno=d.deptno)
where e.comm is not null;

select e.ename, d.dname
from emp as e left join dept d on (e.deptno=d.deptno)
where e.ename like '%A%';

select e.ename, e.job, d.deptno, d.dname, d.loc
from emp as e join dept d on (e.deptno=d.deptno)
where loc = 'Dallas';


select e.ename as Employee, e.empno as Emp#, i.ename as Manager, i.empno as Mgr#
from emp as e join emp i on (e.deptno=i.deptno)

select e.ename, e.job, e.sal, t.dname, b.grade as Salgrade
from emp e join SALGRADE b on e.sal between b.losal and b.hisal join dept t on t.deptno=e.deptno;


select e.ename as Employee, e.hiredate "Emp Hiredate", m.ename as Manager, m.hiredate "Mgr Hiredate"
from emp e join emp m on e.mgr = m.empno
where e.hiredate < m.hiredate

select d.dname as dname, d.loc as loc, count(*) "Number of People", convert (decimal(10,2), avg(sal)) as Salary
from emp e join dept d on e.deptno = d.deptno
group by d.dname, d.loc

