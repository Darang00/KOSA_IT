//Ex17_do_while_Menu 처리한 함수를 모두 static으로 바꾸어서 코드를 변경하세요
import java.util.Scanner;

public class Ex18_do_while_Menu_Static {
	static Scanner sc = new Scanner(System.in);
	
	static void inputRecord() {
		System.out.println("성적 데이터 입력");
	}
	
	static void deleteRecord() {
		System.out.println("성적 데이터 삭제");
	}
	
	static void sortRecord() {
		System.out.println("성적 데이터 정렬");
	}
	
	static int displayMenu() {
		System.out.println("**************");
		System.out.println("***성적관리***");
		System.out.println("1. 학생성적 입력");
		System.out.println();
		System.out.println("2. 학생성적 삭제 ");
		System.out.println();
		System.out.println("3. 학생성적 이름순 정렬");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println(); 
		
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine()); // 1 or 2 입력
				if (menu >= 1 && menu <= 4) {
					break; //do~while 탈출
				} else {
					// 1보다 작고 4보다 큰 값
					// 나는 실제 오류가 아니지만 (예외가 아니지만)
					//이런 상황을 예외로 만들 수 있어요
					throw new Exception("메뉴 선택 번호가 잘못되었습니다"); //사용자 정의 예외
				}
			} catch (Exception e) {
				System.out.println("원인파일 : " + e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println ("1~4까지 번호만 입력해");
			}
		}while (true);
		
		return menu;
	}
	
	static int menu = 0;
	
	

	public static void main(String[] args) {
		// Ex18_do_while_Menu_Static ex18 = new Ex18_do_while_Menu_Static(); 위에서 자원들을 static 처리를 해놔서
		// class area 안에 Ex18_do_while_Menu_Static 객체가 생성돼있어서
		// heap 메모리에는 생성되는 것 없고
		// new 로 클래스 객체 만들지 않아도 된다
		while(true) {
			switch (displayMenu()) {
			case 1: inputRecord();
				break;
			case 2: deleteRecord();
				break;
			case 3: sortRecord();	
			    break;
			case 4: System.out.println("프로그램 종료");
			    //return;  >> main 함수 종료
			    System.exit(0); //프로그램 종료(kill)
			}
		}
	}

}