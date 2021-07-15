package 새창데이터전달;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {

	public void open3(String id, String pw) {

		JFrame f = new JFrame("로그인");
		f.setSize(300, 300);

		JButton b3 = new JButton("로그인 성공");
		if (id.equals("root") && pw.equals("pass")) {
			새창3 new3 = new 새창3();
				
			
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패 입력 다시하셈");
		}
		f.add(b3);

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창 1을 닫습니다.");
				f.dispose();
			}
		});

		f.setVisible(true);

	}

}
