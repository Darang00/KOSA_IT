
public class BubbleSort {
	
	static int a[] = {8, 3, 7, 5, 4, 2};

	public static void bubblesort(int[] a){
		bubblesort(a,a.length);
		
	}

	private static void bubblesort(int[] a2, int size) {
		// round는 배열의 크기 -1 만큼 진행됨
		for(int i = 1; i<a.length;i++) {
			
			boolean swapped = false;
			// 각 round별 진행 횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j<size-1; j++) {
				/*
				 현재 원소가 다음 원소보다 클 경우
				 서로 원소의 위치를 교환한다
				 */
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					swapped = true;
				}
			}
			
			/*
			 만약 swap된 적이 없다면 이미 정렬되었다는 의미이므로 반복문을 종료한다
			 */
			if (swapped == false) {
				break;
			}
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
