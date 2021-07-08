package 클래스사용;

import 클래스생성.Car;

public class 자동차공장 {

	public static void main(String[] args) { // 만들지 않았는데 뜨는 함수(메서드)들은 원래 있던 함수 이것을 상속이라고 부른다.
		// 모든 패키지에서 쓸려면 앞에 public을 붙여야한다.
		Car car1 = new Car();
		Car car2 = new Car(); // 2를 추가하는 순간에 color count가 복사된다.
		car1.run();
		car1.up();  
		car1.color = "빨강";
		car1.count = 4;
		
		System.out.println(car1.color);
		System.out.println(car1.count);
		
		
		//void는 return과 함께 나올수 없다 .
	}

}
