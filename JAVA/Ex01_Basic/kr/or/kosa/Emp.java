package kr.or.kosa;

//����� ���� �ϼ���
public class Emp {//Emp��� Ŭ������ ������ Ÿ���̴� (ūŸ��)
	public int number;
	private int empno;
	
	public int getEmpno() {//read
		return empno;
	}
	public void setEmpno(int empno) {//write
		//�����ϱ� ���� ����...
		if(empno<0) {
			this.empno = 0;
		}else {
			this.empno = empno;
		}
	}
}
		//public void print)(){