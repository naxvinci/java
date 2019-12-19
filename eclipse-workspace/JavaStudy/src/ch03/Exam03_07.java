package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;

		int n = 0;
		int total = 0;
		boolean con = true;
		while (con) {
			n = num % 10;
			num = num / 10;
			total = total + n;
		}
		System.out.println(total);
	}
}
