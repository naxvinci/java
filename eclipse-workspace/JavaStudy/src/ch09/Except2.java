package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Except2 {
	static void method() throws FileNotFoundException {
		FileInputStream in = new FileInputStream("c:/dev/text22.txt");
	}

	public static void main(String[] args) {
		method();
	
	}
}
