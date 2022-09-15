import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_Set_TreeSet {

	public static void main(String[] args) {
		//Set �̶�� �������̽��� �߱��ϴ� ��: ����(X), �ߺ�(X) , ���� ��� (X)
		
		//TreeSet
		//����(X), �ߺ�(X) + ���� ���(O)
		//[�˻�]�ϰų� [���� �ʿ�]�� �ϴ� �ڷ� ������ ����(������ ����)
		//�ζ�
		//�ߺ� ������... ��� ����(���� �� ����)
		
		//Ư¡
		//1. ���� Ʈ�� ���� (������ �̾Ƽ� �Ųٷ� ��� ������) : root > leaf
		//2. �����͸� ���� �� ���ı���� ����
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		
		System.out.println(hs.toString());
		//[P, A, B, D, F, G, K] ���� ����� �����
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0 ; lotto.size() < 6 ; i++) {
			int num = (int)(Math.random()*45 + 1);
			lotto.add(num);
			System.out.println("num : " + num);
		}
		
		System.out.println(lotto.toString());
		// [4, 8, 12, 18, 23, 29]
		
	}

}
