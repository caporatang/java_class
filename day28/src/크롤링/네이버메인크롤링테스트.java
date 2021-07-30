package 크롤링;

import java.io.IOException;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링테스트 { // tag가 담긴 arraylist = elements(다수) , element(하나)

	
		//html = document
		//tag = element
		// tag가 여러개인 것이 elements
	
	
	public static void main(String[] args) {
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("http://www.naver.com").get();
			System.out.println("1. 사이트 연결 성공");
			System.out.println("2. 소스 받아오기 성공");
			//System.out.println(doc);
			//Element: tag
			//Element: tags
			Elements list = doc.select("a.nav"); // a.은 태그명이다.
			System.out.println(list.size());
			//System.out.println(list);
			
			for (Element tag : list) {
				System.out.println(tag.text()); // <a> text </a>  <a> 태그 사이에 있는 text가 찍힌다
			}
		Element aTag0 = list.get(0);  // 엘레먼츠는 어레이리스트를 상속했기 때문에 a태그를 atag0에 넣어놓고
		Elements list2 = aTag0.select("i"); // a태그 중에서 i를 끼고 있는 클래스를 선택해서 list2에 넣어주고 
		System.out.println(list2.get(0)); // list2 를 출력한다 
		
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
