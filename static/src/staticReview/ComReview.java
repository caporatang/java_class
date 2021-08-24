package staticReview;

public class ComReview {

	String name;
	String gender;
	int age;
	
	static int count;
	static int sum;
	
	public ComReview(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum += age;
	}
	
	@Override
	public String toString() {
		return "ComReview [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
}
