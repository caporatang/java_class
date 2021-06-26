package 순차문정리문제;

import javax.swing.JOptionPane;

public class 순차문정리문제1 {

	public static void main(String[] args) {
		//당신의 취미는 골프
		//당신의 여행지는 제주도
		//당신은 제주도로 골프를 즐기러 간다.
		//처리한 내용 출력
		
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String travel = JOptionPane.showInputDialog("당신의 다음 여행지는?");
		
		JOptionPane.showMessageDialog(null, "당신은" + travel + "로" + hobby + "를 즐기러 간다.");
		

	}

}
