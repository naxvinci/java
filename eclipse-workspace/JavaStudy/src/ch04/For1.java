package ch04;

public class For1 {
	public static void main(String[] args) {
		for(int i = 1; i <=5; i = i + 1) {
			System.out.println(i);
		}
		
		int i = 1;
		for( i = 1; i <=5; i = i + 1) {
			System.out.println(i);
		}
		System.out.println(i);
		
		for( ; ; ) {
			System.out.println(i);
		}
	}
}
