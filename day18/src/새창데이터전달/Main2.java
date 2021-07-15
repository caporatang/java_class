package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창...!!! 여기서부터 시작@@");
		f.setSize(500, 500);
		Font font = new Font("궁서", Font.BOLD, 45); // 폰트 부품은 글씨체 , 굵기 , 크기 세개가 들어가야 사용할 수 있다.

		JButton b1 = new JButton("로그인처리");
		b1.setBounds(94, 161, 304, 62);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창3 new3 = new 새창3();
				String id = t1.getText();
				String pw = t2.getText();
				
				
				new3.open3(id, pw);
				//f.setVisible(false); 눌렀을때 없애기
			}
		});
		JButton b2 = new JButton("새창 열기 -2 ");
		b2.setBounds(94, 404, 304, 62);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t3.getText();
				int no2 = Integer.parseInt(no);
				
				새창4 new4 = new 새창4();
			new4.open4(no2);
			
					
				
				
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);

		b1.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		
		t1 = new JTextField();
		t1.setBounds(169, 6, 310, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(169, 75, 310, 44);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(42, 20, 80, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("pw");
		lblNewLabel_1.setBounds(38, 85, 84, 25);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 온도");
		lblNewLabel_2.setBounds(38, 313, 108, 56);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(127, 319, 310, 44);
		f.getContentPane().add(t3);
		
		
		
		
		
		f.setVisible(true); 

	}
}
