package week2.chap04;


public class Rectangle {
	//Field
	int x;
	int y;
	int width;
	int height;
	
	//Constructor
	Rectangle(int x, int y, int width, int height){ //Initializing
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//Method
	int square() {
		return width*height ;
	}
	
	void show() {
		System.out.println("(" + x + " , " + y + ")���� ũ�Ⱑ " + width + " x " + height + "�� �簢��");
	}
	
	boolean contains(Rectangle r) {
		//���� �� �� �κ�..
		if((r.x>=this.x) && (r.y>=this.y) && ((r.x + r.height )<=this.width) && ((r.y+r.height)<=this.height)) {
			//System.out.printf("t�� %s�� �����մϴ�", r);
			return true;
		} else { 
			return false;
		}
		}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) 
			System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s))
		System.out.println("t�� s�� �����մϴ�");
	}
	
}
