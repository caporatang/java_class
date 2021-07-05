package 문제풀이;

import java.util.Iterator;
import java.util.Scanner;

public class 배열응용문제풀이3 {

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
		int[] fruit = new int[5];
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (true) {
			System.out.println("=======================");
			for (int i = 0; i < fruit.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("=======================");
			System.out.print("구매하실 과일을 입력하세요 1)사과 , 2) 바나나 , 3)포도 , 4)키위 0)종료 > > > ");
			int fruit2 = sc.nextInt();
			if (fruit2 == 0) {
				System.out.println("과일 구매 시스템을 종료합니다.");
			}
			
			
			
		} // while

	}// main

} // class
