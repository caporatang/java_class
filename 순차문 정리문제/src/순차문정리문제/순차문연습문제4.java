package 순차문정리문제;

import javax.swing.JOptionPane;

public class 순차문연습문제4 {

	public static void main(String[] args) {
		// 구매항목 : 과자/라면/커피
		// 당신은 vip입니까?
		// 과자라면 어린아이이군요!
		// 라면이면 성인이군요!
		//그것도 아니라면 뭔가를 샀군요!
		//vip이면, 구매금액에서 1000원을 할인하여 결제, 아니면 구매금액 모두 결제
	
		String food = JOptionPane.showInputDialog("구매 항목은?");
		String qas = JOptionPane.showInputDialog("당신은 vip입니까?");
		
		String a1 = "snack";
		String a2 = "noodle";
		String a3 = "coffe";
		String a4 = "yes";
		
		if (food.equals(a1)) {
		JOptionPane.showMessageDialog(null, "어린 아이이시군요!");
		} else if (food.equals(a2)) {
		
			JOptionPane.showMessageDialog(null, "성인이시군요!!");
	
		} else if (food.equals(a3)) {
			JOptionPane.showMessageDialog(null, "성인이시군요!");
		} else {
			JOptionPane.showMessageDialog(null, "무언가를 사셨군요!");
		}
		
		if (qas.equals(a4)) {
			JOptionPane.showMessageDialog(null, "1000원 할인 해드릴게요");
		} else {
			JOptionPane.showMessageDialog(null, "구매금액 모두 결제");
		}
		
		
		
		
		

	}

}
