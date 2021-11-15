package com.mega.test;

public class High extends Student {
	
	
	
	// 묵시적으로 부모 클래스의 인스턴스 변수 2개를 가지고 있음
	// 묵시적으로 부모 클래스의 일반 메서드 2개(toString, toString)를 가지고 있음
	
	int hour;
	String location;
	
	//생성자
	// 부모 클래스에 있는 멤버변수들도 초기화 해주고 싶을때
	public High(String name, int age, int hour, String location) {
		// 부모의 것이기 때문에 super클래스를 나타내고 부모클래스 안에 것을 초기화 해준다 
		super(name, age); 
		// 파라메터 있는 부모의 생성자 호출은 생략이 불가능하다 super();
		// 파라메터있는 부모의 생성자 호출은 명시적으로 해야한다 super();
		this.hour = hour;
		this.location = location;
	}
	
	public void nightSelfStudy() {
		System.out.println("야간 자율 학습을 하다");
	}
	
	public void go (String location2) {
		System.out.println(location2 + "에 가다");
	}
	
	//부모의 메서드
	@Override
	public void study() {
		//super.study(); 생략 가능
		System.out.println("입시 공부하다");
		
		
	}
	
	
	// 부모 클래스의 변수들까지 toString 설정해주자
	@Override
	public String toString() {
		return "High [hour=" + hour + ", location=" + location + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
 
	
	
	
	
	
	
	
	
	
	
}
