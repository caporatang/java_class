package 이차원배열;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {
		// set , arraylist는 내용 확인할때 for문 돌릴 필요없이 그냥 찍으면 괄호까지 해서 들어있는 값이 출력된다.
		//set: 집합 , 중복된 값을 허용하지 않는다.
		HashSet set = new HashSet();
		set.add("100");
		set.add("200");
		set.add("100");
		System.out.println(set.size());
		System.out.println(set); // 주소가 찍히지 않는다.
		
		
		ArrayList list = new ArrayList();
		//많은 양의 데이터를 다룰 때, 가변, 다양한 데이터인 경우에 사용한다.
		//object > 아무거나 넣을수 있다는 뜻이다. 제일 큰 범위. 
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자");
		
		Random r = new Random();
		list.add(r);
		//인덱싱 = 인덱스에 들어있는 값을 가져온다.
		//Arraylist는 렝스가 생성되지 않아서 길이를 알아볼려면 List size를 사용 해야 한다.
		System.out.println(list);
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		//System.out.println(list.get(2));
		//System.out.println(list.get(3));
		//System.out.println(list.get(4));
		//System.out.println(list.get(5));
		
		System.out.println(list.size());
		
		//어레이 리스트는 포문이 자동으로 변수지정이 되지 않는다. 사이즈로 변경해주어야한다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		
		list.remove(5); // remove는 특정한 인덱스값을 지워야한다.  
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	
	
	
	}

}
