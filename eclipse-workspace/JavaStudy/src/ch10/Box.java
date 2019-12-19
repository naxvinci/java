package ch10;

import java.util.ArrayList;

public class Box {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(11);
		list.add("22");
		list.add(true);
		
		int item = (int)list.get(0);
		System.out.println(item);
	}
}
