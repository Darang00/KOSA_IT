/*
 �߻� Ŭ����
 >> �̿ϼ� Ŭ����(���赵)
 1. �ϼ��� �ڵ� + �̿ϼ� �ڵ�
 2. �ϼ�(�Լ�) ������� �ִ� �Լ� + �̿ϼ�(�Լ�) ���� ���� ���� �Լ� >> public void run(); ������� ����!
 ���� �Լ�) public void run(){�����};
 3. �ϼ��� Ŭ���� (new ����) - �̿ϼ� Ŭ���� (������ ��ü ���� �Ұ�)
 
 ������ ���忡��
 >> �ǵ� >> �ݵ�� ������ �ض� >> ������ ������ �������� (���� ���ϴϱ�)

 */
class Car{
	void run() {} //{����� �ȿ� ������ ���: ������� ������ �ϼ��� �ڵ�}
}

class Hcar extends Car{
	//����
	@Override
	void run() {System.out.println("������");}
}
// Car ���� ����� �ǵ�: run() �Լ��� �������ؼ� ������ �ٲ��
// �׷��� ������ ����� Hcar ����� ����� �ǹ������� �ƴϴ�...
// �� �ڵ�� �������� ����

abstract class Abclass{ //Ŭ���� �ȿ� �ּ� 1�� �̻��� �߻� �Լ�(�޼ҵ�)�� ������ �ִ� Ŭ����
	// �ϼ��� �ڵ�
	int pos; 
	void run() {
		pos++;
	}
	
	//�̿ϼ� �ڵ� �߰� (�̿ϼ� �Լ�: �߻� �Լ�)
	abstract void stop(); // ������� ����� >> �����Ǹ� ����(override)
}

class Child extends Abclass{

	@Override
	void stop() { // ������� ����� ����(������ ����)
		this.pos = 0;
		System.out.println("stop : " + this.pos);
		
	}
	
}

class Child2 extends Abclass{

	@Override
	void stop() { // ������� ����� ����(������ ����)
		this.pos = -1;
		System.out.println("stop : " + this.pos);
		
	}
	
}

public class Ex01_abstract_class {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.stop();
		////////////////////////////////////////
		Abclass ab = ch;  // ������ (ch��� �ϴ� ���������� ������ �ִ� �� )
		// ��Ӱ��迡�� �θ� Ÿ���� ���������� �ڽ� Ÿ�� ��ü���� �ּҸ� ���� �� �ִ�.
		// ��, �θ�� �ڽ��� �͸� �� �� �ִ�.
		// ��, �����Ǹ� ���� �ڽ��� �ڿ��� �� �� �ִ�.
		ab.run();
		ab.stop(); // �ڽ� �Լ��� ȣ��(����)
		
		
		
		
	}

}
