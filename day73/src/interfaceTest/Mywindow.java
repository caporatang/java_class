package interfaceTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow {

	public static void main(String[] args) {
		// 생성자 메서드  > 클래스와 같은 이름으로 메서드를 만듬
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
		
		// 부품 객체 생성
		ClickClass click = new ClickClass();
		B2Click b2click = new B2Click(); // B2Click 클래스 
		// 처리해줄 부품을 넣어서 쓰면된다. > 부품 ClickClass 
		b1.addActionListener(click);
		
		//객체 변수에는 주소가 들어가있음(참조형 변수)
		b2.addActionListener(b2click);
		// 참조형 변수라서 어차피 주소가 들어가니 바로 넣어줘도 똑같다
		// new를 해서 바로 넣는 경우는 한번 사용하고 말것이기 때문이다
		b2.addActionListener(new ClickClass());
		
		
		
		
		f.setVisible(true);
	}

}
