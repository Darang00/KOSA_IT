import java.text.DecimalFormat;
import java.text.MessageFormat;

//���� formating
public class Ex11_Format_ETC {

	public static void main(String[] args) {
		double money = 123456.5678;
		DecimalFormat df1 = new DecimalFormat("0.0"); //123456.6 �ݿø�
		System.out.println(df1.format(money));
		
		DecimalFormat df2 = new DecimalFormat("0"); //123457 �ݿø�
		System.out.println(df2.format(money));
		
		DecimalFormat df3 = new DecimalFormat("0.000000000000");
		System.out.println(df3.format(money));
		
		DecimalFormat df4 = new DecimalFormat("#.###########");
		System.out.println(df4.format(money));
		
		String userId = "kdlim";
		String userName = "ȫ�浿";
		String userTel = "010-111-11121";
		String message = "ȸ�� Id :{0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ��ȣ : {2}";
		String result = MessageFormat.format(message, userId, userName, userTel);
		
		//printf()�� ���� ����
		System.out.println(result);

	}

}
