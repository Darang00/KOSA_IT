import java.util.Calendar;
import java.util.Date;

import kr.or.kosa.utils.Edu_Date;

/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
* GregorianCalendar
buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
�±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
�� �ν��Ͻ��� ��ȯ�Ѵ�
GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
�׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
�׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
class MyApp{
static void main(){
Calendar cal = new getInstance();
�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
API : ������ Protected Calendar() 
*/

public class Ex09_Calendar {

	public static void main(String[] args) {
		Date dt = new Date(); //Date: ��¥�� ǥ���ϴ� ��ü (old version)
		System.out.println(dt.toString());
		//Wed Sep 14 16:46:14 KST 2022
		
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance(); //�� Calendar�� new ���ϰ� �ٷ� ����: Calendar�� �߻�Ŭ���� //�Ź���
		//Calendar�� �߻�Ŭ����
		System.out.println(cal.toString());
		//����� �ʿ��� ������ �����ؼ� �����ϼ���
		//java.util.GregorianCalendar[time=1663142191238,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=257,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=56,SECOND=31,MILLISECOND=238,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		System.out.println("�� : " + (cal.get(Calendar.MONTH)+1)); //���� 0�� ���� 11������ ǥ���Ѵ� >> get�Լ��� ������ �� +1 
		System.out.println("�� : " + cal.get(Calendar.DATE));
		
		System.out.println("�� ���� ��°�� : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_WEEK));
		
		//��, ��, ��
		System.out.println("��: " + cal.get(Calendar.HOUR));
		System.out.println("��: " + cal.get(Calendar.MINUTE));
		System.out.println("��: " + cal.get(Calendar.SECOND));
		
		//����, ����
		System.out.println("���� ����: " + cal.get(Calendar.AM_PM));
		
		//�л� ���� �ý���
		//��: ������ �� �� : 200page
		//150page ��¥ ����: �� ������ �ϴܿ� ��� (2022�� 09�� 14��)
		//A ģ��>> cal.get(Calendar.YEAR)) +"��" ...
		//���ڱ� �ؿ� ����..... ��¥ 2022-09-14
		
		//�� ���� �����ؼ� 150�������� ��¥ ���� ���� �Ƿ���
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance(), "-"));
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance(), "/"));
		
		
	}

}
