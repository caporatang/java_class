package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자: 사칙연산자(+, -, *(아스테르크), /), %(나머지)
		int x = 100;
		int y = 200;
		// 하나라도 스트링이 들어가면 스트링이 된다.(결합의 의미) 앞에서부터 보면 +가 결합 연산자로 취급된다.
		System.out.println("두 수의 합은" + (x + y));
		System.out.println("두 수의 차는" + (x - y));
		System.out.println("두 수의 곱은" + (x * y));
		System.out.println("두 수의 나눗셈은" + (x / y));
		System.out.println("두 수의 나머지는" + (x % y));
		

	}

}
