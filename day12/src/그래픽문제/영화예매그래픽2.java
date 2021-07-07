package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽2 {

	static int a = 0;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("영화 예매 창"); // 프레임을 만들기위해 램에 가져다 놓는다.
		f.setSize(850, 850); // 만들어진 f의 사이즈를 입력한다.
		FlowLayout flow = new FlowLayout(); // 생성된 버튼들의 위치를 왼쪽에서 오른쪽으로 생성해준다.
		f.setLayout(flow); // 만들어진 f창에 레이아웃을 적용한다.
		
		int[] down = new int[200]; // 예약된 버튼에 1을 넣어서 예약된걸로 저장 시킬 배열. 

		for (int i = 0; i < 200; i++) { // 200개의 버튼을 만들고 만들어진 버튼들에 번호와 기능들을 차례대로 넣기위해 for문을 써준다
			JButton b1 = new JButton(i + ""); // j버튼을 b1 변수로 선언하고 i+ ""로 번호를 표현한다.
			f.add(b1); // f에 b1버튼 추가
			b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) { // 버튼을 클릭 했을때 실행될 기능을 추가한다.
					String c = e.getActionCommand(); // 버튼의 넣어준 명령을 스트링(getActionCommand 반환값이 String)으로 받아온다.
					int d = Integer.parseInt(c); // 스트링으로 받아온 값을 배열에 넣기 위해서 인트로 변환한다.
					down[d] = 1; // 예약된 상황 저장을 위해서 1을 넣어둔다, 0 >> 1 로 변환 시키기 위해서
					JOptionPane.showMessageDialog(f, d + "번 예약됌"); // 좌석 버튼을 눌렀을때 down에 배열 번호를 예약 됐다고 출력한다.
					b1.setBackground(Color.blue); // 버튼 색
					b1.setEnabled(false); // 예약 표시 된버튼 비활성화.
					b1.setOpaque(true); // 버튼 색
					b1.setBorderPainted(false); // 버튼 색
					a++;   // 스태틱 변수 a누적
					f.setTitle("예약된 좌석수 : " + a +""); // f위에 클릭한 버튼 수 누적 수 프린트
					
							
					
					
				}
			});
		}

		JButton b2 = new JButton(" <<<<<<<<<<<<< 결제 하기 >>>>>>>>>>>> "); // 결제하기 버튼 만들기
		f.add(b2); // f에 위에서 만든 결제하기 버튼 추가

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // b2를 눌렀을 때 실행될 기능을 추가해주는 코드
				int count = 0; // 예약된 자리를 누적해줄 변수
				String sum = ""; // 스트링으로 "번" 까지 누적해줄 String변수
				final int PRICE = 10000; // 가격 final > 변하면 안되는 값 대문자로 표기
				for (int i = 0; i < down.length; i++) { // 200개 버튼을 예약된 자리인지 (인덱스값이 1인지) 비교해줄 for
					if (down[i] == 1) {
						count++; // 예약된 자리 누적
						sum = sum + i + "번 "; // 예약된 자리가 몇번인지 표기해줄 변수
					}
				}
				JOptionPane.showMessageDialog(f, "당신이 총 결제할 금액은 " + (count * PRICE) + "원 입니다.");// 출력
				JOptionPane.showMessageDialog(f, "당신이 예약한 자리는 " + sum + " 입니다."); // 출력

				
			}
		});
		
		
		b2.setBackground(Color.pink);// 결제버튼 색
		b2.setOpaque(true); // 결제버튼 색
		b2.setBorderPainted(false); // 결제버튼 색

		f.setVisible(true); // 위에서 창을 만들고 시각화 할수 있게 해주는 코

	}

}
