package ch12;

public class CharAt {
	public static void main(String[] args) {
		System.out.println((long) Math.pow(2, 38));
		String str = "rpylqjyrc";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			System.out.print((char) (c + 2));
		}
	}
}