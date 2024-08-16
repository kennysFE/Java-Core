package Lab12;

public class HashMapStudent {
	// Atribute
	String rollNo;
	String fullName;

	// Constructor
	public HashMapStudent(String rollNo, String fullName) {
		this.rollNo = rollNo;
		this.fullName = fullName;
	}

	// Getter, Setter
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "HashMapStudent [rollNo=" + rollNo + ", fullName=" + fullName + "]";
	}

}
