package sec01.exam01;
public class DmbCellPhone extends CellPhone{
	//Field
	int channel;
	
	//Constructor
	DmbCellPhone(String model, String colour, int channel){
		this.model = model;
		this.colour = colour;
		this.channel = channel;
	}
	
//	public DmbCellPhone(String model, String colour, int channel2) {
//		// TODO Auto-generated constructor stub
//	}

	void turnOnDumb() {
		System.out.println("no. " + channel + "channel starts DMB on air");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("change to no. " + channel);
	}
	void turnOffDmb() {
		System.out.println("Stop recieving DMB air");
	}

}
