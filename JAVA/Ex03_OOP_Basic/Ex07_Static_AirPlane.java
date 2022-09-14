import kr.or.kosa.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		// 

		AirPlane air1 = new AirPlane(101, "대한항공");
		//air1.makeAirPlane(101, "대한항공");
		air1.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(707, "아시아나");
		//air2.makeAirPlane(707, "아시아나");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane(808, "터키항공");
		//air3.makeAirPlane(808, "터키항공");
		air3.airPlaneTotalCount();
		
		//AirPlane air4 = new AirPlane();

	}

}
