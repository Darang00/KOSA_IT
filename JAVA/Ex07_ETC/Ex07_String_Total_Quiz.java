//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 

//static 함수로 기능 만들기
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력
import java.util.Scanner;

 class test{
	static String idNum;
	private static int[] totalIDnum; 
	
	static boolean checkDigit(  ) {   // method of checking digits of the input
		return false; 
		
	} 
	
	static boolean allowValue(  ) {   // method of checking if the first value is allowed
		return false;
	} 
	
	static void print(String numArray) {
		
		totalIDnum = new int[13];
		for (int i=0; i < numArray.length(); i++ ) {
			totalIDnum[i] = Integer.parseInt(numArray.substring(i, i+1));
			System.out.println("i : "+ i  + "total : "+totalIDnum[i]);
		}
		
		if (totalIDnum[6] ==1 || totalIDnum[6] ==3) {
		System.out.println("남자"); }
		
		else if (totalIDnum[6] ==2 || totalIDnum[6] ==4) {
			System.out.println(totalIDnum[6]);
			System.out.println("여자");
			}
		} 

}

public class Ex07_String_Total_Quiz {
		
	
	
	
	
	public static void main(String[] args) {
		
		test test1 = new test();
		
		System.out.println("Enter your ID code");
		Scanner sc = new Scanner(System.in);

		test1.idNum = sc.nextLine(); // Input is String type
		//System.out.println(idNum); //checking if the input is String or Int
		
		String numArray = test1.idNum.replace("-", "") ; 
		
		test1.print(numArray);
		
		 
		

		
		
		
		
		
	
		// System.out.println(numArray);
		
		
		
		

	}

}
