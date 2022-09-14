package week2.chap05;

public class IPTV extends ColourTV {
	//Field
	String address;
	
	//Constructor
	public IPTV(int size, int colour, String address) {
		super(size, colour);
		this.address=address;	
	}
	
	//Method
	void printProperty(){
		System.out.printf("나의 IPTV는 %s주소의 %d인치 %d컬러", address, getSize(), colour);
	}

	
	public static void main(String[] args) {
		IPTV iptv = new IPTV(32, 2048, "132.1.1.2");
		iptv.printProperty();
		

	}

}
