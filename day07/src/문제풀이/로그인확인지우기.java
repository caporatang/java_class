package 문제풀이;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 로그인확인지우기 {
	private static JTextField a1;
	private static JTextField a2;

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 해주세용");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel t1 = new JLabel("아이디");
		t1.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		t1.setBounds(31, 34, 197, 83);
		f.getContentPane().add(t1);

		a1 = new JTextField();
		a1.setBackground(Color.ORANGE);
		a1.setBounds(272, 42, 322, 66);
		f.getContentPane().add(a1);
		a1.setColumns(10);

		a2 = new JTextField();
		a2.setBackground(Color.ORANGE);
		a2.setColumns(10);
		a2.setBounds(272, 179, 322, 66);
		f.getContentPane().add(a2);

		JLabel t2 = new JLabel("비밀번호");
		t2.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		t2.setBounds(31, 165, 197, 83);
		f.getContentPane().add(t2);

		JLabel t3 = new JLabel("");
		t3.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		t3.setBounds(31, 483, 197, 83);
		f.getContentPane().add(t3);

		JButton b1 = new JButton("로그인");
		b1.setBackground(Color.PINK);
		b1.setOpaque(true);
		b1.setBorderPainted(false);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String c1 = a1.getText();
				String c2 = a2.getText();

				if (c1.equals("root") && c2.equals("pass")) {
					t3.setText("로그인 성공");
				} else {
					t3.setText("로그인 실패");
				}

			}
		});
		b1.setBounds(42, 327, 225, 102);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1.setText("");
				a2.setText("");
			}
		});
		b2.setBackground(Color.PINK);
		b2.setOpaque(true);
		b2.setBorderPainted(false);

		b2.setBounds(330, 327, 225, 102);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
