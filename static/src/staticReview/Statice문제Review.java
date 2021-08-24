package staticReview;

public class Statice문제Review {

	public static void main(String[] args) {
		ComReview company1 = new ComReview("김태일", "남자", 15); // 에러가 나는 이유는 같은 이름을 가진 기본 생성자가 없기 때문이다.
		System.out.println(company1);
		System.out.println(ComReview.count);
		ComReview company2= new ComReview("이유리", "여자", 17); // 에러가 나는 이유는 같은 이름을 가진 기본 생성자가 없기 때문이다.
		System.out.println(company2);
		System.out.println(ComReview.count);
		ComReview company3 = new ComReview("이현서", "여자", 19); // 에러가 나는 이유는 같은 이름을 가진 기본 생성자가 없기 때문이다.
		System.out.println(company3);
		System.out.println(ComReview.count);
		
		System.out.println("직원 나이의 총합은" + ComReview.sum);
		System.out.println("직원 나이의 평균은" + ComReview.sum/ComReview.count);
		
		
	}

}
