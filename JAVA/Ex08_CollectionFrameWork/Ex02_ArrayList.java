import java.util.ArrayList; //ctrl+shift+O
import java.util.Collections;
import java.util.List;

// AllDay Point
public class Ex02_ArrayList {

	public static void main(String[] args) {
		//ArrayList: List  인터페이스 구현(순서보장, 중복 데이터 허락)
		
		ArrayList arraylist = new ArrayList();
		//Object 타입으로
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for (int i=0; i<arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		
		//add 함수는 순차적으로 데이터 넣기
		arraylist.add(0, 111); // ** 자리 이동 **
		System.out.println(arraylist.toString());
		arraylist.add(4,444);
		System.out.println(arraylist.toString());
		
		// ** 비순차적인 데이터의 추가, 삭제 >> ArrayList 적합하지 않아요 >> 순서가 있는 데이터 집합
		// ** 순차적인 데이터 추가, 삭제^^
		
		//arraylist.remove(111); //java.lang.IndexOutOfBoundsException index
		//System.out.println(arraylist.toString);
		
		//[11, 100, 200, 300, 444]
		//ArrayList 함수 공부(초급)
		System.out.println(arraylist.contains(200)); //true
		System.out.println(arraylist.contains(2000)); //false
		
		arraylist.clear(); //데이터 삭제(공간은 남아 있어요)
		System.out.println(arraylist.size()); // 0
		System.out.println(arraylist.isEmpty());// isEmpty() 너 비어있니?? //true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //false
		System.out.println(arraylist.size());
		Object value = arraylist.remove(0); //0번째 방 데이터 값(101) 삭제한 후 자리 바꿈 (그 뒤 값들 102, 103이 앞으로 이동)
		System.out.println(arraylist.toString());
		
		//POINT
		//인터페이스 부모 타입
		//개발자 습관적으로 ... 다형성(확장성, 유연성)
		List li = new ArrayList(); // List를 부모로 두는 자식 객체의 타입은 다 li 받을 수 있다. //습관적응로 부모타입 써서 다형성 이용
		//ArrayList li = new ArrayList(); // ArrayList타입의 값(주소)만 받을 수 있다.
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		List li2 = li.subList(0, 3); // *** subList  함수는 내부적으로 new ArrayList() 생성 ***
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
		
		Collections.sort(alist); //// 내부적으로 정렬 >> 초급개발자 프로젝트 시 쓰면 감점....
		System.out.println(alist.toString());
		//[1, 3, 7, 15, 40, 46, 50] sort() 함수가 크기순으로 정렬해준다 
		//높은값순으로 정렬
		//함수
		Collections.reverse(alist); // 역순
		System.out.println(alist.toString());

		
		
		
		
	}

}
