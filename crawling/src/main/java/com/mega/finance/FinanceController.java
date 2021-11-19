package com.mega.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FinanceController {
	
	@Autowired
	FinanceDAO dao;
	
	@Autowired
	CrawlingStock stock;
	
	@RequestMapping("crawl.do")
	public void crawl(String code) {
		stock.crawl(code);
	}
	
	
	
	
	@RequestMapping("create.do")
	public void insert(FinanceDTO financeDTO) {
		dao.insert(financeDTO);
	}
	
	
	
	
}
