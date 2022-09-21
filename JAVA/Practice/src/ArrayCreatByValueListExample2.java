
public class ArrayCreatByValueListExample2 {

	public static void main(String[] args) {
		int[] scores; // the variable 'scores' which refers the array is initialized by integer type
		scores = new int[] {83, 90, 87}; // New array is created by the variable 'scores' and it has 83, 90, 87 as it's values.
		int sum1 = 0; // local variable sum1 is initialized
		for(int i = 0; i<3; i++){ // variable i is initialized; it repeats conducting {the conducting code} until i is lower than 3; i is increased by one
			sum1 += scores[i]; // sum1 = sum1 + scores[i] // scores[i] == the variable scores of i index in the array
		}
	System.out.println("The total count is " + sum1); //print the total count
	
	int sum2 = add (new int[] {83, 90, 87}); // 
	System.out.println("The total count is " + sum2);
	System.out.println();
	
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i]  ;
		}
	return sum;
	}

}
