package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
//	1 ~ 1000 ������ ���� �� 3�� �����ϰ� �ִ� ���ڸ� ���
			int num = i; // ���� ���� i�� �Ѽ����� �ʰ� ���纻�� num ������ ���� �����ϱ� ����
			while (num > 0) {
				int n = num % 10;
				if (n % 10 == 3) {
					count++;
//					System.out.println(i + ": 3 ����"); //�ٽ� ����� ���� ���� ��� num�� �ƴ϶� i
//					break;
				}
				num = num / 10;
			}
		}
		System.out.println(count);
	}
}