package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList순서있는목록문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println("1등 : " + list.get(0));
		System.out.println("2등 : " + list.get(1));
		System.out.println("3등 : " + list.get(2));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등: " + list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		
		
	}

}
