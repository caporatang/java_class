package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BWindow2 {

	public BWindow2() {
		System.out.println("B객체가 생성된다.");
	}
	
	
	
	public void open() {
		JFrame f = new JFrame("B");
		f.setSize(300, 300);
		JButton b = new JButton("A open");
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					AWindow a = new AWindow();
					a.open();
					f.dispose();
				
			}
		});
		f.getContentPane().add(b);
		f.setVisible(true);

	}

}
