package week2.chap05;

class ColourTV extends TV{
	int colour;

	public ColourTV(int size, int colour) {
		super(size);
		this.colour = colour;
		
	}
	
	void printProperty() {
		System.out.printf("%d인치 %d컬러", getSize(), colour);
	} 
	


	public static void main(String[] args) {
		ColourTV myTv = new ColourTV(32, 1024);
		myTv.printProperty();
	
	}
}
