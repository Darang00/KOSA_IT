
public class AlgorismArray3 {

	public static void main(String[] args) {
		int data[] = {88, 50, 65, 80, 25, 65};
		// 60�� �Ѵ� �����͸� �����Ͽ� �հ�, ����, ��� ���ϱ�
		// ����� �Ҽ��� ù °�ڸ����� �ݿø��Ͽ� ����
		
		int len = data.length; // �������� ���̸� len������ ����
		int sum = 0; // �հ踦 ������ ����
		int count = 0; // ������ ������ ����
		
		for(int i = 0; i<data.length; i++) {
			if(data[i] >=60) {
				sum += data[i];
				count++;
			}
		}
		System.out.println("The sum is " + sum);
		System.out.println("The total count is " + count);

	// ����� �Ҽ� ù°�ڸ����� �ݿø��Ͽ� ���
	if(count == 0) {
		System.out.println("There is no valid data");
		}else{
		int avg = (int)((double)sum/count + 0.5);
		System.out.println("The average is " + avg);
		}
	
	// �������� ������ �𸣴� ���-ù ��° �����ͷ� �ʱ�ȭ
			int max = data[0];
			int min = data[0];
		for(int i =0; i<len;i++) {
			//�ִ밪���� �ش� �ε����� �����Ͱ� �� ũ�� �����͸� �ִ밪�� ����
			if(max<data[i]) {
				max = data[i];
			}
			//�ּҰ����� �ش� �ε����� �����Ͱ� �� ������ �� �����͸� �ּҰ��� ����
			if(min>data[i]) {
				min = data[i];
			}
		}
		
		System.out.println("The maximum value is " + max);
		System.out.println("The minimum value is " + min);
		
	// �ִ밪�� ���� �������� �ε����� ã��
	// �ִ밪�� ������ ������ �ִ밪�� �ε����� ������ ���� ����
	// max = 0;
	// int idx = -1;
		
	// �����ϴ� �����ͷ� max ���� �ʱ�ȭ �� ����
	// �ε����� �����ϴ� ������ �ʱ�ȭ �ؾ��Ѵ�.
	max = data[0];
	int idx = 0;
	
	for(int i=0; i<len; i++) {
		if(max<data[i]) {
			max = data[i];
			//�ִ밪�� ����� ���� ��ġ�� idx�� ����
			idx = i;
		}
	}
	System.out.println("The location of the max is "+ idx );
	
	
	// 77�� ���� ����� �� ã��
	// ���� ����� ���� ã�� ���� �Ÿ��� ����ؼ� �Ÿ��� �ּҰ��� ã�ƾ� �Ѵ�.
	// �Ÿ��� ����� ���;� �Ѵ�
	// ���� �˰��򿡼��� �Ÿ��� �����ؼ� ����Ѵ�.
	// �̰� ������ �л��̳� ǥ�������� ������ �Ѵ�.
	min = 100000; // �ּҰ��� ���� ū ������ �ʱ�ȭ
	int distanceMin = 1000000; // �Ÿ��� �ּҰ��� �����ϱ� ���� ����
	idx = -1; // �Ÿ��� �ּҰ��� ��ġ�� �����ϱ� ���� ����
	for(int i =0; i<len; i++) {
		//�Ÿ� ���
		int distance = 77-data[i];
		// �Ÿ��� ������ ����� ��ȯ
		if (distance <0) {
			distance = -distance;
		}
		if(distanceMin>distance) {  
			distanceMin =distance ; // �Ÿ��� �Ÿ��� �ּҰ��� ����
			min = data[i]; // �ε����� i�� ����
			idx = i;
			
		}
	}
	
	System.out.println("The closest value to 77 is " + min);
	
	
////////////////////////////////////////////	
	}
}
