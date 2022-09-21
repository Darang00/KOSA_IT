
public class ArrayCreatByValuableListEample1 {

	public static void main(String[] args) {
		int [] scores = {40, 70, 100, 69, 49, 95, 96};
		
		System.out.println("score[0] : " + scores[0]); // the variable of scores on index [0] in the array
		System.out.println("score[1] : " + scores[1]); // the variable of scores on index [1] in the array
		System.out.println("score[2] : " + scores[2]); // the variable of scores on index [2] in the array
		System.out.println("score[3] : " + scores[3]); // the variable of scores on index [3] the array
		System.out.println("score[4] : " + scores[4]); // the variable of scores on index [4] the array
		System.out.println("score[5] : " + scores[5]); // the variable of scores on index [5] the array
		System.out.println("score[6] : " + scores[6]); // the variable of scores on index [6] the array
		
		int sum = 0;
		for(int i = 0; i<3; i++) { 
			sum += scores[i];
		}
		
		System.out.println();
		System.out.println("The total count is : " + sum); 
		System.out.println("The calculated mean is : " + sum/scores.length);
		

	}

}
