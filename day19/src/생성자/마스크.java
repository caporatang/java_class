package 생성자;

public class 마스크 {
	//속성 ==> 멤버변수
	//색, 가격 
	//멤버변수는 자동 초기화
	String color; // 참조형 변수는 null
	int price; // 기본형 변수는 0
	
	//객체 생성시 클래스이름과 동일한 것이 있으면
	//자동 호출된다.
	//객체 생성시 넣어주어야 하는 처음값을 넣어주기 위해 사용한다.
	//생성자메서드 ==> 생성자라고 한다.
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	
	
	
	//동작 ==> 멤버메서드
	public void cover() {
		System.out.println("마스크 쓰다");
	}
	public String toString() { //일일히 프린트 하지않고 주소가 가르키는 값들을 프린트할수있게한다.
		return color + " " + price;
	}
	
}
