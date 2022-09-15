import kr.or.kosa.MyStack;

public class Ex07_MyStack_Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		stack.push(10); //i=10
		stack.push(20); //i=20
		stack.push(30); //i=30
		stack.push(40); //i=40
		stack.push(50); //i=50
		stack.push(60); //i=60
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		

	}

}
