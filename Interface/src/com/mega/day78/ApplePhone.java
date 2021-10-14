package com.mega.day78;

// 추상 클래스는 추상 메서드를 하나라도 가지고 있으면 무조건 추상 클래스이다
// 추상 메서드가 class에 정의 되어있기 때문에 클래스 앞에도 abstract를 붙여준다
public abstract class ApplePhone implements MegaPhone {
	String tel = "010-111-2222";
	
	// apple12, 13틀이 다르다.
	// camera() 기능이 있긴 있어야함.
	// apple12, 13은 applePhone을 재사용해서 카메라 기능만 메서드를 구현하면 된다.
	// 상속받아서 apple12, 13을 따로 만들어야 하는데, ApplePhone에 없었던 
	// 카메라 기능이 반드시 있어야 하는것을 명시 해야한다.
	public abstract void camera(); // 추상 메서드
	
	
	@Override
	public void map() {
		System.out.println( tel + "gps로 맵 서비스를 사용하다.");
	}

	@Override
	public void internet() {
		System.out.println("핸드폰으로 인터넷을 사용하다.");
	}

	@Override
	public void call() {
		System.out.println("핸드폰으로 전화를 사용하다.");
	}

	@Override
	public void text() {
		System.out.println("핸드폰으로 문자를 사용하다.");
	}
	
	@Override
	public void kakao() {
		System.out.println("핸드폰으로 카카오 서비스를 사용하다.");
	}

	@Override
	public void siri() {
		System.out.println("핸드폰으로 시리를 사용하다.");
	}

}
