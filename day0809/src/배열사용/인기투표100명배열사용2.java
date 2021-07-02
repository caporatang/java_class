package 배열사용;

import java.util.Scanner;

public class 인기투표100명배열사용2 {

	public static void main(String[] args) {
		String[] name = {"아이유" , "유재석" , "방탄"}; //이름 저장 배열
		int[] tv = new int[3];       //투표수 저장 배열
		
		Scanner sc = new Scanner(System.in); // 콘솔창에 입력받기 위한 스캐너.
		
		//인기투표를 반복적으로 돌려야 되므로 입력창부터 while로 묶는다.
		while (true) {
			System.out.println("인기투표 1.아이유 2.유재석 3,BTS 4.종료"); //입력창 만들기.
			System.out.print("선택번호 > > > "); //입력창 만들기.
			int num = sc.nextInt(); // string을 int로 받기
			// -1 을 하는 이유는 컴퓨터는 배열을 0부터 시작하기 때문에 목록에서 1이라고 입력을 하면 컴퓨터한테 0 이라고 입력할 수 있다.
			for (int i = 0; i < 3; i++) {
				System.out.println(name[i] + " :" + tv[i]);
			}// 지역변수를 이용해서 순차적으로 name , tv 인덱스값을 출력한다.
			
			if (num == 4) {
				System.out.println("시스템 종료");
				System.exit(0);
				//num에 입력한값 3이면 시스템 종료.
			} 
			tv[num - 1]++;
			// int로 입력받은 값이 num에 들어 있으므로 num = 1 num = 2 num = 3 이 들어가면
			// tv에 있는 인덱스값에 해당하는게 1씩 증가된다. 
			System.out.println(name[num - 1 ] + " 득표"); // name에 해당하는, num에 들어간 인덱스값을 프린트한다.
		}
		
		
	}

}


