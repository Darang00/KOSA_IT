import kr.or.kosa.Card;

public class Ex08_Static_Card {

	public static void main(String[] args) {
		// ī�� 53�� ����
		// �޸�(heap)
		// ���赵�� �������� �ʰ�
		// �� ���� ī�� ũ�⸦ �����ϸ� ��� ī�尡 ����
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
