package 문제풀이;

import java.util.Scanner;

public class 문제풀어보기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력 받을 스캐너
		int[] num = new int[5]; // 수강신청 여부를 나타내줄 배열

		while (true) { //프로그램을 반복해주는 무한루프
			System.out.println("");
			System.out.println("----수강 신청을 진행합니다----");
			System.out.println("원하는 과목을 신청 해주세요");
			System.out.println("--------------------------------");
			System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리 ");
			System.out.println("--------------------------------");
			for (int i = 0; i < num.length; i++) { // 수강신청 여부를 0, 1 로 표시해줄 배열 프린트
				System.out.print(num[i] + "       ");
			}

			System.out.println();
			System.out.print("원하는 과목코드를 입력해주세요. (종료는 0) > > > ");
			int subject = sc.nextInt(); // 입력하는 과목을 받아줄 변수

			if (subject == 0) { // 메뉴 중 0번을 누르면 종료
				System.out.println("시스템을 종료합니다. 안녕히 가세요.");
				break;// 메뉴 중 0번을 누르면 종료
			}

			System.out.print("수강 신청 하시겠습니까?  1)수강신청 2)취소 > > > ");
			int yes = sc.nextInt(); // 사용자의 입력값을 담을 변수

			if (num[subject - 1] == 0) { // 만약에 배열에 인덱스 값이 0이면 수강신청이 가능하다.
				System.out.println("수강신청이 가능합니다");
				if (yes == 1) { // yes가 1 이면 수강 신청을 하겠다고 입력한것이다.
					if (num[subject - 1] == 0) // 배열값이 0일경우
						num[subject - 1] = 1; // 배열값을 1로 바꿔준다. >> 수강신청 완료.
					System.out.println("수강신청 완료");
				} else if (yes == 2) { // 입력 2번은 수강신청을 취소한다는 입력이다.
					System.out.println("수강 신청을 취소합니다");
				}
			} else { // if문의 조건, num[subject - 1] 배열의 값이 0이 아니면(배열값이 1이 들어가있으면),
				// 수강신청이 불가능하다고 띄워준다.
				System.out.println("강의가 꽉차서 수강신청이 불가능 합니다");
			}

		} // main end
	}
} // class end
