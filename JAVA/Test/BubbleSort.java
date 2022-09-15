
public class BubbleSort {
	
	static int a[] = {8, 3, 7, 5, 4, 2};

	public static void bubblesort(int[] a){
		bubblesort(a,a.length);
		
	}

	private static void bubblesort(int[] a2, int size) {
		// round�� �迭�� ũ�� -1 ��ŭ �����
		for(int i = 1; i<a.length;i++) {
			
			boolean swapped = false;
			// �� round�� ���� Ƚ���� �迭 ũ���� ���� ���带 �� ��ŭ ����
			for(int j = 0; j<size-1; j++) {
				/*
				 ���� ���Ұ� ���� ���Һ��� Ŭ ���
				 ���� ������ ��ġ�� ��ȯ�Ѵ�
				 */
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					swapped = true;
				}
			}
			
			/*
			 ���� swap�� ���� ���ٸ� �̹� ���ĵǾ��ٴ� �ǹ��̹Ƿ� �ݺ����� �����Ѵ�
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
