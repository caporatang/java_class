package 배열응용;

import java.util.Scanner;

public class 스트림을배열로문제 {

	public static void main(String[] args) {
		//전화번호입력 >>    011-245-1234
		//1)양쪽 공백을 제거하시오.
		//2)-을 기준으로 분리해내세요 String으로
		// 첫번째 문자열이 011이면 sk, 019이면 LG 나머지이면 Apple
		//두번째 글자의 길이가 4개이상이면 최신폰, 아니면 올드폰
		//전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		//						아니면 유효하지 않은 전화번호
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요 > > > > > ");
		String number = sc.next();
		
		String number2 = number.trim();
		String[] number3 = number2.split("-");
		
		if (number3[0].equals("011")) {
			System.out.println("사용하고 있는 폰기종은 sk");
		} else if (number3[1].equals("019")) {
			System.out.println("사용하고 있는 폰기종은 lg");
		} else {
			System.out.println("사용하는 폰은 apple");
		}
		
		if (number3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		if (number3.length < 10) {
			System.out.println("유효한 전화번호 입니다.");
		} else {
			System.out.println("유효하지 않은 전화번호 입니다.");
		}
		
		
		

	}

}
