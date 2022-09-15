import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map�� Generic�� �����Ѵ�.
 HashMap<k, v>
 
  HashMap<String, String>
  HashMap<Integer, String>
  HashMap<String, Student> **POINT**  /// Student ���� Student ��ü�� �ּҰ� ���µ�
  
  class Student{//Ŭ������ ������ Ÿ�� �̹Ƿ�!
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
	//���ǻ���
	//Generic 
	ArrayList<String[]> al = new ArrayList<String[]>(); // al.add() �ϸ� String �迭�� ���� �ּҰ�
	
	
	
}

public class Ex15_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> sts = new HashMap<String, String>();
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));
		
		//�ǹ������� Map
		//�л����� ���� ������
		//Kim�̶�� �л��� [����, ����, ����] ���� >> Array, Collection(ArrayList(O))\
		
		//value���� ��ü Ÿ��(Emp, Student etc.)
		
		//������: Map<String, Student> smap = new HashMap<String, Student>();
		
		//Today Point
		HashMap<String, Student> smap = new HashMap<String, Student>();
		smap.put("hong", new Student(100, 80, 50, "HongGilDong"));
		smap.put("kim", new Student(50, 30, 60, "KimYuShin"));
		// >> key  �� �����ϸ� value �� ���� �� �ִ�.
		
		//...
		ArrayTest at = new ArrayTest();
		String[] starr = {"A", "B", "C", "D"};
		at.al.add(starr);
		
		//Tip
		Set set = smap.entrySet(); //Map, Key, value ���� >> key + "=" + value
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//hong=Student@5e91993f
		//kim=Student@1c4af82c
		
		//Tip 
		//key, value �и��ż� ����� ���� �;��
		//class Entry{Objet key, Object value}
		//Map {Entry[] elements} >> Map.Entry
		for(Map.Entry m : smap.entrySet()){ //key �� value�� �и��� �� �ִ�.
			System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name);
		}
		
		Student sd = smap.get("hong"); // Student Ÿ���� sd�� smap�� hong Ű�� �����ϴ� value return
		System.out.println(sd.kor);
		System.out.println(sd.math);
	}

}
