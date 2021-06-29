package 그래픽프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); // ()안에는 제목이 들어간다.
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null); // 레이아웃을 지정하지 않으면
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(6, 211, 474, 255);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 483, 199);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		f.setVisible(true);
		
	}
}
