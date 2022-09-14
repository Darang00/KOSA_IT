/*
 ������(��Ӱ��迡�� ����) 
 ������ : �������� ����(����)�� ���� �� �ִ� �ɷ� 
 
 C#: ������(overloaing , override)
 
 Java: [��Ӱ���]���� [�ϳ�(�θ�)�� ��������]�� [�������� �ڽ� Ÿ��]�� ���� �� �ִ� ��
 >> [�ϳ��� ��������] >> [�θ�Ÿ��]
 >> [�������� Ÿ��] >> [�θ� ��ӹ��� �ڽ�Ÿ��]
 
 
 ������ : ���� >> �θ�� �ڽĿ��� ��� ���� �� �� �ִ�..
        ���α׷� >> �ڽ��� �θ𿡰� ���Ǿ��� �帰��.
 */

class Tv2{ // �θ�(�и�: ������� >> �Ϲ�ȭ, �߻�ȭ)
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2{ //CapTv Ư��ȭ, ��üȭ, ������ 
	String text;
	String captionText() {
		return this.text = "���� �ڸ� ó����...";
	}
}


public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv ct = new CapTv(); // ���� ct�� captv �� tv2 �Ѵ� ���� ����
		ct.power();
		ct.chUp();
		ct.captionText();
		System.out.println(ct.captionText()); //
		
		/////////////////////////////////////////////////////////////////
		Tv2 tv2 = ct; 
		// [��Ӱ���]���� [�θ�Ÿ��]�� [�ڽ�Ÿ��]�� �ּҸ� ���� �� �ִ�.
		// �� �θ�� [ �ڽ��� �ڿ� ]�� ���� �����ϴ�
		// �� �����Ǵ� �����ϰ�....
		
		System.out.println(ct.toString()); //CapTv@5e91993f
		System.out.println(tv2.toString()); //CapTv@5e91993f
		
		// tv2.captionText()  // �ڽ� �ڿ��� ���� �Ұ� (�θ�Ÿ���� �ڿ� ����)
		                      // ��, �����Ǵ� �����ϰ�
		
		
	}

}
