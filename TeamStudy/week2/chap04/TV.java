package week2.chap04;

class TV {
	
	//Field
	String brand;
	int year;
	int size;
	
	//Constructor
	TV(String brand, int year, int size){
		this.brand = brand;
		this.year = year;
		this.size = size;	
	}
	
	//Method
	void show(){
		System.out.println(brand + "���� ���� " + year + "�� �� " + size + "inch Tv" );	
	}


 public static void main(String[] args) {
	 TV myTV = new TV("LG", 2022, 32);
	 myTV.show();
	
 }

}
