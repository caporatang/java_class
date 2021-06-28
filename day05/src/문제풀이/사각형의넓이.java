package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {
		//사각형의 넓이를 구하자
		//가로크기 세로크기 입력
		// 사각형의 넓이는 **입니다.
		
		String a1 = JOptionPane.showInputDialog("가로를 입력하세요.");
		String a2 = JOptionPane.showInputDialog("세로를 입력하세요.");
		
		int b1 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(a2);
		
		int b3 = b1 * b2;
		
		JOptionPane.showMessageDialog(null, b3);
		
		
		

	}

}
