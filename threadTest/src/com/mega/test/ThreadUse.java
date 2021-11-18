package com.mega.test;

public class ThreadUse {

	public static void main(String[] args) {
		MyThread my1 = new MyThread("my1");
		my1.start();
		MyThread my2 = new MyThread("my2");
		my2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main >>>>>>>>>>>>>" + i );
		}
		
	}

}
