/*
 String is a Class (���ڿ�)
 String  �� ���� �Լ��� ������ �ִ� > ���ڿ��� ���� (�ڸ��� ��ġ�� ..)
 String > static �Լ� + �Ϲ� �Լ� (15~20�� ���)
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = " ";
		String[] strarr = {"aaa", "bbb", "cccc"};
		for(String s : strarr) {
			System.out.println(s);

		}
		// �����: int, double �� ���� ��Ÿ��ó�� ���
		
		String st = "ȫ�浿";
		System.out.println(st.length());
		System.out.println(st); //st.toString()
		System.out.println(st.toString()); //�ּҷ� ���� �����͸�  return ����(������)
		// String Ŭ������ Object��� �ϴ� �θ� Ŭ����  toString() ��Ӱ��� ������....
		
		//�������� ���
		String sdata = new String("������");
		System.out.println(sdata);
		
		String name = "�����ٶ�"; 
		// String Ŭ������ ���������� char[] member field >> [��] [��] [��] [��] [��]
		// class String extends Object { private char[] str ... @Override toString()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//���ڿ��� ��
		System.out.println(str1);
		System.out.println(str2.toString()); //toString() ������ �ּҰ��� �ƴϰ� ���� ���´�
		System.out.println(str1 == str2);	
		// == ������ ������ �� str1(�ּҰ�) . str2(�ּҰ�)
		// ���� �ּ� �Ǹ�
		// ** �޸𸮿� ������ ���� ���ڿ��� ������ [����]�Ѵ�.
		// POINT
		System.out.println(str1.equals(str2)); // equals�� �ּҸ� ã�ư��� �� �ȿ� �ִ� ���� ��
		
		// why : equals ���ڿ��� ��..
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		
		System.out.println(str3 == str4); // false <- new�� ���� ������ ���ο� ��ü ����Ƿ� �ּҰ��� �ٸ���.
		//���ڿ��� ���� �߿��ؿ�(POINT)         // ���� == ���� �ȵǰ� equals ��� ***
		System.out.println(str3.equals(str4)); // �ּҸ� ã�ư��� �� �ȿ� ���� ��
		
		//Quiz
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s); // result: ABC (�����ż�)
		
		s = "A"; 
		
		

	}

}
