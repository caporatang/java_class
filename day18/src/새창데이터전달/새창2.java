package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {
			
	public void open2(String m2) {
		JFrame f = new JFrame( m2 + "새창 2화면 입니다. @@");
		f.setSize(700, 700);

		
		JButton b1 = new JButton( m2 + " " + "새창2 화면닫기");
		
		f.add(b1);
		b1.setBackground(Color.green);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
			
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창2을 닫습니다.");
				//System.exit(0); // 프로그램 종료!!
				f.dispose();//이 프레임만 닫히게 하기
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
	}
	
	
	
}
