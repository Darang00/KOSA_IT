package kr.or.kosa;
/*
 Tv 설계도 요구사항 정의
 Tv는 채널 정보를 가지고 있다 (예를 들면 1~200 값을 가질 수 있다)
 Tv는 브랜드 이름을 가지고 있다 (예를 들면 엘지 , 삼성)
 Tv 는 채널 전환 기능을 가지고 있다 (채널은 한 채널씩 이동이 가능하다)
 Tv는 채널 전환 기능을 가지고 있다 (채널은 한 채널씩 이동이 가능하다)
 ->채널을 증가 시키는 기능을 가지고 있다
 ->채널을 감소 시키는 기능을 가지고 있다
 Tv의 채널정보와 브랜드이름을 볼 수(출력) 있는 기능을 가지고 있다
 */
public class Tv {
	//
	public int ch; // default > 0
	public String brandname; // default > null
	
	public void ch_Up() {
			ch++;
	}
	
	public void ch_Down() {
		ch--;
}
	
	public void tvInfo() {
		System.out.printf("[%s], [%d] \n", brandname, ch);
	}
	

}
