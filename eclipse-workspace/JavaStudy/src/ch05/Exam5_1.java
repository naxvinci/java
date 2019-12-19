package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String sep = "";
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(sep + arr[i]);
			sep = ",";
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) { // ÀÎµ¦½º°¡ Â¦¼öÀÎ °Í
				System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			if (value % 2 == 1) { // È¦¼ö
				System.out.println(arr[i]);
			}
		}
	}
}