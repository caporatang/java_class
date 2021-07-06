package 배열응용;

import java.util.Scanner;

public class 영화예매배열2 {

	public static void main(String[] args) {
		int[] seat = new int[10];    // seat에 배열 10개 생성
		Scanner sc = new Scanner(System.in); // 콘솔에 입력 받기 위한 스캐너
		int count = 0; //누적시킬 count변수
		final int MONEY = 10000; // 가격 : 절대 변하지 않아야 할 값..
		
		
		
		while (true) { // 질문을 계속 돌릴 무한루프
			System.out.println("---------------------"); // 틀
			
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			} // 위에 프린될 0 1 2 3 4.... 프린트 
			
			System.out.println();
			
			System.out.println("---------------------");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			} // 아랫줄에 프린트 될 0 0 0 0 0 0 0 >> seat[i]에 아직 0이 들어가 있어서 0 프린트.
			System.out.println();
			
			System.out.println();
			System.out.print("원하는 자리 번호를 입력하세요 (종료 : -1) : "); // 입력받을 프린트.
			int no = sc.nextInt();  // 스트링으로 받은 스캐너를 int로 받음.
			if (no == -1) {
				System.out.println("예약 시스템을 종료합니다");  
				int total = count * MONEY; // 토탈 변수에 예매횟수 * MONEY(10000원) 값을 넣는다.
				System.out.println("당신의 지불 금액은 " + total + "원");
				break; // 입력 받은 값이(no)가 -1과 같으면 트루 이므로 시스템 종료.
				// 종료 할때 지불해야 할 금액을 같이 프린트 // break > system.exit를 하면 아래 코드가 실행이 안되서 break..
			} 
			
			
			if (seat[no] != 1) { // seat[no] 에 들어가는 값이 1이 아니면 true
				seat[no] = 1;	// 위에 조건이 트루이면 seat[no]에 1을 넣는다.
				System.out.println(no + "번 예약 완료."); // no입력값에 해당하는 자리가 예약 완료라고 프린트.
				count++; // 예약한 자리가 총 몇자리인지 1씩 누적.
				System.out.println(count + " 자리가 예약되었습니다"); //count에 누적된 값을 프린트.
				System.out.println();
			} else { // 위에 조건이 false이면 프린트.
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 예매하세요");
			} 
			
		} // while
		sc.close();  // 스캐너 종료.... 
		
		
		
		
		int count2 = 0; //시스템 종료시에 전체 예약좌석을 카운트 누적 할 변수 
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			} // seat[i]가 1인 경우 예약 좌석으로 보고 count2에 누적시킨다.
		}
		System.out.println("예약된 자리는 총 " + count2 + " 입니다"); // 누적된 값을 출력
	
		String sum = ""; 
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum += i + "번 "; // 결합연산자로 묶는다.
			} //i가 반복문으로 돌면서 인덱스에 있는 값이 1이면 예약된 자리를 나타낸다.
		}
		System.out.println("예약된 자리 목록 : " + sum); // sum값을 출력한다.
		
		
		//1.틀을 먼저 만들고
		//2.시스템 종료 설정.
		// 종료 되지 않는걸로 기능 추가.
		
		
		
		
	}

}
