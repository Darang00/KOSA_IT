import java.util.ArrayList; //ctrl+shift+O
import java.util.Collections;
import java.util.List;

// AllDay Point
public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList: List  �������̽� ����(��������, �ߺ� ������ ���)
		
		ArrayList arraylist = new ArrayList();
		//Object Ÿ������
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for (int i=0; i<arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		
		//add �Լ��� ���������� ������ �ֱ�
		arraylist.add(0, 111); // ** �ڸ� �̵� **
		System.out.println(arraylist.toString());
		arraylist.add(4,444);
		System.out.println(arraylist.toString());
		
		// ** ��������� �������� �߰�, ���� >> ArrayList �������� �ʾƿ� >> ������ �ִ� ������ ����
		// ** �������� ������ �߰�, ����^^
		
		//arraylist.remove(111); //java.lang.IndexOutOfBoundsException index
		//System.out.println(arraylist.toString);
		
		//[11, 100, 200, 300, 444]
		//ArrayList �Լ� ����(�ʱ�)
		System.out.println(arraylist.contains(200)); //true
		System.out.println(arraylist.contains(2000)); //false
		
		arraylist.clear(); //������ ����(������ ���� �־��)
		System.out.println(arraylist.size()); // 0
		System.out.println(arraylist.isEmpty());// isEmpty() �� ����ִ�?? //true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //false
		System.out.println(arraylist.size());
		Object value = arraylist.remove(0); //0��° �� ������ ��(101) ������ �� �ڸ� �ٲ� (�� �� ���� 102, 103�� ������ �̵�)
		System.out.println(arraylist.toString());
		
		//POINT
		//�������̽� �θ� Ÿ��
		//������ ���������� ... ������(Ȯ�强, ������)
		List li = new ArrayList(); // List�� �θ�� �δ� �ڽ� ��ü�� Ÿ���� �� li ���� �� �ִ�. //���������� �θ�Ÿ�� �Ἥ ������ �̿�
		//ArrayList li = new ArrayList(); // ArrayListŸ���� ��(�ּ�)�� ���� �� �ִ�.
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		
		List li2 = li.subList(0, 3); // *** subList  �Լ��� ���������� new ArrayList() ���� ***
		System.out.println(li2.toString());
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
		
		Collections.sort(alist); //// ���������� ���� >> �ʱް����� ������Ʈ �� ���� ����....
		System.out.println(alist.toString());
		//[1, 3, 7, 15, 40, 46, 50] sort() �Լ��� ũ������� �������ش� 
		//������������ ����
		//�Լ�
		Collections.reverse(alist); // ����
		System.out.println(alist.toString());

		
		
		
		
	}

}
