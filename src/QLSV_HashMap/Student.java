// Class Student 

package QLSV_HashMap;

public class Student {
	// Atribute
	private String rollNo;
	private String name;
	private String sex;
	private int age;
	private String email;
	private String address;

	// Contructor
	public Student() {

	}

	public Student(String rollNo, String name, String sex, int age, String email, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	// Getter, Setter
	public String getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// toString
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", sex=" + sex + ", age=" + age + ", email=" + email
				+ ", address=" + address + "]";
	}

	// display infor student
	public void display() {
		System.out.println(this);
	}

}
