package ch06;

public class Exam6_1 {
	// plus �޼ҵ� �ۼ�
	int plus(int a, int b) {
		return a + b;
	}
	// minus �޼ҵ� �ۼ�
	int minus(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Exam6_1 e = new Exam6_1();

		int result1 = 0;
// result1 ������ plus �޼ҵ� ȣ�� ��� ����
		result1 = e.plus(5, 3);
		System.out.println(result1);
// plus �޼ҵ� ȣ�� ��) xx.plus(5, 3);
		int result2 = 0;
// result2 ������ minus �޼ҵ� ȣ�� ��� ����
		result2 = e.minus(5, 3);
		System.out.println(result2);
// minus �޼ҵ� ȣ�� ��) xx.minus(5, 3);
	}
}
