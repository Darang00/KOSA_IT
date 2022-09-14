/*
 원칙: 객체를 만들 떄 생성자는 1개만 호출 가능(new Car() or new Car(10)...)
 
 this(객체) : 여러개의 생성자를 호출 가능
 
 코드량도 감소
 */

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar() { //default
		this("red", "auto", 2); // 생성자를 호출하는 this 이용항하면 반복되는 코드를 줄일 수 있다.
		this.color = "red";
		this.geartype = "auto";
		this.door = 2;
		System.out.println("default...");
		
	}
	
	Zcar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading ...");
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
		
	}
}
/////////////////////////////////////////////
/*
 저희 자동차 매장은 차 3종류 옵션 지원함
 1. 기본옵션: 차 색깔 "red", 문 개수 1개, 기어타입 "auto"
 2. 옵션) 차 색깔 "선택가능", 문 개수 변경가능, 기어타입 "auto"
 3. 옵션) 차 색깔 "선택가능", 문 개수 선택가능, 기어타입 "선택가능"
 */
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){
		this("red", 1);// 기본옵션 (red, 1, auto)
		System.out.println("default...");
	}
	
	Zcar2(String color, int door){
		this(color, door, "auto"); // 옵션) color, door 변경 (geartype: default "auto")
		System.out.println("overloading parameter 2개..");
	}
	
	Zcar2(String color, int door, String geartype) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		// 옵션) color, door, geartype 다 선택가능
		System.out.println("overloading parameter 3개");
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
	
}

}






public  class Ex20_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zcar zcar = new Zcar();
		// Zcar zcar2 = new Zcar (null. null. 0);
		Zcar zcar = new Zcar();
		zcar.print();
		
		Zcar zcar2 = new Zcar("blue", "auto", 0);
		
	}

}

