package 컬렉션;

import java.util.HashSet;

public class 중복없는컬렉션 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("볼펜");
		System.out.println(bag.size());
		System.out.println(bag);
		
		for (Object o : bag) {
			System.out.println(o);
		}
		

	}

}
