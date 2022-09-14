/*
 static member field : 객체간 공유자원 ...
 static method : why : 첫날 첫 시간 했던 코드....
 1. 객체 생성 없이....
 2. 많이 사용해요
 3. 설계도를 만들때 고려해야해요 (당신이 그 자원(기능)을 많이 사용한다면)
 4. 자원 많이 쓰네... 편하게 쓰게 해줄게.. new 객체 ... 불편하지.. >> static 설계
 
 */
class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//일반함수
		//new를 통해 heap이라는 메모리에 올라가야 > 사용
		//1. iv 제어 가능
		cv = 100;
		//why: 생성시즘 (static 자원은 객체 생성 이전에 memory 로드)
	}
	
	
	
	static void print() {
		//static 함수
		//1. cv를 갖고 놀 수 있다 (0) (제어가능)
		//2. static 함수는 일반변수iv를 제어 불가능 ... static 자원을 먼저 처리하기 때문에 메모리에 올라가있고 
		//그 뒤에 일반함수나 일반변수 처리되므로 일반함수는 먼저 메모리 위에 올라가있는 static 자원들을 사용 가능 
		//그러나 static 함수가 일반 함수나 변수 사용 불가능 
		//iv = 1000; 생성시점 (static 자원은 일반 자원보다 우선한다)
		
		//결과: static 자원만 가지고 놀아요
		cv = 200000;
		System.out.println(cv); 
	}
}





public class Ex10_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticClass.print();  // new 없이 함수 사용 ...
		
		System.out.println(StaticClass.cv);
		
		//일반자원 (객체 생성)
		StaticClass sc = new StaticClass();
		sc.print();
		
		

	}

}
