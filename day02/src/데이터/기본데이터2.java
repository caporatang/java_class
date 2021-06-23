package 데이터;

public class 기본데이터2 {

	public static void main(String[] args) {
// 				기본데이터2.java
// 				---------------------
// 				색을 저장(r)
// 				호실을 저장(709)
// 				평균나이를 저장(27.5)
// 				-------------------
// 				1.선언
//          	2.대입 
//		    	3.출력
//          	4.그림
		// 예약어는 저장공간의 공간을 쑬 수 없다.
		// char , int, class
		//1.선언
		//color= 'ㅅ';
		// 변수가 선언되지 않아 값을 대입할 수 없다.
		
		char color;
		int num;
		double avgAge; //중간에 대문자 섞어 쓰기 낙타표기법 , avg_age(파이썬, 뱀표기법)
		// int는 계산의 대상이 될때 잡는것. 호수와 같은것은 원래는 잡지 않음(이번엔 교육 목적)
		//2.할당, 대입
		color = 'r';
		num = 709;
		avgAge = 27.5;
		//변수(variable, 값이 변한다.) : 램에 저장공간에 들어갈 값은 변할 수 있다.
		//램에 만들어지는 저장공간을 변수라고 부른다.
		
		System.out.println("색은 : " + color); //글자가 들어가면 결합연산자
		System.out.println("방번호는 : " + num + "호");
		System.out.println("평균나이 : " + avgAge);
		
		//자동완성 : ctrl + spacebar
		//한줄 복사 : ctrl + alt + 화살표아래
		//한줄 이동 : alt + 이동방향 화살표
		//한줄 삭제 : ctrl + d
		
		color = 'b';
		//변수 하나에는 값이 하나만 저장!
	}

}
