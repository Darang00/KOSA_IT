
public class Ex07_Operation {
public static void main(String[] args) {
		// eodlqdustkswk
		// += , -= , *= , /=
	
		int sum=0;
		sum+=1;//sum = sum +1;
		sum-=1;
		System.out.println("sum : " + sum);
		
		//������ ���� ����
		//����: A+, A-, B+, B-, ...F
		//���� : 94��
		
		//�Ǵܱ��� 90���� �̻����� >> A �ο�
		//�Ǵ� 95�� �̻� >> A+
		//�ƴ϶�� A-
		
		//84 �� ������, �ϴ� 80�� �̻��̴ϱ� > B
		//�Ǵ� 85 �̻� > B+
		//�ƴ϶�� > B-
		
		//if���� ����ؼ� ���� ����� �ϼ���
		
		int score=88;
		String grade="";//A+ , A- �� ��� ����
		System.out.println("����� ������ : " + score);
		
		//if�� ����
		if(score >= 90) {
			grade="A";
		
			grade = (score>=95) ? (grade+="+") :(grade+="-");
			/*���� ������ ���
			 <���� �����ڶ�>
			 (���ǽ�) ? '�� �Ǵ� �����(1)' : '�� �Ǵ� �����(2)' 
			 �� ��, ���ǽ��� "��" �̸� �� �� ó�� �� ���, ���ǽ��� "����'�̸� ������ (2) ó�� �� ��� */
		}else if (score >= 80){
			grade="B";
			if(score >= 85) {
				grade+="+";
			}else {
				grade+="-";
			}
		}else if (score >= 70) {
			grade="C";
			if(score >= 75) {
				grade+="+";
			}else {
				grade+="-";
			}
		}else {
			grade="F";
		}
		
		//
		System.out.println("����� ������ : " + grade);
}
}
		

	


