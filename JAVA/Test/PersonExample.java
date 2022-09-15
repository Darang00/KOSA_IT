
public class PersonExample {

	public static void main(String[] args) {
	Person p1 = new Person("123456789" , "GildongHong");
	
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	//p1.nation = "nation"; // Error: The final field Person.nation cannot be assigned
	//p1.ssn = "321654987"; // Error: The final field Person.ssn cannot be assigned
	
	p1.name = "SamwonHong";
	System.out.println(p1.name);

	}

}
