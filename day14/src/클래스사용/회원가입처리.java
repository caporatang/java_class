package 클래스사용;

import javax.swing.JOptionPane;

public class 회원가입처리 {

	public static void main(String[] args) throws Exception {
		MemberDB lo = new MemberDB();
		String id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요");
		
		lo.create(id, pw, name, tel);
		
		

	
		
		
		
		

	}

}
