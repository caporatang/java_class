package com.mega.mvc08.box;

import javax.swing.JOptionPane;

public class BoxingUnBoxing2 {

	public static void main(String[] args) {
		// 원래는 참조형 변수에 들어있는 주소를 기본형 변수에 넣을 수 없다.
		// 자바는 변수가 선언될 때 변수에 들어가는 타입이 결정되기 때문이다.
		
		// 클래스 이기 떄문에 객체로 생성해도 사용할 수 있다
		Integer i1 = new Integer(0); // 참조형
		int i2 = 0; // 기본형 정수
		int i3 = 0;

		// 기본형과 기본형에 대한 포장클래스간만 가능 !
		// 참조형 변수에 기본형을 넣음.
		// 기본형 변수에 참조형 값을 넣음.
		i1 = i2; // 참조형(클래스 , 객체) <---오토박싱---  큰개념 >> 작은개념
		i3 = i1; // 기본형 <---오토언박싱--- 참조형(클래스 , 객체)    작은개념 >>큰개념

	}

}
