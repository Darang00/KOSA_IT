import kr.or.kosa.Fclass;

public class Ex02_Method_Call {
	public static void main(String[] args) {
		//Fclass�� ���� ... �޸𸮿� �÷��� �Ѵ� ... ��ü ����
		Fclass fclass = new Fclass();
		fclass.m();//ȣ���ߴ� ���� �̸��� �ҷ� �־���� (call)
		
		fclass.m2(1000);
		int result = fclass.m3(); 
		System.out.println("m3 �Լ� ȣ��� �������� �� :" + result);
		
		int result2 = fclass.m4(555);
		System.out.println("m4 �Լ� ȣ��� �������� �� :" + result2);
		
		result2 = fclass.sum(100, 200, 300); 
		System.out.println("sum �Լ� ȣ��� �������� �� :" + result2);
		
		fclass.callSubSum(); // callSubSum �Լ��� void���� Ÿ�� �Ƚᵵ ��
		
		result2= fclass.opSum(-10);
		System.out.println("opSum �Լ� ȣ��� �������� �� :" + result2);
		
		int result3 = fclass.max(10, 5);
		System.out.println("max �Լ� ȣ��� �������� �� :" + result3);
		
		
		
		
	}

}
