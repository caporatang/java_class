package 자바기본;

import java.util.Scanner;

public class 기본입출력3배열문제 {

	public static void main(String[] args) {
		// 회사에서 다같이 커피를 마실건데 회비는 3만원이예요
		// 6명이서 마실꺼고, 회비가 넘어가면 못마셔요
		// 주문금액 총액을 구하고
		// 양심없이 비싼거 시킨 팀원들의 커피값들을 출력해보아요.

		Scanner sc = new Scanner(System.in);
		int[] price2 = new int[6];
		int total = 0;

		for (int i = 0; i < 6; i++) {
			System.out.print("마시고 싶은 커피 금액을 입력하세요 > > > > > ");
			int price = sc.nextInt();
			price2[i] = price;
			total = total + price;
		}

		for (int j = 0; j < price2.length; j++) {
			if (price2[j] < 5000) {
				System.out.println((j + 1) + "번 주문 하신 분 괜찮아요");
			} else {
				System.out.println((j + 1) + "번 주문 하신 분 너무 비싸요");
			}

//			System.out.print(price2[j] + " ");
		}

		System.out.println("주문 금액 총 합은" + total);
		if (total < 30000) {
			System.out.println("주문해서 맛있게 먹어요");
		} else {
			System.out.println("못마셔요");
		}

	}

}
