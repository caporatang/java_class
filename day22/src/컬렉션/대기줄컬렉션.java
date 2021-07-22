package 컬렉션;

import java.util.LinkedList;

public class 대기줄컬렉션 {

	public static void main(String[] args) { // 순서대로 들어가고 순서대로 리무브된다. 잘 쓰지는 않지만 알아두자.
		LinkedList queue = new LinkedList();
		queue.add("홍길동");
		queue.add("김길동");
		queue.add("송길동");
		System.out.println(queue);
		
		
		queue.remove();
		System.out.println(queue);
		
		
	}

}
