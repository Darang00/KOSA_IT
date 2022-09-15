import java.util.ArrayList;
import java.util.List;


// https://cafe.naver.com/kosait/329

/*
 �ڹٴ� 8���� �⺻ Ÿ��(�� Ÿ��): JAVA API ����
 
 8���� �⺻ Ÿ�Կ� ���ؼ� ��ü ���·� ��� ���� �ϵ��� ���� Ŭ����(wrapper class) 
 
[���]
1. �Ű����� ��ü �䱸�� ��
2. �⺻�� ���� �ƴ� ��ü ���·� ������ �ʿ��� ��
3. ��ü �� ���� ���� ��
4. Ÿ�� ��ȯ �� ó��

>> generic ���� (��ü ����) >> ex: int�� wrapper class type: Integer
  
 
 */
public class Ex08_Wrapper {

	public static void main(String[] args) {
		int i = 100; //i�� ��Ÿ�� ����
		
		/*
		Integer n = new Integer(500); //int ��� �ϴ� ���� Ÿ���� ��ü�� ���� ��
		System.out.println("n : "+ n); //toString�� ������ �ؼ� Integer�� �ּҰ� ������ ���� �ƴ϶� ���� ���� //n : 500
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE); //-2147483648
		*/
		//POINT
		//parameter Ȱ�� : �Լ��� �Ű����� ��
		//���ʸ�(generic) : ��ü ���� �� Ÿ���� �����ϴ� ��� >> refer class
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
		// li.add("A"); // li�� Ÿ�� Integer�� ���� �ߴµ� "A"��� ����(��)�� ���ͼ�
		for(int value : li) {
			System.out.println(value);
			
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //false
		System.out.println(i2.equals(i3)); //true // �ּҸ� ã�ư��� �� ���� ��
		
		//String >> ���ڿ��� �� >> equals (������)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 ==i5);
	}
	
	static void iMethod(Integer i) {
		
	}

}
