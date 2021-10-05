package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mywindow3 {
	// 3번째 방법 @
	// 버튼 아래에 바로 만들어줌
	// 안드로이드 스튜디오와 윈도우 빌더에서 방법이다.
	JLabel result;

	public Mywindow3() {
		// 생성자 메서드 > 클래스와 같은 이름으로 메서드를 만듬
		// 다형성 오버로드
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300, 300);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("나를 눌러요");
		f.add(b1);
		JButton b2 = new JButton("b2 다이얼로그 띄우기");
		f.add(b2);
		JButton b3 = new JButton("나는 세번째 버튼");
		f.add(b3);

		// JLabel result = new JLabel("결과 보여주는 라벨 ~"); >> 지역변수로 선언하면 아래에서 사용불가
		// 전역변수로 위에 썼음
		result = new JLabel("결과 보여줌");
		result.setFont(new Font("궁서", Font.BOLD, 20));
		result.setForeground(Color.red);
		f.add(result);

		// 자기 자신이 가지고 있는것으로 표기(클래스)
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("b1클릭 결과는 나야 @");

			}
		});

//		b2.addActionListener(new [!!!! ActionListener() { 
//									   액션리스너는 인터페이스이다 = > 익명클래스 
//			익명 클래스를 가지고 객체를 생성한것임
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				result.setText("b2클릭 결과는 나야 @");
//
//			}
//		}]!!!!!);

		
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("b2클릭 결과는 나야 @");

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("b3클릭 결과는 나야 @");

			}
		});

		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Mywindow3();
	}
}
