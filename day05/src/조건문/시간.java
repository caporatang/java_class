package 조건문;

import java.util.Date;

public class 시간 {

	public static void main(String[] args) {
		// 25년된 부품 Date , java util을 사용해라.
		Date date  = new Date();
		int hour = date.getHours(); // deprecated > 너무 오래되서 삭제될거야.
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시" + min + "분" + sec + "초" );
		
		
		int year = date.getYear() + 1900; // 처음 만들때 1900년을 기준으로 만들어져서 기준점을 1900으로 잡아야 한다.
		int month = date.getMonth() + 1; // 음력 기준으로 출력된다.
		int today = date.getDate();
		System.out.println(year + "년" + month + "월" + today + "일" );
		
		
		//요일 찍어내기 . getday를 쓰면 숫자로 출력이 되기 때문이다. 
		int day = date.getDay();
		System.out.println(day); 
		if(day == 0)
			System.out.println("일요일");
		else if (day == 1) {
			System.out.println("월요일");
		}else if (day == 2) {
			System.out.println("화요일");
		}else if (day == 3) {
			System.out.println("수요일");
		}	else if (day == 4) {
			System.out.println("목요일");
		}else if (day == 5) {
			System.out.println("금요일");
		} else if (day == 6) {
			System.out.println("토요일");
		}else if (day == 7) {
			System.out.println("일요일");
		}
			
		
		
	} // main

}//class
