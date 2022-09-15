import java.util.ArrayList;

//�������̴ϱ�...
class EmpData{
	private String name; //default ��: null (string �� Ŭ������)
	private int[] numbers; // ���� Ÿ���� �迭�� ���� �� �ִ� //default: null
	private ArrayList elist; // �߿� //default: null
	
	//�ʱ�ȭ (private �ڿ��� ������ �� �ִ� getter  , setter �����)
	public EmpData() {
		this.name = "�ƹ���";
		//����ڰ� ���� Ÿ��, Array, ArrayList >> �ʱ�ȭ > �޸� (new�� ���ؼ�) >
		this.numbers = new int[10];
		this.elist = new ArrayList();
		
	}
	public String getName() { //getter
		return this.name;
	}
	public void setName(String name) { //setter
		
	}
	
	//int[] numbers �� getter, setter (���� Ÿ���� �ּҰ��� return �ϰ�, �ް�)
	public int[] getNumbers() { // getter // type!! int[] ��ü�� Ÿ������ ����!!
		return this.numbers;
	}
	public void setNumbers(int[] numbers) { //setter // int[] �迭 ��ü�� �ּҰ��� ������
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
		System.out.println(empdata.toString()); // ������ ���ؼ� �ּҰ� ����: EmpData@626b2d4a
		System.out.println(empdata.getElist().toString()); // ������ >> []
		
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
		System.out.println(intList.add(100)); //true ���������� ó�� �Ǿ���
		System.out.println(intList.size());  //1

	}

}
