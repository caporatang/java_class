package 자바기본;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 만든문제풀이 {

	public static void main(String[] args) {
		// 미니로또 추첨 시스템
		// 숫자 입력 4개 받고
		// 랜덤값 4개 생성 범위는 0~10
		// 랜덤값 4개와 입력 받은값이 같으면 당첨되셨습니다
		// 아니면 다음 기회에 출력

		Scanner sc = new Scanner(System.in);
		Random r = new Random(100);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.print("첫번째 숫자를 입력하세요 > > > > >");
		int one = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 > > > > >");
		int two = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 > > > > >");
		int three = sc.nextInt();
		System.out.print("네번째 숫자를 입력하세요 > > > > >");
		int four = sc.nextInt();

		for (int i = 0; i < 4; i++) {
			list.add(r.nextInt(11));
		}

		if (one == list.get(0) && two == list.get(1) && three == list.get(2) && four == list.get(3)) {
			System.out.println("당첨 되셨습니다");
		} else {
			System.out.println("다음 기회에");
		}

	}

}
