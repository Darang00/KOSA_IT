package kr.or.kosa;
/*
 우리는 카드를 만들어 판매하는 회사 입니다
 고객의 요청에 따라 카드 53장을 제작하게 되었습니다 (new 카드...53)
 요구사항)
 카드는 카드의 번호를 가지고 있고 모양을 가지고 있다
 카드는 크기를 가지고 있다 크기는 높이와 너비를 가지고 있다
 카드의 크기는 h=50, w = 20
 
 그리고 제작되는 카드의 높이와 너비는 동일합니다
 
 -------------------------------------------------
 
 제작해서 고객에게 전달했어요
 갑자기 고객이 "카드과 너무 커요.. 다시 만들어 주세요"
 
 설계도를 변경하지 않고 53장 카드의 높이와 너비를 변경할 수 있도록 설계도를 만드세요
 
 */

public class Card {
	private int number;
	private String kind;
	
	public static int h = 50;
	public static int w= 20;
	
	public void makeCard (int num, String name) {
		
		number = num;
		kind = name;
		
		
	}
	
	public void cardDisplay() {
		System.out.printf("번호 %d, 카드모양 %s, h:%d , w:%d \n", number, kind, h, w);
	}
	
	

}
