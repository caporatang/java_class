package 문제풀이;

import java.util.Scanner;

public class 과일선택문제풀이이이이 {
	public static void main(String[] args) {

		// =====================
		// 좋아하는 과일은? 1)사과 , 2) 바나나 , 3)포도 , 4)키위, 0종료 >> 1
		// =====================
		// 사과가 선택 되었습니다.

		// =====================
		// 좋아하는 과일은? 1)사과 , 2) 바나나 , 3)포도 , 4)키위, 0종료 >> 2
		// =====================
		// 바나나가 선택 되었습니다
		// =====================
		// 좋아하는 과일은? 1)사과 , 2) 바나나 , 3)포도 , 4)키위, 0종료 >> 1
		// =====================
		// 시스템이 종료됩니다.
		// 사과 : 3 개
		// 바나나 : 2 개
		// 포도 : 1 개
		// 키위 : 2개
		// 전체 구매금액은 __얼마입니다.

		// 사과 바나나 2000 포도 키위 3000

		String[] fruit = { "사과", "바나나", "포도", "키위" };
		int[] a = new int[4];
		Scanner sc = new Scanner(System.in);

		final int price1 = 2000;
		final int price2 = 3000;

		while (true) {
			System.out.println("===========================");
			System.out.println("좋아하는 과일을 선택하세요 1.사과 2.바나나 3.포도 4.키위 0종료 > > > >");
			System.out.println("===========================");
			int take = sc.nextInt();
			if (take == 0) {
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < a.length; i++) {
					System.out.println(fruit[i] + ": " + a[i]);
				}
				int total = (a[0] * price1) + (a[1] * price1) + (a[2] * price2) + (a[3] * price2);
				System.out.println("총 구매금액은 : " + total);
				break;
			}
			if (take > 4) {
				System.out.println("과일을 다시 선택해주세요");
			} else {
				a[take - 1]++;
				System.out.println(fruit[take - 1] + "가 선택 되었습니다");

			}
		}

	}
}
