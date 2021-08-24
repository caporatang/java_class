package static1;

public class Static문제풀이 {

	public static void main(String[] args) {
		Com company1 = new Com("홍길동", 25, "여");
		System.out.println(company1);
		System.out.println("회사 전체 인원은" + Com.count);
		Com company2 = new Com("김길동", 24, "남");
		System.out.println(company2);
		System.out.println("회사 전체 인원은" + Com.count);
		Com company3 = new Com("송길동", 26, "여");
		System.out.println(company3);
		System.out.println("회사 전체 인원은" + Com.count);

		System.out.println("회사원들의 평균 나이는" + Com.ages / Com.count + "입니다");

	}

}