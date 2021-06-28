package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속문제 {

	public static void main(String[] args) {
		// 1. 무한 루프를 돌리고
		// 2. 게임 계속 할지 물어보고
		// 3. 답변에 다르게 처리 
		//첫번째 사람 숫자를 입력 : 20 
		//두번째 사람 숫자를 입력 : 10 
		//첫번째 사람 승! // 더 큰 숫자를 낸 사람이 승 !
		
		

		
		
		
		while (true) {
			String data = JOptionPane.showInputDialog("계속하실래요?(0:계속, 1:종료)"); // 데이터를 입력 받는 창을 띄움.
			int data2 = Integer.parseInt(data); //	String으로 받은 data값을 int로 변환 
			
			if (data2 == 1) { // 만약 입력값이 1 이랑 똑같으면 게임을 중지합니다. 라는 메세지를 쓰고 break를 사용해서 루프를 멈춤.
				JOptionPane.showMessageDialog(null, "게임을 중지합니다.");
				break;
				
			} else { // data2 값이 1과 같지 않다면, 게임을 계속합니다. 라는 메세지를 출력한다.
				JOptionPane.showMessageDialog(null, "게임을 계속 합니다.");
				//게임 구현 해주세요.
				String num = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요."); // 변수에 메세지를 띄워서 받은 입력값을 num에 넣음.
				String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요."); // 변수에 메세지를 띄워서 받은 입력값을 num2에 넣음
			
				int c1 = Integer.parseInt(num);   //받은 입력값을 int로 변환해서 c1에 넣음.
				int c2 = Integer.parseInt(num2); // 받은 입력값을 int로 변환해서 c2에 넣음. 
				
				if (c1 > c2) { //조건이 true이면 아래 메세지 출력
					JOptionPane.showMessageDialog(null, "숫자 1이 더 커요 "); // 출력 
				} else if (c1 < c2) { //조건이 true이면 아래 메세지 출
					JOptionPane.showMessageDialog(null, "숫자 2가 더 커요 "); //출력
				} else { //위에 두 조건이 맞지 않으면 아래 메세지 출력 
					JOptionPane.showMessageDialog(null, "무승부 ");//출력 

				}

				
				
				
			} 
		}

	}

}
