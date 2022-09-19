/*
 Today Point
 [*��Ӱ���*]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [������] 
 [��Ӱ���]���� [�ڽ�Ŭ����]�� [�θ�Ŭ����]�� �޼���(�Լ�) �� ������ (������ �ٲ�)
 ������: Ʋ�� ��ȭ�� ���� (�Լ��� �̸�, Ÿ��) �ƴϰ� ���븸 ��ȯ {����: �߰�ȣ ���� ���� �͸� ����}

 ����)
 1. �θ�� �Լ� �̸� ����
 2. �θ� �Լ��� parameter�� ����
 3. �θ� �Լ��� return type�� ����
 4. �ᱹ {���� ���� �ȿ� �ڵ常 ���� ����}
 
 */

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
		
	}
	
}
class Point3D extends Point2 {
	int z = 6;
	
	// String get3D... () {} // ���ο� �Լ� �߰�
	// �߰� ... �Լ� ...//
	// Annotation�� Java code������ ������ �� ���� �ΰ����� ������ �����Ϸ��� �������� ������ �� �ִ�
	//@Override �����Ϸ������������� ���� �� �Լ��� ������ �Ǿ����� �����غ� ...
	
	// Spring �� 70%�� Annotation
	
	
	@Override
	String getPosition() {
		return this.x+"/" + this.y + "/" + this.z ;  
	}
}


public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		System.out.println(p.getPosition());
		
		

	}

}