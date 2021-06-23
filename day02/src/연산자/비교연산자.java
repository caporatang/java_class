package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// 비교연산자: ==, !=(! not), >(초과, 미만),>=(이상, 이하) 
		// 비교결과가 중요(논리데이터, boolean, true/false)
		int x = 100;
		int y = 200;
		// 하나라도 스트링이 들어가면 스트링이 된다.(결합의 의미) 앞에서부터 보면 +가 결합 연산자로 취급된다.

		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x >= y);
		System.out.println(x > y);
		System.out.println(x < y);
		

	}

}
