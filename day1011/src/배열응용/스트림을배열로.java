package 배열응용;

import java.util.Scanner;

public class 스트림을배열로 {

	public static void main(String[] args) {
		// String s = "감자,고구마,양파";
		// String[] s2 = s.split(","); // 나눠줄 기준 -을 입력한다. // {"감자","고구마","양파"}

//		System.out.println(s2[0]);
//		System.out.println(s2[1]);
//		System.out.println(s2[2]);
//		System.out.println(s2.length);
//		System.out.println(s2[0].equals(s2[1]));

		// 일, 월 , 화 날씨를 순서대로 입력해보세요. ("흐림,맑음 . 흐림")
		// 흐림이 몇개인지,맑음이 몇개인지 세어보세요.
		// 1.sc.next()로 받아서
		// 2. 스트링을 배열로 변환해서 넣으세요
		// 3.count해보세요

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count2 = 0;

		System.out.println("일 월 화 날씨를 입력 해주세요 > > > ");
		String weather = sc.next();
		String[] weather2 = weather.split(",");

		System.out.println(weather2[0]);

		for (int i = 0; i < weather2.length; i++) {
			if (weather2[i].equals("흐림")) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("일 월 화 중에 흐린날은" + count + " 일 입니다");
		System.out.println("일 월 화 중에 맑은날은" + count2 + " 일 입니다");

	}

}
