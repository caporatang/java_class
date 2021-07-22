package 컬렉션;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) { // list를 찍으면 주소가 나와야하지만 toString이 오버라이드 적용되어있다.
		ArrayList list = new ArrayList(); // arraylist는 모든 타입의 데이터를 넣을 수 있다
		list.add("홍길동");
		list.add("100"); //-> 기본형 > 클래스변환 > Object
		list.add("22.22");
		list.add("true");
		list.add('남');
		list.add(new JFrame());
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		list.add("목요일"); // 리사이징 > 길이 늘리기 가능
		System.out.println(list.size());
		list.remove(5); // 리사이징 > 리무브로 특정 인덱스값을 삭제
		list.remove("홍길동");  // 리사이징 > 리무브로 특정하게 들어간 값을 입력해도 지울수있다.
		System.out.println(list.size());
		System.out.println(list.get(0));
		list.add(0, "김길동"); // 0번 앞에 김길동을 add한다. add두번째 생성자.
		System.out.println(list);
		list.set(0, "홍길동");
		System.out.println(list);
		
		
		
	}

}
