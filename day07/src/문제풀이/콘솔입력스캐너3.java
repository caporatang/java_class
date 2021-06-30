package 문제풀이;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		// 나이 입력 >> 100 nextint
		// 내년 나이는 101세
		// 키를 입력 88.8 nextdouble
		// 내년 키는 98.8
		// 저녁을 먹었는지 입력(true/false) >> true nextboolean
		// 배가 부르시겠군요
		// 올해의 목표는 >> 열심히 살자 입력받기 nextline
		// 올해의 목표는 열심히 살자!!! 프린트
		
		
		// 부울렌 1 캐릭터2 인트 4 더블8 < 바이트 숫자
		// 기본형이 아닌 변수는 공간이 4바이트가 잡힌다.
		// 부품 기본형이 1248  ,  sc jbutton 이런 애들이 4바이트.
		//

		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요>>>");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + (age + 1) + "세");

		System.out.print("당신의 키를 입력하세요>>");
		double cm = sc.nextDouble();
		System.out.println("내년 키는 " + (cm + 10.0));

		System.out.print("저녁을 먹었는지 입력하세요(true / false)>>");
		Boolean t = sc.nextBoolean(); // t라는 변수에 true가 이미 들어있으므로 boolean은 비교연산자를 쓰지 않아도 된다.
		if (t) {
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배 고프시겠군요");
		}
		sc.nextLine();
		System.out.print("올해의 목표는?>>");
		String hard = sc.nextLine(); // nextline은 가장 최근에 입력된 enter를 인식한다.
		System.out.println("올해의 목표는 " + hard + "!!!!");
	}

}
