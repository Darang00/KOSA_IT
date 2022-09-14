package kr.or.kosa;
//������ ���� (���� ����) >> new 

// �̱��� ... (��ü �ϳ��� ���� �����ϰڴ�)
// �ǵ� : �ϳ��� ��ü�� �����ϴ� ���强 �ڵ带 �����ϰڴ�...

// ���� IT
// ���� ������
// ������ �� ...
public class Singleton {
	private static Singleton p; // p��� ������ �ּҸ� ������ �Ϸ��� new������ �ʿ�
	//�⺻������: public Singleton() {} 
	private Singleton() { // �������� �����ڸ� private���� ����� ������ �Լ� ȣ�� ���ϴ� ��ü ���� �Ұ� new...
		
	}
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton(); // ���� Ŭ���� �������� private �ڿ��� ���� ����(public, private ������)
		}
		return p;
	}
}



/*
Singleton s = new Singleton();
*/