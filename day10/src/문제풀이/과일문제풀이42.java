package 문제풀이;

import java.util.Scanner;

public class 과일문제풀이42 {

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
		

		String[] fruits = {"사과" , "바나나" , "포도" , "키위"};
		int[] count = new int[4];
		Scanner sc = new Scanner(System.in);
		
		
		
			while (true) {
				System.out.println("=====================");
				System.out.print("구매할 과일을 입력하세요 1)사과 2)바나나 3)포도 4) 키위 0)종료 > > > > > > ");
				System.out.println();
				System.out.println("=====================");
				int select = sc.nextInt();
				if (select == 0) {
					System.out.println("시스템을 종료함 . ");
					for (int i = 0; i < count.length; i++) {
						System.out.println(fruits[i] + " : " + count[i]);
					}
					
					break;
				}
				count[select - 1]++;
				System.out.println(fruits[select - 1] + "가 선택 되었습니다.");
				System.out.println();
			}
			
		
			sc.close();
		
	}

}
