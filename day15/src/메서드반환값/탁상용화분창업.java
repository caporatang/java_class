package 메서드반환값;

public class 탁상용화분창업 {

	public static void main(String[] args) {
		//처리한 결과를 호출한 곳에 다시 값을 가져와서 다음 처리에서 사용하게 하고 싶을때 리턴한다. 
		int 화분_price = 10000;
		int 삽_price  = 5000;
		
		
		계산기 cal = new 계산기(); // cal을 램에다 옮겨둠
		int result1 = cal.add(화분_price, 삽_price); 
		
		int 물조리개_price = 3000;
		int 식물_price = 9000;
		int result2 = cal.add(물조리개_price, 식물_price);
		
		//반환값이 있다 : 메서드를 호출 해서 사용 했을때 결과를 가져와서 사용할 수 있다 . 
		//계산기가 main 메서드에게 더한 결과값을 반환하다.
		int result3 = cal.add(result1, result2 );
		System.out.println("최종 결제 금액은 " + result3);
		
		
		
	}

}
