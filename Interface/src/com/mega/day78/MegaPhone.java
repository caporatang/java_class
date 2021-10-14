package com.mega.day78;


// 인터페이스는 여러개를 상속받아서 기능을 정의할 수 있다. 다중상속 가능
// 클래스간에는 단일 상속만 지원한다. (자바)
public interface MegaPhone extends Gps, Phone {
	
	void siri(); // 추가, 전체 6개 기능을 구현해야한다.
	
	
}
