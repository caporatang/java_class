package 자바기본;

import java.util.Scanner;

public class 기본입출력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int sum; >> 쓰레기값 상태 : 연산도 할 수 없고, 출력도 안되는 상태를 말한다.
		int sum = 0; // 쓰레기값 대신 처음값을 넣어주는 것. 초기화, 변수초기화
		
		// 변수초기화를 반드시 해주어야 하는 경우는??
		// 변수 초기화는 반드시 해주어야 한다.
		// 자동으로 되는 경우가 있음.
		// (전역변수, 멤버변수는 자동 초기화된다) >> 전역 변수는 클래스 전체영역에서 사용 가능한 변수
		// 변수 선언의 위치에 따라 사용할 수 있는 범위가 달라진다.
		// 변수 선언이 클래스 바로 아래 되어야 전체 영역에서 사용 가능하다.
		// 자동으로 안되는 경우는 수동으로 초기화를 해주어야 한다.(지역변수, 로컬 변수)
		// 로컬변수는 반드시 수동으로 초기화를 해주어야 한다.
		
		
		for (int i = 0; i < 5; i++) {

			System.out.print("오늘 온도는 몇도인가요 ?");

			int temp = sc.nextInt();

			if (temp >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜찮아요");
			}
			sum = sum + temp;
		}
	
		double avg = sum / 5.0; // 자바에서는 정수끼리 연산은 무조건 정수다.
								// 자바에서는 하나라도 실수이면 , 연산의 결과는 무조건 실수이다.
		System.out.println("평균은" + avg);
		//double avg = (double)sum / 5.0;
		//(바꾸고 싶은 타입) cpu가 ram에 있는 것을 가져다가 type을 강제로 변경한다
		sc.close();

	}

}
