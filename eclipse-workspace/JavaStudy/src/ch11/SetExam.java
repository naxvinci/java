package ch11;

import java.util.HashSet;

public class SetExam {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Integer i = 1;
		Short s = 1;
		Character c = 'c';
		Long l = 100L;
		Float f = 10.0f;
		Double d = 10.0d;
		Byte b = 10;
		Boolean bb = true;

		set.add(5);
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(21);
		set.add(22);
		System.out.println(set);
	}
}
