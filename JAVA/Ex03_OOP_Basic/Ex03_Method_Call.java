import kr.or.kosa.Tv; // import �ҷ����� ����Ű: ��ü�� Tv�� ��� Tv�� ���콺 Ŭ�� �� �� ctrl+shift+o

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
