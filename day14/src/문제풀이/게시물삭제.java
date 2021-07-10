package 문제풀이;
import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		BbsDB db = new BbsDB();
		
		String del = JOptionPane.showInputDialog("삭제하실 게시물 제목을 입력하세요");
		
		db.delete(del);
		
		

	}

}
