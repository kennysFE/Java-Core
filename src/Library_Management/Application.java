package Library_Management;

import java.util.Scanner;

public class Application {
	public static Scanner scanner = new Scanner(System.in);
	public static boolean running = true;

	// Exception Check choice (1 -> 7)
	public static int checkChoice(int choice) throws ExceptionChoice {
		if (choice < 0 || choice > 7) {
			throw new ExceptionChoice(choice);
		}
		return choice;
	}

	// Menu Student Management
	public static void MenuSelect() {
		System.out.println(" >> -- Library Management -- << ");
		System.out.println(" ++ ----------------------- ++ ");
		System.out.println("| 1. Add Book |");
		System.out.println("| 2. Sort by author name  |");
		System.out.println("| 3. Get All Information Book|");
		System.out.println("| 4. Save book object file");
		System.out.println("| 5. Save book text file ");
		System.out.println("| 6. Read book from file ");
		System.out.println("| 7. End Process | ");
		System.out.println(" ++ ----------------------- ++ ");
	}

	// Action Select Choice Menu (Switch - case)
	public static void SelectActionMenu(int choice) {
		switch (choice) {
		case 1:
			System.out.println(" 1. Add book ");
			break;
		case 2:
			System.out.println(" 2. Sort by author name ");
			break;
		case 3:
			System.out.println(" 3. Get All Information Book ");
			break;
		case 4:
			System.out.println(" 4. Save book object file");
			break;
		case 5:
			System.out.println(" 5. Save book text file ");
			break;
		case 6:
			System.out.println(" 6. Read book from file ");
			break;
		case 7:
			System.out.println(" 7. End Process  ");
			System.exit(0);
			break;
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

			while (true) {
				try {
					System.out.println(" Enter your choice : ");
					choice = scanner.nextInt();
					try {
						checkChoice(choice);
						break;
					} catch (ExceptionChoice e) {
						System.out.println(e.getMessage());
					}
				} catch (Exception e) {
					System.out.println(" Choice must type number, try it again  ! ");
					scanner.nextLine();
				}
			}

			SelectActionMenu(choice);
		}

		scanner.close();
	}

}
