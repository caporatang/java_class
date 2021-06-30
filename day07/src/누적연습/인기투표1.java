package 누적연습;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		// for문안에 변수를 작성하면 돌면서 초기화 되므로 주의한다

		int yes = 0, no = 0; // 인트 타입의 같은 데이터 유형이면 변수를 이렇게 지정해도 된다.

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배고파요?(배고프면1, 배안고프면2)");
			switch (reply) {
			case "1":
				yes++;
				break;
			case "2":
				no++;
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "1 , 2 중 선택 해주세요");
				i--; // 디폴트가 실행 됐을때 카운트가 되지 않게 돌던 i를 하나 뺴줌
				break;
			}
		}//for
		System.out.println("배고픈 사람 " + yes + "명");
		System.out.println("배안고픈 사람 " + no + "명");
	}

}
