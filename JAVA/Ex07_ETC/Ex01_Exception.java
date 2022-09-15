/*
 오류
 1. 에러(error)  : 네트워크 장애, 메모리 full, 하드웨어 >> 개발자가 코드적으로 해결 불가
 2. 예외(exception): 개발자가 코드의 실수에 의해서 발생되는 것 >> 문제 코드를 찾아서 >> 코드를 수정 >> 배포
                  >> 프로그램 컴파일시가 아니라... 실행시... 알 수 없다 (테스트....)
                  >> 문제가 발생하면 (exception) 프로그램 강제 종료 (웹이라면 500번)
 3. 예외처리 >> 예외발생에 대한 코드를 수정하는 것이 아니고 >> 일단 임시방편으로 >> 문제가 생기더라도
    >> 프로그램이 안정적으로 종료 ... 처리  >> 결국 예외처리를 통해서 문제가 생긴 부분을 찾고
    >> 다시 코드 수정 >> 배포
    
    try{
    	>> 문제가 의심되는 코드 실행
    	>> 문제가 발생(exception)
    } catch(Exception e){
    	>> 문제가 발생한 예외 부분을 파악....
    	>> 처리 (코드를 수정하는 것이 아니고 보고하는 것)
    	>> 1. 관리자 email
    	>> 2. 로그파일에 기록 (장애 발생 기록)
    	>> 3. 일단 강제로 프로그램이 종료되는 것은 막는다
    	>> 결국 개발자가 연락을 받고 수정하는 것이 답..
    } 
    finally{
    	>> 문제가 발생하던, 발생하지 않던 강제적으로 실행해야 될 코드
    	>> DB 작업 문제 (특정 자원에 대한 종료) 강제
    }
 
 
 
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/* System.out.println("main start");
		
		System.out.println(0/0); // java.lang.ArithmeticException: / by zero
		
		System.out.println("main end");
		*/
		System.out.println("main start");
		try {
			System.out.println(0/0);
			//연산 예외가 발생 ... try{}catch() 처리 프로그램이 강제 종료되진 않아요
			
		
			//Exception 클래스 사용 (예외 클래스의 최상위 부모
			
			//e 라는 변수는 무엇을 받는 것일까요
			//Exception: 클래스 >> e: 주소값을 받는 변수

			// ArithmeticException 문제가 발생
			// 컴파일러에 의해서 ArithmeticException 객체가 생성되고
			// 그 객체에게 문제가 되는 메시지, 코드 전달하면...
		}catch(Exception e) { // 부모타입의 변수는 자식타입의 주소값을 받을 수 있다(다형성) 
			 //어떤 문제인지를 파악하고 그 정보를 전달
			 //관리자, email, log write
			 System.out.println(e.getMessage());
		 }
		
		System.out.println("main end");
		
		
		

	}

}

