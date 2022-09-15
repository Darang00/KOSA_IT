package kr.or.kosa.utils;

import java.util.Calendar;

//�� ���赵�� ��� ����� �� ���ұ�
//��¥�� �����ϴ� �Լ��� ���� ���ſ�... ���ϰ� ���� �;�� >> static
//static .... �̸� ....overloading >> �ϳ��� �̸��� �̿��ؼ� ������ ����� �� �ְ�
public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + 
				(date.get(Calendar.MONTH) +1)+ "��" + 
				date.get(Calendar.DATE) + "��";
	}
	
	public static String DateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR) + opr + 
				(date.get(Calendar.MONTH) +1)+ opr + 
				date.get(Calendar.DATE) ;
	}
	
	//�䱸����
	//2020-09-14
	//1~9 >> 01, 02, .... 09
	//10, 11, 12 >> �״��
	public static String monthFormat_DateString(Calendar date) {
		String month="";
		if((date.get(Calendar.MONTH)+1) < 10) {
			month="0" + (date.get(Calendar.MONTH)+1);
		}else {
			 month = String.valueOf((date.get(Calendar.MONTH)+1));
		}
		return  date.get(Calendar.YEAR) + "��" + 
				month + "��" +
		        date.get(Calendar.DATE) + "��";
	}
}