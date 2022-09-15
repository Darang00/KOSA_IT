import java.util.ArrayList;

//연습용이니까...
class EmpData{
	private String name; //default 값: null (string 도 클래스라서)
	private int[] numbers; // 정수 타입의 배열을 담을 수 있는 //default: null
	private ArrayList elist; // 중요 //default: null
	
	//초기화 (private 자원에 접근할 수 있는 getter  , setter 만들기)
	public EmpData() {
		this.name = "아무개";
		//사용자가 만든 타입, Array, ArrayList >> 초기화 > 메모리 (new를 통해서) >
		this.numbers = new int[10];
		this.elist = new ArrayList();
		
	}
	public String getName() { //getter
		return this.name;
	}
	public void setName(String name) { //setter
		
	}
	
	//int[] numbers 의 getter, setter (같은 타입의 주소값을 return 하고, 받고)
	public int[] getNumbers() { // getter // type!! int[] 자체를 타입으로 보기!!
		return this.numbers;
	}
	public void setNumbers(int[] numbers) { //setter // int[] 배열 객체의 주소값을 가진다
		this.numbers = numbers;
	}
	
	// ArrayList elist getter, setter
	// public List getElist(){}
	public ArrayList getElist() {
		return this.elist;
	}
	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
	
}
public class Ex04_ArrayList {

	public static void main(String[] args) {
		EmpData empdata = new EmpData();
		System.out.println(empdata.toString()); // 재정의 안해서 주소값 나옴: EmpData@626b2d4a
		System.out.println(empdata.getElist().toString()); // 재정의 >> []
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		
		empdata.setElist(li);
		System.out.println(empdata.getElist().toString()); // [100, 200]
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("superman");
		slist.add("Hulk");
		slist.add("Captain");
		System.out.println(slist.toString()); //[superman, Hulk, Captain]
		
		ArrayList<Integer> intList = new ArrayList<Integer>(20);
		System.out.println(intList.size());  //0
		System.out.println(intList.add(100)); //true 정상적으로 처리 되었어
		System.out.println(intList.size());  //1

	}

}
