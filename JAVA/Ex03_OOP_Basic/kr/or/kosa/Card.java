package kr.or.kosa;
/*
 �츮�� ī�带 ����� �Ǹ��ϴ� ȸ�� �Դϴ�
 ���� ��û�� ���� ī�� 53���� �����ϰ� �Ǿ����ϴ� (new ī��...53)
 �䱸����)
 ī��� ī���� ��ȣ�� ������ �ְ� ����� ������ �ִ�
 ī��� ũ�⸦ ������ �ִ� ũ��� ���̿� �ʺ� ������ �ִ�
 ī���� ũ��� h=50, w = 20
 
 �׸��� ���۵Ǵ� ī���� ���̿� �ʺ�� �����մϴ�
 
 -------------------------------------------------
 
 �����ؼ� ������ �����߾��
 ���ڱ� ���� "ī��� �ʹ� Ŀ��.. �ٽ� ����� �ּ���"
 
 ���赵�� �������� �ʰ� 53�� ī���� ���̿� �ʺ� ������ �� �ֵ��� ���赵�� ���弼��
 
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
		System.out.printf("��ȣ %d, ī���� %s, h:%d , w:%d \n", number, kind, h, w);
	}
	
	

}
