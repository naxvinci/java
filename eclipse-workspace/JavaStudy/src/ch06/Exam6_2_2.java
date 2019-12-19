package ch06;

public class Exam6_2_2 {

	int getBetweenSum(int a, int b) {
		int sum = 0;
		int start = a > b ? b : a;
		int end = a > b ? a : b;

		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Exam6_2_2 e = new Exam6_2_2();
		System.out.println(e.getBetweenSum(3, 5));
		System.out.println(e.getBetweenSum(7, 7));
		System.out.println(e.getBetweenSum(5, 3));
		System.out.println(e.getBetweenSum(1, 10));

	}
}

//두 개의 정수 a, b가 입력되었을 때 a 와 b 사이에 속한 모든 정수의 합을 반환하는
//getBetweenSum 메소드 만들기