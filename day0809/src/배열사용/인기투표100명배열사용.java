package 배열사용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 인기투표100명배열사용 {

	public static void main(String[] args) {
		// tv에는 힙영역에 멀리 생기기 때문에 배열들의 주소값이 들어간다.
		// 기본형 데이터가 들어가는거만 값이 들어가고, 나머지는 다 힙영역에 주소값이 들어간다. 주소값이 들어가는 변수를 참조형변수 라고 부른다.
		// 기본형 데이터가 들어간 변수는 기본형 변수라고 한다.
		// @@@@@ 각 데이터들의 바이트값 확인할 것 @@@@2
		String[] name = { "아이유", "유재석", "방탄" };
		int[] tv = new int[3]; // 투표수를 저장하기 위한 배열. {0,0,0}
		// System.out.println(name[0] + " :" + tv[0]); // 배열 두가지 조합 테스트..

		Scanner sc = new Scanner(System.in);
		while (true) {
			// 사용자가 사용할 수 있도록 화면을 만들어보자.
			System.out.println("인기투표 0.아이유 1.유재석 2.BTS 3.종료");
			System.out.print("선택번호 >> ");
			int num = sc.nextInt(); // 3일때 종료.
			for (int i = 0; i < tv.length; i++) {
				System.out.println(name[i] + ": " + tv[i]);
			}
			if (num == 3) {
				
				System.out.println("시스템을 종료합니다. ");
				//System.out.println(num[0] +": " + tv[0] + "");
				//System.out.println(num[1] +": " + tv[1] + "");
				//System.out.println(num[2] +": " + tv[2] + "");
			
				System.exit(0); // 콘솔창에 terminated가 뜨거나 빨간불이 안뜬다면 시스템이 종료된것.
				//while조건에서는 증감하기전에 종료조건을 먼저한다.
			}
			//해당 인덱스에 있는 배열의 값을 증가
			tv[num]++;
			System.out.println(name[num] + " 득표" );
		}

	}

}
