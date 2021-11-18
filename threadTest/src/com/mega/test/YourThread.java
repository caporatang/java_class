package com.mega.test;

import javax.swing.JFrame;

public class YourThread extends JFrame implements Runnable {
	
	String who;

	public YourThread(String who) {
		this.who = who;
	}

	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println(who + ">>>>>>>>" + i);

		}

	}

}
