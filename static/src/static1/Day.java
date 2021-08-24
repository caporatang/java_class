package static1;

public class Day {

	// 맴버변수, 전역 변수, 자동 초기화
	// 자동초기화는 배열, 전역변수, 맴버 변수 밖에 없다
	String doing; // null
	int time; // 0
	String location;// null new 할때마다 doing , time , location은 복하된다.

	static int sum;
	static int count; // static 변수는 new해도 새로 생성되지 않는다

	public Day(String doing, int time, String location) {

		this.doing = doing; // this는 위에서 선언 한 전역 변수를 의미한다.
		this.time = time;
		this.location = location;
		count++;
		sum += time;
	}
	// static 메서드는 객체 생성하지 않아도 아무때나 클래스 이름으로
	// 접근해서 그 기능을 처리하게 할 수 있다.
	// 자주 쓰는 기능은 static 메서드로 만들어 놓으면 아무때나 쓸 수 있어서 편하다.

	public static int getAvg() {
		return sum / count;
		// static 메서드 안에는 static변수만 사용 가능!!! instance변수 사용 불가능 !!
		// instance변수는 객체 생성후 접근 가능하기 때문이다
		// static메서드는 객체 생성하지 않아도 접근해서 처리를 해야한다.
		// return doing;
	}

	@Override
	public String toString() {
		return "day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}