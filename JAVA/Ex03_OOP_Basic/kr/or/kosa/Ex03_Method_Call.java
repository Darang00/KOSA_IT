package kr.or.kosa;

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
		
		lgtv.tvInfo();
		
		Tv sstv = new Tv();
		sstv.brandname = "SS";
		
		
		
		
		
		

	}

}
