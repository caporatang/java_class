package 스레드;

public class Image1 extends Thread {
	@Override
	public void run() {
		//500부터 1씩 감소 시키자 i --(증감연산자) 
		String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(5000); // 밀리세컨즈(1/1000초) > 헷갈리면 우유를 생각하자
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		
	}
}
