package ch04;

import java.io.File;

public class Condition {
	public static void main(String[] args) {
		File file = new File("c:/dev1111");
		boolean exist = file.exists();
		if(exist == true) {
			System.out.println("���� ����");
		} else 
			file.mkdirs();
			System.out.println("���� ����");
			
	}
}
