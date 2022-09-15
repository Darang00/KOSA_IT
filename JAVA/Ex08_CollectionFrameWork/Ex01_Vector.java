import java.util.Vector;

/*
 Collection FrameWork
 [다수의 데이터]를 다루는 [*표준화된 인터페이스*]를 구현하고 있는 [클래스의 집합]
 
 Collection 인터페이스 -> 상속 List(구현: ArrayList), Set(구현: HashTable, HashSet..)
 
 >> ArrayList의 부모타입은 List이다(OK) >> 다형성
 >> Collection 인터페이스는 ArrayList의 부모타입이다 (OK) >> 다형성
 
 Map 인터페이스(key, value)라고 하는 쌍의 배열 -> (구현: HashMap)
 
1. List (줄을 서시오)  약속...
 	순서(번호표)가 있으므로 중복 허용 > 내부적으로 데이터(자료)를 배열(Array)로 관리한다. > [홍길동] [홍길동] [홍길동]
 	                                                                            [0]    [1]     [2]
1.1 Vector (구버전) -> 동기화 보장(멀티 스레드) > Lock(장치) 보호 > 성능은 조금 약해진다> 한강 화장실
1.2 ArrayLIst (신버전) -> 동기화 보장하지 않음 > Lock 옵션 (기본 Lock(x) ) -> 성능 우선 > 한간 비빔밥 축제

기존 다수의 데이터를 다루는 방법: Array (정적, 고정)
***** 방의 개수가 한 번 정해지면 (방의 크기는 변경 불가) *****
int[] arr = new int[5];
arr[0] = 100;
int[0] arr2 = {10, 20, 30}
데이터가 많아지면 
새로운 크기의 배열을 다시 만들고 데이터를 이동시킨다. (코드로 직접 구현) ***
Array
1. 배열의 크기가 고정 : Car[] cars = {new Car(), cew Car()}; 방 2개
2. 접근 방법: (index) 방 번호로 접근: cars[0], .. cars[length-1] 

List 인터페이스를 구현하고 있는 (Vector, ArrayList)의 특징
1. 배열의 크기를 동적으로 확장 or 축소가 가능하다 >> * 진실은 컴파일러가 새로운 배열을 만들고 데이터를 이동시켜줌 *
2. 순서를 유지 (내부적으로 Array 사용; 순서를 고려), 중복값 사용 가능
3.데이터의 저장 공간은 Array 사용

 
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("초기 default 용량: " + v.capacity()); //초기 default 용량: 10
		System.out.println("size : " + v.size()); //size : 0 // 실 데이터의 크기
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(10);
		
		System.out.println("size : " + v.size());
		System.out.println(v.toString()); //[AA, AA, AA, 10] // for문 돌면서 재정의 데이터 출력
		// Array >> length >> 편법적으로 index 개념을 만들어서 마치 사이즈(size)처럼
		// Collection >> size
		for (int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i)); //collection에서 값을 가져오는 함수: get(index) 값을 return // 정적 array[index]
		}
		// 개선된 for문 출력
		for(Object obj : v) {
			System.out.println(obj);
		}
		// 단점: 작은 데이터(같은 타입의 데이터) ... 가장 큰 타입을 사용하는 것 불합리
		// 제너릭 >> 타입을 강제 >> 추후 별도로 학습(POINT)
		Vector<String> v2 = new Vector<String>();
		v2.add("baby");
		v2.add("You should put only String");
		v2.add("whatever");
		
		for(String str: v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); // 방 10개
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
		v3.add("12"); // 11번째 방

		System.out.println(v3.toString());
		System.out.println(v3.capacity());
		
		//증명: 그냥 쓰시면 돼요(지가 알아서 늘리고 하니...)
		
		
		
		

	}

}
