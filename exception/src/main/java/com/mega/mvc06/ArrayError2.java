package com.mega.mvc06;

public class ArrayError2 {

	public static void array() throws IndexOutOfBoundsException {
		// arrayerror3에서
		// arrayerror2의객체 생성 후
		// array()메서드를 호출하세요
		// 1)array()메서드 내에서 try~catch 예외처리
		// 2) 호출한 곳에서 예외처리
			int[] num = { 1, 2, 3 };
			num[3] = 4;
			
	}

}
