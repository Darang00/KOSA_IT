import java.util.HashMap;
import java.util.Scanner;

public class Ex14_Map_Quiz {

	public static void main(String[] args) {
		/*
		 Map 사용해서 구현하는 데이터 집합:
		 지역번호, 우편번호, 회원가입(id, pw) 등의 정보
		 
		 */
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		/*
		 우리 시스템은 회원 가입한 회원의 id, pw 정보를 가지고 있다.
		 로그인시 id와 pw 를 확인해서 회원이라면 사이트에 접속 가능
		 
		 id(O), pwd(O) >> 회원                  1
		 id(O), pwd(X) >> 비밀번호를 다시 입력      2
		 
		 id(X), pwd(O) >> 회원가입으로 유도
		 id(X), pwd(X) >> 회원가입으로 유도        3
		 
		 */
		
		Scanner sc  = new Scanner(System.in);

		while(true) {
			//id와 pwd 받으세요
			//id는 공백을 제거 >> 소문자 변환 (String 함수)
			//pwd 공백 제거 
			/*
			 id(O), pwd(O) >> 회원님 방가방가 출력하세요                   1
		 	 id(O), pwd(X) >> id, pw 확인해 주세요(입력 다시 받게..)       2
		 
		 	 id(X), pwd(O) >> id 재입력 하세여 출력 id, pw 입력
		 	 id(X), pwd(X) >> id 재입력 하세여 출력 id, pw 입력     3
		 	 3가지 논리를 if문으로 제어
			 */
			System.out.println("id, pwd  입력해 주세요");
			
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) {
				//id(x)
				System.out.println("id 맞지 않습니다 ... 재입력 하세요");
			} else {
				//id(O)
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("회원님 방가방가 ^^");
					break;
				} else {
					System.out.println("비밀번호 확인하세요");
				}
			}

		}
		
	}

}
