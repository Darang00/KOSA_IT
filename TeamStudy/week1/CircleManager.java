package week1;

import java.util.Scanner;

class Circle{
	
	//Field
	private double x, y ; // Initializing variable x and y as default values
	private int radius; // The integer variable radius is one of the field of the class Circle
	public Circle(double x, double y, int radius) { //Conductor Circle // the conductor name must be same as class name
		this.x = x; this.y = y; this.radius = radius ; // x, y, radius √ ±‚»≠
		
	}
	
	public void show(){ // Creating method show()
		System.out.println("( " + x + " , " + y + " )" + radius);
		
	}
	
	
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for (int i = 0; i < c.length ; i++) { 
			System.out.print("x, y, radius >>" );
			
			c[i] = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt()); //Studying what nextDouble and nextInt are\
			
	
		}
		for (int i=0; i<c.length; i++) { 
			c[i].show();
			
		}
		scanner.close();

	}

}
