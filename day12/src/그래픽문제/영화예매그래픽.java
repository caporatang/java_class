package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {
		//인덱스에는 인트밖에 오지 못함
		
		JFrame f = new JFrame("영화 예매 그래픽버전");
		f.setSize(800, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200]; //{0,0,0,0,0...}
		
		for (int i = 1; i < 200; i++) {
			JButton b = new JButton(i + ""); // String.valueOf(0);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) { 
					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1;				
					JOptionPane.showMessageDialog(f, index + "번 예약됨.");
					
					b.setEnabled(false);
					b.setBackground(Color.red);

					b.setOpaque(true);
					b.setBorderPainted(false);
				}
			});
			f.add(b);
			
		}
		
		JButton b2 = new JButton("<<<<<<<< 결 제 하 기 >>>>>>>>>");
		f.add(b2);
		b2.setBackground(Color.yellow);
		b2.setOpaque(true);
		b2.setBorderPainted(false);

		//결제하기 버튼을 누르면 
		//1) 배열안에 1이 몇개인지 세서 
		//2) 금액 10000원씩 계산 후에 결제 금액이 얼마인지
		//3) 몇번 좌석을 예약 했는지 출력해주세요
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				final int MONEY = 10000;
				String sum = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";
					}
				}
				int total = count * MONEY;
				JOptionPane.showMessageDialog(f, "총 결제금액은 " + total + "원 입니다 ");
				JOptionPane.showMessageDialog(f, "당신이 에약한 좌석은: " + sum + "입니다");
				
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
		
		
		

	}

}
