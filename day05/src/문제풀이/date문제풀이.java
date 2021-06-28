package 문제풀이;

import java.util.Date;

public class date문제풀이 {

	public static void main(String[] args) {
		// 시간을 구해보세요.
		// 10시전이면 굿모닝
		//15시전이면 굿에프터눈
		//20시 전이면 굿이브닝
		//나머지는 굿나잇.
		Date date = new Date();
		
		int hour = date.getHours();
		
		if (hour < 10) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿에프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		
		
		
		int a = date.getDay();
		System.out.println(a);
		if (a == 0) {
			System.out.println("쉬어요");
		} else if (a == 1) {
			System.out.println("달려요");
		} else if (a == 2) {
			System.out.println("달려요");
		} else if (a == 3) {
			System.out.println("달려요");
		} else if (a == 4) {
			System.out.println("달려요");
		}else if (a == 5) {
			System.out.println("달려요");
		}else if (a == 2) {
			System.out.println("쉬어요");
		}
	
	
	}

}
