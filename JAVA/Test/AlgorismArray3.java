
public class AlgorismArray3 {

	public static void main(String[] args) {
		int data[] = {88, 50, 65, 80, 25, 65};
		// 60이 넘는 데이터만 추출하여 합계, 개수, 평균 구하기
		// 평균은 소수점 첫 째자리에서 반올림하여 저장
		
		int len = data.length; // 데이터의 길이를 len변수에 저장
		int sum = 0; // 합계를 저장할 변수
		int count = 0; // 개수를 저장할 변수
		
		for(int i = 0; i<data.length; i++) {
			if(data[i] >=60) {
				sum += data[i];
				count++;
			}
		}
		System.out.println("The sum is " + sum);
		System.out.println("The total count is " + count);

	// 평균을 소수 첫째자리에서 반올림하여 출력
	if(count == 0) {
		System.out.println("There is no valid data");
		}else{
		int avg = (int)((double)sum/count + 0.5);
		System.out.println("The average is " + avg);
		}
	
	// 데이터의 범위를 모르는 경우-첫 번째 데이터로 초기화
			int max = data[0];
			int min = data[0];
		for(int i =0; i<len;i++) {
			//최대값보다 해당 인덱스의 데이터가 더 크면 데이터를 최대값에 대입
			if(max<data[i]) {
				max = data[i];
			}
			//최소값보다 해당 인덱스의 데이터가 더 작으면 그 데이터를 최소값에 대입
			if(min>data[i]) {
				min = data[i];
			}
		}
		
		System.out.println("The maximum value is " + max);
		System.out.println("The minimum value is " + min);
		
	// 최대값을 가진 데이터의 인덱스를 찾기
	// 최대값을 저장할 변수와 최대값의 인덱스를 저장할 변수 생성
	// max = 0;
	// int idx = -1;
		
	// 존재하는 데이터로 max 값을 초기화 할 때는
	// 인덱스도 존재하는 값으로 초기화 해야한다.
	max = data[0];
	int idx = 0;
	
	for(int i=0; i<len; i++) {
		if(max<data[i]) {
			max = data[i];
			//최대값이 변결될 때의 위치를 idx에 저장
			idx = i;
		}
	}
	System.out.println("The location of the max is "+ idx );
	
	
	// 77에 가장 가까운 수 찾기
	// 가장 가까운 수를 찾을 때는 거리를 계산해서 거리의 최소값을 찾아야 한다.
	// 거리는 양수만 나와야 한다
	// 실제 알고리즘에서는 거리를 제곱해서 사용한다.
	// 이것 때문에 분산이나 표준편차도 제곱을 한다.
	min = 100000; // 최소값을 아주 큰 값으로 초기화
	int distanceMin = 1000000; // 거리의 최소값을 저장하기 위한 변수
	idx = -1; // 거리의 최소값의 위치를 저장하기 위한 변수
	for(int i =0; i<len; i++) {
		//거리 계산
		int distance = 77-data[i];
		// 거리가 음수면 양수로 변환
		if (distance <0) {
			distance = -distance;
		}
		if(distanceMin>distance) {  
			distanceMin =distance ; // 거리를 거리의 최소값에 대입
			min = data[i]; // 인덱스를 i에 대입
			idx = i;
			
		}
	}
	
	System.out.println("The closest value to 77 is " + min);
	
	
////////////////////////////////////////////	
	}
}
