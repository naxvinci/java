package ch04;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {

		System.out.println("0~2 ������ ���ڸ� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue) {
			int me = s.nextInt();

			Random r = new Random();
			int com = r.nextInt(3); // 0~2 ���ڰ� �������� ���

			if ((me + 1) % 3 == com) {
				System.out.println("���� �̱�");
			} else if (me == com) {
				System.out.println("���");
			} else {
				System.out.println("���� �̱�");
				isContinue = false;
			}
			// 1= ���� 2= ���� 3=��
		}
	}
}
