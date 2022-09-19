package ch08_sec01.exam04;

import ch08_sec01.exam02.Remotecontrol;
import chat08_sec01.exam03.RemoteControl;

public class Television implements RemoteControl{
	//field
	private int volume;
	
	@Override
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Turnning on the TV");
	}
	
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Turnning off the TV");
	}
	
	//Concrete method of the abstract method; setVolume()
	public void setVolume(int volume) { //�������̽��� ����� �̿��ؼ� volume �ʵ��� ���� ����
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("The current volume of the TV is " + this.volume);
	}
}
