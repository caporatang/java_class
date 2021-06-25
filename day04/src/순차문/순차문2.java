package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?"); 

		// 2.처리, 27을 입
		int yes = 28; // 어제 온도
		//int temp2 = Integer.parseInt(temp); // Integer.parseInt > String을 인트로 바꿔준다. parseint(분석해서 바꿔줘.)
		double temp3 = Double.parseDouble(temp);
		
		//int result = yes - temp2;
		double result2 = yes - temp3;
		// 3.출력
		//System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요");
		
		
		

	} // main의 닫는 괄호

} // class의 닫는 괄호
