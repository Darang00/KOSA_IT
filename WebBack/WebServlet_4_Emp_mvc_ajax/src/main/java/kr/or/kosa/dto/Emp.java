package kr.or.kosa.dto;

import java.util.Date;

/*
create table memo(
    id varchar2(20) not null,
    email varchar2(20) not null,
    content varchar2(100)
); 
 */
public class Emp {
   private int empno;
   private String ename;
   private String job;
   private int mgr;
   private Date hiredate;
   private int sal;
   public int getEmpno() {
      return empno;
   }

   public Emp(int empno, String ename, String job, int mgr, Date hiredate, int sal, int comm, int deptno) {
      super();
      this.empno = empno;
      this.ename = ename;
      this.job = job;
      this.mgr = mgr;
      this.hiredate = hiredate;
      this.sal = sal;
      this.comm = comm;
      this.deptno = deptno;
   }

   public void setEmpno(int empno) {
      this.empno = empno;
   }

   public String getEname() {
      return ename;
   }

   @Override
   public String toString() {
      return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
            + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
   }

   public void setEname(String ename) {
      this.ename = ename;
   }

   public String getJob() {
      return job;
   }

   public void setJob(String job) {
      this.job = job;
   }

   public int getMgr() {
      return mgr;
   }

   public void setMgr(int mgr) {
      this.mgr = mgr;
   }

   public Date getHiredate() {
      return hiredate;
   }

   public void setHiredate(Date hiredate) {
      this.hiredate = hiredate;
   }

   public int getSal() {
      return sal;
   }

   public void setSal(int sal) {
      this.sal = sal;
   }

   public int getComm() {
      return comm;
   }

   public void setComm(int comm) {
      this.comm = comm;
   }

   public int getDeptno() {
      return deptno;
   }

   public void setDeptno(int deptno) {
      this.deptno = deptno;
   }

   private int comm;
   private int deptno;
   
   public Emp() {}

   
   
}