package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		//나이를 입력 : 2
		// 태어난 연도는 2020년 (date이용)
		//태어난 시각 : 10
		//오전에 태어나셨군요(오전, 오후 , 밤 , 새벽)
		
		String age = JOptionPane.showInputDialog("나이를 입력하세영");
		System.out.println(age);
		
		Date date = new Date();
		
		int year = date.getYear() + 1899;
		System.out.println("태어난 년도는" + year +"년" + "입니다" );

		String time = JOptionPane.showInputDialog("몇시에 태어 나셨어요?");
		int time2 = Integer.parseInt(time);
		
		if ( time2 == 10 ) {
			System.out.println("오전에 태어나셨군요.");
		} else if (time2 == 7 || time2 < 7) {
			System.out.println("새벽에 태어나셨군요");
		} else if (time2 == 12 || time2 < 18) {
			System.out.println("오후에 태어나셨군요");
		} else if (time2 == 19 ||time2 > 19) {
			System.out.println("밤에 태어나셨군요");
		} 
		 
		
		
	}

}
