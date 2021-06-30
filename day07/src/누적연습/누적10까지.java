package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		//1-10까지 더해봅시다.
		//모든 언어에서 숫자로 시작할수없음
		int sum = 0; // int의 초기 변수값은 보통 0으로 많이 넣는다. 
		
		for (int i = 1; i <= 10000; i++) {
			//1 + 2 + 3 + .......
			// 하나씩 계산을 하고 계산한 결과겂을 램에다가 넣어둔 후에 다시 빼와서 다음 숫자를 계산한다.
			 sum = sum + i; // 1 = 0 + 1
			 				// 3 = 1 + 2 
							// 6 = 3 + 3 
							// 6 = 6 + 4   
			
		}
		System.out.println(sum);
		
		
		
	} //main

}//class
