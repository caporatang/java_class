package 반북문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random(4);
		int target = r.nextInt(100);
		
				while (true) {
			//1.입력 받기 
			String a = JOptionPane.showInputDialog("숫자를 맞춰 주세요.");
			//2.숫자로 변환처리
			int a2 = Integer.parseInt(a);
			
			//3.정답인지 확인한다.
			//4.정답이면, 종료
			//정답이 아니면, 1로 가라. 
			if (a2 == target) {
				JOptionPane.showMessageDialog(null, "정답입니다.");
				//break;// while break!     if는 알아서 멈춤. 
				System.exit(0); // 0값이면 정상종료 나갈땐 System.exit(0);
			} else {
				System.out.println("틀렸습니다.");
				if (a2 > target) {
					System.out.println("너무 큽니다 .");
				} else {
					System.out.println("너무 작습니다..");
					
				}
			}

			
		}//while
				//System.out.println("게임이 모두 종료 되었습니다.");
	}//main

}//class
