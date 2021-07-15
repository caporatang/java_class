package db연결;

import javax.swing.JOptionPane;

public class 회원정보수정 {

	public static void main(String[] args) throws Exception {
		String tel = JOptionPane.showInputDialog("tel 입력");
		String id = JOptionPane.showInputDialog("id 입력");
		
		
		MemberDAO te = new MemberDAO();
		te.update(tel, id);

	}

}
