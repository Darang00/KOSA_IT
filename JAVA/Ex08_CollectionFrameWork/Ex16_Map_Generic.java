import java.util.HashMap;
import java.util.Set;

class QuizeInfo{
	//field
	String question;
	String answer;
	String result;

	//default constructor
	
	//override constructor
	public QuizeInfo(String question, String answer, String result) {
		super();
		this.question = question;
		this.answer = answer;
		this.result = result;
	}

	@Override
	public String toString() {
		return "QuizeInfo [����=" + question + ", ���=" + answer + ", ���=" + result + "]";
	}	
}
public class Ex16_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<String, String>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");
		
		for(int i = 0; i<quiz.size(); i++) {
			//key���鸸 �������� �Լ� : keySet()
			Set set = quiz.keySet();
			Object[] obj = set.toArray(); // key�� ������ �迭�� �ٲپ ó��
			//System.out.println(obj.length);
			System.out.println("����: "+obj[i]); // obj�迭 ���� i��° ����
			//System.out.println(quiz.keySet().toArray()[i]);
		}
	}
}
