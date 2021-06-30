package 문제풀이;

import java.util.Scanner;

public class 콘솔입력스캐너4 {
	public static void main(String[] args) {
		// 입력값 세개
		Scanner sc = new Scanner(System.in);
		System.out.print("안정성 점수를 입력하세요 >>");
		Double a1 = sc.nextDouble();
		System.out.print("속도 점수를 입력하세요 >>");
		Double b1 = sc.nextDouble();
		System.out.print("연비 점수를 입력하세요 >>");
		Double c1 = sc.nextDouble();

		double a2 = a1 * 0.3;
		double b2 = b1 * 0.5;
		double c2 = c1 * 0.2;

		double total = a2 + b2 + c2;
		System.out.println(total);

		if (total >= 90) {
			System.out.println(total + "점 최우수 입니다");
		} else if (total >= 80) {
			System.out.println(total + "점 우수 입니다");
		} else if (total >= 70) {
			System.out.println(total + "점 보통 입니다");
		} else {
			System.out.println(total + "점 미달 입니다");
		}

	}
}
