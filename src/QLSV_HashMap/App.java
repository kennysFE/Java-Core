// Main App QLSV HashMap 

package QLSV_HashMap;

import java.util.Scanner;

public class App {

	public static Scanner scanner = new Scanner(System.in);
	public static StudentManagement studentManagement = new StudentManagement();
	public static boolean running = true;

	// Feature Back Menu
	public static void FeatureBackMenu() {
		while (true) {
			System.out.println(" - You want back menu student management ? [y/n]");
			System.out.println(" - Your Enter : ");
			String checkBack = scanner.next();
			if (checkBack.equals("y") || checkBack.equals("Y")) {
				running = true;
				break;
			} else if (checkBack.equals("n") || checkBack.equals("N")) {
				running = false;
			} else {
				System.out.println(" - Invalid character ! ");
			}

		}
	}

	// Exception Check Choice (Valid 1 -> 4)
	public static int CheckChoice(int choice) throws ExceptionChoice {
		if (choice < 0 || choice > 4) {
			throw new ExceptionChoice(choice);
		}
		return choice;
	}

	// Exception Check Age Student

	public static int CheckAgeStudent(int age) throws ExceptionAgeStudent {
		if (age < 0 || age > 1000) {
			throw new ExceptionAgeStudent(age);
		}
		return age;
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
	public static void featureAddStudent(int QualityStudent) {
		for (int i = 1; i <= QualityStudent; i++) {
			System.out.println(" - Enter rollNo Student " + i + ":");
			String rollNo = scanner.next();
			System.out.println(" - Enter name Student " + i + ":");
			String name = scanner.next();
			System.out.println(" - Enter sex Student " + i + ": ");
			String sex = scanner.next();

			// Check Age

			int age;
			while (true) {
				try {
					System.out.println(" - Enter age Student " + i + ": ");
					age = scanner.nextInt();
					try {
						CheckAgeStudent(age);
						break;
					} catch (ExceptionAgeStudent e) {
						System.out.println(e.getMessage());
					}
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println(" * Age must be the number, Try it again ");
				}
			}

			System.out.println(" - Enter email Student " + i + ": ");
			String email = scanner.next();
			System.out.println(" - Enter address Student " + i + ": ");
			String address = scanner.next();
			Student st1 = new Student(rollNo, name, sex, age, email, address);
			studentManagement.addStudent(st1);
		}
	}

	// 2. Feature Search Student By RollNo
	public static void featureSearchStudentByRollNo() {
		System.out.println(" - Enter rollNo you find : ");
		String lookRollNo = scanner.next();
		Student stc = studentManagement.searchStudentByRollNo(lookRollNo);
		if (stc == null) {
			System.out.println(" - Invalid Data ! ");
		} else
			stc.display();
	}

	// Action Select Choice Menu (Switch - case)
	public static void SelectActionMenu(int choice) {
		switch (choice) {
		case 1: {
			System.out.println("** 1. Add Student **");
			System.out.println(" - Enter number of Student on List ");
			int numberStudent = scanner.nextInt();
			featureAddStudent(numberStudent);
			FeatureBackMenu();
			break;
		}
		case 2: {
			System.out.println("** 2. Search Student By RollNo **");
			featureSearchStudentByRollNo();
			FeatureBackMenu();
			break;
		}
		case 3: {
			System.out.println("** 3. Get All Information Student **");
			studentManagement.showAllInforStudent();
			FeatureBackMenu();
			break;
		}
		case 4: {
			System.out.println("** 4. End Process **");
			System.exit(0);
		}
		default:
			System.out.println(" - Invalid choice, Try choice again");
			break;
		}
	}

	// App
	public static void main(String[] args) {

		while (running) {
			MenuSelect();
			int choice;

			// Exception Check Value User Entered
			while (true) {
				try {
					System.out.println(" - Enter your choice : ");
					choice = scanner.nextInt();
					try {
						CheckChoice(choice);
						break;
					} catch (ExceptionChoice e) {
						System.out.println(e.getMessage());
					}
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println(" - Pls enter number! ");
				}
			}

			// Select action
			SelectActionMenu(choice);

		}
		scanner.close();
	}
}
