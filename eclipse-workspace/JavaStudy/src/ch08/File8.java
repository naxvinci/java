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
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class File8 {
	public static void main(String[] args) throws IOException {
		
		//서버 접속 라이브러리 사용
		URL url = new URL("https://kapi.kakao.com/v1/translation/translate?src_lang=kr&target_lang=en&query=" 
		+ URLEncoder.encode("안녕하세요, 자바 개발자입니다.", "utf-8"));
		URLConnection con = url.openConnection();
		con.addRequestProperty("Authorization", "KakaoAK d4be7b479f4b4cbd99bd19ae87f88b4b");
		
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
		System.out.println(result);
		
	}
}
