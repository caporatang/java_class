package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		// 3의 배수만 더하고 싶다.
		// % 는 나머지 연산자
		// if문이 트루이면 (나머지가 0이면 누적. 누적시킬 변수 생성)
		int sum1 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);

		System.out.println("-----------------------");

		// 입력 처리 출력 변수는 다 따로따로 해서 구분을 짓는게 나중에 오류를 잡아야함
		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
				// 반복문을 계속 하라는 의미
				// 조건에 맞는 경우 아래에 있는 코드는 더 이상 실행하지 않는다.
				// 제외의 이미이다.
			}

			if (sum2 > 20) {
				System.out.println("20이 넘었으므로 스탑");
				break;
				// for문이 아니라 더하기를 멈추라는 뜻.
			}
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		System.out.println("-------------구분선 -------------");
		// 문제
		// 1부터 1000까지 중 3씩 점프해주세요.
		// 만약 더한 값이 100이 넘으면 더하기를 종료
		// 5의 배수는 더하지 않습니다.

		int sum5 = 0;

		for (int i = 1; i <= 1000; i = i + 3) {
			
			if (sum5 > 100) {
				System.out.println("100이 넘었으므로 stop");
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			sum5 = sum5 + i;

		}
		System.out.println(sum5);

	}

}
