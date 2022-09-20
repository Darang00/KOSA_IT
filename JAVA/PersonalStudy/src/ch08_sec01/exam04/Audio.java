package ch08_sec01.exam04;

import chat08_sec01.exam03.RemoteControl;

public class Audio implements RemoteControl{
	//field
	private int volume;
	
	//concrete method of the abstract method; turnOn() 
	@Override
	public void turnOn() {
		System.out.println("Turnning on the Audio");
		
	}

	//concrete method of the abstract method; turnOff() 
	@Override
	public void turnOff() {
		System.out.println("Turnning on the Audio");
		
	}
	
	//concrete method of the abstract method; setVolume() 
	@Override
	public void setVolume(int volume) { // 인터페이스 상수를 이용하여 volume 필드의 값을 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("The current volume of the Audio is " + this.volume);
	}
	
	
}
