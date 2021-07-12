package 메서드반환값;

public class 계산기 {
		// 성질 : 멤버변수
		// 동작 : 멤버 메서드(*)
		//cal.add(100, 200)
		//기능정의, 함수정의, 메서드 정의
		//x, y는 지역변수, add안에서만 사용 가능하다.
		// 메서드 사용(호출, call)
		//메서드 안에서 값을 전달할 목적으로 생성되는 변수를 >>> 매개변수 (x y)
		//매개 변수 , parameter(파라메터)
		//void : 없다라는 의미, 반환값이 없다.
		// 반환할때는 return을 써야한다. void와 return은 절대 같이 사용할 수 없다.
		//리턴값 받을 때 주의
		public int add(int x , int y) {
				int result = x + y;
				System.out.println("두 수의 합은" + result);
				return result;
		}
		
		
		

		
		
		
		
}
