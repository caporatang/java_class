package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		// 나에 대한 정보
		//내이름, 내나이, 내키, 성별, 점심먹었나요?
		String name = "김태일"; //스트링(문자열)
		int age = 27;
		double weight = 69;
		char gender = 'M';
		boolean food = true; // false, 부울렌
		
		System.out.println(name);
		System.out.println(weight);
		System.out.println(age + 1);
		
		weight = weight - 10;
		System.out.println(weight);
	}

}
