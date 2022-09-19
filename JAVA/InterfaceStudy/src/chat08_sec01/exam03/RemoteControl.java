package chat08_sec01.exam03;

public interface RemoteControl {
	//constant field
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//abstract method //메소드의 선언부만 작성 {중괄호 블럭 없음}
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
