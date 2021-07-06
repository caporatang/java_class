package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class up {
	//눌렀을때 짠 하고  뜨기 위한 함수가 필요하다.
	
	public void up() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					uptwo uptwo = new uptwo();
				uptwo.uptwo();
			}
		});
		
		
		
		
		f.add(b);
		f.setVisible(true);
		
	}
	
	
	
	
}
