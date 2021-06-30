package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 입력 >>>");
		int n1 = sc.nextInt(); // String >>>> int
		System.out.print("숫자 2 입력 >>>");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("앞 숫자가 더 크다");
		} else {
			System.out.println("뒤에 입력한 숫자가 더 큽니다.");
		}
		
		System.out.print("당신이 좋아하는 과목은?");
		String a1 = sc.next();
		switch (a1) {
		case "java":
			System.out.println("jsp로 점프!");
			break;

		default:
			System.out.println("재밌는 자바^^");
			break;
		}
		
	}

}
