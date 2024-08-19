// Main App QLSV HashMap 

package QLSV_HashMap;

import java.util.Scanner;

public class App {

	public static Scanner scanner = new Scanner(System.in);
	public static StudentManagement studentManagement = new StudentManagement();

	// Exception Check Choice (Valid 1 -> 4)
	public static int CheckChoice(int choice) throws ExceptionChoice {
		if (choice < 0 || choice > 4) {
			throw new ExceptionChoice(choice);
		}
		return choice;
	}

	// Menu Student Management
	public static void MenuSelect() {
		System.out.println(" >> -- Student Manaement -- << ");
		System.out.println(" ++ ----------------------- ++ ");
		System.out.println("| 1. Add Student |");
		System.out.println("| 2. Search Student By RollNo |");
		System.out.println("| 3. Get All Information Student |");
		System.out.println("| 4. End Process | ");
		System.out.println(" ++ ----------------------- ++ ");
	}

	// 1. Add Student Feature
	public static void featureAddStudent() {
		System.out.println(" Enter rollNo : ");
		String rollNo = scanner.next();
		System.out.println(" Enter name : ");
		String name = scanner.next();
		System.out.println(" Enter sex : ");
		String sex = scanner.next();
		System.out.println(" Enter age : ");
		int age = scanner.nextInt();
		System.out.println(" Enter email : ");
		String email = scanner.next();
		System.out.println(" Enter address : ");
		String address = scanner.next();
		Student st1 = new Student(rollNo, name, sex, age, email, address);
		studentManagement.addStudent(st1);

	}

	// 2. Feature Search Student By RollNo
	public static void featureSearchStudentByRollNo() {
		System.out.println(" Enter rollNo you find : ");
		String lookRollNo = scanner.next();
		Student stc = studentManagement.searchStudentByRollNo(lookRollNo);
		if (stc == null) {
			System.out.println(" Invalid Data! ");
		} else
//			System.out.println(studentManagement.searchStudentByRollNo(lookRollNo));
			stc.display();
	}

	// Action Select Choice Menu (Switch - case)
	public static void SelectActionMenu(int choice) {
		switch (choice) {
		case 1: {
			System.out.println("** 1. Add Student **");
			featureAddStudent();
			break;
		}
		case 2: {
			System.out.println("** 2. Search Student By RollNo **");
			featureSearchStudentByRollNo();
			break;
		}
		case 3: {
			System.out.println("** 3. Get All Information Student **");
			studentManagement.showAllInforStudent();
			break;
		}
		case 4: {
			System.out.println("** 4. End Process **");
			System.exit(0);
		}
		default:
			System.out.println(" Invalid choice, Try choice again");
			break;
		}
	}

	// App
	public static void main(String[] args) {
		boolean running = true;

		while (running) {
			MenuSelect();
			int choice;

			// Exception Check Value User Entered
			while (true) {
				try {
					System.out.println(" Enter your choice : ");
					choice = scanner.nextInt();
					try {
						CheckChoice(choice);
						break;
					} catch (ExceptionChoice e) {
						System.out.println(e.getMessage());
					}
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println(" Pls enter number! ");
				}
			}

			// Select action
			SelectActionMenu(choice);

		}
		scanner.close();
	}
}
