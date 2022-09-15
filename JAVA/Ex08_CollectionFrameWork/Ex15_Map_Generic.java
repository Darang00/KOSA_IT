import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map도 Generic을 제공한다.
 HashMap<k, v>
 
  HashMap<String, String>
  HashMap<Integer, String>
  HashMap<String, Student> **POINT**  /// Student 에는 Student 객체의 주소값 들어온디
  
  class Student{//클래스도 데이터 타입 이므로!
  }
  
  >> put("kglim", new Student());
  
  Student st = new Student();
  >> put("kglim", st);

 */

class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}

class ArrayTest{
	//주의사항
	//Generic 
	ArrayList<String[]> al = new ArrayList<String[]>(); // al.add() 하면 String 배열이 들어가서 주소값
	
	
	
}

public class Ex15_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> sts = new HashMap<String, String>();
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));
		
		//실무에서의 Map
		//학생들의 성적 데이터
		//Kim이라는 학생의 [국어, 영어, 수학] 점수 >> Array, Collection(ArrayList(O))\
		
		//value값은 객체 타입(Emp, Student etc.)
		
		//다형성: Map<String, Student> smap = new HashMap<String, Student>();
		
		//Today Point
		HashMap<String, Student> smap = new HashMap<String, Student>();
		smap.put("hong", new Student(100, 80, 50, "HongGilDong"));
		smap.put("kim", new Student(50, 30, 60, "KimYuShin"));
		// >> key  값 제시하면 value 값 얻을 수 있다.
		
		//...
		ArrayTest at = new ArrayTest();
		String[] starr = {"A", "B", "C", "D"};
		at.al.add(starr);
		
		//Tip
		Set set = smap.entrySet(); //Map, Key, value 가공 >> key + "=" + value
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//hong=Student@5e91993f
		//kim=Student@1c4af82c
		
		//Tip 
		//key, value 분리돼서 결과를 보고 싶어요
		//class Entry{Objet key, Object value}
		//Map {Entry[] elements} >> Map.Entry
		for(Map.Entry m : smap.entrySet()){ //key 와 value를 분리할 수 있다.
			System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name);
		}
		
		Student sd = smap.get("hong"); // Student 타입의 sd는 smap의 hong 키에 상응하는 value return
		System.out.println(sd.kor);
		System.out.println(sd.math);
	}

}
