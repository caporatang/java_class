package com.mega.mvc06;

public class ArrayError3 {

	public static void main(String[] args)  {
		ArrayError2 error2 = new ArrayError2();
		try {
			error2.array();
		} catch (IndexOutOfBoundsException arr) {
			System.out.println("array메서드가 던진걸 잡아다가 내가 해결");
		} finally {
			System.out.println("문제 사라지게 처리 하였음");
		}
		
		
		
		
		
	}

}
