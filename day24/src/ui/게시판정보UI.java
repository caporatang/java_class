package ui;

import java.util.Scanner;

import javax.swing.JOptionPane;

import db.게시판DAO;
import db.회원DAO;
import db.회원DAO2;
import dto.게시판Bag;
import dto.회원bag;

public class 게시판정보UI {

	public static void main(String[] args) { 
		//1. 게시판 정보를 입력 받아서
		//2. 가방을 만들어서, 입력받은 데이터를 넣는다.
		//3, dao를 만들어서, dao에게 create기능을 호출(가방을 전달)
		//4. 확인
		String title = JOptionPane.showInputDialog("제목을 입력하세요");
		String writer = JOptionPane.showInputDialog("닉네임을 입력하세요");
		String content = JOptionPane.showInputDialog("내용을 입력하세요");
		
		게시판DAO dao = new 게시판DAO();
		게시판Bag bag = new 게시판Bag();
		
		bag.setWriter(writer);
		bag.setTitle(title);
		bag.setContent(content);
		
		
		System.out.println(bag);
		
		
		
		
	}

}
