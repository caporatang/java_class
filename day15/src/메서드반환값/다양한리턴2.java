package 메서드반환값;

import java.util.Random;

public class 다양한리턴2 {
			
		public int get (int x) {
			return 100 + x;
		}
		public double get () {
			return 11.11;
		}
	
		public int[] get3 () {
			 int[] arr = {10, 20, 30, 40, 50};
			 return arr;
		}
	
		public Random get4 () {
			 //Random r = null
			// null이면 변수만 선언해둔것이기 떄문에 안된다..
			// null point exception이 뜨면 부품이 만들어졌는지 부터 확인할것.
			
			Random r = new Random(); 
			 
			return r;
			
			
			
		}
	
	
	
	
	
	
	
}

