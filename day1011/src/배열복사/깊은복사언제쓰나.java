package 배열복사;

public class 깊은복사언제쓰나 {

	public static void main(String[] args) {

		String[] subject = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();

		term2[0] = 22;
		term2[2] = 88;

		for (int i = 0; i < term2.length; i++) {
			System.out.print(term1[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < term2.length; i++) {
			System.out.print(term2[i] + " ");
		}
		
		System.out.println();
		
		int count = 0;// 같은 성적 누적 변수
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
			}
		}
		System.out.println("1학기 2학기 같은 성적 과목 수는 " + count + " 입니다");

		int count2 = 0;  // 오른 과목수 누적 변수 
		int subject2 = -1;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++;
			}
		}
		System.out.println("2학기에 오른 과목 수는" + count2 + " 과목 입니다.");
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				subject2++;
				subject2 = i;
			}
		}
		
		if (subject2 != -1) {
			System.out.println(subject[subject2]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
