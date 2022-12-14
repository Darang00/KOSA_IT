import java.util.Calendar;
import java.util.Date;

import kr.or.kosa.utils.Edu_Date;

/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
* GregorianCalendar
buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
의 인스턴스를 반환한다
GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
class MyApp{
static void main(){
Calendar cal = new getInstance();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
API : 생성자 Protected Calendar() 
*/

public class Ex09_Calendar {

	public static void main(String[] args) {
		Date dt = new Date(); //Date: 날짜를 표현하는 객체 (old version)
		System.out.println(dt.toString());
		//Wed Sep 14 16:46:14 KST 2022
		
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance(); //왜 Calendar는 new 안하고 바로 쓸까: Calendar는 추상클래스 //신버전
		//Calendar는 추상클래스
		System.out.println(cal.toString());
		//당신이 필요한 형식을 추출해서 조립하세요
		//java.util.GregorianCalendar[time=1663142191238,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=257,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=56,SECOND=31,MILLISECOND=238,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1)); //달을 0월 부터 11월까지 표기한다 >> get함수로 가져온 값 +1 
		System.out.println("일 : " + cal.get(Calendar.DATE));
		
		System.out.println("이 달의 몇째주 : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_WEEK));
		
		//시, 분, 초
		System.out.println("시: " + cal.get(Calendar.HOUR));
		System.out.println("분: " + cal.get(Calendar.MINUTE));
		System.out.println("초: " + cal.get(Calendar.SECOND));
		
		//오전, 오후
		System.out.println("오전 오후: " + cal.get(Calendar.AM_PM));
		
		//학사 관리 시스템
		//웹: 페이지 본 수 : 200page
		//150page 날짜 정보: 각 페이지 하단에 출력 (2022년 09월 14일)
		//A 친구>> cal.get(Calendar.YEAR)) +"월" ...
		//갑자기 해외 수출..... 날짜 2022-09-14
		
		//한 번만 수정해서 150페이지의 날짜 정보 수정 되려면
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance(), "-"));
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance(), "/"));
		
		
	}

}
