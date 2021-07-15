package db연결;

import javax.swing.JOptionPane;

public class 회원검색처리 {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("삭제할 아이디 입력");
		
		MemberDAO de = new MemberDAO();
		String[] result = de.read(id);
		System.out.println("검색된 id는 " + result[0]);
		System.out.println("검색된 pw는 " + result[1]);
		System.out.println("검색된 name은 " + result[2]);
		System.out.println("검색된 tel은 " + result[3]);
		// 라벨 변수명. settext(result[0])
		//b1.setText(result[1])
	}

}
