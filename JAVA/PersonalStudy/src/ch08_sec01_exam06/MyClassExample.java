package ch08_sec01_exam06;

import ch08_sec01.exam04.Audio;
import ch08_sec01.exam04.Television;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)--------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); //Television의 turnOn()이 실행
		myClass1.rc.setVolume(5); //Television의 setVolume(5)가 실행
		
		System.out.println("2)---------------------");
		
		MyClass myClass2 = new MyClass(new Audio()); //Audio의 turnOn()과 setVolume()메소드가 실행
		
		System.out.println("3)----------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
