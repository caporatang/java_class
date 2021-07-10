package 클래스생성;

public class 브런치카페 {

	public static void main(String[] args) {
		// 시작은 브런치 카페 , 부품 class를 사용하면 된다. 
		int coffeePrice = 3500;
		int coffeeCount = 5;
		
		int bagelPrice = 3000;
		int bagelCount = 3;
		
		
		계산기 cal = new 계산기();
		cal.곱하기(coffeePrice, coffeeCount); // 곱하기 메서드가 계산기  class에 기능이 있으므로 여기서 값을 쉼표 , 로 준다.
		cal.곱하기(bagelPrice, bagelCount); // 곱하기 메서드가 계산기  class에 기능이 있으므로 여기서 값을 쉼표 , 로 준다.
		
		//커피 주문해보세요
		cal.order("커피");
		
		//베이클 주문 해보세요
		cal.order("베이글");
		cal.더하기(1000, 2000);
		cal.나누기(55.5, 11.2);
		
		

	}

}
