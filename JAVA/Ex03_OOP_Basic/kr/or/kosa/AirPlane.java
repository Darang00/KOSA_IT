package kr.or.kosa;

/*
 �츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ��ϴ� ȸ���Դϴ�
 �츮 ȸ��� ����⸦ �����ϴ� ���赵�� ������� �մϴ�
 
 �䱸����
 1. ����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �Ѵ�
 2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο��Ǿ����� Ȯ�� �ϴ� �۾��� �ʿ��ϴ� (���)
 3. �������� ������� ������� ������� �� ��������� Ȯ���� �� �ִ�.
 
 AirPlane air 101 = new Airplane();
 air101 �̸� >> �����װ�
 air101 ��ȣ >> 707
 ����� ���� Ȯ��..
 ....5��
 �����ڰ� ����� ���� ����� Ȯ���� �� �־�� �Ѵ�.... 5�밡 ���۵Ǿ����ϴ�.
 
 ���� ) �����ڸ� ������� ������ (����....)
 
 */

// �����ڸ� ����ؼ� �̻ڰ� �ٲټ���
public class AirPlane {
	 
	private int airnum;
	private String airname;
	private static int airtotalcount; //��� ��ü�� �����ϴ� �ڿ�(�ʵ�)
	



	public AirPlane(int airnum, String airname) {
		this.airnum = airnum; 
		this.airname = airname;
		//airtotalcount �������
		airtotalcount++;
		
		AirDisplay();
		
	}
	
	
	
	private void AirDisplay() {
		System.out.printf("��ȣ[%d], �̸�[%s] \n" , this.airnum, this.airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("�� ����� ���� ��� : [%d] \n", airtotalcount );
		
	}
	

}
