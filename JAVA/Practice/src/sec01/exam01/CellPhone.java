package sec01.exam01;

public class CellPhone {
	//Field
	String model;
	String colour;
	
	//Constructor
	
	//Method
	void powerOn() {
		System.out.println("Turn on the power");
	}
	void powerOff() {
		System.out.println("Turn off the power");
	}
	void bell() {
		System.out.println("Ringing the bell");
	}
	void sendVoice(String message) {
		System.out.println("Me: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("Other: " + message);
	}
	void hangUp() {
		System.out.println("Stopping the call");
	}

}
