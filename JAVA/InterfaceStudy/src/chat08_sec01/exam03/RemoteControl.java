package chat08_sec01.exam03;

public interface RemoteControl {
	//constant field
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//abstract method //�޼ҵ��� ����θ� �ۼ� {�߰�ȣ �� ����}
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
