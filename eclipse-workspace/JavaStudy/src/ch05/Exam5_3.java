package ch05;

import java.util.Random;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		for (int i = 0; i < nums.length; i++) {
			Random random = new Random();
			int ran = random.nextInt(nums.length);
			char temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}

		System.out.println(nums);
	}
}
