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
		
		//���Ƿ� ���ܹ߻���Ű��
//		throw new RuntimeException();
	}
	
	
	public static void main(String[] args) {
		method1();
		System.out.println("���α׷� ����");

		
		
		
		
		//		try {
//			FileInputStream in = new FileInputStream("c:/dev/text22.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
