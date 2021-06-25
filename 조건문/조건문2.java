package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		//int x = 111;
		//int y = 222;
		//x > y면 x가 더 커요.
		//그게 아니면 y가 더 크거나 같아요
		int x = 111;
		int y = 222;
		if (x > y) {
			JOptionPane.showMessageDialog(null, "더 커요");
		} else {
			JOptionPane.showMessageDialog(null, "y가 더 크거나 같아요");
		}

	}

}
