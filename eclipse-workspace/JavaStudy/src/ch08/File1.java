package ch08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = 
				new FileInputStream("c://dev/text.txt");
		//���� ��Ʈ��
		InputStreamReader isr = new InputStreamReader(in,"utf-8");
		
		//�� �� �� ���ڿ��� �������� ���ؼ� ����ϴ� ���̺귯��	
		BufferedReader reader = new BufferedReader(isr);
		
		
		
		while (true) {
			String data = reader.readLine();
			if(data == null) break;
			System.out.println(data);
		}
	}
}
