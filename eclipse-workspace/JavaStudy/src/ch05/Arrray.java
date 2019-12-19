package ch05;

public class Arrray {
	public static void main(String[] args) {
		// 배열 만들기 1
		int[] arr1 = new int[5];

		// 배열 만들기 2
		int[] arr2 = { 5, 6, 7, 8, 9, 10 };

		// 배열 만들기 3
		int[] arr3 = new int[] { 5, 6, 7, 8 };

		int num = arr2[4]; // 9
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
