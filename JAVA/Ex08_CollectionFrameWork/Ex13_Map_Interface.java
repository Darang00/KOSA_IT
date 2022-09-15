import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map 인터페이스
 (key, value) 쌍의 구조를 갖는 배열
 ex) 지역번호 (02, 서울), (031, 경기)
 조건) 
 key 중복(X)    >> Set
 value 중복(O)  >> List
 
 Generic  지원 한다.
 
 Map 인터페이스 구현하는 클래스
 구버전 : HashTable (동기화 보장) : 한강 화장실처럼 lock 기능 > 자원 보호.. 성능은 떨어짐
 신버전 : HashMap   (동기화 강제하지 않아요) 성능 고려(Tread 학습 ....)  *****중요***** 
 */


public class Ex13_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//(ID, PW) ; Id 중복 안되지만 PW는 중복 가능
		map.put("Tiger", "1004");
		map.put("Scott", "1004");
		map.put("Superman", "1007");
		
		System.out.println(map.containsKey("tiger")); //대소문자 구별(false) tiger key 있니?
		System.out.println(map.containsKey("Scott")); //대소문자 구별(true) Scott key있니?
		System.out.println(map.containsValue("1004")); //1004 value 있니?
		
		System.out.println(map.get("Tiger")); //1004 //key값을 제시하면 value값을 return
		//key 제공하면 > value 값을 알 수 있다 << map.get(key)
		System.out.println(map.get("hong"));//없는 key return 하면: null 
		
		map.put("Tiger", "1008"); //value replace(똑같은 key 값 있으면 value를 oveeride 해버린다)
		System.out.println(map.get("Tiger")); //1008
		System.out.println(map.size()); //3
		
		System.out.println(map.toString()); // 재정의 key, value 확인 가능
		//{Superman=1007, Tiger=1008, Scott=1004}
		
		Object value = map.remove("Superman");
		System.out.println("삭제된 value: " + value);
		System.out.println(map.toString());
		
		//응용 (이해)
		Set set = map.keySet(); //이해 (Set 인터페이스를 구현하고 있는 객체를 생성해서 그것의 주소를 return)
		//순서(X), 중복(X)
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection clist = map.values(); //value는 중복 데이터가 있어서 순서가 있는 데이터 집합으로 관리된다. (그것의 부모 타입: Collection)
		System.out.println(clist.toString());

	}

}
