package 조건문;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			//++ -- 증감 연산자 , RAM의 변수값을 1씩감소/증가시켜주는 처리 연산자.
			//for(시작값; ,조건식; 증감식) 순서로 구성이 된다.
			//for (int i = 0; i < 3; i=i+1) {
			// 유한적으로 반복할땐 세가지가 필요함 int i = 0 (변수 > i)
			//	i++ i-- 는 1씩 늘거나 줄거나 할때만 사용한다. 
			
			
			
			// 1. 입력
			// 입력을 데이터 입력을 받아서 처리해보세요.!
			String score = JOptionPane.showInputDialog("당신의 점수를 입력하세요.");

			int jumsu = Integer.parseInt(score);
			// String > int로 변환해서 , jumsu에 넣어주면 된다.

			// 2. 처리
			String result = null; // 선언 : 램에 공간이 할당된다.
			// 처음에 공간을 할당할 때 쓰레기값이 들어있는 공간이 할당이 됨.
			// 쓰레기값은 프린트도 안되고, 연산도 불가능
			// 변수(공간)를 깨끗하게 하는 작업을 초기에 해두는 것이 좋다.
			// 변수의 초기화

			if (jumsu >= 90) {
				result = "A학점";
			} else if (jumsu >= 80) {
				result = "b학점";
			} else if (jumsu >= 70) {
				result = "c학점";
			} else {
				result = "F학점";
			}

			// 3, 출력
			System.out.println("당신의 학점은" + result);
		} // for

	} // main

} // class
