package static1;

public class DayUse {

	public static void main(String[] args) {
		Day day1 = new Day("자바 공부", 10, "강남"); // 기본생성자가 없기 때문에 처음에 new해서 생성 했을 경우에 에러가 발생된다.
		System.out.println(Day.count);
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.sum + "시간");
		System.out.println((Day.sum / Day.count) + "시간");
		System.out.println(Day.getAvg()); // static 메서드 바로 사용
		//day 1, 2 , 3를 클래스의 인스턴스라고 한다
		//(틀)                  (실제 부품)
	}

} 