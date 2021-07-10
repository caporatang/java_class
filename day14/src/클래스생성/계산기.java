

package 클래스생성;

public class 계산기 {
	//사칙연산 계산기
	
	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다");
	}
	public void 더하기(int a, int aa) {
		System.out.println("더하기 기능 처리 내용 구현");
		int result2 = a + aa;
		System.out.println(result2);
	}
	
	public void 빼기() {
		System.out.println("빼기 기능 처리 내용 구현");
	}
	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리 내용 구현");
		int result = price * count;
		System.out.println("두수의 곱의 결과는 " + result);
	}
	public void 나누기(double b, double bb) {
		System.out.println("나누기 기능 처리 내용 구현");
		double result3 = b / bb;
		System.out.println(result3);
	}
	
	
	
	
	
}
