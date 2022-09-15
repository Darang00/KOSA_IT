import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map �������̽�
 (key, value) ���� ������ ���� �迭
 ex) ������ȣ (02, ����), (031, ���)
 ����) 
 key �ߺ�(X)    >> Set
 value �ߺ�(O)  >> List
 
 Generic  ���� �Ѵ�.
 
 Map �������̽� �����ϴ� Ŭ����
 ������ : HashTable (����ȭ ����) : �Ѱ� ȭ���ó�� lock ��� > �ڿ� ��ȣ.. ������ ������
 �Ź��� : HashMap   (����ȭ �������� �ʾƿ�) ���� ���(Tread �н� ....)  *****�߿�***** 
 */


public class Ex13_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//(ID, PW) ; Id �ߺ� �ȵ����� PW�� �ߺ� ����
		map.put("Tiger", "1004");
		map.put("Scott", "1004");
		map.put("Superman", "1007");
		
		System.out.println(map.containsKey("tiger")); //��ҹ��� ����(false) tiger key �ִ�?
		System.out.println(map.containsKey("Scott")); //��ҹ��� ����(true) Scott key�ִ�?
		System.out.println(map.containsValue("1004")); //1004 value �ִ�?
		
		System.out.println(map.get("Tiger")); //1004 //key���� �����ϸ� value���� return
		//key �����ϸ� > value ���� �� �� �ִ� << map.get(key)
		System.out.println(map.get("hong"));//���� key return �ϸ�: null 
		
		map.put("Tiger", "1008"); //value replace(�Ȱ��� key �� ������ value�� oveeride �ع�����)
		System.out.println(map.get("Tiger")); //1008
		System.out.println(map.size()); //3
		
		System.out.println(map.toString()); // ������ key, value Ȯ�� ����
		//{Superman=1007, Tiger=1008, Scott=1004}
		
		Object value = map.remove("Superman");
		System.out.println("������ value: " + value);
		System.out.println(map.toString());
		
		//���� (����)
		Set set = map.keySet(); //���� (Set �������̽��� �����ϰ� �ִ� ��ü�� �����ؼ� �װ��� �ּҸ� return)
		//����(X), �ߺ�(X)
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection clist = map.values(); //value�� �ߺ� �����Ͱ� �־ ������ �ִ� ������ �������� �����ȴ�. (�װ��� �θ� Ÿ��: Collection)
		System.out.println(clist.toString());

	}

}
