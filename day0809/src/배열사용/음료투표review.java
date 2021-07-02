package 배열사용;

import java.util.Scanner;

public class 음료투표review {
	public static void main(String[] args) {
		//좋아하는 음료에 투표하세요. 1.아아 2.콜드브루 3.라떼 4.없어요.
		// 풀기 , ppt 32p 풀어보기 다른 ppt도 참고해서 보세요.
		
		String[] a = {"아아" , "콜드브루" , "라떼" };
		int[] b = new int[3];
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 음료는? 1.아아 2.콜드브루 3.라떼 4.없어요 ");
		System.out.print("입력하세요 > > > ");
		
		int c = sc.nextInt();
		
		if (c == 4) {
			System.out.println("먹어보세요 맛있어요");
			System.exit(0);
		}
		
		
		
		
	}
}
