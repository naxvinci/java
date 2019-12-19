package ch04;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// 1번 Random 클래스
		Random r = new Random(); //import
		r.nextInt(10); //랜덤의 범위 지정
		int lotto1 = r.nextInt(45) + 1; // 1 ~ 45
		
		// 2번 math/ Random() 메소드(함수)
		Math.random(); // 0.0 <= X <1.0
		int lotto2 = (int)(Math.random() * 45) + 1;
		System.out.println(lotto1);
		System.out.println(lotto2);
	}
}
