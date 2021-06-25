package 순차문;

import javax.swing.JOptionPane;

public class 순차문5 {

	public static void main(String[] args) {
		//내가 먹고 싶은 음식은? 팥빙수
		//친구가 먹고 싶은 음식은? 팥빙수 
		//아하! 나랑 친구랑 같아요!
		//크~! 나랑 친구랑 달라요!
		
		String food = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String food2 = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		String yes = "팥빙수";
		String yes2 = "팥빙수";
		
		System.out.println(food.equals(yes));
		System.out.println(food2.equals(yes2));
		System.out.println(food.equals(yes) && food2.equals(yes2));
		
		if (food.equals(yes) && food2.equals(yes2)) {
				JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
		} else {
			JOptionPane.showMessageDialog(null, "친구가 먹고 싶은 음식은?");
		}
		

	}

}
