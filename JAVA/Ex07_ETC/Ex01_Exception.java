/*
 ����
 1. ����(error)  : ��Ʈ��ũ ���, �޸� full, �ϵ���� >> �����ڰ� �ڵ������� �ذ� �Ұ�
 2. ����(exception): �����ڰ� �ڵ��� �Ǽ��� ���ؼ� �߻��Ǵ� �� >> ���� �ڵ带 ã�Ƽ� >> �ڵ带 ���� >> ����
                  >> ���α׷� �����Ͻð� �ƴ϶�... �����... �� �� ���� (�׽�Ʈ....)
                  >> ������ �߻��ϸ� (exception) ���α׷� ���� ���� (���̶�� 500��)
 3. ����ó�� >> ���ܹ߻��� ���� �ڵ带 �����ϴ� ���� �ƴϰ� >> �ϴ� �ӽù������� >> ������ �������
    >> ���α׷��� ���������� ���� ... ó��  >> �ᱹ ����ó���� ���ؼ� ������ ���� �κ��� ã��
    >> �ٽ� �ڵ� ���� >> ����
    
    try{
    	>> ������ �ǽɵǴ� �ڵ� ����
    	>> ������ �߻�(exception)
    } catch(Exception e){
    	>> ������ �߻��� ���� �κ��� �ľ�....
    	>> ó�� (�ڵ带 �����ϴ� ���� �ƴϰ� �����ϴ� ��)
    	>> 1. ������ email
    	>> 2. �α����Ͽ� ��� (��� �߻� ���)
    	>> 3. �ϴ� ������ ���α׷��� ����Ǵ� ���� ���´�
    	>> �ᱹ �����ڰ� ������ �ް� �����ϴ� ���� ��..
    } 
    finally{
    	>> ������ �߻��ϴ�, �߻����� �ʴ� ���������� �����ؾ� �� �ڵ�
    	>> DB �۾� ���� (Ư�� �ڿ��� ���� ����) ����
    }
 
 
 
 */
public class Ex01_Exception {

	public static void main(String[] args) {
		/* System.out.println("main start");
		
		System.out.println(0/0); // java.lang.ArithmeticException: / by zero
		
		System.out.println("main end");
		*/
		System.out.println("main start");
		try {
			System.out.println(0/0);
			//���� ���ܰ� �߻� ... try{}catch() ó�� ���α׷��� ���� ������� �ʾƿ�
			
		
			//Exception Ŭ���� ��� (���� Ŭ������ �ֻ��� �θ�
			
			//e ��� ������ ������ �޴� ���ϱ��
			//Exception: Ŭ���� >> e: �ּҰ��� �޴� ����

			// ArithmeticException ������ �߻�
			// �����Ϸ��� ���ؼ� ArithmeticException ��ü�� �����ǰ�
			// �� ��ü���� ������ �Ǵ� �޽���, �ڵ� �����ϸ�...
		}catch(Exception e) { // �θ�Ÿ���� ������ �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ�(������) 
			 //� ���������� �ľ��ϰ� �� ������ ����
			 //������, email, log write
			 System.out.println(e.getMessage());
		 }
		
		System.out.println("main end");
		
		
		

	}

}
