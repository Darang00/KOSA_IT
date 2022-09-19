package ch08_sec01_exam06;

import ch08_sec01.exam04.Audio;
import ch08_sec01.exam04.Television;
import chat08_sec01.exam03.RemoteControl;

public class MyClass {
	//field
	RemoteControl rc = new Television();
	
	//constructor
	MyClass(){
		
	}
	MyClass(RemoteControl rc){ //생성자의 매개값으로 구현 객체 대입
		this.rc = rc;
		rc.turnOn(); //Television의 turnOn()이 실행
		rc.setVolume(5); //Television setVolume(5)가 실행
	}
	
	//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn(); //Audio의 turnOn()이 실행
		rc.setVolume(5); //Audio의 setVolume(5)이 실행
	}
	
	void methodB(RemoteControl rc) { //생성자의 매개값으로 구션 객체 대입
		rc.turnOn();
		rc.setVolume(5);
	}

}
