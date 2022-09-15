
public class StaticCar {
	
	//Instance Field
	int speed;
	
	void run() {
		System.out.println("Running with the speed : " + speed);
	}
	
	

	public static void main(String[] args) {
		StaticCar staticcar = new StaticCar();
		
		staticcar.speed = 60;
		staticcar.run();
		
		

	}

}
