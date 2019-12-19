package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Except {
	static void method1() {
		method2();
	}
	static void method2() {
		method3();
	}
	static void method3() {
		
		//고의로 예외발생시키기
//		throw new RuntimeException();
	}
	
	
	public static void main(String[] args) {
		method1();
		System.out.println("프로그램 종료");

		
		
		
		
		//		try {
//			FileInputStream in = new FileInputStream("c:/dev/text22.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
