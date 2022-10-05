package DTO;

//DTO(VO), DOMAIN Ŭ����
//�����͸� 1�� ���� �� �ִ� Ŭ����
//DB ���̺��� 1:1�� ���� ����
//DB �� dept ���̺��� 1���� row�� ���� �� �ִ� Ŭ����
/*
 CREATE TABLE DEPT
(DEPTNO number,
DNAME VARCHAR2(14),
LOC VARCHAR2(13) );
 
 Dept dept = new Dept(); 1���� ������
 List<Dept> deptlist = new ArrayList<Dept>(); ������
 */
public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	

}