package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실에서핸드폰 {

	public static void main(String[] args) {
		Phone phone1 = new Phone(); // 힙영역에 phone1이 생성된다
		phone1.color = "골드";
		phone1.shape = "아이폰";
		phone1.call();
		phone1.me();
		
		System.out.println(phone1.color);
		System.out.println(phone1.shape);
		
		Dog dog = new Dog();
		dog.color2 = "갈색";
		dog.kind = "리트리버";

		System.out.println(dog.color2);
		System.out.println(dog.kind);
		System.out.print(dog.color2 + dog.kind + "가 ");
		dog.eat();
		dog.walk();
		
		
		
	}

}
