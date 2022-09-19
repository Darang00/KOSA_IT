package ch08_sec01.exam05;

import chat08_sec01.exam03.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	//field
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Turnning on the TV");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turnning off the TV");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("The volume of the currnet TV is " + this.volume);
		
	}

	@Override
	public void search(String url) { // Searchable 의 추상 메소드에 대한 실체 메소드
		System.out.println("Searching the " + url); 
		
	}

}
