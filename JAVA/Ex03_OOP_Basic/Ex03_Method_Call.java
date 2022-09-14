import kr.or.kosa.Tv; // import 불러오는 단축키: 객체가 Tv인 경우 Tv에 마우스 클릭 한 후 ctrl+shift+o

public class Ex03_Method_Call {

	public static void main(String[] args) {
		Tv lgtv = new Tv() ;
		lgtv.brandname = "LG";
		
		lgtv.tvInfo();
		lgtv.ch_Up();
		lgtv.ch_Up();
		lgtv.ch_Up();
		
		lgtv.tvInfo();
		lgtv.ch_Down();
		lgtv.ch_Down();
		
		
		

	}

}
