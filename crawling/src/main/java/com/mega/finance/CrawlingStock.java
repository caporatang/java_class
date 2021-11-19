package com.mega.finance;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component <-- Service, Repository, Controller
@Service
public class CrawlingStock {

	// code를 jsp에서 입력하여
	// controller로 넘겨서 (Controller)
	// 크롤링을 해서, (Sercvice layer, business layer)
	// dao를 쳐서 (model layer)
	// db로 들어가자

	@Autowired
	FinanceDAO dao;

	public void crawl(String code) {
		// 크롤링하여 dao를 이용해서 바로 db처리하자
		// 크롤링하는 과정 다 코딩하면 된다 .
		// dao.insert("finance.create", vo);

		// 1. 연결해라, html을 가지고 와라.
		String url = "https://finance.naver.com/item/main.nhn?code=" + code;
		try {
			Document doc = Jsoup.connect(url).get();
			// System.out.println(doc);
			Elements aList = doc.select(".h_company a");
			// System.out.println(aList.size());
			// System.out.println(aList); // 7개
			System.out.println(aList.get(0).text()); // 7개중에서 첫번째 것. 인덱스 0번

			Elements todayList = doc.select("p.no_today .blind");
			//System.out.println(todayList.get(0).text());

			Elements firstList = doc.select("td.first .blind");
			//System.out.println(firstList.get(0).text());

			Elements highList = doc.select("td.first+td>em>span.blind");
			//System.out.println(highList.get(0).text());

			FinanceDTO dto = new FinanceDTO();
			dto.setCode(code);
			dto.setCompany(aList.get(0).text());
			dto.setToday(todayList.get(0).text());
			dto.setHigh(highList.get(0).text());
			dto.setYesterday(firstList.get(0).text());
			
			dao.insert(dto);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2. 가지고 온 html에서 추출해라.
		// 3. 내가 원하는 형태로 가공(DTO, VO).

	}

}
