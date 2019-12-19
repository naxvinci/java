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

public class File6 {
	public static void main(String[] args) throws IOException {
		
		//서버 접속 라이브러리 사용
		URL url = new URL("http://ggoreb.com/http/json2.jsp");
		URLConnection con = url.openConnection();
		
		InputStream in = con.getInputStream();
		
		//보조 스트림
		InputStreamReader isr = new InputStreamReader(in,"utf-8");
		
		//한 줄 씩 문자열을 가져오기 위해서 사용하는 라이브러리	
		BufferedReader reader = new BufferedReader(isr);
		
		//JSON jar 파일을 다운로드
		String result = "";
		while (true) {
			String data = reader.readLine();
			if(data == null) break;
			result = result + data;
		}
		//Parsing - 
		
		JSONArray arr = new JSONArray(result);
		for(int i =0; i <arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			int age = obj.getInt("age");
			String name = obj.getString("name");
			System.out.printf("%s %s \n", age, name);
		}
		
	}
}
