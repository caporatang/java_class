package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
		// 생수값 1000 생수구매개수 2,
		//마스크값 2000, 마스크구매개수 3
		//내가 지불해야할
		//생수값 금액은 얼마?
		//마스크값 금액은 얼마?
		//총 지불금액은 얼마?
		
		int water = 1000;
		int mask = 2000;
		
		int water2 = 2;
		int mask2 = 3;
		JOptionPane.showMessageDialog(null, "생수값은 " + (water * water2));
		JOptionPane.showMessageDialog(null, "마스크값은" + (mask * mask2));
		JOptionPane.showMessageDialog(null, "총 지불금액은 " + (water * water2 + mask * mask2));
	}

}
