package 반복문;

import javax.swing.JOptionPane;

public class 반복문 {

	public static void main(String[] args) {
		// 유한적인 반복문은 대체로 for문을 쓴다.
		// 무한적인 반복문은 while문을 쓴다(무한루프)
		while (true) {
			System.out.println("나는 계속 돌아요");
			String q =JOptionPane.showInputDialog("중단 하실래요x? ");
			if (q.equals("x")) {
				//break;
				System.exit(0);
				
		}

	}

}
}