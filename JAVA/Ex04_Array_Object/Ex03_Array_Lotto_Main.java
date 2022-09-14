/*
 1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안된다 (중복값 검증)
 3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시켜라(정렬: 자리바꿈 : swap)
 4. 위 결과를 담고있는 배열을 출력하세요
 
 main 안에서 모두 작성하셔도 되고요
 
 static 함수를 만들어 기능 나누는 것은 가능
 
 (int)(Math.random()*(44)+1);
 
 별도의 Lotto.java 클래스는 생성하지 마세요...
 */

public class Ex03_Array_Lotto_Main {
	
	static int ran() { //난수 생성 메소드
		return (int)(Math.random()*(45)+1);	
	}
	
	static boolean verify(int[] copy, int num) { //중복값 검증 메소드
		for (int i = 0; i<copy.length; i++) { // (정수 i의 초기값은 0; 조건문 i가 copy라는 배열의 방의 개수보다 작을 떄 ; 증감 i를 1 증가시킨다)
			if(num == copy[i]) {
				//System.out.println("중복 발생");
				return false;
				}
			}
		return true;
		}
	
	////////////////////////////////////////////////////////////////////
		
	
	

	public static void main(String[] args) { // main() method 실행
		
		//int temp = 0;
		int num = 0; // 로컬변수(main() method 에 소속되어 있으므로 )
		
		int[] lotto = new int[6]; // 방이 6개인 배열 객체를 생성
		
		
		for (int i = 0; i<lotto.length ; i++) {
			while(true) {
				num = ran(); // static 으로 만들어놨던 ran() method에서 추출된 난수를 num 값에 할당
				
				//난수를 배열에 들어가있는 값과 같은지를 비교(중복된 값이 있으면 안되니까)
				//(parameter로 현재 index, 값)
				if (verify(lotto, num) ) { // if안의 (조건문)을 true나 false 자체로 쓸 수 있음. if의 (조건문) 이 true 면 {실행문} 안의 내용을 실행하고 아니면 그 실행문을 나온다.
					lotto[i] = num; // 없으면 배열에 넣음
					break; //return: 메모리 반환 후 프로그램 종료, break: 지금 실행중인 소스코드(반복문)를 종료
					}
				
				/*else {
					num = ran();
				} */ //if 의 조건문 verify 메소드가 false이면 한 번 더 random값 추출하는 걸 else에 넣어주는 것이 더 정확하긴 함
				
				}
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
			
			
			
		
		
		
		

	}

}

