package kr.or.kosa;

/*
 기능 (행위) 만드는 방법
 함수 (mathod)를 만들거다.
 
 method:  행위 또는 기능의 최소 단위로 구현: 하나의 함수는 하나의 기능만을 구현한다.
 ex)먹는다, 잔다, 걷는다 ...
 
 클래스 : field + method
 
 ex) 롯데월드: 게임방: 농구, 동전, 동전 뽑기 ...
 
 method라는 놈은 혼자서 동작하지는 않음
** method(함수)는 호출에 의해서만 동작 된다
누군가 이름을 부르지 않으면 동작하지 않는다...

 
 
 JAVA)
 1. void, parameter(0): void print(String str){실행코드}
 2. void , parameter(X): void print() {실행코드} >> 공짜
 3. return type, parameter(0): int print(int data) {return 100;}
 4. return type, parameter(X): int print(){return 100;}
 
 *** void > 돌려주는 것이 없어요 > return type 없어요
 return type >> 기본 8가지 + String + Array, class, collection, interface
 이 중에서 기본 8가지 + String + class 인정 .... 
 
 boolean print(return true)
 Car print() { Car c = new Car(); return c; } // 나는 당신에게 Car 객체의 주소를 return 하겠다 c
 String print() { return "A"; }
 
 parameter type >> void print(String 파라메터)
 >> 기본 8가지 타입 + String + Array, class, collection, interface
  이 중에서 기본 8가지 + String + class 인정 .... 
  void print(int i){}
  void print(String str){}
  void print(Car car){} //print 함수는 parameter로 Car타입의 주소값을 받는다.
  
  
  
  ex) 
  Car c = new Car();
  
  void print(Car car) {}
  
  print(c); // print 함수 호출시 c 라는 변수값 (주소값)
  
  어려워요 ... 동전 구멍이 여러개일때는 어떡해요
  void print (int a, int b, int c, int d) {}
  
  print(10, 20) > 실행 안됨
  print(100, 100, 100) >실행 안됨
  print(100, 100, 100, 200) > 실행 됨
  
  void print(Car c, String str, int i){}
  
  관용적인 표현
  코드 규칙 : 관용적 표현
  class 이름의 첫 글자는 대문자 : class Car, class Person
  method의 이름은 단어의 첫글자는 소문자 그리고 이어지는 단어의 첫글자는 대문자 : getNumber()
  
  Q. 사원번호를 가지고 사원의 모든 정보를 가지고 와라 (함수 생성)
  getEmpListByEmpno()  >> 함수의 이름으로 대략적인 내용 파악 가능 .....
  
 
 */

public class Fclass {
	public int data; 
	
	
	//void m() >> 컴파일러가 >> default void m() >> 같은 폴더 내에서만 사용..
	//함수 70% public
	//함수 30% private : hint) public, private 클래스 내부 동등 ...
	//클래스 내부에서만 사용해라 >> 이런함수를 "공통함수" 라고 부른다. >> 따라서 private의 목적: 다른 함수를 도와주는 목적
	
	public void m() {//void, parameter(x)
		//기능 구형
		//main 함수에서 사용했던 코드 그대로 구현 ...
		System.out.println("일반함수 : void, parameter(X)" );
	
	}
	
	//void m2(int)
	public void m2(int i) {
		System.out.println("일반함수 : void, parameter(0)");
		System.out.println("parameter 값은 활용 i변수의 함수 내부에서만 유효함 {중괄호 안에서만} " + i);
		}
	
	//return type m3(x)
	public int m3() {
		//void가 아닐 때는 무조건, 강제로... return 써야함
		return 1000; //return type이 존재하면 반드시 return 키워드를 명시 해야한다 (필수)
		
	}
	
	public int m4(int data) {
		return 100 + data;
	}
	
	//요기까지는 기본 4가지
	
	//확장...
	//return type(0), parameter(0) 단지 개수가 늘어났을 뿐...
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	//함수의 접근자
	//default int subSum() {} 같은 폴더는 그래도 사용 가능
	//private int subSum() {} 같은 폴더도 안돼요
	//클래스 내부에서 다른 함수를 도와주는 공통함수 .....
	//private 함수 만들어서 사용...
	
	private int subSum(int i) { //다른 함수가 호출해서 사용...
		return i + 100;         //로직이 모든 함수가 가지고 있다면.. 변경.. 유지보수..
		
	}
	
	public void callSubSum() {
		//함수는 다른 함수를 호출할 수 있다
		int result = subSum(data);  //이 때 앞의 int result는 local valuable
		System.out.println("call result : " + result);
	}
		private int operationMethod(int data) {
			return data * 200;
			
		}
		public int opSum(int data) {
			int result = operationMethod(data);
			//제어문
			if(result >0) {
				return 1;
			} else {
				return -1;
			}
		}
		
		/*
		 Quiz
		 a와 b 둘 중에 큰 값을 return하는 함수를 만드세요
		 ex) 함수 호출시 max(10, 5) return 값은 10이 나오면 돼요
		 */
		//30점 구현에는 문제 없지만 함수 구현시 유지보수 측면에서 return을 최소화하는게 좋음
		/*public int max(int a, int b) {
			if (a>b) {
				return a;
			} else {
				return b;
			}
			
			
		} */
		
		//60점
		/*
		public int max(int a, int b) {
			if result = 0;
				if (a>b) {
					result = a;}
				else {
					result = b;
				}
				return result; //return 1개 ...
			
		}*/
		
		
		//90점
		/* public int max (int a, int b) {
			int max = (a>b) ? a : b ;
			return max;
		}*/
		
		
		//100점
		public int max (int a, int b) {
			return (a>b) ? a:b ;
		}
		
	}


