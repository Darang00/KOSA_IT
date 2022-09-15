package kr.or.kosa;

//Java API�� �����ϴ� stack�� ���� ������ ����
//Last In First Out ������ �ڵ�...

//1. stack�̶�� �ڷᱸ���� ��������� ������ �ִ� (Array Ȱ��), ������� Ÿ��(Object)
//2. ��ġ����: ����Ǵ� ���� �ִ� ��ġ (index) hint: ������ǰ ���� cart ����ؼ� ó��
//3. ���: push(), pop(), boolean empty(), boolean full()


public class MyStack {
	private Object[] stackarr; //�����
	private int maxsize; //�ִ�ũ��
	private int top; // �迭�� index��(��ġ ����)
	
	//Overrideing
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize]; //�迭�̴ϱ�
		top = -1; // �迭�� ���۰�: 0 (index)
	}
		
		//push(), pop(), boolean empty(), boolean full()
		//MyStack my = new MyStack(5);
		public boolean isEmpty() {
			return (top ==-1);//true
		}
		
		public boolean isFull() {
			return(top == maxsize -1); //5���� ���� ����� [0], [1], [2], [3], [4] > top: 4
		}
		
		public void push(Object i) {
			if(isFull()){
				System.out.println("stack is full");
			} else {
				//POINT
				stackarr[++top] = i; //ó�� top = -1 >> [0]���� �濡 ó�� push ��
			}
		}
		
		public Object pop() {
			Object value = null; //local variable: value
			if(isEmpty()) {
				System.out.println("stack is empty");
			} else {
				value = stackarr[top]; //������ ���� ��
				top--;
			}
			return value;
		}
	}


