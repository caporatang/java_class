package 스레드;

import java.util.Date;
public class Timer1 extends Thread {
	@Override
	public void run() {
		//500부터 1씩 감소 시키자 i --(증감연산자) 
		for (int i = 0; i < 1000; i++) {
			
			Date date = new Date();
			System.out.println(date);
			
			try {
				Thread.sleep(1000); // 밀리세컨즈(1/1000초) > 헷갈리면 우유를 생각하자
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		
	}
}
