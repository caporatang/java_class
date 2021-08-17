package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 만든문제풀이2 {

	public static void main(String[] args) {
		// 팀원들이 마실 커피 종류를 입력 받아라 > 4잔
		// 아아 : 2000원 라떼 : 2500원 마끼아또 : 5000원 프라푸치노 : 5000원
		// 총 금액을 구하고 , 목록을 카운트해라
		
		Scanner sc = new Scanner(System.in);
		int ame = 2000;
		int latte = 2500;
		int ma = 5000;
		int pra = 5000;

		int total = 0;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			System.out.print("구매 하실 커피를 입력하세요 > > > > > >");
			list.add(sc.next());
		}
		System.out.println("구매한 커피 목록은 ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("아아")) {
				total += ame;
			} else if ((list.get(i).equals("라떼"))) {
				total += latte;
			} else if (list.get(i).equals("마끼아또")) {
				total += ma;
			} else if (list.get(i).equals("프라푸치노")) {
				total += pra;
			}
		}
		System.out.println();
		System.out.println(total);

	}

}
