package ch11;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> list = new ArrayList<>();
		//값 입력
		list.add("A");
		list.add("가");
		list.add("0");
		
		//값 확인
		for(int i =0; i < list.size(); i++) {
			String data = list.get(i);
			System.out.println(data);
		}			

	}
}
