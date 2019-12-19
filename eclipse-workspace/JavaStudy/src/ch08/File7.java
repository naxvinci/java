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

public class File7 {
	public static void main(String[] args) throws IOException {
		
		//서버 접속 라이브러리 사용
		URL url = new URL("http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?serviceKey=A2usf4txsthrBPXx7%2FckSjISrlOOF3DRCXlpwxFKcl1KPyvOOWSD%2FUhcapvCkM51AdZOieooIvkMdz2XQCt33w%3D%3D&MobileOS=ETC&MobileApp=AppTest&eventStartDate=20191101&_type=json");
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
		JSONObject obj = new JSONObject(result);
		
		JSONObject response = obj.getJSONObject("response");
		JSONObject body = response.getJSONObject("body");
		JSONObject items = body.getJSONObject("items");		
		JSONArray item = items.getJSONArray("item");
		
		for(int i =0; i <item.length(); i++) {
			JSONObject item2 = item.getJSONObject(i);
			String title = item2.getString("title");
			String addr1 = item2.getString("addr1");
			String firstimage = item2.getString("firstimage");
			System.out.printf("%s %s %s \n", title, addr1, firstimage);
		}
		
	}
}
