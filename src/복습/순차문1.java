package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 : 입력 -> 처리-> 출력의 순서
		// 1.입력 , 해결방법 제시 : 마우스를 가져다 놓거나 , 해결방법이 안뜰경우에 클릭하고 f2, 마지막 글자를 지우고 다시 자동완성.
		// 모든 입력데이터는 컴퓨터는 스트링으로 읽어온다!
		// 숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가 결정한다.
		// 숫자로 써야한다면 숫자로 변환하는 처리를 해주어야 한다.
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다.
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?"); // class(부품)은 무조건 시작 대문자
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?"); // 변수는 무조건 소문자

		// 2.처리
		String result = today + "은" + temp + "도" ; 
		// 3.출력
		System.out.println(result);
		
		
		// 현재 알고있는 입력할수 있는 수단은 2가지. swing , Joptionpain

	} // main의 닫는 괄호

} // class의 닫는 괄호
