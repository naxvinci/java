package ch02;

public class Variablee {
	public static void main(String[] args) {
		double value = Math.pow(2, 38);
		System.out.println((int) value);
		System.out.println((long) value);

		int º¯¼ö = 100;

		char ch = 'Z';
		int ch2 = (int) ch;
		System.out.println(ch2);

		char ch3 = (char) (ch2 - 1);
		System.out.println(ch3);
	}
}
