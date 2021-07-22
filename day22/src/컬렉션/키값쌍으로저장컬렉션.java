package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장컬렉션 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("메론", "melon");
		System.out.println(dic);
		//dic.clear();     전체 삭제
		System.out.println(dic);
		System.out.println(dic.size());
		System.out.println(dic.get("사과")); // 키로 벨류값을 프린트
		dic.put("사과", "blueapple"); // 원래 있던 키에 벨류값을 덮어씌우기도 가능하다
		System.out.println(dic.get("사과"));
		dic.remove("메론"); // 키값을 삭제하면 벨류값도 같이 지워진다.
		System.out.println(dic);
	}

}
