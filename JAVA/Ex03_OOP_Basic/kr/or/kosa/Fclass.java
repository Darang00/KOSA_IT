package kr.or.kosa;

/*
 ��� (����) ����� ���
 �Լ� (mathod)�� ����Ŵ�.
 
 method:  ���� �Ǵ� ����� �ּ� ������ ����: �ϳ��� �Լ��� �ϳ��� ��ɸ��� �����Ѵ�.
 ex)�Դ´�, �ܴ�, �ȴ´� ...
 
 Ŭ���� : field + method
 
 ex) �Ե�����: ���ӹ�: ��, ����, ���� �̱� ...
 
 method��� ���� ȥ�ڼ� ���������� ����
** method(�Լ�)�� ȣ�⿡ ���ؼ��� ���� �ȴ�
������ �̸��� �θ��� ������ �������� �ʴ´�...

 
 
 JAVA)
 1. void, parameter(0): void print(String str){�����ڵ�}
 2. void , parameter(X): void print() {�����ڵ�} >> ��¥
 3. return type, parameter(0): int print(int data) {return 100;}
 4. return type, parameter(X): int print(){return 100;}
 
 *** void > �����ִ� ���� ����� > return type �����
 return type >> �⺻ 8���� + String + Array, class, collection, interface
 �� �߿��� �⺻ 8���� + String + class ���� .... 
 
 boolean print(return true)
 Car print() { Car c = new Car(); return c; } // ���� ��ſ��� Car ��ü�� �ּҸ� return �ϰڴ� c
 String print() { return "A"; }
 
 parameter type >> void print(String �Ķ����)
 >> �⺻ 8���� Ÿ�� + String + Array, class, collection, interface
  �� �߿��� �⺻ 8���� + String + class ���� .... 
  void print(int i){}
  void print(String str){}
  void print(Car car){} //print �Լ��� parameter�� CarŸ���� �ּҰ��� �޴´�.
  
  
  
  ex) 
  Car c = new Car();
  
  void print(Car car) {}
  
  print(c); // print �Լ� ȣ��� c ��� ������ (�ּҰ�)
  
  ������� ... ���� ������ �������϶��� ��ؿ�
  void print (int a, int b, int c, int d) {}
  
  print(10, 20) > ���� �ȵ�
  print(100, 100, 100) >���� �ȵ�
  print(100, 100, 100, 200) > ���� ��
  
  void print(Car c, String str, int i){}
  
  �������� ǥ��
  �ڵ� ��Ģ : ������ ǥ��
  class �̸��� ù ���ڴ� �빮�� : class Car, class Person
  method�� �̸��� �ܾ��� ù���ڴ� �ҹ��� �׸��� �̾����� �ܾ��� ù���ڴ� �빮�� : getNumber()
  
  Q. �����ȣ�� ������ ����� ��� ������ ������ �Ͷ� (�Լ� ����)
  getEmpListByEmpno()  >> �Լ��� �̸����� �뷫���� ���� �ľ� ���� .....
  
 
 */

public class Fclass {
	public int data; 
	
	
	//void m() >> �����Ϸ��� >> default void m() >> ���� ���� �������� ���..
	//�Լ� 70% public
	//�Լ� 30% private : hint) public, private Ŭ���� ���� ���� ...
	//Ŭ���� ���ο����� ����ض� >> �̷��Լ��� "�����Լ�" ��� �θ���. >> ���� private�� ����: �ٸ� �Լ��� �����ִ� ����
	
	public void m() {//void, parameter(x)
		//��� ����
		//main �Լ����� ����ߴ� �ڵ� �״�� ���� ...
		System.out.println("�Ϲ��Լ� : void, parameter(X)" );
	
	}
	
	//void m2(int)
	public void m2(int i) {
		System.out.println("�Ϲ��Լ� : void, parameter(0)");
		System.out.println("parameter ���� Ȱ�� i������ �Լ� ���ο����� ��ȿ�� {�߰�ȣ �ȿ�����} " + i);
		}
	
	//return type m3(x)
	public int m3() {
		//void�� �ƴ� ���� ������, ������... return �����
		return 1000; //return type�� �����ϸ� �ݵ�� return Ű���带 ��� �ؾ��Ѵ� (�ʼ�)
		
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	
	//�������� �⺻ 4����
	
	//Ȯ��...
	//return type(0), parameter(0) ���� ������ �þ�� ��...
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//�Լ��� ������
	//default int subSum() {} ���� ������ �׷��� ��� ����
	//private int subSum() {} ���� ������ �ȵſ�
	//Ŭ���� ���ο��� �ٸ� �Լ��� �����ִ� �����Լ� .....
	//private �Լ� ���� ���...
	
	private int subSum(int i) { //�ٸ� �Լ��� ȣ���ؼ� ���...
		return i + 100;         //������ ��� �Լ��� ������ �ִٸ�.. ����.. ��������..
		
	}
	
	public void callSubSum() {
		//�Լ��� �ٸ� �Լ��� ȣ���� �� �ִ�
		int result = subSum(data);  //�� �� ���� int result�� local valuable
		System.out.println("call result : " + result);
	}
		private int operationMethod(int data) {
			return data * 200;
			
		}
		public int opSum(int data) {
			int result = operationMethod(data);
			//���
			if(result >0) {
				return 1;
			} else {
				return -1;
			}
		}
		
		/*
		 Quiz
		 a�� b �� �߿� ū ���� return�ϴ� �Լ��� ���弼��
		 ex) �Լ� ȣ��� max(10, 5) return ���� 10�� ������ �ſ�
		 */
		//30�� �������� ���� ������ �Լ� ������ �������� ���鿡�� return�� �ּ�ȭ�ϴ°� ����
		/*public int max(int a, int b) {
			if (a>b) {
				return a;
			} else {
				return b;
			}
			
			
		} */
		
		//60��
		/*
		public int max(int a, int b) {
			if result = 0;
				if (a>b) {
					result = a;}
				else {
					result = b;
				}
				return result; //return 1�� ...
			
		}*/
		
		
		//90��
		/* public int max (int a, int b) {
			int max = (a>b) ? a : b ;
			return max;
		}*/
		
		
		//100��
		public int max (int a, int b) {
			return (a>b) ? a:b ;
		}
		
	}


