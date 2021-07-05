package 배열응용;

import java.util.Scanner;

public class 영화예매 {
	public static void main(String[] args) {

		int[] seat = new int[10]; // 반복문 안에 넣으면 매번 생성 되므로 반복시키지  않는다.
		// {0,0,0,0,0,0.....}
		Scanner sc = new Scanner(System.in);//반복문 안에 넣으면 매번 생성 되므로 반복시키지  않는다.
		int count = 0;
		final int MONEY = 10000;
		//final이 붙은 모든것은 변경이 불가능하다. final은 가독성을 위해 모두 대문자로 쓴다.
		//항상 똑같은 수가 들어가는 변수는 '상수' 라고한다.
		//final은 상수를 나타내고 , 변경불가능! 변수명을 모두 대문자로 쓴다. 
		
		while (true) {
			System.out.println("---------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			
			System.out.println();
			System.out.print("원하는 자리 번호를 입력하세요 (종료 : -1) : ");
			int no = sc.nextInt(); // 0번 입력
			if (no == -1) {
				System.out.println("예약 시스템을 종료합니다");
				int total = count * MONEY;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
			} 
			//예약 처리 하기전에 이미 그 자리가 예약된 자리인지 확인 해야한다.
			//0번을 입력했으면 배열의 인덱스 0번자리를 1로 변경해서
			//예약되었다는 것을 저장해두자.
			
			
			if (seat[no] != 1) {
				seat[no] = 1;
				System.out.println(no + "번 예약 완료.");
				count++;
				System.out.println(count + " 자리가 예약되었습니다");
				System.out.println();
			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 예매하세요");
			} 

			
			
			
		} // while
		sc.close(); 
		
		//예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있다.
		//1. 지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요.!
		//{1,1,1,0,0,0}
		int count2 = 0;
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println("예약된 자리는 총 " + count2 + " 입니다");
		//2. 1로 예약된 자리가 어디인지 프린트
		String sum = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum = sum + i + "번 ";
			}
		}
		System.out.println("예약된 자리 목록 : " + sum);
		
		
		
		
	}
}
