package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mywindow2 implements ActionListener{
	// 스태틱이 많아서 main안에 코드는 좋은 코드가 아님
	// 기본 생성자를 하나 만들어서 코드 작성
	// 메서드를 만들어서 사용해도 무관하다
	
	
	// 전역변수로 선언해서 다른 메서드에서도 라벨을 사용할수있게 해주자
	JLabel result;
	
	
	public Mywindow2() {
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
				
				//JLabel result = new JLabel("결과 보여주는 라벨 ~");  >> 지역변수로 선언하면 아래에서 사용불가
				// 전역변수로 위에 썼음
				
				result = new JLabel("결과 보여줌");
				result.setFont(new Font("궁서", Font.BOLD, 20));
				result.setForeground(Color.red);
				f.add(result);
				
				// 자기 자신이 가지고 있는것으로 표기(클래스)
				b1.addActionListener(this);
				b2.addActionListener(this);
				
				
				f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mywindow2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText("버튼을 클릭했음 라벨에 결과를 붙이자");
		
	}

}
