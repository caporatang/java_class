package com.mega.day78;

public class PhoneFactory {

	public static void main(String[] args) {
		
		// 불완전한 추상 메서드를 가진 인터페이스, 추상 클래스로는 객체를 생성할 수 없다
		//ApplePhone p1 = new ApplePhone(); // 추상클래스
		//Phone p2 = new Phone(); // 인터페이스
		
		ApplePhone p = new Apple13();
		
		
		Apple12 p3 = new Apple12();
		Apple13 p4 = new Apple13();
		
		p3.call();
		p4.internet();

	}

}
