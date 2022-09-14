
public class Ex04_Array_For {

	public static void main(String[] args) {
		/*
		 Today Point
		 for �� >> ���� for��, ������ for��
		 JAVA  : for(Type ������  : �迭 or Collection) {�����}
		 C#    : for(Type ������ in �迭 or Collection) {�����}
		 JavaScript: for(Type ������ in Collection) {�����}
		 */
		
		int[] arr = {5, 6, 7, 8, 9};
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//������...
		for(int value: arr) {
			System.out.println(value);
		}
		
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		for (String str : strarr) {
		System.out.println(str);
		}
	}

}
