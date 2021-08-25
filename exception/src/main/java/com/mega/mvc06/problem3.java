package com.mega.mvc06;

import java.io.FileWriter;

public class problem3 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요 ?");
		try {
			//System.out.println("2.문제 발생 ~~~ ?" + 10/0);
			FileWriter file = new FileWriter("/test.txt"); // 에러를 발생시킬것임
			file.write("내가 첫줄/n");
			file.write("내가 둘째줄/n");
			file.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("3. 나도 프린트 될까요 ?");

	}

}
