/*
 ������ �Լ�(constructor)
 1. �Լ�(Ư���� ����)
 2. ����: (member field �ʱ�ȭ) >> static {}, {�ʱ��� ��}
 
 3. �Ϲ��Լ��� �ٸ���
 3.1 �Լ��� �̸��� ����(class �̸��� ����)
 3.2 return type ����� (��ü ������ ���ÿ� ȣ��) (return�� ���� ����� ����)
 3.3 ������� >> new�� ���ؼ� ��ü�� ���� >> heap�̶�� �޸𸮿� ���� ���� >> member field �ڸ��� ���� >> �ڵ����� ������ �Լ� ȣ��
 3.4 return type(x) void >> public void(����) Ŭ���� �̸� >> public Ŭ���� �̸� () {}
 
 4. Why: [�����Ǵ� ��ü]���� [������]���� member field ���� �ʱ�ȭ �� �� �ִ�. 
 
 class Car {String color;}
 >> ���赵�� ������� ... �ڵ����� ������ ���� �� �˾Ƽ� ��
 
 A) �� ������ �Ķ��� ���� ����.... ó������ �Ķ������� ������ �ּ���
 
 class Car {String color="blue"}
 
 B) ���� �� ������ ���� �˾Ƽ� �����ҰԿ�
 class Car {String color;} 
 Car car = new Car(); -> (��ȣ) : ������ ȣ���ϴ� ��ȣ. ��ȣ �� ��������� default
 car.color = "gold";
 
 ����) �� ����� �����ϰ� �ڵ����� ������ �������� �ʰ� ����ߴ�.
  -> null�̶� ����(���� ����)
  
  >> ������ ���� �� ������ ������ �Է��ϰ� �� �� �ִ� ���?
  >> �Լ� ...., {�ʱ��ں�} -> �������� ���ų� �Ǵ� �Է°��� �������� ���ؿ�
  
 5. ������ �Լ�(.... overloading ��� ��� ����)
 
 6. ������ �����ε��� ���ؼ� �پ��� �������� ���� ... **********
 
 7. ������(�Լ�)�� ���� ���� �߿��� ������ [������] �ʱ�ȭ(member field)*********
  
 
 */

class Car {
	String carname="����";
	// ����� ���� Car ���赵�� ���� ��...
	// �����Ϸ��� �˾Ƽ� �Լ��� �����մϴ�...
	// ������ �Լ�
	// public Car() {} �����Ϸ��� �ڵ����� ����....
	
	// �����ڰ� ���� ����
	public Car() {// �ڵ�ȣ��
		System.out.println("�⺻������ ȣ��^^");
		carname = "������";
		
		
	}
	
}

class Car4{
	String carname;
	//�����Ǿ� �ִ�
	//���������� ������ public�̸鼭 Ŭ���� �̸��� �Ȱ��� ������ �Լ��� �����Ǿ� �ִ� (public )
}

class Car2{
	String carname; //null����
	public Car2() { //default constructor �ʱ�ȭ
		carname="����";
	}
}

class Car3{ //�������� �ǵ�: �� �⺻�ڵ��� �̸� ����,,, �ʰ� ���ϸ� �ڵ��� �̸� �־ �����ص� ��
	String carname;
	public Car3() {
		carname="�⺻�̸�";
	}
	//overloading ���ؼ�
	public Car3(String name) { //���� Point
		carname = name;
	}
}

// �ڵ����� �̸��� ������ �ڵ����� ��������� ����ϰ� ��..... ���赵�� ������
class Car5{ //�������� �ǵ�: �� �⺻�ڵ��� �̸� ����,,, �ʰ� ���ϸ� �ڵ��� �̸� �־ �����ص� ��
	String carname;
	
	//overloading ���ؼ�
	public Car5(String name) { //���� Point
		carname = name;
	}
}
// �� �ڵ�� public Car5() {} �������� �ʾҾ��... �������� �ʾƵ� �����Ϸ��� �ڵ����� �Ѵٸ� ����...
// ���������� ... �����ڰ� overloading�� �����ڸ� �Ѱ��� ����ٸ� 
// �����Ϸ��� �ڵ����� default �����ڸ� ������ �ʴ´�.

/////////////////
public class Ex15_Constructor {

	public static void main(String[] args) {
		Car car = new Car(); // new Car() �� ��ȣ�� �Լ��� ��ȣ  // default constuctor
		System.out.println(car.carname);
		
		Car3  car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("mycar");
		System.out.println(car4.carname);
		
		
		

	}

}
