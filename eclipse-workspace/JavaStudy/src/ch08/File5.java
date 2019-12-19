package ch08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class File5 {
	public static void main(String[] args) throws IOException {
		
		//���� ���� ���̺귯�� ���
		URL url = new URL("http://ggoreb.com/http/json1.jsp");
		URLConnection con = url.openConnection();
		
		InputStream in = con.getInputStream();
		
		//���� ��Ʈ��
		InputStreamReader isr = new InputStreamReader(in,"utf-8");
		
		//�� �� �� ���ڿ��� �������� ���ؼ� ����ϴ� ���̺귯��	
		BufferedReader reader = new BufferedReader(isr);
		
		//JSON jar ������ �ٿ�ε�
		String result = "";
		while (true) {
			String data = reader.readLine();
			if(data == null) break;
			result = result + data;
		}
		
		JSONObject obj = new JSONObject(result);
		String name = obj.getString("name");
		int age = obj.getInt("age");
		System.out.println(name);
		System.out.println(age);
		
	}
}
