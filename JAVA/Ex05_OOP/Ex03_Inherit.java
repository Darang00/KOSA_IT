
// 두 개의 설계도

class Tv{
	boolean power;
	int ch;
	
	void power() { // 두 개의 기능을 하나의 함수로 처리 가능
		this.power =! this.power;
		
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class Vcr { // 비디오 플레이러
	boolean power;
	void power() {
		this.power =! this.power;
	}
	void play() {
		System.out.println("play");
		
	}
	void stop( ) {
		System.out.println("stop");
		
	}
	
	void rew() {}
	
	void ff() {}
	
}

//Tv 설계도
//Vcr 설계도

//TvVcr 이런 제품을 만들고 싶어요

// class TvVcr extends Tv, Vcr (x) 다른 상속 금지
// 계층적 상속 이상 (자원의 이름 동일 ... 사용 불가)

// 답: 한 놈은 상속하고 한 놈은 포함...
// 어떤 놈을 상속하고 어떤 놈을 포함할까??
// 기준 Tv(상속), Vcr(포함) >> Tv를 더 많이 사용...

// 메인 기능을 누가 가지고 있느냐 (비중)

class TvVcr2 extends Tv{ //일체형. 주 기능인 티비 상속받고
	Vcr vcr;
	
	public TvVcr2() {
		vcr = new Vcr() ;
	}
}

 class TvVcr extends Tv {
	Tv t;
	Vcr v;
	public TvVcr() {
		this.t = new Tv();
		this.v = new Vcr();
	}
}




public class Ex03_Inherit {
	public static void main(String[] args) {
		TvVcr tv = new TvVcr();
		tv.t.power();
		tv.v.power();
		
		System.out.println(tv.t.power);
		//////////////////////////////////////////////
		
		TvVcr2 tv2 = new TvVcr2();
		tv2.power();
		System.out.println("Tv 전원 : " + tv2.power);
		tv2.chUp();
		
		tv2.vcr.power();
		System.out.println("비디오 전원 : " + tv2.vcr.power);
		tv2.vcr.play();
		
		tv2.vcr.power();
		System.out.println("비디오 전원 : " + tv2.vcr.power);
		tv2.vcr.play();
		
		

	}

}
