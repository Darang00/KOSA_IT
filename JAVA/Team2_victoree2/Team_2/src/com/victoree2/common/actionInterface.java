package com.victoree2.common;

public interface actionInterface {
	abstract public void selectAccount(); //계정정보 조회
	abstract public void paymentCancel(); //결제 취소 ****(결제내역 저장)
	abstract public void checkSeat(); //자리 조회
	abstract public void run(); //시스템 실행
	abstract public int selectMenu(); // 처음 메뉴창
}
