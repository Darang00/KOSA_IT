package kr.or.bit;

//���赵
public class Emp {
	private int empno; //�ʵ�
	private String ename; // �ʵ�
	
	//public Emp() {}
	public Emp(int empno, String ename) { // ������
		
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
	
	
// ��� ���
	public void empInfoPrint() {
		System.out.println(this.ename + "/" + this.empno);
	}

}
