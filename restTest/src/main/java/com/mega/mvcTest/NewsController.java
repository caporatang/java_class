package com.mega.mvcTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class NewsController {

	@Autowired
	NewsDAO dao;
	
	
	@RequestMapping("newsGo")
	public void newsGo(String title, String link, String date) {
	System.out.println("넘겨받은 값들은" + title + link + date);
		
		
		
		dao.newsInsert(title, link, date);
	}

	
	
}
