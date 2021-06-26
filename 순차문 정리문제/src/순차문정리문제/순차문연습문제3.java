package 순차문정리문제;

import javax.swing.JOptionPane;

public class 순차문연습문제3 {

	public static void main(String[] args) {
		//구매 금액 : 5000
		// 당신은 vip입니까? yes/no
		//구매금액이 3000원 이상이면 "감사합니다"
		//아니면 "다음에 더 많은 구매를 부탁드립니다."
		// vip이면, 구매금액에서 1000월을 할인하여 결제 , 아니면 구매금액 모두 결제.
		
		String price = JOptionPane.showInputDialog("구매금액");
		String q = JOptionPane.showInputDialog("당신은 vip입니까?");
		
		String hi = "yes";
		
		if (q.equals(hi)) {
				JOptionPane.showMessageDialog(null, "1000원 할인 해드릴게요.");
		} else {
			JOptionPane.showMessageDialog(null, "구매금액 그대로 결제하세요.");
		}
		
		
		int price2 = Integer.parseInt(price);
		
		
		if (price2 >= 3000) {
				JOptionPane.showMessageDialog(null, "구매 감사합니다.");
		} else {
			JOptionPane.showMessageDialog(null, "다음에 더 많은 구매를 부탁 드립니다.");
		}

	}

}
