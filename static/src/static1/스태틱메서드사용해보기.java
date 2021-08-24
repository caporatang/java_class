package static1;

import javax.swing.JOptionPane;

public class 스태틱메서드사용해보기 {

	public static void main(String[] args) {
		// 객체를 생성하지 않아도(new로 생성하지 않아도) 
	String age = JOptionPane.showInputDialog("age입력"); 
		int age2 = Integer.parseInt(age);
		
		JOptionPane.showMessageDialog(null, (age2 + 1) +"세");
		System.exit(1);
		

	}

}