package 클래스생성;

public class Car {
	
		//전역변수(global , 글로벌 변수) < -- > 지역변수(local, 로컬변수)  ,..저장되는 메모리 위치도 다
		//class 설계를 모델링이라고 한다.
		//성질 : 색(color) , 바퀴수(count) , 변수로 만든다.     ---- > 맴버 변수라고 부른다.
		public String color; // 클래스 밑에 생성되는 거고 , 참조형이기 때문에 자동 초기화 = null
		public int count; // 자동 초기화 0
		
		//동작 : 멤버 메서드 --> member method 맴버 매서드 라고 부른다.
		public void run() { // method 메서드
			//함수의 기능을 정의한다.
			System.out.println("네 바퀴로 달리다");
			
		}
		
		public void up() { 
		System.out.println("속도를 20씩 빨라진다.");
		}
		
		
		
}
