package static1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum;
	final static int price = 5000; // fianl을 넣어줘서 상수로 만들어준다
	
	
	//main이 static이므로 , 객체 생성하지 않아도 접근이 가능한 변수여야 한다.
	// main안에서 사용하는 전역변수는 반드시 static으로 만들어주어야 한다.
	
	public static void main(String[] args) {
		// main이 static인 이유는
		// 객체생성하지 않아도 main부터 시작하기 때문....
		JFrame f = new JFrame();
		f.getContentPane().setForeground(Color.GREEN);
		f.setSize(850, 850);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수 : ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(525, 29, 183, 48);
		f.getContentPane().add(lblNewLabel);
	
		count = new JTextField();
		count.setForeground(Color.BLACK);
		count.setBounds(627, 24, 217, 53);
		f.getContentPane().add(count);
		count.setColumns(10);
		count.setOpaque(true);

		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("/Users/taeil/Desktop/자장.png"));
		img.setBounds(71, 142, 757, 532);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제 금액");
		result.setForeground(Color.RED);
		result.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		result.setBounds(60, 693, 613, 89);
		f.getContentPane().add(result);
	
		
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img.setIcon(icon);
				result.setText(sum * price + "원");
			}
		});
		btnNewButton.setBounds(60, 24, 139, 51);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("우동.png");
				img.setIcon(icon);
				result.setText(sum * price + "원");
			}
		});
		btnNewButton_1.setBounds(211, 24, 139, 51);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum + "개");
				ImageIcon icon = new ImageIcon("자장.png");
				img.setIcon(icon);
				result.setText(sum * price + "원");
			}
		});
		
		btnNewButton_2.setBounds(362, 24, 139, 51);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		
	}
}