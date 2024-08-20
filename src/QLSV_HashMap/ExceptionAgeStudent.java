package QLSV_HashMap;

public class ExceptionAgeStudent extends Exception {

	private int age;

	public ExceptionAgeStudent(int age) {
		this.age = age;
	}

	public String getMessage() {
		return " Age not invalid " + age + "";
	}
}
