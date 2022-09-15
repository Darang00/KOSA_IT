import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set 인터페이스 (원 안에 들어가세요(내부적으로 배열을 사용하지 않는다)): 순서보장(X), 중복을 허락하지 않음 
순서가 없고 중복을 허락하지 않는 데이터 집합
구현하는 클래스:
HashSet, TreeSet(자료구조) 
 
 */

public class Ex10_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//순서가 없는 [중복되지 않은] 데이터 집합
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("정상: " + bo);
		
		bo = hs.add(1);
		System.out.println("결과: " + bo); //이미 원 안에는 1이라는 데이터가 존재 (절대 중복된 데이터 허락하지 않음)
										  //예: 로또, 차량번호
		System.out.println(hs.toString());//toString 재정의는 되어있다 [1, 100, 55]
		
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
		System.out.println(hs2.toString()); //[A, b, c, F, H, Z] > 출력 순서 고려X, 중복 데이터 X
		
		String[] strobj = {"A", "B", "C", "D", "B", "A"}; //1000건 (1건씩 중복)
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0; i<strobj.length; i++) {
			hs3.add(strobj[i]); //중복 데이터는 add 하지 않는다.
		}
		
		System.out.println(hs3.toString());
		
		/*
		int[] lotto = new int[6];
	    
		for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			 for(int j = 0 ; j < i ; j++) { //j < i (채워진 개수 만큼 비교)
				 if(lotto[i] == lotto[j]) {
					 i--; //point 같은 방의 값을 바꾸어여 한다
					 break;
				 }
			 }
		}  		 
		 */
		
		//Quiz
		//HashSet 1~45까지의 난수 6개를 넣으세요
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45 +1);
			lotto.add(num);
			System.out.println("i: " + i + " num : " + num);
		}
		System.out.println(lotto.toString());
		
		//HashSet 다형성 >> 부모 >> Set
		
		Set set2 = new HashSet(); //Set이 부모, HashSet이 자식. 다형성
		int index = 0;
		while(set2.size()<6) {
			int num = (int)(Math.random()*45 +1);
			set2.add(num); //add 추상함수를 HashSet 클래스가 재정의 하고 있다.
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
