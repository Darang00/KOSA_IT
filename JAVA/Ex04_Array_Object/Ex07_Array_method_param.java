class Human{
	String name;
}

class OverTest{
	int add(int i, int j) {
		return i+j;
	}
	void add (Human human) { //Human ��ü�� �ּҰ�...
		System.out.println(human.name);
	}
	//1. add(new Human());
	//2. Human h = new Human(); add(h);
	
	//Today point(�迭�� Ÿ���̴� == �迭�� ��ü��)
	int add (int param) {
		return param +100;
	}
	int[] add(int[] params) {// point: params�� int[] �迭�� *�ּҰ�*�� �޴´�
		// return null; // int[] �迭�� �ּҰ� return
		int[] target = new int[params.length];
		for(int i = 0; i< target.length; i++) {
			target[i] = params[i] +1; // target �迭�� �濡 �ִ� ���� params �迭�� �� �濡 ����ִ� �� ���� 1�� ũ��
			
		}
		return target; // target �迭�� �ּҰ��� return �ϰڴ�
	}
	int[] add(int[]so, int[] so2) {
		// ��ٰ� ...
		return null;
	}
}
public class Ex07_Array_method_param {

	public static void main(String[] args) {
		OverTest overtest = new OverTest();
		
		int[] source = {10, 20, 30, 40, 50};
		
		int[] ta = overtest.add(source); // int[] add(int[] params)���� return�� target�� == overtest.add(source);
		//int[] param = source;
		for(int value: ta) { //ta �迭 �ȿ� �ִ� ���� ������� ���
			System.out.println(value);
		}
		// **return ���� ��ȯ�Ǵ� ���� ���� ������ ���� ������ �Ѵ�**

	}

}
