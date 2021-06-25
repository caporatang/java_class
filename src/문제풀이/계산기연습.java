package 문제풀이;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기연습 {
	private static JTextField textField;
	private static JTextField q1;
	private static JTextField q2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		textField.setText("계산기");
		textField.setBounds(12, 42, 688, 142);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		q1 = new JTextField();
		q1.setBackground(Color.YELLOW);
		q1.setBounds(259, 196, 422, 67);
		f.getContentPane().add(q1);
		q1.setColumns(10);
		
		q2 = new JTextField();
		q2.setBackground(Color.YELLOW);
		q2.setColumns(10);
		q2.setBounds(259, 354, 422, 67);
		f.getContentPane().add(q2);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(91, 222, 115, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(91, 371, 115, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton t1 = new JButton("더하기");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String b1 = q1.getText();
			String b2 = q2.getText();
			
			double c3 = Double.parseDouble(b1);
			double c4 = Double.parseDouble(b2);
			
			JOptionPane.showMessageDialog(null, (c3 + c4) + "입니다.");
			
			
			}
		});
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		t1.setBounds(91, 477, 221, 76);
		f.getContentPane().add(t1);
		
		JButton t2 = new JButton("빼기");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String b1 = q1.getText();
				String b2 = q2.getText();
				
				double c3 = Double.parseDouble(b1);
				double c4 = Double.parseDouble(b2);
				
				JOptionPane.showMessageDialog(null, (c3 - c4) + "입니다.");
			
			
			}
		});
		t2.setBounds(428, 477, 239, 67);
		f.getContentPane().add(t2);
		f.setSize(700, 700);
		
		f.setVisible(true);

	}

}
