import java.util.Vector;

/*
 Collection FrameWork
 [�ټ��� ������]�� �ٷ�� [*ǥ��ȭ�� �������̽�*]�� �����ϰ� �ִ� [Ŭ������ ����]
 
 Collection �������̽� -> ��� List(����: ArrayList), Set(����: HashTable, HashSet..)
 
 >> ArrayList�� �θ�Ÿ���� List�̴�(OK) >> ������
 >> Collection �������̽��� ArrayList�� �θ�Ÿ���̴� (OK) >> ������
 
 Map �������̽�(key, value)��� �ϴ� ���� �迭 -> (����: HashMap)
 
1. List (���� ���ÿ�)  ���...
 	����(��ȣǥ)�� �����Ƿ� �ߺ� ��� > ���������� ������(�ڷ�)�� �迭(Array)�� �����Ѵ�. > [ȫ�浿] [ȫ�浿] [ȫ�浿]
 	                                                                            [0]    [1]     [2]
1.1 Vector (������) -> ����ȭ ����(��Ƽ ������) > Lock(��ġ) ��ȣ > ������ ���� ��������> �Ѱ� ȭ���
1.2 ArrayLIst (�Ź���) -> ����ȭ �������� ���� > Lock �ɼ� (�⺻ Lock(x) ) -> ���� �켱 > �Ѱ� ����� ����

���� �ټ��� �����͸� �ٷ�� ���: Array (����, ����)
***** ���� ������ �� �� �������� (���� ũ��� ���� �Ұ�) *****
int[] arr = new int[5];
arr[0] = 100;
int[0] arr2 = {10, 20, 30}
�����Ͱ� �������� 
���ο� ũ���� �迭�� �ٽ� ����� �����͸� �̵���Ų��. (�ڵ�� ���� ����) ***
Array
1. �迭�� ũ�Ⱑ ���� : Car[] cars = {new Car(), cew Car()}; �� 2��
2. ���� ���: (index) �� ��ȣ�� ����: cars[0], .. cars[length-1] 

List �������̽��� �����ϰ� �ִ� (Vector, ArrayList)�� Ư¡
1. �迭�� ũ�⸦ �������� Ȯ�� or ��Ұ� �����ϴ� >> * ������ �����Ϸ��� ���ο� �迭�� ����� �����͸� �̵������� *
2. ������ ���� (���������� Array ���; ������ ���), �ߺ��� ��� ����
3.�������� ���� ������ Array ���

 
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮: " + v.capacity()); //�ʱ� default �뷮: 10
		System.out.println("size : " + v.size()); //size : 0 // �� �������� ũ��
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(10);
		
		System.out.println("size : " + v.size());
		System.out.println(v.toString()); //[AA, AA, AA, 10] // for�� ���鼭 ������ ������ ���
		// Array >> length >> ��������� index ������ ���� ��ġ ������(size)ó��
		// Collection >> size
		for (int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i)); //collection���� ���� �������� �Լ�: get(index) ���� return // ���� array[index]
		}
		// ������ for�� ���
		for(Object obj : v) {
			System.out.println(obj);
		}
		// ����: ���� ������(���� Ÿ���� ������) ... ���� ū Ÿ���� ����ϴ� �� ���ո�
		// ���ʸ� >> Ÿ���� ���� >> ���� ������ �н�(POINT)
		Vector<String> v2 = new Vector<String>();
		v2.add("baby");
		v2.add("You should put only String");
		v2.add("whatever");
		
		for(String str: v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); // �� 10��
		v3.add("1");
		v3.add("2");
		v3.add("3");
		v3.add("4");
		v3.add("5");
		v3.add("6");
		v3.add("7");
		v3.add("8");
		v3.add("9");
		v3.add("10");
		v3.add("11");
		v3.add("12"); // 11��° ��

		System.out.println(v3.toString());
		System.out.println(v3.capacity());
		
		//����: �׳� ���ø� �ſ�(���� �˾Ƽ� �ø��� �ϴ�...)
		
		
		
		

	}

}
