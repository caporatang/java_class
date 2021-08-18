package 자바심화;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class 만든문제풀이1 {

	public static void main(String[] args) {
		// 미니 호텔 예약 시스템
		// 1. 예약가능한 방 호수 목록 출력
		// 2. 예약하고 싶은 방 이름, 호수를 입력하세요
		// 3. 예약 취소
		// 4. 예약 변경
		// 7. 종료

		HashMap<String, String> room = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		room.put("좋은방", "903");
		room.put("구린방", "503");
		room.put("괜찮은방", "303");
		room.put("별로인방", "403");
		room.put("자고싶은방", "703");


		while (true) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("1. 예약 가능한 방 목록");
			System.out.println("2. 예약 하기");
			System.out.println("3. 예약 취소");
			System.out.println("7. 종료");
			System.out.print("메뉴를 선택 하세요 >> ");
			String menu = sc.next();
			
			if (menu.equals("7")) {
				System.out.println("종료 되었습니다");
				break;
			} else if (menu.equals("1")) {
				System.out.println(room);
			} else if (menu.equals("2")) {
				System.out.print("예약하실 방 이름을 입력하세요");
				String name = sc.next();
				System.out.print("예약하실 방 호수 입력하세요");
				String num = sc.next();
				room.remove(name, num);
				System.out.println(name + "이 예약 되었습니다");

				System.out.println("예약 가능한 방은 " + room);
				
			} else if (menu.equals("3")) {
				System.out.print("예약하신 방 이름을 입력하세요 > > ");
				String reserve = sc.next();
				System.out.print("예약하신 방 호수를 입력하세요 > > ");
				String reserveNumber = sc.next();
				
				room.put(reserve, reserveNumber);
				System.out.println("예약이 취소 되었습니다");
				
				System.out.println("예약 가능한 방은 " + room);
				
			}  else {
				System.out.println("메뉴를 다시 입력 하세요");
			}
		} // while end

		sc.close();
	} // main end

} // class end
