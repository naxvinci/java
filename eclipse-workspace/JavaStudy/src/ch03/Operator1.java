package ch03;

import java.util.Scanner;

public class Operator1 {
	public static void main(String[] args) {
		int age = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int num = s.nextInt();
		boolean result = num % 14 == 0;
		System.out.println(result);
	}

}
