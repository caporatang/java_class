package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		System.out.println(name + "님 안녕히가세요");
		JOptionPane.showMessageDialog(null, name + "님 안녕히가세요");

		String name1 = JOptionPane.showInputDialog("당신이 있는 호수는?");
		System.out.println(name1 + "입니다 ");

		String name2 = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
		System.out.println(name2 + "을 먹는군요.");
		
		

		// 당신이 있는 강의실 호수는?
		// 당신은 709호에 있습니다.

		// 당신의 점심 메뉴는?
		// 당신은 자장면을 먹는군요.

	}

}
