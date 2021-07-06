package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		String[] subject = {"컴퓨터", "국어", "수학", "영어", "체육"};
		
		int[] term1 = {77,88,99,55,70};
		int[] term2 = {99,100,88,80,70};

		//1. 성적이 2학기 향상된 과목의 수를 카운트해보세요
		//2. 성적이 1,2학기 동일한 과목의 수를 프린트 해보세요
		//3. 성적이 1,2학기 동일한 과목명을 프린트 해보세요
		int count = 0;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println("1학기 보다 성적이 오른 과목은 " + count + " 과목 입니다.");
		
		
		int count2 = 0;
		int location = -1;// 같은 과목인걸 저장해둘 변수 , // -1은 절대 올수 없는값을 하나 넣어둔다.
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
				location = i; // 변수에 같았던 i를 저장한다..
			}
		}
		System.out.println("1,2학기 동일한 성적의 과목 수는 " + count2 + " 입니다");
		if (location != 1) {
			System.out.println(subject[location]); // 저장한 배열값을 프린트한다
			
		} else {
			System.out.println("동일한 과목이 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
