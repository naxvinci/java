package ch04;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {

		System.out.println("0~2 사이의 숫자를 입력하세요");
		Scanner s = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue) {
			int me = s.nextInt();

			Random r = new Random();
			int com = r.nextInt(3); // 0~2 숫자가 랜덤으로 출력

			if ((me + 1) % 3 == com) {
				System.out.println("상대방 이김");
			} else if (me == com) {
				System.out.println("비김");
			} else {
				System.out.println("내가 이김");
				isContinue = false;
			}
			// 1= 가위 2= 바위 3=보
		}
	}
}
