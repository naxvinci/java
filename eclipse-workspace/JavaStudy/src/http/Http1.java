package http;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Http1 {
	public static void main(String[] args) throws IOException {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=641253");
		Document doc = con.get();
		Elements eles = doc.select("#content > .category_tab a");
		for (int i = 0; i < eles.size(); i++) {
			Element ele = eles.get(i); // eles[i]
			String src = ele.text();
			System.out.println(src);
		}

	}
}
