package static1;

public class Com {

	String name;
	int age;
	String gender;

	static int count;
	static int ages;

	public Com(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		ages += age;
	}

	@Override
	public String toString() {
		return "Com [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}