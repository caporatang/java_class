package 상속;

public class GiantBabyUse {

	public static void main(String[] args) {
		GiantBaby gb = new GiantBaby();
		
		gb.name = "빅베이비";
		gb.age = 3;
		gb.resemble = "엄마";
		gb.big = true;
				
		
		gb.move();
		gb.eat();
		System.out.println(gb) ;
	}

}
