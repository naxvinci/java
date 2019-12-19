package ch11;

import java.util.HashMap;

public class MapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 1000);
		map.put("key2", 2000);
		map.put("key3", 3000);
		map.put("key4", 4000);
		
		Integer i = map.get("key1");
		int a = map.get("key1");
	}
}
