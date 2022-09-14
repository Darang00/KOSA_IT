package kr.or.bit;

//설계도
public class Emp {
	private int empno; //필드
	private String ename; // 필드
	
	//public Emp() {}
	public Emp(int empno, String ename) { // 생성자
		
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}
	
	
// 기능 출력
	public void empInfoPrint() {
		System.out.println(this.ename + "/" + this.empno);
	}

}
