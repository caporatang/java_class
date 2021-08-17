package 자바기본;

import java.util.Scanner;

public class 기본입출력문제 {

	public static void main(String[] args) {
	
		// 문제
		// 오늘 마신 커피 잔 수를 스캐너를 사용하여 물어보기
		// 2잔 이하이면 적당해요
		// 3 ~ 6 이면 너무 많아요
		// 그 이상이면 중독? 
		
		Scanner sc = new Scanner(System.in);
		// 콘솔과 자바 프로그램간의 입력 스트림이 만들어진다.
	

		for (int i = 0; i < 10; i++) {
			System.out.print("오늘 커피는 몇잔 마셨나요 ? >>>"); // 콘솔에 찍기
			int coffee = sc.nextInt();
			// 컴퓨터는 String으로 인식하기 때문에 입력값을 int로 인식 시켜주고 변수에 저장
			if (coffee <= 2) {
				System.out.println("적당해요");
			} else if (coffee <= 6) {
				System.out.println("너무 많아요");
			} else {
				System.out.println("중독?");
			}
		}
		sc.close();
	}

}
