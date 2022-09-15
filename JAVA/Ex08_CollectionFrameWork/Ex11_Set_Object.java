import java.util.HashSet;
import java.util.Iterator;

class Myclass{
	private int id;
	private String name;
	
	public Myclass() {
		}
	public Myclass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Myclass [학번=" + id + ", 이름=" + name + "]";
	}
	
}

public class Ex11_Set_Object {

	public static void main(String[] args) {
		HashSet<Myclass> hset = new HashSet<Myclass>();
		Myclass mc1 = new Myclass(1, "Abc"); //mc1은 주소값
		Myclass mc2 = new Myclass(2, "Def");
		Myclass mc3 = new Myclass(3, "Asdf");
		
		Myclass mc4 = new Myclass(1, "Abc");
		
		hset.add(mc1);
		hset.add(mc1); //mc1은 주소값인데 똑같으면 add 될까 안될까 //안돼요
		hset.add(mc2);
		hset.add(mc3);
		hset.add(mc4); //가능
		
		System.out.println(hset.toString());
		
		//개선된 for문
		for(Myclass m : hset) {
			System.out.println(m.toString());
		}
		
		Iterator<Myclass> itr = hset.iterator();
		while (itr.hasNext()){
			Myclass mc = itr.next();
			System.out.println(mc.getId() + " / " + mc.getName());
		}
		
		

	}

}
 
