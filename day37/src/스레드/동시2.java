package 스레드;

import java.lang.*; // 묵시적 import 

public class 동시2 extends Thread { // thread는 String,system들과 같이 임포트를 하지 않아도 된다. 이를 묵시적 임포트라고 한다. 
	//run메서드를 오버라이드 해서 구현 해주면, run메서드 내의 구현 부분이 
	// 동시에 처리가 된다.
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
		System.out.println("동시2>> " + i);
		}
	}


}
