import kr.or.kosa.Card;

public class Ex08_Static_Card {

	public static void main(String[] args) {
		// 카드 53장 제작
		// 메모리(heap)
		// 설계도를 변경하지 않고
		// 한 장의 카드 크기를 변경하면 모든 카드가 변경
	Card c = new Card();
	c.makeCard(1, "heart");
	c.h= 100;
	c.w= 10;
	c.cardDisplay();
	
	Card c2 = new Card();
	c2.makeCard(2, "heart");
	c2.cardDisplay();
	
	Card c3 = new Card();
	c3.makeCard(3, "heart");
	c3.cardDisplay();
	  

	}

}
