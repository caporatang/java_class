package db연결;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reviewactiontest {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(130, 69, 218, 95);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(130, 212, 218, 95);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				ReviewDAO RDO = new ReviewDAO();
				try {
					int result = RDO.create(id, pw, name, tel);
					if (result == 1) {
						System.out.println("던지기 성공");
					}else {
						System.out.println("던지기 실패");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
			}
		});
		btnNewButton.setBounds(130, 384, 218, 57);
		f.getContentPane().add(btnNewButton);
		
		t3 = new JTextField();
		t3.setBounds(364, 69, 130, 95);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(364, 212, 130, 95);
		f.getContentPane().add(t4);
		f.setVisible(true);
	}
}
