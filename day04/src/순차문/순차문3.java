package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// 숫자 1 입력 : 333
		// 숫자 2 입력 : 222
		// 두 숫자를 정수로 변환해서 더하기의 결과 출력 , 빼기 결과 출
		
		
		String num = JOptionPane.showInputDialog("숫자 1의 값은?");
		String num2 = JOptionPane.showInputDialog("숫자 2의 값은?;");
		
		int yes = Integer.parseInt(num);
		int no = Integer.parseInt(num2);
		
		System.out.println(yes + no);
		System.out.println(yes - no);
		
		
		
		
		
		
		

	} // main의 닫는 괄호

} // class의 닫는 괄호
