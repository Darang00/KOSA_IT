package com.victoree2.system;

import java.util.Scanner;

import com.victoree2.common.AccountData;
import com.victoree2.common.ActionInterface;
import com.victoree2.common.ReturnMessage;
import com.victoree2.main.ReadingRoom;

public class UserSystem extends ReturnMessage implements ActionInterface{
	ReadingRoom room = new ReadingRoom();
	Scanner scan = new Scanner(System.in);
	AccountData userStatus;
	int key;
	public UserSystem(AccountData userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public void run() {
		
		System.out.println(userStatus.getName()+message(room.language, "0019"));

		

		while ((key = selectMenu("0")) != 0) {
			switch (key) {
			case 1:
				myPage();
				break;
			case 2:
				seasonReservation();
				break;
			case 3:
				timeReservation();
				break;
			case 4:
				//미지정.
				break;
			case 5:
				checkSeat();
				break;
			case 0:
				System.out.println(message(room.language, "0018"));
				System.exit(0);
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}
	}
	
	public void myPage() {
		while ((key = selectMenu("01")) != 0) {
			switch (key) {
			case 1://패스워드 초기화
				pwdReset();
				break;
			case 2://결제취소
				paymentCancel();
				break;
			case 0:
				System.out.println(message(room.language, "0018"));
				System.exit(0);
			}
		}
	}
	@Override
	public void selectAccount() {
		//내 남은 시간조회
	}

	public void seasonReservation(){//정기권 예약
		
	}
	public void timeReservation() {//시간권예약
		
	}
	public void payment() { //결제하다
		//결제방법 1.카드 2.현금
	}

	@Override
	public void paymentCancel() {
		//결제 취소 
	}

	@Override
	public void checkSeat() {
		//내 좌석 조회
	}
	@Override
	public void pwdReset() {
		//패스워드 초기
		
	}
	


	@Override
	public int selectMenu(String index) {
		if(index == "0")
			System.out.println(message(room.language, "0002"));
		else if(index == "01")
			System.out.println(message(room.language, "0026"));
		return Integer.parseInt(scan.nextLine());
	}

	


}
