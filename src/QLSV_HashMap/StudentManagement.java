package QLSV_HashMap;

import java.util.HashMap;

public class StudentManagement {
	HashMap<String, Student> StudentManagement = new HashMap<>();

	// Add Student
	public void addStudent(Student student) {
		StudentManagement.put(student.getRollNo(), student);
	}

	// SearchStudentByRollNo
	public Student searchStudentByRollNo(String lookRollNo) {
		return StudentManagement.get(lookRollNo);
	}

	// ShowAllInforStudent
	public void showAllInforStudent() {
		if (StudentManagement.size() != 0) {
			// Duyet mang StudentManagement
			System.out.println("----------- List Student-----------");
			for (String key : StudentManagement.keySet()) {
				System.out.println("Student " + key + StudentManagement.get(key));
			}
		} else {
			System.out.println("No information on list");
		}
	}

}
