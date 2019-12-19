package ch05;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 0, 4 };
		int min = Integer.MAX_VALUE; //int의 최대 숫자
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("최소값 : " + min);
	}
}