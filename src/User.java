
public class User {
	private int age;
	private String name;
	
	public int getAge() {
		return age + 1;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name + ", hi";
	}
	public void setName(String name) {
		this.name = name;
	}
}
