package staticReview;

public class DayUseReview {

	public static void main(String[] args) {

		// 파라메터로 들어간 값들이 인스턴스 변수이
		DayReview day11 = new DayReview("자바", 13, "스프링"); // 객체를 생성해서 생긴 변수(day11)는 클래스의 인스턴스이다.
		DayReview day12 = new DayReview("코틀린", 14, "c++"); // 클래스에서는 멤버변수이고 , 여기서 들어간 값들은 인스턴스 변수라고 한다.
		DayReview day13 = new DayReview("오라클", 12, "mysql"); // 멤버변수를 인스턴스 변수라고 혼용해서 사용하기도 한다.

		System.out.println(day11); // 클래스의 인스턴스 출력 > object!!
		System.out.println(day12);
		System.out.println(day13);

		// count를 static으로 선언 해주었기 때문에 클래스 이름으로 객체를 생성하지 않고 바로 접근해서 사용한다.
		System.out.println(DayReview.count); // 인스턴스를 몇번 복사 했는지 카운트

	}

}
