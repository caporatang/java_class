package 자바심화;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제2 {

	public static void main(String[] args) {

		// 친구목록 들어갈 리스트
		HashMap<String, String> friends = new HashMap<>();
		friends.put("홍길동", "011-1234-5678");
		friends.put("김길동", "010-2345-1234");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("----------------------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 이름 변경");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택 하세요 >> ");

			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템 종료");
				break;
			} else if (choice == 1) { // 1. 친구 리스트 출력
				System.out.println(friends);
			} else if (choice == 2) { // 2. 친구 추가
				System.out.print("추가할 친구 이름을 입력하세요 > > >");
				String name = sc.next();
				System.out.print("추가한 친구의 전화번호를 입력하세요");
				String tel = sc.next();
				int size1 = friends.size(); // 친구 추가 전 사이즈
				friends.put(name, tel);
				int size2 = friends.size(); // 친구 추가 된 후 사이즈
				if (size2 > size1) {
					System.out.println(name + "님이 친구 추가 되었습니다");
				}
				System.out.println();
			} else if (choice == 3) { // 3. 친구 삭제

				for (Entry<String, String> element : friends.entrySet()) {
					String key = element.getKey();
					String value = element.getValue();
					System.out.println(String.format(key + value));
				}

				System.out.print("삭제할 친구 이름을 입력하세요 > > ");
				String no = sc.next();
				friends.remove(no);

				System.out.println("삭제 완료. 삭제 후 남은 친구 목록은");

				for (Entry<String, String> element : friends.entrySet()) {
					String key = element.getKey();
					String value = element.getValue();
					System.out.println(String.format(key + value));
				}

			} else if (choice == 4) { // 4.친구 이름 변경
				System.out.println("수정할 친구를 고르시오.");
				for (Entry<String, String> element : friends.entrySet()) {
					String key = element.getKey();
					String value = element.getValue();
					System.out.println(String.format(key + value));
				}
				System.out.print("수정할 이름을 입력하시오 > > ");
				String index = sc.next();
				System.out.print("수정할 전화번호를 입력하시오 > > ");
				String name = sc.next();
				friends.replace(index, name);
				System.out.println("수정이 완료 되었습니다");

			} else { // 1~4, 9도 아닌 경우
				JOptionPane.showMessageDialog(null, "해당 숫자가 없습니다. 다시 입력 해주세요");
			}

		}

		sc.close();

	}

}
