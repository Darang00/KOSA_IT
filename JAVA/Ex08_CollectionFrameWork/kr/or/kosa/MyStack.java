package kr.or.kosa;

//Java API가 제공하는 stack를 직접 구현해 보기
//Last In First Out 구조를 코드...

//1. stack이라는 자료구조는 저장공간을 가지고 있다 (Array 활용), 저장공간 타입(Object)
//2. 위치정보: 저장되는 값이 있는 위치 (index) hint: 전자제품 매장 cart 사용해서 처리
//3. 기능: push(), pop(), boolean empty(), boolean full()


public class MyStack {
	private Object[] stackarr; //저장소
	private int maxsize; //최대크기
	private int top; // 배열의 index값(위치 정보)
	
	//Overrideing
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize]; //배열이니까
		top = -1; // 배열의 시작값: 0 (index)
	}
		
		//push(), pop(), boolean empty(), boolean full()
		//MyStack my = new MyStack(5);
		public boolean isEmpty() {
			return (top ==-1);//true
		}
		
		public boolean isFull() {
			return(top == maxsize -1); //5개의 방을 만들면 [0], [1], [2], [3], [4] > top: 4
		}
		
		public void push(Object i) {
			if(isFull()){
				System.out.println("stack is full");
			} else {
				//POINT
				stackarr[++top] = i; //처음 top = -1 >> [0]번쨰 방에 처음 push 됨
			}
		}
		
		public Object pop() {
			Object value = null; //local variable: value
			if(isEmpty()) {
				System.out.println("stack is empty");
			} else {
				value = stackarr[top]; //마지막 방의 값
				top--;
			}
			return value;
		}
	}


