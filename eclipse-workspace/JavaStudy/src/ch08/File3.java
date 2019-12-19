package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File3 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("c://dev/text.txt");
		FileOutputStream out = new FileOutputStream("c://dev/test2.bin");
		while (true) {
			int data = in.read();
			System.out.println(data);
			System.out.println((char) data);
			if (data == -1)
				break;
			out.write(data);

			System.out.println((char) data);
		}
	}
}
