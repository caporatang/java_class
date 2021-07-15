package 새창데이터전달;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {

	
		public void open4(int no2) {
			
			JFrame f = new JFrame("더워요");
			f.setSize(300, 300);
			
			
			if (no2 <= 30) {
				JOptionPane.showMessageDialog(null, "폭염");
			} else {
				JOptionPane.showMessageDialog(null, "견딜만 해요");
			
			}
			
			
			
			JButton b3 = new JButton( no2 + "도 입니다");
			f.add(b3);
			
			
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					f.dispose();
				}
			});
			
			
			
			f.setVisible(true);
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
}
