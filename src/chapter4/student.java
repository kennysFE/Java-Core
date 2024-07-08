package chapter4;

public class student {
	// class atribute
	private String name;
	private int age;
	private String fullName;

	// class method
	public void java() {
		System.out.println("run 123");
	}

	// Contructor
	public student() {
	}

	public student(String name, int age, String fullName) {
		this.name = name;
		this.age = age;
		this.fullName = fullName;
	}

	// Getter
	public String getFullName() {
		return this.fullName;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	// Setter

	public void setFullName(String fullNameUpdate) {
		this.fullName = fullNameUpdate;
	}

	public void setName(String nameUpdate) {
		this.name = nameUpdate;
	}

	public void setAge(int ageUpdate) {
		this.age = ageUpdate;
	}

}
