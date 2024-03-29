package ch05;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		char[] arr = { 'r', 't', 'a', 'b', 'w' };
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				char second = arr[j];
				if (arr[i] > second) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
	}
}
