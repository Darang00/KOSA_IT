package sec01.exam01;
public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		//Creating DmbCellPhone class
		DmbCellPhone dmbCellPhone = new DmbCellPhone("javaPhone ", "black ", 10);
		
		//Field extended from class CellPhone
		System.out.println("model : " +dmbCellPhone.model);
		System.out.println("colour : " +dmbCellPhone.colour);
		
		//Field of DmbCellPhone class
		System.out.println("channel: " + dmbCellPhone.channel);
		
		//Calling method extended from class CellPhone 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello!");
		dmbCellPhone.receiveVoice("Hello, this is Gildong Hong");
		dmbCellPhone.sendVoice("Oh yes, nice to see you");
		dmbCellPhone.hangUp();
		
		//Calling method of DmbCellPhone
		dmbCellPhone.turnOnDumb();
		dmbCellPhone.changeChannelDmb(12);;
		dmbCellPhone.turnOffDmb();
		
		
		
		
	}
}