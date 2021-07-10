package 문제풀이;

import javax.swing.JOptionPane;

public class 게시물등록 {

	public static void main(String[] args) {
			BbsDB db = new BbsDB();
			
			String cre = JOptionPane.showInputDialog("게시물의 제목을 입력하세요");
			
			db.create(cre);
			
			
			
			

	}

}
