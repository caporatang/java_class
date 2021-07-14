package db연결;

import javax.swing.JOptionPane;

public class 회원아이디탈퇴 {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("삭제할 아이디 입력");
		
		MemberDAO de = new MemberDAO();
		de.delete(id);

	}

}
