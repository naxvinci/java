package ch07;

public class Customer {
	public static void main(String[] args) {
		Capsule c = new Capsule();
		//값 입력
		c.m2(10000);
		
		//값 가져오기
		int money = c.get();
	}
}
