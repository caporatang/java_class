package 복습.순차문;

import javax.swing.JOptionPane; // 경로를 알려준다.

public class 입력처리출력 {
	// main + option + space bar
	public static void main(String[] args) {
		// 1. 입력 > 데이터를 가져오는것
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		// hobby - 주소가 들어간다. 기본형이 아니면 4바이트를 차지한다.
		String when = JOptionPane.showInputDialog("언제 하시나요?");
		String time = JOptionPane.showInputDialog("몇시간이나 하시나요?");

		// 2. 처리
		String result = when + "에" + hobby + "을 하시는군요!";
		// Strin -> int로 변환해주는 처리
		// 기본형 -> 기본형은 cpu가 가능.. 다른 경우에는 부품을 사용해줘야한다.

		int time2 = Integer.parseInt(time);
		
		if (time2 >= 3) { //비교 연산자의 결과는 항상 boolean(논리 데이터, true/false)
			//조건이 true일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "많이 하시네요 ");
		
		} else {
			//조건이 false일 때 실행되는 부분 
			JOptionPane.showMessageDialog(null, "보통으로 하셨네요");
			
		}
		// 3. 출력

		JOptionPane.showMessageDialog(null, result);

		// void - 없다 > 끝에 void가 붙는경우에 변수에 저장할수 없음.
		// 명령어에는 소괄호가 항상 붙는다.

	}

}
