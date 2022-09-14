import java.util.Arrays;

/*
 배열은 객체다 (Array)
1. new를 통해서 생성
2. heap 메모리에 생성된다. > 관리되는 자원이다(garbage collector가 정리하므로 인위적으로 정리할 필요 없다)
3. *** 고정배열(정적배열): 배열을 한 번 선언하면 (크기가 정해지면) 변경 불가 *** <=> collection(동적배열): 동적이다
4. *** 자료구조(알고리즘) 기초적인 학습 ***

 
 
 */
public class Ex01_Array_Basic {
	

	public static void main(String[] args) {
		// 같은 타입의 변수 여러개를 선언해서 데이터를 처리하세요
		int s;
		int s1;
		int s2;
		int s3; // 비효율적
		
		int a, a1, a2, a3; //비효율적
		
		//배열
		int[] score = new int[4]; //문법: 타입[] = new 타입[방크기];
		//score(101동) >101호, 102호...
		//int 타입의 방 4개 생성... heap 연속된 공간에 >> 방이름(index(첨자) : [0], [1], [2], [3])
		System.out.println(score[0]); // score배열의 0번째 방 값 출력해라
		score[0] = 101;
		score[1] = 20;
		score[2] = 300;
		score[3] = 500;
		//score[4] = 111; 
		//Error: 없는 방의 번호를 썼다. java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//방의 개수는 항상 index 값보다 1이 크다 (n-1 한 것이 마지막 index)
		System.out.println(score[3]);
		
		//Array 배열 궁합 제어문: for
		for(int i = 0; i<4 ; i++)
		{
			System.out.printf("[%d] = %d\t", i, score[i]);
		}
		
		System.out.println(); 
		
		for(int i = 0; i<score.length ; i++) { // score.length: 배열의 개수
			System.out.printf("[%d] = %d\t", i, score[i]);
		}
		
		System.out.println();
		//Tip: Arrays.toString(score) 쓰지 마세요 (실력이 감소): ...
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray); // [101, 20, 300, 500]
		
		//Tip: sort 당분간 쓰지 마세요. sort 는 크기를 작은거부터 큰 거로 정렬하는 메소드
		Arrays.sort(score);
		resultArray = Arrays.toString(score);
		System.out.println(resultArray); // [20, 101, 300, 500]
		
		//정렬 알고리즘 (최소 버블정렬)
		
		//Today point
		//배열 생성 3가지 방법(*암기*)
		int[] arr = new int[5]; // 기본
		int[] arr2 = new int[] {100, 150, 200}; // 초기값을 통해서 배열의 개수를 정의하고 값을 할당
		int[] arr3 = {11, 22, 33};//컴파일러에게 자동으로 new라는 부분을 부탁하는 것 *** 가장 편함
		//Tip) javascript) let cararr = [1, 2, 3, 4, 5];
		
		for (int i = 0; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		// 배열을 객체다(new를 통해서 만들고 heap메모리에 로드 된다)
		int [] arr4;
		arr4 = new int[] {21, 22, 23, 24, 25};
		System.out.println(arr4); // 주소값: I@7e0e6aa2
		
		int[] arr5 = arr4;
		System.out.println(arr4 == arr5);
		
		// 배열의 타입 : 8가지 기본 + String + 클래스 (타입)
		String[] strarr = new String[] {"가", "나", "다라마"};
		for (int i = 0;i< strarr.length ; i++) {
			System.out.println(strarr[i]);
		}
		
		char[] carr = new char[5];
		float[] farr = new float[4];
		
		/*
		 class Car {}
		 */
		
		//Car[] carrarr = new Car[5];
		
		
		
		
		
	
		
	}

}
