package kr.or.kosa;
/*
 Tv ���赵 �䱸���� ����
 Tv�� ä�� ������ ������ �ִ� (���� ��� 1~200 ���� ���� �� �ִ�)
 Tv�� �귣�� �̸��� ������ �ִ� (���� ��� ���� , �Ｚ)
 Tv �� ä�� ��ȯ ����� ������ �ִ� (ä���� �� ä�ξ� �̵��� �����ϴ�)
 Tv�� ä�� ��ȯ ����� ������ �ִ� (ä���� �� ä�ξ� �̵��� �����ϴ�)
 ->ä���� ���� ��Ű�� ����� ������ �ִ�
 ->ä���� ���� ��Ű�� ����� ������ �ִ�
 Tv�� ä�������� �귣���̸��� �� ��(���) �ִ� ����� ������ �ִ�
 */
public class Tv {
	//
	public int ch; // default > 0
	public String brandname; // default > null
	
	public void ch_Up() {
			ch++;
	}
	
	public void ch_Down() {
		ch--;
}
	
	public void tvInfo() {
		System.out.printf("[%s], [%d] \n", brandname, ch);
	}
	

}
