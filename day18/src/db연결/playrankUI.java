package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class playrankUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();	
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setBounds(57, 53, 139, 40);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblPw.setBounds(57, 130, 139, 40);
		f.getContentPane().add(lblPw);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(57, 216, 139, 40);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("tel");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(57, 304, 139, 40);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		t1.setBounds(211, 44, 240, 58);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		t2.setColumns(10);
		t2.setBounds(211, 121, 240, 58);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(Color.YELLOW);
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		t3.setColumns(10);
		t3.setBounds(211, 207, 240, 58);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.YELLOW);
		t4.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		t4.setColumns(10);
		t4.setBounds(211, 295, 240, 58);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1~t4에 입력된 값을 가지고 와야 한다.
				String id =t1.getText();
				String pw =t2.getText();
				String name =t3.getText();
				String tel =t4.getText();
				
				//member테이블에 저장 하려고 함.
				//해결책, 우리가 원하는 기능을 가진 메소드를 가지고 있는
				//부품을 찾아야한다.
				//램에 가져다 놓으면 됨.
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel); // 1
					if (result == 1 ) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					}else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//입력한거 지워버리기.
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton.setBounds(27, 377, 117, 73);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id를 입력 받아야 함.
				String id = JOptionPane.showInputDialog("id를 입력하세요");
				//db처리 하기.
				MemberDAO db = new MemberDAO();
				
				try {
					int result = db.delete(id); //1
					if(result == 1){
						JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원탈퇴 실패");
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton_1.setBounds(188, 377, 117, 73);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = JOptionPane.showInputDialog("id를 입력하세요"); 
				String del = JOptionPane.showInputDialog("변경하실 tel을 입력하세요");
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, del);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "정보수정 성공 ");
					} else {
						JOptionPane.showMessageDialog(f, "정보수정 실패");
					}
					
					
					
				} catch (Exception e3) {
					   // TODO Auto-generated catch block

				}
				
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton_2.setBounds(350, 377, 117, 73);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
