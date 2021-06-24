package 순차문;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
		//순차문은 입력 > 처리 > 출력 
		//오늘은 무슨 요일인가요? 목요일
		//오늘의 날씨는 어떤가요? 더워요
		// 출력은 목요일은 더워
		
		
		String name = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String name1 = JOptionPane.showInputDialog("오늘의 날씨는 어떤가요?");
		JOptionPane.showMessageDialog(null, name + "은" + name1);
		
		
		
		
	}

}
