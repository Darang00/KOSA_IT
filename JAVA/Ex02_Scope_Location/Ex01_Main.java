//import kr.or.kosa.common.Air_Main; // �ٸ� ��Ű��(default) �� �־ ���� �Ұ�(������ Air_Main ������ Ŭ���� �� �տ� public �پ���� ��)
import kr.or.kosa.common.Car;
import kr.or.kosa.common.*;// �ظ��ϸ� ���� �ʴ°� ����. �ٸ� ���� �� ���� �����ϴٴ� ��.
/*
 Ŭ���� == ���赵 == �������� Ÿ��
 
  Ŭ���� ���� ��� (���赵��� �Ǵ��ҷ��� �ּ��� ������ ������ �־�� �Ѵ�)
  [�ʵ� + �Լ�] + ������ �Լ�
  
  �ʵ� (member field) >> ������, ���� ��ƾ� �Ѵ� >> ���� ����, ���� ����, ��ǰ ���� >> field >> variable
  �Լ�(method) >> ��� (����) >> �ڵ��� >> �޸���, �����, �Ҹ��� ����
  + �߰������� ������(constructor): Ư���� ������ �Լ� >> ��ü ���� �� member field �ʱ�ȭ �ϱ� ���� ����..
  
  Ŭ����, �ʤ�, ������, �Լ� : ����(����) >> ������, ������, ������(modifier)
  >> public, private, default, protected
  
  >> kr.or.kosa.comon �ȿ� Car Ŭ���� ����  >> public class Car {} >> �� �� �����Ҳ���
  
  >> kr.or.kosa.common �ȿ� AirPlane  >> class airPlane { >> default class AIrPlane}
  >> default ���� ���������� �����ϰڴ� : [���� package �ȿ����� ����] [�ٸ� package ������ ���� �Ұ� ]
  >>default �����ڴ� : ���� ���� (package) ������ ���� ������ ...
  
  �ϳ��� �������� java ������ �������� Ŭ������ ���� �� �ִ�.
  >> Ex01_Main.java ������ �׾ȿ� EX01_Main Ŭ������ �ϳ� ������ �ִ�.
  >> �Ϲ������� �ʿ��� Ŭ������ ������ ���Ϸ� �����ؼ� ��� ..... Apt.java
  >> �׳� ���� ... �غ� ���� ���������� ���� �����ʿ� ������
  >> �ϳ��� ������ ������ �������� Ŭ������ ���� �� ������ public�� �ϳ��� Ŭ������ ���� �� �ִ�. 

 */

class Emp { //�����ϰų� �ǽ��� �� �ٷ� Ȯ�� ...
	
}

class Test{ // �����Ϸ��� default class Test ��� �ؼ�
	int data; // instance variable // �����Ϸ��� default int data ��� �ؼ�
	public int p_data; // ������ �ƴ����� �ٸ� �������� ��� �Ұ�... �Ǿտ� public�� �ǹ̰� ����
	private int pri_data; //private ���ߴ�, �����, ĸ�����̼�, ĸ��ȭ, ����ȭ
	
}


public class Ex01_Main {

	public static void main(String[] args) {
		// 
		Car car = new Car ();
		 // ctrl + shift + o (�ٸ� ����� �ҽ��� �޾Ҿ�� .. import  �� ���� 
		// AirPlane air = new AirPlane(); �̷� Ŭ���� ���µ� �ؼ� ... ������ �ʾƿ�
		Apt apt = new Apt ();
		Emp e = new Emp();
		
		Test t = new Test();
		//t.pri_data ����� �� ����. ������ private���� �����־
		

	}

}
