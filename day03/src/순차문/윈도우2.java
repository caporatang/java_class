package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요");
				JOptionPane.showMessageDialog(f, "저를 누르셨군요");
			}
		});
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setFont(new Font("PCMyungjo", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(126, 81, 160, 59);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요");
				JOptionPane.showMessageDialog(f, "저도 누르셨군요");
			}
		});
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Lao MN", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(126, 214, 160, 53);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(196, 331, 153, 53);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(84, 336, 116, 43);
		f.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 396, 157, 43);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(84, 409, 61, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		
		
		f.setVisible(true); // setVisible > 아래로 코드 작성시 보이지 않음.위에 코드들만 실행.
	
	
	
	
	}
}
