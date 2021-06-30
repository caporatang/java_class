package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {
		// 인기투표 유재석 , 아이유 , bts
		//149쪽 150쪽 풀어보기@@@@@@@@@@@@@
		//sc.nextint   ,,,    r.nextint   -> 이름이 같아도 기능은 다르다. 혼동하지 말것 
		int yes = 0, no = 0,a1=0;

		for (int i = 0; i < 10; i++) {
String aoo = JOptionPane.showInputDialog( "좋아하는 연예인은? (1.유재석 2.아이유 , 3. bts)");
	switch (aoo) { //switch
	case "1":
		yes++;
		break;
	case "2":
		no++;
		break;
	case "3":
		a1++;
		break;

	default:
		JOptionPane.showMessageDialog(null, "1 2 3 중에 다시 선택해주세요");
		i--;
		break;
	}	
	
	} // for
		System.out.println("유재석 " + yes + "명");
		System.out.println("아이유 " + no + "명");
		System.out.println("bts " + a1 + "명");
		
		
	}

}
