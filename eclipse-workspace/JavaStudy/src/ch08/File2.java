package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = 
				new FileInputStream("c://dev/test.bin");
		FileOutputStream out =
				new FileOutputStream("c://dev/test2.bin");
		
		byte[] buffer = new byte[1024];
		
		
		System.out.println("start");
		while(true) {
			int data = in.read(buffer);
			if(data == -1) break;
			out.write(buffer);
		}
		System.out.println("end");
	}
}
