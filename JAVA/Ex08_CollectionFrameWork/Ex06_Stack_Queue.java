import java.util.Stack;

public class Ex06_Stack_Queue {

	public static void main(String[] args) {
		//Java API �� �����ϴ� Ŭ����
		//Collection Java API ����
		
		//Stack �ڷᱸ�� ������ Ŭ���� ���� �޾ƿ�
		
		Stack stack = new Stack();
		stack.push("A"); // �� �ִ� �Լ�: push();
		stack.push("B");
		stack.push("C");
		
		//stack.pup(); // �� ������ �Լ�: pop(); ���� ���߿� ������ ���� ����
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop()); // �� ���̻� ���µ� ������ ���ϱ� ���� ����
		                                   // java.util.EmptyStackException : stack�� �����
		
		// stack.empty(); // ����ִ�?? true or false (boolean)
		System.out.println(stack.empty());
		
		
	}

}
