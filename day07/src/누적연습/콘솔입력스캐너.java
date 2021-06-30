package 누적연습;



import java.util.Scanner; // java.util.(Scanner) 스캐너 자리에 *를 넣으면 앵간한거 다 임포트 한다는 뜻.
//java.utill.a.Test;  < 쓸수 없다. : *를 넣으면 하위패키지를 쓰고싶으면 하위패키지는 따로 임포트를 해줘야 한다.
//import java.util.a.Test
			
public class 콘솔입력스캐너 {

	public static void main(String[] args) {
			// scan은 보통 입력용이다.
			// scan은 () 안에 입력값이 반드시 있어야한다.
		// 프린트 > 입력 코드 > 입력한거 처리 > 출력
		Scanner sc = new Scanner(System.in); //램에 복사해서 불러온 단계   ,   scan 변수는 보통 sc로 한다.
		System.out.print("당신의 이름을 입력하시오.>>>");
		String name =sc.next(); // String 입력을 받을 수 있다.   여러 글자 입력을 받을수 있다 .
		System.out.println("당신의 이름은 " + name);
		System.out.print("당신의 소속을 입력하시오.>>>");
		String com = sc.next();
		System.out.println("당신의 소속은 ?" + com);
		
		

	}

}
