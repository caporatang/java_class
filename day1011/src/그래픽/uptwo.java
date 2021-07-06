package 그래픽;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class uptwo {
	public void uptwo(){
	JFrame f = new JFrame("업프레임");
	f.setSize(150, 150);
	JButton h = new JButton("나를 눌러요");
	
	h.setBackground(Color.green);
	h.setOpaque(true);
	h.setBorderPainted(false);

	
	
	f.add(h);
	f.setVisible(true);
	
}
}
