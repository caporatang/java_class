package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class problem4 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요 ?");
		try {
			// System.out.println("2.문제 발생 ~~~ ?" + 10/0);
			FileWriter file = new FileWriter("/test.txt"); // 에러를 발생시킬것임
			file.write("내가 첫줄/n");
			file.write("내가 둘째줄/n");
			file.close();

		} catch (ArithmeticException e1) { 
			e1.printStackTrace();
		} catch (IOException e2) {
			System.out.println("파일에 쓰는중 에러 발생 ..@@@@@@@@@@@@@");
		} catch (Exception e) {
			System.out.println("모든 에러를 처리함 @_@");
		} finally {
			//에러의 발생 유무와는 상관없이 반드시 꼭 실행 해주어야하는 부분은 여기에 넣음.
			System.out.println("예외처리 다 했음..!");
		}
		System.out.println("3. 나도 프린트 될까요 ?");
	}

}
