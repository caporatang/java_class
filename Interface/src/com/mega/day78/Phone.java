package com.mega.day78;

public interface Phone {
	// 일반 변수 선언 불가
	// int x;
	// String b;
	
	// 상수만 사용 가능
	// 파이널이 붙으면 변경이 불가능하다 
	// 눈에 잘 띄게 대문자로 사용하는 경우가 많다
	public final String COMPANY = "mega"; 
	
	// 인터페이스는 필요한 기능만을 정의한 문서 역할
	// public abstract는 생략 가능.
	public abstract void internet();
	// 메서드의 처리 내용을 구체적으로 정의하지 않은 불완전한 메서드
	// 추상 메서드
	public void call();
	abstract void text();
	void kakao();
	
}
