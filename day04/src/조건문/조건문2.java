package 조건문;

public class 조건문2 {

	public static void main(String[] args) {
		//1.입
		int jumsu = 30;
		
		//2. 처리 : 학점부여 , 결과를 출력 , 프린트 할 변수를 하나 생성한다.
		// 깨끗한 자리를 위해 기본값 하나를 넣어둔다. 기본형이 아닌경우 null을 넣어둔다.
		String result = null; // 변수의 초기화!
		if (jumsu >= 90) {
			result = "A 학점";
			//조건을 다시 한번 더 체크해야 할 경우에 else if 를 써주고 반드시 condition이 와야 한다.
		} else if (jumsu >= 80) {
			result = "B 학점";
		} else if (jumsu >= 70) {
			result = "C 학점";
		}	
		
		
		//3. 출력 
		System.out.println(result);
	}

}
