package kr.or.kosa;

// ��(����: �Ϲ�, �߻�) : ���� �� �� �ִ�. ���� ������. 

public class Bird {
	// �������� �����غ���
	public void fly() {
		System.out.println("flying");
	}
	
	// �����ڰ� ��� : Bird [����ϴ�] ����� moveFast �ڿ��� ���ؼ� [������] ������ ���ھ�(90%) > protected
	protected void moveFast() {
		fly();
	}

}
