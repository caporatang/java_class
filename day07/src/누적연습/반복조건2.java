package 누적연습;

public class 반복조건2 {

	public static void main(String[] args) {
		// 문제
		// 1부터 1000까지 중 3씩 점프해주세요.
		// 만약 더한 값이 100이 넘으면 더하기를 종료
		// 5의 배수는 더하지 않습니다.

		int sum1 = 0;
		int count = 0; // 몇번 더했는지 알고싶을때 별도로 변수를 생성한다.
		
		
		
		for (int i = 1; i < 1000; i = i + 3) {
			if (sum1 > 100) {
				break; // for문 종료
			}
			
			if (i % 5 == 0) {
				continue;//이번 횟수만 제외하고 for문은 계속 돈다
			}
			sum1 = sum1 + i;
			count++; //몇번 더했는지 증감식으로 넣어준다. 
		}
		System.out.println(sum1);
		System.out.println(count);
		
		
		
		
		
	}

}
