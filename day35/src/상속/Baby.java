package 상속;

public class Baby extends Person {

 
	String resemble;
	
	
	
public void move() {
	System.out.println("기어다니다");
}



@Override
public String toString() {
	return "Baby [resemble=" + resemble + ", name=" + name + ", age=" + age + "]";
}	
	
	
	
	
}
