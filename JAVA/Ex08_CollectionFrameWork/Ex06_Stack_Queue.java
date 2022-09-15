import java.util.Stack;

public class Ex06_Stack_Queue {

	public static void main(String[] args) {
		//Java API 가 제공하는 클래스
		//Collection Java API 제공
		
		//Stack 자료구조 가지는 클래스 제공 받아요
		
		Stack stack = new Stack();
		stack.push("A"); // 값 넣는 함수: push();
		stack.push("B");
		stack.push("C");
		
		//stack.pup(); // 값 꺼내는 함수: pop(); 가장 나중에 넣은거 먼저 꺼냄
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop()); // 값 더이상 없는데 꺼집어 내니까 예외 터짐
		                                   // java.util.EmptyStackException : stack이 비었다
		
		// stack.empty(); // 비어있니?? true or false (boolean)
		System.out.println(stack.empty());
		
		
	}

}
