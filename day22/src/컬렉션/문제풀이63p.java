package 컬렉션;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 문제풀이63p {

	public static void main(String[] args) {
		HashSet pro = new HashSet();
		pro.add("디자이너");
		pro.add("프로그래머");
		pro.add("DB관리자");
		System.out.println(pro);
		
		
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		HashMap phone = new HashMap();
		phone.put("1번", "엄마");
		phone.put("2번", "아빠");
		phone.put("3번", "친구");
		phone.put("4번", "동생");
		
		System.out.println("단축키 2번은" + phone.get("2번"));
		
		
		
		
		
		
		
		
		
	}

}
