import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_Set_TreeSet {

	public static void main(String[] args) {
		//Set 이라는 인터페이스가 추구하는 것: 순서(X), 중복(X) , 정렬 기능 (X)
		
		//TreeSet
		//순서(X), 중복(X) + 정렬 기능(O)
		//[검색]하거나 [정렬 필요]로 하는 자료 구조에 사용됨(데이터 집합)
		//로또
		//중복 데이터... 출력 정렬(낮은 값 부터)
		
		//특징
		//1. 이진 트리 구조 (나무를 뽑아서 거꾸로 들고 보세요) : root > leaf
		//2. 데이터를 저장 시 정렬기능이 제공
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		
		System.out.println(hs.toString());
		//[P, A, B, D, F, G, K] 정렬 기능은 없어요
		
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
