package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		// 코드 작성
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 14 == 0) {
				total = total + i;
			}
		}
		System.out.println(total);
	}
}