package interfacePractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Travel {

	public Travel() {
		JFrame f = new JFrame("여행");
		f.setSize(500, 500);

		JTextField text1 = new JTextField();
		text1.setBounds(147, 40, 193, 26);
		JTextField text2 = new JTextField();
		text2.setBounds(147, 78, 193, 26);
		f.getContentPane().setLayout(null);

		f.getContentPane().add(text1);
		f.getContentPane().add(text2);

		JButton b1 = new JButton("@@@@@@버튼1을 눌러요 @@@@@@");
		b1.setBounds(121, 116, 258, 29);
		f.getContentPane().add(b1);
		JButton b2 = new JButton("@@@@@@버튼2를 눌러요 @@@@@@");
		b2.setBounds(121, 157, 258, 29);
		f.getContentPane().add(b2);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String t1 = text1.getText();
				String t2 = text2.getText();
				JOptionPane.showMessageDialog(f, t1 + "로 " + t2 + " 에 떠나요");
			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				java.util.Date date = new java.util.Date();

				JOptionPane.showMessageDialog(f, date);

			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {
		new Travel();
	}

}
