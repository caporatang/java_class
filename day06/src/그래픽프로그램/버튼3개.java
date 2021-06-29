package 그래픽프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); // ()안에는 제목이 들어간다.
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); // 레이아웃을 지정하지 않으면
		
		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
					
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton.setBounds(85, 19, 295, 96);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피 *");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피 * ");
					
				}
			}
		});
		btnNewButton_1.setBounds(85, 127, 295, 96);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("커피 * 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i <= 3; i++) {
					System.out.println("커피 * 우유 ");
					
				}
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		btnNewButton_2.setBounds(85, 241, 295, 96);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("1:짱!");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 4; i++) {
					System.out.println(i + " : 짱!");
					
				}
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1_1.setBounds(85, 349, 295, 96);
		f.getContentPane().add(btnNewButton_1_1);
		//내가 넣고 싶은 위치에 넣을 수 있다.
		
		f.setVisible(true);
		
	}
}
