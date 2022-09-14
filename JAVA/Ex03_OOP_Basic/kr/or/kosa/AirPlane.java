package kr.or.kosa;

/*
 우리 회사는 비행기를 주문 제작 판매하는 회사입니다
 우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다
 
 요구사항
 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다
 2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인 하는 작업이 필요하다 (출력)
 3. 공장장은 현재까지 만들어진 비행기의 총 누적대수를 확인할 수 있다.
 
 AirPlane air 101 = new Airplane();
 air101 이름 >> 대한항공
 air101 번호 >> 707
 출력을 통해 확인..
 ....5대
 관리자가 비행기 누적 대수를 확인할 수 있어야 한다.... 5대가 제작되었습니다.
 
 조건 ) 생성자를 사용하지 마세요 (아직....)
 
 */

// 생성자를 사용해서 이쁘게 바꾸세요
public class AirPlane {
	 
	private int airnum;
	private String airname;
	private static int airtotalcount; //모든 객체가 공유하는 자원(필드)
	



	public AirPlane(int airnum, String airname) {
		this.airnum = airnum; 
		this.airname = airname;
		//airtotalcount 누적대수
		airtotalcount++;
		
		AirDisplay();
		
	}
	
	
	
	private void AirDisplay() {
		System.out.printf("번호[%d], 이름[%s] \n" , this.airnum, this.airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("총 비행기 제작 대수 : [%d] \n", airtotalcount );
		
	}
	

}
