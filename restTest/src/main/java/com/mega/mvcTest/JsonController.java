package com.mega.mvcTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

	
	@RequestMapping("jsonResponse1")
	@ResponseBody
	public BookBag json1() {
		//db에서 row 1개를 가지고와서
		// 클라이언트에게 주고 싶은 경우
		BookBag bag = new BookBag();
		bag.setId("naver");
		bag.setName("naver");
		bag.setUrl("http://www.naver.com");
		bag.setImg("resources/img/clock.png");
		return bag;
	}
	
	@RequestMapping("jsonResponse2")
	@ResponseBody
	public List<BookBag> json2() {
		//db에서 row 1개를 가지고와서
		// 클라이언트에게 주고 싶은 경우
		List<BookBag> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			BookBag bag = new BookBag();
			bag.setId("naver" + i);
			bag.setName("naver" + i);
			bag.setUrl("http://www.naver.com" + i);
			bag.setImg("resources/img/clock.png");
			list.add(bag);
		}
		return list;
		
	}
	
	@Autowired
	SkiDAO dao;
	
	@RequestMapping("dbGo")
	public void dbGo(String name, String tel) {
		dao.insert(name, tel);
	}
	
	
	
	
	
	
	
	
} // controller end
