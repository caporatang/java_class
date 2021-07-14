package db연결;

import javax.swing.JOptionPane;

public class 회원로그인처리 {

	public static void main(String[] args) throws Exception {
		
	String id = JOptionPane.showInputDialog("아이디를 입력하세요");
	String pw = JOptionPane.showInputDialog("pw를 입력하세요");
	String name = JOptionPane.showInputDialog("name을 입력하세요");
	String tel = JOptionPane.showInputDialog("tel을 입력하세요");
		
	MemberDAO abb = new MemberDAO();
	abb.create(id, pw, name, tel);	
	
		//abb.create(id, pw, name, tel);
		
		
		
	}

}
