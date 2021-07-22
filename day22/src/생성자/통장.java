package 생성자;

public class 통장 {

	// 멤버 변수로 통장에 필요한 정보를 선언하자.
	String name;
	String ssn;
	int money;


	//public 통장() {
		// 생성자 중에서 입력값이 없는 생성자 - > 기본생성자
		// default constructor << 기본 생성자
		//다른 생성자가 하나도 없으면 자동으로 생성된다.
		//묵시적으로 만들어졌다.
		//new로 부품을 복사하면. 눈에는 보이지 않지만 이게 자동으로 생성되어 있다.
	//}
	
	public 통장(String name, String ssn, int money) {
		
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	
	
	//오버라이드 : 원래 메서드가 있던 것을 똑같은 형태로 다시 한번
	//정의해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어써진다.
	//위로 올라타다
	//기존에 있던걸 덮어 썼다는 이유로 표기해주는것이다. 
	
	
	//오버라이드(재정의) < 라고 부른다.
	@Override // @ = (at, -에) , @Override(Annotation, 표시)의 의미이다. Annotation 이라고 읽는건 숙지해두자....
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	// 멤버 메서드로 기능을 정의하자.
	public void 입금하다() {
		System.out.println("입금하다");
	}
	
}