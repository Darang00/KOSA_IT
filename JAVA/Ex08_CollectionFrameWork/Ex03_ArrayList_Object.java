import java.util.ArrayList;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		// 1. 사원 한 명 만들어라
		Emp emp = new Emp(1000, "김유신", "장군");
		System.out.println(emp.toString());
		
		// 2. 사원 2명 만드세요 (Array) // 정적 배열: 방 크기 정해져 있음
		Emp[] emplist = {new Emp(100, "김씨", "영업"), new Emp(200, "박씨", "IT")} ;
		for(Emp e: emplist) { //개선된  for문
			System.out.println(e.toString());
		}
		
		//3. 사원이 1명 더 입사를 했어요 (300, "이씨", "IT")
		//방 3개 배열 생성 -> 이사한 후 for문 돌면서 다시 데이터 대입해줌
		
		//ArrayList 사용 // 동적 배열: 방 크기 정해져 있지 않음. 사원 계속 추가 가능
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100, "김씨", "영업"));
		elist.add(new Emp(200, "박씨", "IT"));
		elist.add(new Emp(300, "이씨", "IT"));
		
		for(int i = 0; i<elist.size(); i++) {
			System.out.println(elist.get(i).toString());
			
			Emp e = (Emp) elist.get(i);
			e.toString();
		}
		
		elist.add(new Emp(400, "최씨", "관리"));
		
		//toString() 사용하지 말고 4명 사원의 사번, 이름, 직종을 출력하세요
		//for문 안에서 getEmpno, getEname(), getJob()
		for(int i = 0; i<elist.size(); i++) {
			Object obj = elist.get(i);
			//obj.toString()
			//Object 모든 타입의 부모타입 (Down casting)
			Emp e = (Emp)obj;
			System.out.println(e.getEmpno() + "." + e.getEname() + "." + e.getJob());
			
		}
		
		// 현업 개발자... (Object 타입 좋아할까?) ... downcasting ... 자식요소 접근
		// Object쓰지 말자 ... 대안
		// 타입을 강제해서 그 타입만 쓰게 하자  >> 하나의 타입만을 가지고 데이터 관리
		// 제너릭 (객체 생성시 타입 강제하는 방법)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A", "IT"));
		
		for(Emp e: list2) {
			System.out.println(e.getEmpno());
		}
		

	}

}
