package db;

import dto.회원bag;

public class 회원DAO2 {
	
	
	
	
	
	//메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//			  중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	//			  파라메터, parameter
	public void create(회원bag bag) {
		//메서드 안에서 만들어진 변수임. 
		//변수는 (타입 변수명;) 해야 만들어진다(선언!)
		//선언의 위치가 변수의 생존범위를 결정한다.
		//파라메터는 지역변수이다. 이 지역을 벗어나서는 사용 불가능하다.
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		
		
		
		// 받아온 bag을 get을 이용해서 꺼낸다.
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name은 " + bag.getName());
		System.out.println("전달된 tel은 " + bag.getTel());
	}
	//하나의 이름으로 메서드 이름을 쓸 수 있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성(오버로딩)
	public void read(String id) {

	}
	
	public void read() {

	}
	
	
	public void update() {

	}

	public void delete() {

	}

}
