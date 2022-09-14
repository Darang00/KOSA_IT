class Human{
	String name;
}

class OverTest{
	int add(int i, int j) {
		return i+j;
	}
	void add (Human human) { //Human 객체의 주소값...
		System.out.println(human.name);
	}
	//1. add(new Human());
	//2. Human h = new Human(); add(h);
	
	//Today point(배열도 타입이다 == 배열은 객체다)
	int add (int param) {
		return param +100;
	}
	int[] add(int[] params) {// point: params는 int[] 배열의 *주소값*을 받는다
		// return null; // int[] 배열의 주소값 return
		int[] target = new int[params.length];
		for(int i = 0; i< target.length; i++) {
			target[i] = params[i] +1; // target 배열의 방에 있는 값은 params 배열의 각 방에 들어있는 값 보다 1씩 크다
			
		}
		return target; // target 배열의 주소값을 return 하겠다
	}
	int[] add(int[]so, int[] so2) {
		// 놀다가 ...
		return null;
	}
}
public class Ex07_Array_method_param {

	public static void main(String[] args) {
		OverTest overtest = new OverTest();
		
		int[] source = {10, 20, 30, 40, 50};
		
		int[] ta = overtest.add(source); // int[] add(int[] params)에서 return한 target값 == overtest.add(source);
		//int[] param = source;
		for(int value: ta) { //ta 배열 안에 있는 값을 순서대로 출력
			System.out.println(value);
		}
		// **return 쓰면 반환되는 값을 받을 변수를 새로 만들어야 한다**

	}

}
