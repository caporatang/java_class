package com.mega.mvc08.casting;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingTest {

	public static void main(String[] args) {
		// 제이프레임도 업캐스팅이 사용된다.
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.setLayout(new FlowLayout());
		f.add(new Button("나는 버튼이야"));
		f.add(new JLabel("나는 라벨이야")); // 업캐스팅
		f.setVisible(true);
		
		

	}

}
