
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// 국문과 학생들의 기말고사 시험점수 입니다
		int [] score = new int[] {79, 88, 97, 54, 56, 95};
		int max = score[0];//max 변수에는 0번째 방의 값인 정수 79가 들어가 있다
		int min = score[0];//min 변수에는 0번째 방의 값인 정수 79가 들어가 있다
		
		
		
		/*
		 제어문을 통해서 max 라는 변수에 시험점수 중 최대값을 담고
		 min 변수에 시험점수 중 최소값을 담으세요
		 출력결과: max == 97, min == 54
		 단) for문을 한 번만 사용
		 */
		//방법 1:if문 사용
		for (int i = 0; i<score.length ; i++) { // int i = 0 아니고 1도 된다
			// System.out.println(score[i]);
			if(score[i] > max) {max = score[i];	}
			if(score[i] < min) {min = score[i]; }
		}
		System.out.println("Using if method, the max is: "+ max);
		System.out.println("Using if method, the min is: "+min);
		
		//방법 2: 3항 연산자
		for (int i = 0; i<score.length ; i++) {
			// System.out.println(score[i]);
			max = (score[i]>max) ? score[i] : max;
			min = (score[i]<min) ? score[i] : min;
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		//////////////////////////////////////////////////////////
		
		/*
		 문제: 
		 int[] number = new int[10];
		 일 때 10개의 방의 값을 1~10까지로 초기화 해라
		 for문을 통해서... [0] = 1, [9] = 10
		 */
		int[] numbers = new int[10];
		for (int i = 0; i<numbers.length ; i++) {
			numbers[i] = i+1;
			// 0 == 1
			// 1 == 2	
		}
		for (int i = 0; i<numbers.length ; i++) {
			System.out.println(numbers[i]); }
			
		////////////////////////////////////////////////
		/*
		 문제: 어느 학생의 기말고사 점수(5과목)
		 int[] jumsu = {100, 55, 90, 60, 78};
		 int sum = 0;
		 float avg = 0f;
		 
		 1. 총 과목의 수
		 2. 과목의 합
		 3. 과목의 평균
		 단, 2, 3문제는 하나의 for문으로 해결
		 */
		int[] jumsu = {100, 55, 90, 60, 78};
		 int sum = 0;
		 float avg = 0f;
		 
		 //1.
		 System.out.println(jumsu.length);
		 
		 //2, 3.
		 
		 for (int i = 0; i<jumsu.length ; i++ ) {
			 sum +=jumsu[i];
			 if(i == (jumsu.length -1)) { // 마지막 방이라면
				 avg = sum/(float)jumsu.length;				 
			 }
			 
		 }
		 System.out.printf("total modules: [%d], total score: [%d], mean: [%f]", jumsu.length, sum, avg);
		 
		
		

	}

}
