package Lab12;

public class Student {

	// Atribute
	private String fullName;
	private int age;

	// Constructor
	public Student() {

	}

	public Student(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	// Getter, Setter
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", age=" + age + "]";
	}

}
