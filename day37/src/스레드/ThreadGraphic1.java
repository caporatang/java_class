package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame {

	// static이라 붙으면 객체 생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음.
	// 맴버변수가 있으면 static메서드에서 바로 사용 불가능...
	// 전역변수에도 static을 붙여주면 객체생성 하지 않아도 static 메서드 안에서 접근 가능하다
	// RAM에 항상 상주하고 있음. 언제든지 cpu가 접근해서 사용 가능하다.
	// static을 많이 사용하면 안된다. > 메모리가 부족해진다.
	
	JLabel count, image, timer; 
	
	public ThreadGraphic1() {
		setSize(800, 350);
		setTitle("나의 스레드 프로그램");

		 count = new JLabel();
		 image = new JLabel();
		 timer = new JLabel();
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);

		count.setFont(font);
		timer.setFont(font2);

		Count2 thread1 = new Count2();
		Image2 thread2 = new Image2();
		Timer2 thread3 = new Timer2();

		thread1.start();
		thread2.start();
		thread3.start();

		setVisible(true);
	}
	// 클래스간 변수를 공유할 목적으로 클래스를 끼워 넣을수있다.
	// 내부 클래스(inner class, 이너 클래스)
	// 내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다 .
	public class Count2 extends Thread {
		@Override
		public void run() {
			// 500부터 1씩 감소 시키자 i --(증감연산자)
			for (int i = 1000; i >= 0; i = i - 2) {
			count.setText("count > > > " + i);

				try {
					Thread.sleep(500); // 밀리세컨즈(1/1000초) > 헷갈리면 우유를 생각하자
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public class Image2 extends Thread {
		@Override
		public void run() {
			//500부터 1씩 감소 시키자 i --(증감연산자) 
			String[] list = { "11.jpg", "12.jpg", "13.jpg", "14.jpg", "15.jpg", "16.jpg", "17.jpg", "18.jpg", "19.jpg", "20.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				//image.setText(list[i]);
				
				try {
					Thread.sleep(5000); // 밀리세컨즈(1/1000초) > 헷갈리면 우유를 생각하자
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			
			
		}
	}
	
	public class Timer2 extends Thread {
		@Override
		public void run() {
			//500부터 1씩 감소 시키자 i --(증감연산자) 
			for (int i = 0; i < 1000; i++) {
				
				java.util.Date date = new java.util.Date();
				timer.setText(date + "");				
				try {
					Thread.sleep(1000); // 밀리세컨즈(1/1000초) > 헷갈리면 우유를 생각하자
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
			
			
		}
	}

	
	
	
	
	public static void main(String[] args) {
		ThreadGraphic1 s = new ThreadGraphic1();
	}

}
