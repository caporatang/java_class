package 반북문;

public class 반복문1 {

	public static void main(String[] args) {
		//반복문안에 들어가는 변수는 횟수를 카운트할 때도 사용하고 
		// 변수에 들어있는 값을 가지고 처리할 때도 사용한다.
		//2가지 경우가 있음.
		// 1부터 5까지 반복해서 찍어보자.
		//i++ ==> i = i + 1; 
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		//1부터 10까지 중 2씩 점프해서 찍어보자.
		for (int i = 1; i < 10; i = i+2) {
			System.out.println(i);
		}
		//1부터 100까지 중 5씩 점프해서 찍어보자.
		for (int i = 1; i <= 100; i = i+5) {
			System.out.println(i);
		}
		
		//100부터 1까지 1씩 점프해서 찍어보자. 
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
		//1000부터 0까지 8씩 점프해서 찍어보
		for (int i = 100; i >= 0; i = i-8) {
			System.out.println(i);
		}
		
		
		//++ -- 증감 연산자 , RAM의 변수값을 1씩감소/증가시켜주는 처리 연산자.
		//for(시작값; ,조건식; 증감식) 순서로 구성이 된다.
		//for (int i = 0; i < 3; i=i+1) {
		// 유한적으로 반복할땐 세가지가 필요함 int i = 0 (변수 > i)
		//	i++ i-- 는 1씩 늘거나 줄거나 할때만 사용한다. 
		
		
		
		
		
		
		
		
	} //main 

} //class 
