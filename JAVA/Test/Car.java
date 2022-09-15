
public class Car {
	
	//Field
	String model;
	int speed;
	
	//Constructor
	Car(String model){
		this.model= model;
	}
	
	//Method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + " is running. (rate: " + this.speed + "km/h");
		}
	}

}
