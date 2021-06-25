package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Windowbuilder {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		t1.setBounds(301, 26, 379, 62);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(301, 158, 379, 62);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(Color.CYAN);
		t3.setColumns(10);
		t3.setBounds(301, 318, 379, 62);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.CYAN);
		t4.setColumns(10);
		t4.setBounds(301, 408, 379, 62);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel.setBounds(103, 40, 254, 29);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(103, 170, 254, 29);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(103, 330, 254, 29);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(103, 431, 254, 29);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 자동으로 이 함수가 실행이 된다.
				//버튼을 클릭했을 때 처리내용을 넣으면 됌.
				String s1 = t1.getText(); //아메리카노 , 전부 만들필요없이 텍스트 박스 안에 값을 가져 오는 것이므로 하나만 만든다.
				// t1 = 입력값이 s1으로 간다.
				
				if (s1.equals("아메리카노") || s1.equals("홍차") || s1.equals("티")) {
					JOptionPane.showMessageDialog(null, "카페로 가세요");
				} else {
					JOptionPane.showMessageDialog(null, "아이스크림 드세");
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(0, 100, 682, 46);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				
				int age = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(btnNewButton_1, age + 1);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(-2, 237, 682, 46);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s3 = t3.getText();
				String s4 = t4.getText();
				
				double a3 = Double.parseDouble(s3);
				double a4 = Double.parseDouble(s4);
				
				JOptionPane.showMessageDialog(btnNewButton_2, (a3 + a4) / 2 + "점");
			 
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(-2, 488, 682, 46);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);

	}
}
//윈도우 빌더를 사용할때는 텍스트 작성할 부분부터 만든다. 이유는 위에서부터 생긴 텍스트를 가지고 버튼으로 변수 처리를 해야하기 때문.
