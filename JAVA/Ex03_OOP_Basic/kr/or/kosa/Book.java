package kr.or.kosa;

/*
 å�� å�̸��� ���������� ������ �ִ�.
 å�� ���ǵǸ� �ݵ�� å�̸��� å ���������� ������ �־�� �Ѵ�.
 å�� �̸��� ���������� Ư�� ����� ���ؼ��� �� �� �ְ�, ���ǵ� ���Ŀ��� ������ �� ���� (å�� ����, �̸�)
 å�̸��� ���������� ���� Ȯ���� �� �ִ�.
 */

public class Book {
	
	private int price;
	private String bname;
	
	//public Book() {} �䱸���� (x)
	public Book(String name, int money) { //overloading constructor
		
	
		price = money;
		bname = name;
	}
	
	public void bookInfo() {
		System.out.println("å���� : " + bname + "���� : " + price);
	}
	
	//������ ���ؼ� getter�� ������
	public String getBname() {
		return bname;
	}
	public int getPrice()  {
		return price;
	}
		
	
	

}
