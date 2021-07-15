package db연결;

import javax.swing.JOptionPane;

public class Reviewtest {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");				
		String pw = JOptionPane.showInputDialog("pw를 입력하세요");				
		String name = JOptionPane.showInputDialog("name을 입력하세요");				
		String tel = JOptionPane.showInputDialog("tel을 입력하세요");				
		
		

		ReviewDAO rv = new ReviewDAO();
		rv.create(id, pw, name, tel);
		
		
		
	}

}
