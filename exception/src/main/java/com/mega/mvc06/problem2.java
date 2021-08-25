package com.mega.mvc06;

public class problem2 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요 ?");
		try {
			System.out.println("2.문제 발생 ~~~ ?" + 10/0);
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("3. 나도 프린트 될까요 ?");

	}

}
