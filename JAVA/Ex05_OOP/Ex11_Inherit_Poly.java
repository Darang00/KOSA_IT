class Pbase{
	int p = 100;
}
class Cbase extends Pbase{
	int c = 200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		Pbase p = cbase; // ������
		// ��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�. >> "������"
		
		Dbase dbase = new Dbase();
		
		p = dbase; //�������� ����
		System.out.println(p.toString());
		
		Cbase c = (Cbase)p; // downcasting ( �θ� -> �ڽ� Ÿ������ )
		
	}

}
