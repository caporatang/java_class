package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AWindow {

	
	
	public static void main(String[] args) {
		AWindow a = new AWindow();
		a.open();
	} //main에는 스타트 되는거 작은거만 넣어준다. 앞뒤로 가는 내용이다 복습 해보자.
	
	
	//객체 생성시 클래스 이름과 동일한 메서드가 있으면 자동으로 호출된다.
	//생성자 메서드이다.(생성자)
	// 클래스와 동일하게 대문자로 시작하고, return이나, void를 입력하지 않는다.
	public AWindow() {
		System.out.println("A객체가 생성된다.");
	}
	
	
	public  void open() {
		JFrame f = new JFrame("A");
		f.setSize(300, 300);
		
		JButton b = new JButton("B open");
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					BWindow2 b = new BWindow2();
					b.open();
					f.dispose();
				
			}
		});
		f.getContentPane().add(b);
		f.setVisible(true);

	}

}
