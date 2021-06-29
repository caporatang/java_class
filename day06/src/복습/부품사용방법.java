package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가있음
		// 클래스 이름으로 바로 사용 가능.
		// Inteager , Double, System, JOptionPane
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		// 함수를 가지고 있는 부품을 선택 ex > 함수 Inteager < 클래스 Inteager.parsint << parsint 함수라고 부

		// 벽돌
		// 시간을 알려주는 기능을 갖고 있는 부품이다. 원래 폴더에 있는걸 복사해서 램에 가져다 놓는 과정.
		// 아래 코드의 풀어 쓴 순서, Date date; > date = new Date(); 변수선언 > 복사한것을 데이트 변수에 넣어줌.

		// Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다.
		// cpu는 모든 부품을 ram에 가져다 놓고 조립한다.
		// Date date; => 저장된타입 변수며이(선언)
		// 선언 : ram에 저장공간을 만드는 것.
		Date date = new Date();

		// Random r = new Random();
		// Scanner sc = new Scanner(System.in); //()안에 입력을 넣어줘야 사용할수있음.

		int hour = date.getHours(); // 현재시간값. > 10
		System.out.println("현재 시각은" + hour + "시"); // 계산 먼저 하고 프린트.

		// 함수는 반환이 있는 것이 있고, 없는 것이 있다.
		// 반환을 return이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
		System.out.println(date.getMinutes());

		// System.out.println(System.out.println());
		// 반환값이 없는 경우에는 void라고 써있다. void는 없다라는 의미로 쓰인다.

		int month = date.getMonth() + 1; // 반환은 인트 date값이 들어간다.
		String result = "해당 계절이 없습니다.";

		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		System.out.println(result);

		System.out.println("==============================");

		int day = date.getDay(); // 요일 0이 일요일.

		if (day == 0 && day == 6) {
			System.out.println("주말에는 놀아요");
		} else {
			System.out.println("주중에는 달려요.");

		}

		while (true) {
			System.out.println("달려요!! 달려요!!"); // 1번
			System.out.println("또 달려요!!"); // 2번
			System.out.println("마지막 달려요!!"); // 3번
			break;
		}

		switch (month) {

		case 3:     // if
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:     // if
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:     // if
		case 10:
		case 11:
			System.out.println("가을");
			break;

		default: // else
			System.out.println("겨울");
			break;
		}
		System.out.println("================================");
		
		// 2월은 28일까지, 3,5,7,8, 10 , 12는 31일까지 나머지는 30
		// 정수(int) , 문자1 char , String    실수 -> 소수점은 적용할수없음.
		switch (month) {
		case 2 : 
			System.out.println("28일까지");
			break;
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : 
			System.out.println("31일까지");
			break;
			
		default:
			System.out.println("나머지는 30까지.");
			break;
		}
		
		
		
		
		
		
	} // main

} // class
