// Main App QLSV HashMap 

package QLSV_HashMap;

import java.util.Scanner;

public class App {

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

	// Action Select Choice Menu (Switch - case)
	public static void SelectActionMenu(int choice) {
		switch (choice) {
		case 1: {
			System.out.println("** 1. Add Student **");
			break;
		}
		case 2: {
			System.out.println("** 2. Search Student By RollNo **");
			break;
		}
		case 3: {
			System.out.println("** 3. Get All Information Student **");
			break;
		}
		case 4: {
			System.out.println("** 4. End Process **");
			System.exit(0);
		}
		default:
			System.out.println("Invalid choice, Try choice again");
			break;
		}
	}

	// App
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
