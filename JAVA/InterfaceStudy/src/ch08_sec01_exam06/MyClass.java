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
	MyClass(RemoteControl rc){ //�������� �Ű������� ���� ��ü ����
		this.rc = rc;
		rc.turnOn(); //Television�� turnOn()�� ����
		rc.setVolume(5); //Television setVolume(5)�� ����
	}
	
	//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn(); //Audio�� turnOn()�� ����
		rc.setVolume(5); //Audio�� setVolume(5)�� ����
	}
	
	void methodB(RemoteControl rc) { //�������� �Ű������� ���� ��ü ����
		rc.turnOn();
		rc.setVolume(5);
	}

}
