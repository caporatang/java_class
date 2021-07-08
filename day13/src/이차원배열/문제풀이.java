package 이차원배열;

import java.util.ArrayList;
import java.util.HashSet;

public class 문제풀이 {

	public static void main(String[] args) {
		// 동계 올림픽 피겨 순위
		//1위 : 김연아
		//2위 : 김영아
		//3위 : 김양아
		//4위 : 김용아
		//4위가 반칙을 하여 탈락함 , 전체 명단을 다시 프린트
		
		
		//2. 아침에 가방에 넣은 물건들. 가방이 무거워지면 안되니까 하나씩만 넣으려고 함.
		//내 가방은 같은 물건이 하나 이상 들어가지 않는다.
		//실제로 내가 넣은 것 : 휴지, 휴대폰, 볼펜 , 휴지
		//내 가방에 들어간 물건의 개수와 물건들을 쓰시오.
		
		
		HashSet pack = new HashSet();
		
		pack.add("휴지");
		pack.add("휴대폰");
		pack.add("볼펜");
		pack.add("휴지");
		
		System.out.println("내 가방에 들어간 물건은 " + pack);
		
		System.out.println("내 가방에 들어간 물건의 개수는 " + pack.size());
		
		
		
		
		ArrayList rank = new ArrayList();
		rank.add("김연아");
		rank.add("김영아");
		rank.add("김양아");
		rank.add("김용아");
		for (int i = 0; i < rank.size(); i++) {
			System.out.println((i + 1) + "위 " + rank.get(i));
		}
		
		System.out.println();
		
		rank.remove(3);
		for (int i = 0; i < rank.size(); i++) {
			System.out.println((i + 1) + "위 " + rank.get(i));
		}
		
	}

}
