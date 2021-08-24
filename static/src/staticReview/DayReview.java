package staticReview;

public class DayReview {

	// 멤버변수 , 전역변수, 자동으로 초기화 된다.
	// 자동 초기화는 멤버변수 , 전역변수 , 배열 밖에 안된다.
	String lan; // 초기화 값 : null
	int time; // 초기화 값 : 0
	String lan2; // null

	static int count; // 스테틱은 객체를 생성하지 않아도 클래스 이름으로 바로 접근할 수 있다

	// 메서드 만들기
	// this란 클래스 바로 아래에 선언한 전역변수와 메서드 안에 선언해준 지역변수를 구분하기 위해 사용한다.
	public DayReview(String lan, int time, String lan2) {
		this.lan = lan;
		this.time = time;
		this.lan2 = lan2;
	}

	@Override
	public String toString() {
		return "DayReview [lan=" + lan + ", time=" + time + ", lan2=" + lan2 + "]";
	}

}
