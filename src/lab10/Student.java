package lab10;

import java.io.Serializable;

public class Student implements Serializable {

	// Serializable : La mot bo cong cu giup chuyen do giua Object -> Binary va
	// nguoc lai

	// Atribute

	private String fullName;
	private String address;

	// Constructor

	public Student() {

	}

	// Getter,Setter

	public Student(String fullName, String address) {
		this.fullName = fullName;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFileLineFormat() {
		return fullName + "," + address;
	}

	public static String getFileHeaderFormat() {
		return "fullName,address";
	}

	@Override
	public String toString() {
		return "Student{" + "fullname=" + fullName + ", address=" + address + '}';
	}

}
