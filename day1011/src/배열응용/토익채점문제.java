package 배열응용;

import java.util.Random;

public class 토익채점문제 {

	public static void main(String[] args) {
		// 답안 999개 공간
		// 내답 999개 공간

		int[] 답안 = new int[999];
		int[] 내답 = new int[999];

		Random r = new Random(11);

		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 4를 넣는경우 = 0~3 // +1을해서 최소값 설정하고. +1해서 0~3에서 1~4
			내답[i] = r.nextInt(4) + 1;
		}
		System.out.println("번호 :       답안       내답");

		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "   : " + 답안[i] + "      <->       " + 내답[i]);
		}
		// 점수를 채점하기 위해서 하나당 1점을 부여한다.

		int count = 0; // 답안과 내 답이 동일해야한다. // 정답채점 변

		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] == 내답[i]) { // 답안과 내 답의 같은 인덱스에 들어있는 값이 동일하면 점수1점 획

				count++;
			}
		}
		System.out.println("맞은 갯수는 " + count + "개 입니다");

		// 답안보다 내답이 정답이 더 큰 경우 몇 문제 카운트

		int count2 = 0; // 내답이 정답이 더 큰경우 변

		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] < 내답[i]) {
				count2++;
			}
		}

		System.out.println("답안보다 내답이 정답이 더 큰 경우는" + count2 + "문제 입니다.");

	}

}
