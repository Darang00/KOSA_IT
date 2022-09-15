import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		
		String str = "hello";
		String concatstr = str.concat(" world");
				System.out.println(concatstr);
				
				boolean bo = str.contains("ello"); //e라고 하는 문자를가지고 있니? (boolean 타입은 다 yes or no)
				
				System.out.println(bo);
				
				String str2 = "a b c d"; // [a] [ ] [b] [ ] [c] [ ] [d]
				System.out.println(str2.length());
				
				// String은 내부적으로 배열이다.
				
			String filename = "hello java world";
			System.out.println(filename.indexOf("h")); // 해당 문자가 몇 번째 index 인지 알려줌
			System.out.println(filename.indexOf("java")); // java 라는 단어의 시작값
			System.out.println(filename.indexOf("개폭망"));
			// 해당하는 문자나 문자열이 없을 경우 -1을 return... 배열에서 값이 없다는 의미 (-1)
			// 신문 사설에서 원하는 단어 감색.... 내가 원하는 문자열이 그 사설 내에 포함되었는지 파악
			
			if(filename.indexOf("wo") != 1) {
				System.out.println("wo 단어가 하나라도 있다");
			}
			System.out.println(filename.lastIndexOf("a")); // 처음부터세어서 마지막 a가 있는 index 값 (9번째 방)
			
			// length() , indexOf() , substring() . replace() , split() 
			
			String result= "superman";
			System.out.println(result.substring(0)) ; // 시작 index~
			System.out.println(result.substring(1)) ;
			System.out.println(result.substring(1, 3));
			//beginIndex - the beginning index, inclusive
			//endIndex - the ending index, exclusive. // endindex -1
			System.out.println(result.substring(0, 0)); //0~-1까지 범위니까 아무것도 안나온다
			System.out.println(result.substring(0, 1)); // s
			
			// Quiz
			String filename2 = "home.jpeg"; // or h.png or aaaaa.hwp
			// 여기서 파일명과 확장자를 분리해서 출력해라
			// 파일명 : home
			// 확장자 : jpeg
			// 단 위에서 배운 함수만 사용해서 출력해라
			
			int position = filename2.indexOf(".");
			System.out.println(filename2.indexOf(".")); // "."의 위치
			String file = filename2.substring(0, position);
			
			String extention2 = filename2.substring(position, filename2.length());
			String extention = filename2.substring(++position);
			
			System.out.println(position);
			System.out.println(file);
			System.out.println(extention);
			System.out.println(extention2);
			
			//replace
			String str3 = "ABCDADDDDDA";
			String result3 = str3.replace("DDDDD", "오늘은 금요일");// DDDDD 찾아서 오늘은 금요일 로 대체
			System.out.println(result3);
			
			result3 = str3.replace("A", "a"); // A 찾아서 a 로 바꿔라
			System.out.println(result3);
			
			// ETC
			System.out.println(str3.charAt(0)); // 0번째 character값 뽑겠다
			System.out.println(str3.charAt(3));
			System.out.println(str3.endsWith("DDDA")); // 뒤에 DDDA로 시작하는 값 잇니?
			System.out.println(str3.endsWith("BDDA")); // 뒤에 BDDA로 시작하는 값 잇니?
			System.out.println(str3.equalsIgnoreCase("aBCDADDDDDa")); // 대소문자 구분없이 비교해라
			
			//Today Point > split()
			String str4 = "슈퍼맨, 팬티, 노랑색, 우하하, 우하하" ;
			String[] namearray = str4.split(",");
			System.out.println(namearray); // > 주소값나옴
			
			for(String s : namearray) {
				System.out.println(s);
			}
			
			//
			String str5 = "슈퍼맨. 팬티. 노랑색. 우하하. 우하하" ;
			String[] namearray2 = str5.split("\\.");
			
			
			for(String s : namearray2) {
				System.out.println(s);
			} //
			
			//https://codechacha.com/ko/java-regex/
			// "." 데이터가 아니고 정규표현식으로 인식함
			
			// 정규표현식 (문자들을 조합해서 규칙을 만들고 : 그 규치기하고 데이터 비교해서 판단)
			// 우편번호 : {\d3} - {\d3}  >>  12-123 (false), 123*123(false), 111-111(true: 내가 입력한 패턴과 같아야만 true)
			
			// regular expression(java, javascript, Oracle, c#) 표준
			// 핸드폰번호, 차량번호, 도메인 주소, 이메일 주소 >> regular expression으로 구현 >> 입력한 데이터 유효성 검증
			
			String filename3 = "kosa.hwp";
			//파일명과 확장자 분리
			String[] filearray = filename3.split("\\.");
			for(String s: filearray) {
				System.out.println(s);
			}
			
			String str6 = "a/b.c-d.f" ;
			StringTokenizer sto = new StringTokenizer(str6, "/. -."); //String을 도와주는 보조 클래스
			while(sto.hasMoreElements()) {
				System.out.println(sto.nextToken());
			}
			
			// 넌센스
			String str7 = "홍     길     동";
			// 저장 >> 공백을 제거 >> "홍길동" 이라는 데이터 사용할거다
			System.out.println(str7.replace(" ", "")); // "홍길동"
			
			String str8 = "     홍길동     "; // 양쪽 데이터를 짤라버리는 함수
			System.out.println(">" + str8 + "<"); 
			System.out.println(">" + str8.trim() + "<");
			
			
			String str9 = "     홍     길     동     ";
			//"홍길동"으로 출력하고 싶으면?
			String result5 = str9.trim();
			String result6 = result5.replace(" ", "");
			System.out.println(result6);
			// 자원을 너무 많이 씀..
			
			// ***** 여러개의 함수를 사용할 경우 (method chain 기법)
			str9.trim().replace(" ", "").substring(2); // 체인처럼 연결하자
			System.out.println(str9.trim().replace(" ", "").substring(2));
			
			//Hint
			int sum = 0;
			String [] numarr = {"1", "2", "3", "4"};
			for (String s: numarr) {
				sum += Integer.parseInt(s);
			}
			System.out.println("sum:" + sum);
			
			
			//Quiz
			String jumin = "123456-1235467";
			//위 주민번호의 합을 구하세요
			String array = jumin.replace("-", "");
			// int a= Integer.parseInt(array);
			int sum2=0;
			for (int i=0; i<array.length(); i++) {
				sum2 += Integer.parseInt(array.substring(i,i+1)); // i번째 방안의 값 부터 i+1번 째 방 전 까지의 값

			}
			System.out.println("주민번호의 합: " + sum2);
			
			

		
			
//////////////////////////////////////////////////////////////////////////////////////			
	}

}
