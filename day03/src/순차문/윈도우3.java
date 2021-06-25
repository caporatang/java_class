package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		lblNewLabel.setBounds(189, 6, 345, 119);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<<<<<<<<<<오늘의 일기 작성을 시작합니다>>>>>>>>>>");
		lblNewLabel_1.setBounds(69, 146, 488, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(69, 174, 395, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(69, 211, 395, 26);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 249, 395, 26);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("번호");
		lblNewLabel_2.setBounds(29, 179, 61, 16);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("날짜");
		lblNewLabel_2_1.setBounds(29, 216, 61, 16);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("제목");
		lblNewLabel_2_2.setBounds(29, 254, 61, 16);
		f.getContentPane().add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.PINK);
		textField_3.setBounds(69, 287, 395, 107);
		f.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("내용");
		lblNewLabel_3.setBounds(29, 332, 61, 16);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.setBounds(79, 407, 108, 29);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삽입");
		btnNewButton_1.setBounds(187, 406, 108, 29);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("저장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("오늘의 하루가 저장 되었습니다.");
			}
		});
		btnNewButton_2.setBounds(293, 406, 108, 29);
		f.getContentPane().add(btnNewButton_2);
		
		
		f.setVisible(true); // setVisible > 아래로 코드 작성시 보이지 않음.위에 코드들만 실행.
	
	
	
	
	}

}
