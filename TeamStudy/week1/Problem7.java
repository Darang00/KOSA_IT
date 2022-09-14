package week1;


class TV{
	
	
	public String brand;
	static int year;
	static int size;
	

	public TV(String brand, int year, int size) {
		this.brand =brand;
		this.year = year;
		this.size = size;
		
	}

	public void show() {
		System.out.println(brand+"에서 만든TV는 " + year + "년 형 " + size + "인치 Tv");
		
	}
	
	
}

public class Problem7 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	
	}

}
