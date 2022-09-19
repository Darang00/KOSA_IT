package com.victoree2.common;
import java.util.HashMap;

import com.victoree2.main.readingroomEx;

public class returnmessage {
	readingroomEx room = new readingroomEx();

	
	HashMap<String, String> kor_message = new HashMap<String, String>();
	HashMap<String, String> en_message = new HashMap<String, String>();
	

	
	void init() {
		kor_message.put("0000", "해당계정은 정지되었습니다.");
		kor_message.put("0001","1:로그인 2:회원가입 3:한글 4:영어 0:종료");
		kor_message.put("0002","1:마이페이지 2:정기권 예약 3:시간권 예약 4:좌석보기 5:스터디룸 예약 0:종료");
		kor_message.put("0003","1:독서실 관리 2:회원 관리 3:좌석보기 0:종료");
		en_message.put("0000", "This account has been suspended.");
		en_message.put("0001", "1:Login 2:Membership 3:Hangul 4:English 0:End");
		en_message.put("0002","1: My Page 2: Regular Ticket Reservation 3: Time Ticket Reservation 4: Seat View 5: Study Room Reservation 0: End");
		en_message.put("0003","1: Reading Room Management 2: Member Management 3: Seat View 0: Exit");
	}
	
	
	public String message(String language, String key) {
		init();
		String message="";
		if(room.language=="kor")
		{
			message = kor_message.get(key);
		}
		else {
			message = en_message.get(key);
		}
		return message;
	}
	
}
