//import kr.or.kosa.common.Air_Main; // 다른 패키지(default) 에 있어서 접근 불가(쓰러면 Air_Main 폴더에 클래스 명 앞에 public 붙엇어야 함)
import kr.or.kosa.common.Car;
import kr.or.kosa.common.*;// 왠만하면 쓰지 않는게 좋음. 다른 폴더 다 접근 가능하다는 뜻.
/*
 클래스 == 설계도 == 데어터의 타입
 
  클래스 구성 요소 (설계도라고 판단할려면 최소한 무엇을 가지고 있어야 한다)
  [필드 + 함수] + 생성자 함수
  
  필드 (member field) >> 데이터, 정보 담아야 한다 >> 고유 정보, 상태 정보, 부품 정보 >> field >> variable
  함수(method) >> 기능 (행위) >> 자동차 >> 달린다, 멈춘다, 소리가 난다
  + 추가적으로 생성자(constructor): 특수한 목적의 함수 >> 객체 생성 시 member field 초기화 하기 위한 목적..
  
  클래스, 필ㄷ, 생성자, 함수 : 영역(범위) >> 접근자, 한정자, 수정자(modifier)
  >> public, private, default, protected
  
  >> kr.or.kosa.comon 안에 Car 클래스 생성  >> public class Car {} >> 나 다 오픈할꺼야
  
  >> kr.or.kosa.common 안에 AirPlane  >> class airPlane { >> default class AIrPlane}
  >> default 같은 폴더에서는 공유하겠다 : [같은 package 안에서는 오픈] [다른 package 에서는 접근 불가 ]
  >>default 접근자는 : 같은 폴더 (package) 내에서 만들어서 연습용 ...
  
  하나의 물리적인 java 파일은 여러개의 클래스를 가질 수 있다.
  >> Ex01_Main.java 파일은 그안에 EX01_Main 클래스를 하나 가지고 있다.
  >> 일반적으로 필요한 클래스를 별도의 파일로 생성해서 사용 ..... Apt.java
  >> 그냥 연습 ... 해볼 굳이 물리적으로 파일 만들필요 있을까
  >> 하나의 물리적 파일은 여러개의 클래스는 가질 수 있지만 public은 하나의 클래스만 가질 수 있다. 

 */

class Emp { //공부하거나 실습할 때 바로 확인 ...
	
}

class Test{ // 컴파일러가 default class Test 라고 해석
	int data; // instance variable // 컴파일러가 default int data 라고 해석
	public int p_data; // 에러는 아니지만 다른 폴더에서 사용 불가... 맨앞에 public은 의미가 없다
	private int pri_data; //private 감추다, 숨기다, 캡슐레이션, 캡슐화, 은닉화
	
}


public class Ex01_Main {

	public static void main(String[] args) {
		// 
		Car car = new Car ();
		 // ctrl + shift + o (다른 사람의 소스를 받았어요 .. import  가 없는 
		// AirPlane air = new AirPlane(); 이런 클래스 없는데 해석 ... 보이지 않아요
		Apt apt = new Apt ();
		Emp e = new Emp();
		
		Test t = new Test();
		//t.pri_data 사용할 수 없다. 위에서 private으로 묶여있어서
		

	}

}
