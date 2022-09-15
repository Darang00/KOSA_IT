import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set �������̽� (�� �ȿ� ������(���������� �迭�� ������� �ʴ´�)): ��������(X), �ߺ��� ������� ���� 
������ ���� �ߺ��� ������� �ʴ� ������ ����
�����ϴ� Ŭ����:
HashSet, TreeSet(�ڷᱸ��) 
 
 */

public class Ex10_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//������ ���� [�ߺ����� ����] ������ ����
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("����: " + bo);
		
		bo = hs.add(1);
		System.out.println("���: " + bo); //�̹� �� �ȿ��� 1�̶�� �����Ͱ� ���� (���� �ߺ��� ������ ������� ����)
										  //��: �ζ�, ������ȣ
		System.out.println(hs.toString());//toString �����Ǵ� �Ǿ��ִ� [1, 100, 55]
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("Z");
		hs2.add("A");
		hs2.add("H");
		hs2.add("b");
		hs2.add("b");
		System.out.println(hs2.toString()); //[A, b, c, F, H, Z] > ��� ���� ���X, �ߺ� ������ X
		
		String[] strobj = {"A", "B", "C", "D", "B", "A"}; //1000�� (1�Ǿ� �ߺ�)
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0; i<strobj.length; i++) {
			hs3.add(strobj[i]); //�ߺ� �����ʹ� add ���� �ʴ´�.
		}
		
		System.out.println(hs3.toString());
		
		/*
		int[] lotto = new int[6];
	    
		for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			 for(int j = 0 ; j < i ; j++) { //j < i (ä���� ���� ��ŭ ��)
				 if(lotto[i] == lotto[j]) {
					 i--; //point ���� ���� ���� �ٲپ �Ѵ�
					 break;
				 }
			 }
		}  		 
		 */
		
		//Quiz
		//HashSet 1~45������ ���� 6���� ��������
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45 +1);
			lotto.add(num);
			System.out.println("i: " + i + " num : " + num);
		}
		System.out.println(lotto.toString());
		
		//HashSet ������ >> �θ� >> Set
		
		Set set2 = new HashSet(); //Set�� �θ�, HashSet�� �ڽ�. ������
		int index = 0;
		while(set2.size()<6) {
			int num = (int)(Math.random()*45 +1);
			set2.add(num); //add �߻��Լ��� HashSet Ŭ������ ������ �ϰ� �ִ�.
		}
		System.out.println(set2.toString());
		
		//HashSet<String> set3 = new HashSet<String>(); //Generic
		Set<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
				
		System.out.println(set3.toString());
				
		Iterator<String> st = set3.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
	}
}
