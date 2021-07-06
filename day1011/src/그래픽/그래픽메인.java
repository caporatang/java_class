package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.Oneway;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class 그래픽메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		JButton b1 = new JButton("나는 왼쪽");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				upwest upwest = new upwest();
				upwest.upwest();

			}
		});
		JButton b2 = new JButton("나는 오른쪽");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				upeast upeast = new upeast();
				upeast.upeast();

			}
		});
		JButton b3 = new JButton("나는 가운데");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				upcenter upcenter = new upcenter();
				upcenter.upcenter();
			}
		});
		JButton b4 = new JButton("나는 아랫쪽");
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				upsouth upsouth = new upsouth();
				upsouth.upsouth();

			}
		});
		JButton b5 = new JButton("나는 윗쪽");
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을 때, 처리하는 내용을 쓴다.
				up up = new up();
				up.up();

			}
		});
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);

		b1.setBackground(Color.yellow);
		b2.setBackground(Color.red);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.lightGray);
		b5.setBackground(Color.pink);

		// 글씨체 , 폰트굵기 글씨 크기

		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

		b1.setOpaque(true);
		b1.setBorderPainted(false);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		b3.setOpaque(true);
		b3.setBorderPainted(false);
		b4.setOpaque(true);
		b4.setBorderPainted(false);
		b5.setOpaque(true);
		b5.setBorderPainted(false);

		f.setVisible(true);

	}

}
