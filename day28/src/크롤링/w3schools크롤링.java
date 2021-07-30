package 크롤링;

import java.io.IOException;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class w3schools크롤링 { // tag가 담긴 arraylist = elements(다수) , element(하나)

	
		//html = document
		//tag = element
		// tag가 여러개인 것이 elements
	
	
	public static void main(String[] args) {
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공");
			System.out.println("2. 소스 받아오기 성공");
			//System.out.println(doc);
			//Element: tag
			//Element: tags
			Elements list = doc.select("a.w3-bar-item");
			//Elements list = doc.select("3topnav > div > div > a:nth-child(5)" );
			
			System.out.println(list.size());
			//System.out.println(list);
			
			//for (Element tag : list) {
			//	System.out.println(tag.text()); // <a> text </a>  <a> 태그 사이에 있는 text가 찍힌다
			//}
		for (int i = 8; i < 18; i++) {
			System.out.println(list.get(i).text());
		} 
		
		
		
		
		
		
		
		
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
