package 복습;

public class 복습1 {

	public static void main(String[] args) {
		//int 정수는 한자리를 가지고 올림이나 계산을 하는걸 기준으로 정수 실수 데이터 구분.
		//boolean 1 , char 2 , int 4, double 8, 각 숫자는 차지하는 바이트.
		
	int classNo = 8;
	double temp = 26.2;
	char day = '목';
	boolean food = false;
	String lunch = "1층가서 생각해보자."; // string에 30바이트. int 등 합친것보다 많음.
	
	System.out.println("오늘 온도 " + temp + "도 ");
	System.out.println("오늘 수업 수 " + classNo);
	System.out.println("오늘 요일 " + day);
	System.out.println("아침 먹었나요 " + food);
	System.out.println("점심 어떻게 하지?" + lunch);
	System.out.println(temp == 27.5);
	System.out.println(temp > 27.5);
	//오늘 온도 29.2로 변경하여, 어제 온도보다 낮은지?
	temp = 29.2;
	
	System.out.println(temp < 27.5);
	
	
	
	
	
	}

}
