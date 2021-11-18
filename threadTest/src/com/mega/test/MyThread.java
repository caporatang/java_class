package com.mega.test;

public class MyThread extends Thread {

	String who;
	
	
	
	public MyThread(String who) {
		this.who = who;
	}



	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(who + ">>>>>>>>" + i);

		}
	}

}
