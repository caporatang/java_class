package 문제풀이;

import java.util.Scanner;

public class 과일문제풀이42 {

	public static void main(String[] args) {
		// 종료될때 총 지불해야할 가격을 입력하세요.
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;

		final int price = 10000;
		
		
		while (true) {
			System.out.println("------------------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("------------------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("원하는 좌석을 입력하세요 ....종료는 -1을 입력하세요> > > > > > > >");
			System.out.println();
			int number = sc.nextInt();
			if (number == -1) {
				System.out.println("시스템을 종료합니다.");
				int total = count * price;
				System.out.println("당신이 총 지불할 금액은" + total + "입니다");
				break;
			}
			
			
			if (num[number] != 1) {
				num[number] = 1;
				count++;
				System.out.println(count + "자리가 예약되었습니다.");
			} else {
				System.out.println("이미 예약된 자리입니다 ");
			}
		}

		int count2 = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1 ){
				count2++;
			}
		}
		System.out.println("총 예매된 자리는 " + count2 + "자리 입니다");
		
		String sum = "";
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) {
				sum = sum + i +"번";
			}
		}
		System.out.println("예약된 자리는" + sum +"입니다 ");
		
		
		
		
		

	} // main

}// class
