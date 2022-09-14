
public class Ex07_Operation {
public static void main(String[] args) {
		// eodlqdustkswk
		// += , -= , *= , /=
	
		int sum=0;
		sum+=1;//sum = sum +1;
		sum-=1;
		System.out.println("sum : " + sum);
		
		//간단한 학점 계산기
		//학점: A+, A-, B+, B-, ...F
		//점수 : 94점
		
		//판단기준 90점이 이상인지 >> A 부여
		//판단 95점 이상 >> A+
		//아니라면 A-
		
		//84 가 들어오면, 일단 80점 이상이니까 > B
		//판단 85 이상 > B+
		//아니라면 > B-
		
		//if문을 사용해서 학점 계산을 하세요
		
		int score=88;
		String grade="";//A+ , A- 를 담는 변수
		System.out.println("당신의 점수는 : " + score);
		
		//if문 동작
		if(score >= 90) {
			grade="A";
		
			grade = (score>=95) ? (grade+="+") :(grade+="-");
			/*삼항 연산자 사용
			 <삼항 연산자란>
			 (조건식) ? '값 또는 연산식(1)' : '값 또는 연산식(2)' 
			 일 때, 조건식이 "참" 이면 왼 쪽 처리 후 출력, 조건식이 "거짓'이면 오른쪽 (2) 처리 후 출력 */
		}else if (score >= 80){
			grade="B";
			if(score >= 85) {
				grade+="+";
			}else {
				grade+="-";
			}
		}else if (score >= 70) {
			grade="C";
			if(score >= 75) {
				grade+="+";
			}else {
				grade+="-";
			}
		}else {
			grade="F";
		}
		
		//
		System.out.println("당신의 학점은 : " + grade);
}
}
		

	


