package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 만든문제풀어보기 {

	public static void main(String[] args) {
//      Q2.
//      수업시작 몇일째인지 입력:8일
//      오늘은 수업을 시작한지 몇일째인가요? 
//
//      수업시작한지 10일 미만 :이제 시작
//      수업시작한지 70일 미만:절반왔네요
//      수업시작한지 150일 미만:거의 다왔어요
		
		
		
		String c = JOptionPane.showInputDialog("수업 시작한지 며칠 됐는지 입력하세요");
			int c2 = Integer.parseInt(c);
			
			System.out.println(c2 + "일 차 수업입니다.");
			
			
			Date date = new Date();
			
			int b = date.getDate();
			
			int b1 = c2 - b;
		
		if (b1 < 10) {
			System.out.println("이제 시작");
		} else if (b1 < 70) {
			System.out.println("절반 왔네요");
		} else if (b1 < 150) {
			System.out.println("거의 다 왔어요.");
		} else {
			System.out.println("힘내세요");
		}
		

	}

}
