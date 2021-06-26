package 순차문정리문제;

import javax.swing.JOptionPane;

public class 순차문연습문제2 {

	public static void main(String[] args) {
		// 이름 입력 : 김길동
		// 나이 입력 : 100
		// 소속 입력 : kg
		//김길동의 나이는 100세이고, 소속은 kg입니다.
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		String team = JOptionPane.showInputDialog("당신의 소속 입력하세요.");
		
		JOptionPane.showMessageDialog(null, name + "의 나이는" + age + "이고," + "소속은" + team + "입니다." );
		

	}

}
