package ch04;

public class Exam4_5 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			
// �ΰ��� �ֻ����� �������� ������ ���� (��1, ��2) ���·� ����ϰ�,
// ���� ���� 10�̸� ������ �����ϴ� �ڵ� �ۼ� (Math.random() �޼ҵ�)
			// �ڵ� �ۼ�
			System.out.printf("(%s, %s)\n" , num1, num2);
			count = count + 1; // count++;
			if(num1 + num2 == 10) {isContinue = false;//Ȥ�� break;�� �ᵵ�� 
			}
		}
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	}
}
