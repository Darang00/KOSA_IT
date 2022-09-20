package com.victoree2.system;




import java.util.Scanner;
import java.util.Set;

import com.victoree2.common.ActionInterface;
import com.victoree2.common.ReturnMessage;
import com.victoree2.main.ReadingRoom;


public class AdminSystem extends ReturnMessage implements ActionInterface{
	Scanner scan = new Scanner(System.in);
	ReadingRoom room = new ReadingRoom();
	ReadingRoomFactory factory;
	Set<String> userMap;
	

	public AdminSystem(Set<String> userMap) {
		this.userMap = userMap;
		this.factory = new ReadingRoomFactory();
	}
	@Override
	public void run() {
		System.out.println(message(room.language, "0021"));
		
		int key=0;
		while ((key = selectMenu("0")) != 0) {
			/*dayeong*/
			switch (key) { //1:좌석현황 2:전체 회원 목록 3:회원검색 4:매출현황 5:쿠폰관리 0:로그아웃
			case 1: // 1. 좌석현황
				System.out.println(message(room.language, "0051"));
				//좌석 배열 보여주기
				System.out.println();
				break;
			case 2:  //2.전체 회원 목록
				System.out.println(message(room.language, "0052"));
				System.out.println();
				break;
			case 3:  //3.회원 검색
				System.out.println(message(room.language, "0053")); //"회원검색합니다. \n검색할 회원의 이름을 입력하세요."
				//[기능] scan통하여 원하는 조회하고자 하는 회원의 이름 입력
				System.out.println(message(room.language, "0058")); //"검색 결과"
				//[기능] selectAccount(String name) scan통하여 원하는 이름을 가진 회원들의 목록 출력
				//해당 이름을 가진 회원 목록 [인덱스][이름][현재 입퇴실 내역(좌석 번호)] 나옴
				//그 회원들의 [인덱스] 중 하나 입력 -> 이제 회원 한 명 특정 됨
				System.out.println(message(room.language, "0059")); //그 특정 회원에 대한 1:회원입퇴실내역조회 2:비밀번호 초기화 3.경고 4.정지 0:뒤로가기
				System.out.println(message(room.language, "0068")); //1.회원의 입퇴실 내역 "이 회원의 입퇴실 내역입니다"
				System.out.println(message(room.language, "0063")); //2.비밀번호 초기화 
				System.out.println(message(room.language, "0060"));  //3.경고 확인 "이 회원에게 경고를 줍니까?"
				System.out.println(message(room.language, "0061"));  //3.경고 "경고를 주었습니다"
				System.out.println(message(room.language, "0066"));  //4.정지 확인 "이 회원을 정지시킵니까?"
				System.out.println(message(room.language, "0067"));  //4. 정지 "회원의 권한을 정지하였습니다"
				
				System.out.println();
				break;
			case 4:  //4.매출 현황
				System.out.println(message(room.language, "0065")); //"매출 현황 입니다"
				System.out.println();
				break;
			case 5:  //5.쿠폰 관리
				System.out.println(message(room.language, "0054")); //"쿠폰을 관리합니다. \n 1:현재 발행된 쿠폰 확인  2:쿠폰 추가  3:쿠폰 삭제  0:뒤로가기"
				System.out.println(message(room.language, "0055")); //1.현재 발행된 쿠폰 확인 "현재 사용가능한 쿠폰 목록입니다."
				System.out.println(message(room.language, "0056")); //2.쿠폰 추가 "추가할 쿠폰의 번호와 할인율을 입력하세요. 추가를 원치 않으면 0을 입력하세요."
				System.out.println(message(room.language, "0057")); //3.쿠폰 삭제 "삭제할 쿠폰의 번호를 입력하세요. 삭제를 원치 않으면 0을 입력하세요."
				//coupon();
				System.out.println();
				break;
			case 0:  //0.로그아웃
				System.out.println(message(room.language, "0053")); //"회원검색합니다. \n검색할 회원의 이름을 입력하세요."
				System.out.println(message(room.language, "0018")); //"종료"
				System.out.println();
				System.exit(0);
				break;
			default:
				System.out.println(message(room.language, "0020")); //"잘못 선택하였습니다."
				System.out.println();
				break;
			} /*dayeong*/
		}

	}


	public void selectAccount(String id) {
		//특정회원 조회
	}
	
	public void userManager() {//회원관리(경고)
		
	}
	public void inoutSeat() { // 회원 입퇴실 내역조회
		
	}
	@Override
	public void pwdReset() { //패스워드 초기화
		
	}
	public void coupon() {//쿠폰
		
	}
	@Override
	public void selectAccount() {
		//회원 전부 조회
		for(String value : userMap) {
			System.out.println(value.toString());
		}
	}
	
	@Override
	public void paymentCancel() {
		//관리자는 회원 환불.
		
	}

	@Override
	public void checkSeat() {
		//전체좌석을 확인할 수 있다.
		
	}
	@Override
	public int selectMenu(String index) {
		if(index == "0")
			System.out.println(message(room.language, "0003"));
		else if(index == "01")
			System.out.println("양식");
		return Integer.parseInt(scan.nextLine());
	}

	
	
}
