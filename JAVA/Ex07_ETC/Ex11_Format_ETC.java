import java.text.DecimalFormat;
import java.text.MessageFormat;

//숫자 formating
public class Ex11_Format_ETC {

	public static void main(String[] args) {
		double money = 123456.5678;
		DecimalFormat df1 = new DecimalFormat("0.0"); //123456.6 반올림
		System.out.println(df1.format(money));
		
		DecimalFormat df2 = new DecimalFormat("0"); //123457 반올림
		System.out.println(df2.format(money));
		
		DecimalFormat df3 = new DecimalFormat("0.000000000000");
		System.out.println(df3.format(money));
		
		DecimalFormat df4 = new DecimalFormat("#.###########");
		System.out.println(df4.format(money));
		
		String userId = "kdlim";
		String userName = "홍길동";
		String userTel = "010-111-11121";
		String message = "회원 Id :{0} \n회원 이름 : {1} \n회원 전화번호 : {2}";
		String result = MessageFormat.format(message, userId, userName, userTel);
		
		//printf()와 같은 종류
		System.out.println(result);

	}

}
