package kr.or.kosa;

/*
 class == ���赵 == ������ Ÿ��
 ���赵�� ���̿� ������ �ʴ´�. �׷��� ��üȭ ���Ѿ� �Ѵ�. (���α׷� ���忡���� �޸𸮿� �ø��� ������ -> ��ü)
 �׷��� �ؼ� ��üȭ �� ��: '��ü', '�ν��Ͻ�'�� �θ�
 
 ���赵: field(������ ����, ���� ����, ��ǰ) , method(���), constructor(������ �Լ�) ��� �� �ʿ��ϴ�
 
 public class Ex01_Basic{
 	public static void main(String{} args} {
 		���� �ȿ��ٰ� �ڵ� �����߾���
 		main �̶�� �̸��� ���� �Լ��� ����
 		String name = "�ʱ�ȭ"; local variable(main �Լ� �ȿ� �ִ� ����) > ������ > �Լ��� ȣ��Ǹ� ����> �Լ� ����� ���� �Ҹ� (���� �Լ��� ���� ���)
 		int age = 0;
 		
 		}
 */

public class Person {
	public String name; // default (�ڵ�) -> null
	public int age; // default (�ڵ�) 0
	public boolean power; // default (�ڵ�) -> false
	public float height ; // default (�ڵ�)-> 0.0
	
	//member field ��� �θ���. >> instance variable �̶�� �θ���. >> ��ü���� 
	//1. instance variable �ʱ�ȭ�� ���� �ʾƵ� �ȴ� >> why? >> default ��
	//�ʱ�ȭ : ������ ó������ ���� �Ҵ�޴� ��.
	//����: �� name member field �ʱ�ȭ �ϰ������ ����? 
	//�ʿ��ϴٸ� ��� �ʱ�ȭ ���� : public int age = 100;
	//Today point: �� �ʱ�ȭ�� ���� �ʾƵ� �ɱ�?, �� �ʱ�ȭ�� ���� �ʿ� ������...?
	//******��: �����Ǵ� ��ü(���)����, [�ٸ� �̸��� ���� �� �ִ�]******
	//Person�� ���� member field�� ����� ����� ���� �� ���� �ٸ� ���� ������ �� ���̱� ������ ���� �ʱ�ȭ ���� �ʾƵ� �ȴ�.
	//�츮�� ����� ���赵�� �ڿ��� ����� �� �ִ� member field�� ����µ�, ��ü���� ���� �ٸ��� �ٰŸ� ���� �ʱ�ȭ ���� �ʾƵ� �ȴ�. 
	/*
	main() {
		Person ���� = new Person(); ��� 1�� �������
		����.name="������";
		����.age="100";
		����.power = "true";
		
		Person ���� = new Person(); ��� �� �� �� �������.
		����. name = "������";
		����. age = "20";
		����. power = false;
		
		Person �ΰ� = new Person();
		
	}
	*/
	
	//���
	//������ ����ϴ� ���(void: ���� ������ �ƹ��͵� �� �����ٰŴ�)
	public void personPrint() {
		System.out.printf("�̸��� %s ���̴� %d, �Ŀ��� %s", name, age, power);
		
	}
}
