package 문제풀이;

public class 점프해서누적 {

	public static void main(String[] args) {
		// 문제 1 . 33~222 모두 더해주세요
		// 55~4500 . 2씩 점프하면서 더해주세요
		// 0~6000, 5씩 점프 하면서 더해주세요

		int sum = 0; // 누적된걸 저장할 변수! 변수명 total도 많이 씀.

		for (int i = 33; i <= 222; i++) {
			sum = sum + i; 
			//  System.out.println(i + ": " + sum); 잘되는지 중간 확인 할수있는 코드이다.  익혀둘것!  
		}
		System.out.println(sum);

		int sum2 = 0;
			// i++; => i = i + 1
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);

		int sum3 = 0;

		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);

	}

}
