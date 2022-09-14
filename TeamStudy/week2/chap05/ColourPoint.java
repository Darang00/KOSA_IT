package week2.chap05;

public class ColourPoint extends Point{
	//Field
	String colour;
	
	//Constructor
	public ColourPoint(int x, int y, String colour) {
		super(x, y);
		this.colour = colour;
	}
	
	//Method
	void setXY(int x, int y) {
		this.getX();
		this.getY();
	}
	
	void setColour(String colour) {
		this.colour = colour;
	}
	
	

	
	public static void main(String[] args) {
		ColourPoint cp = new ColourPoint(5, 5, "Yellow");
		cp.setXY(10, 20);
		
	
	}



}


