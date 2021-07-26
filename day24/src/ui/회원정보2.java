package ui;

import javax.swing.JOptionPane;

import db.회원DAO;
import db.회원DAO2;
import dto.회원bag;

public class 회원정보2 {

	public static void main(String[] args) { 
		String id = JOptionPane.showInputDialog("회원가입 id 입력");
		String pw = JOptionPane.showInputDialog("회원가입 pw 입력");
		String name = JOptionPane.showInputDialog("회원가입 name 입력");
		String tel = JOptionPane.showInputDialog("회원가입 tel 입력");

		// 가방에 집어 넣을때는 set, 가방에서 꺼낼때는 get을 사용한다.
		회원DAO2 dao2 = new 회원DAO2();
		회원bag bag = new 회원bag(); // 1.가방을 만들어라.
		bag.setId(id); // 2.가방에 넣어라
		bag.setName(name);
		bag.setPw(pw);
		bag.setTel(tel);
		
		dao2.create(bag); // 3. dao에 가방 전달 .
		//4. dao에서 get으로 꺼내서 처리한다.
		
		System.out.println("dao의 create()하고 연이어 실행됨.");
		
		
		
		
		
		
		
	}

}
