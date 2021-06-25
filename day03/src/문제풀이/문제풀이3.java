package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이3 {

	public static void main(String[] args) {
		// 2. 내 현재 나이를 변수에 저장 100
		// 내 내년 나이를 계산하고 출력
		// 내 내년 나이가 100세를 넘으면 "이제부터 시작", 아니면 "아직 젊어요"
		
		int age = 100;
		int age2 = 100+1;
		JOptionPane.showMessageDialog(null, age2);
		if (age2 > 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작");
		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요");

		}
	
	}

}
