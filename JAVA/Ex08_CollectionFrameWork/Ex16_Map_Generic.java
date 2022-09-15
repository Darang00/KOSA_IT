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
		return "QuizeInfo [문제=" + question + ", 답안=" + answer + ", 결과=" + result + "]";
	}	
}
public class Ex16_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<String, String>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");
		
		for(int i = 0; i<quiz.size(); i++) {
			//key값들만 가져오는 함수 : keySet()
			Set set = quiz.keySet();
			Object[] obj = set.toArray(); // key의 집합을 배열로 바꾸어서 처리
			//System.out.println(obj.length);
			System.out.println("문제: "+obj[i]); // obj배열 안의 i번째 문제
			//System.out.println(quiz.keySet().toArray()[i]);
		}
	}
}
