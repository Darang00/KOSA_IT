import kr.or.kosa.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		// 

		AirPlane air1 = new AirPlane(101, "�����װ�");
		//air1.makeAirPlane(101, "�����װ�");
		air1.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(707, "�ƽþƳ�");
		//air2.makeAirPlane(707, "�ƽþƳ�");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane(808, "��Ű�װ�");
		//air3.makeAirPlane(808, "��Ű�װ�");
		air3.airPlaneTotalCount();
		
		//AirPlane air4 = new AirPlane();

	}

}
