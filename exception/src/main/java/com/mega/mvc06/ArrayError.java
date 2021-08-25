package com.mega.mvc06;

public class ArrayError {

	public static void main(String[] args) {
		//배열의 IndexOutOfBoundsException이면 "인덱스 에러!!"라고 출력
		// 다른 에러이면 "다른 에러 발생 @@@" 이라고 출력 
		// 에러가 발생하든 안하든 상관없이.. "배열에 문제가 사라지게 해결했어요"를 출력한다.
		try {
	//		int[] num = {1,2,3};
	//		num[3] = 4;
			System.out.println(3/0);
		} catch (IndexOutOfBoundsException arr) {
			System.out.println("인덱스 에러 !!!!!!!!!!!!!");
		} catch (Exception e) {
			System.out.println("다른 에러 발생@_@");
		}
		finally {
			System.out.println("에러에 상관없이 배열에 문제가 사라지게 해결했어요");
		}
	}

}
