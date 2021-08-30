package com.mega.mvc08.casting;

public class MathTest {

	public static void main(String[] args) {
		double pie = 3.554159;
		System.out.println(Math.abs(pie));
		System.out.println(Math.round(pie)); // 반올림
		System.out.println(Math.floor(pie)); // 버림
		System.out.println(Math.ceil(pie)); // 소수점까지 표기 반올림
		System.out.println(String.format("%.2f", pie)); // 소수점 두번째 자리까지 표기
		
		System.out.printf("내 나이는 %10d살 입니다.\n", 20);
		System.out.printf("내 시력은 %.2f입니다.", 0.195);
		System.out.printf("내 이름은 %s입니다.", "홍길동");
		System.out.println();
		
		
		System.out.println(Math.random());
		
		
		
	}

}
