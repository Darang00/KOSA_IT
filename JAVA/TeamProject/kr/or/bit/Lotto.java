package kr.or.bit;

////////////6개의 중복이 안되는 난수 추출

public class Lotto {
	
	
	static int randomnum() { //난수 생성 메소드
		return (int) (Math.random() *45)+1; // 
	}
	
	
		
	static boolean verify(int[] copy, int num) { //Checking overlapped value method verify
		for (int i = 0; i < copy.length ; i ++) { //Repeating uppor checking until the 6 randomnumber is out
			if (num == copy[i] ) { 
				return false;
			} 
		} return true;
	}
	 
	
	
	
	
//Conducting//////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		
		// Checking randomnum 1~45
		int num = randomnum(); 
		/* Lotto lotto = new Lotto();
		System.out.println(lotto.num);*/ //
		
		// Creating array object having length of 6
		int[] lottery = new int[6];
		
		for (int i = 0; i <lottery.length ; i++) {
			while (true) { //Just reapting without any conditions(Infinite loop)
				num = randomnum();
				
				if (verify(lottery, num)) { //if this condition is true, conducting code proceeds.
					lottery[i] = num;
					break;}
					// if upper condition is false, out of this conducting code is proceeded.
				}
				
				System.out.print(lottery[i] + " ");
			} 
			
		System.out.print(" ");
		
		} 
		
		
		
		
		
		
	}
	
	
	



