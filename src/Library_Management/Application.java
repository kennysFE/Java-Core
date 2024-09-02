package Library_Management;

import java.util.Scanner;

public class Application {
	public static Scanner scanner = new Scanner(System.in);
	public static BookManagement bookManagement = new BookManagement();
	public static boolean running = true;

	// Exception Check choice (1 -> 7)
	public static int checkChoice(int choice) throws ExceptionChoice {
		if (choice < 0 || choice > 7) {
			throw new ExceptionChoice(choice);
		}
		return choice;
	}

	// feature Add Book
	public static void featureAddBook(int quality) {
		for (int i = 0; i < quality; i++) {
			System.out.println(" - Enter book name " + i + ":");
			String bookName = scanner.next();
			System.out.println(" - Enter author name " + i + ":");
			String authorName = scanner.next();
			System.out.println(" - Enter publish date " + i + ": ");
			String publishDate = scanner.next();
			System.out.println(" - Enter manufacturer name " + i + ": ");
			String manufacturerName = scanner.next();
			System.out.println(" - Enter price  " + i + ": ");
			int price = scanner.nextInt();
			bookManagement.addBook(new Book(bookName, authorName, publishDate, manufacturerName, price));
			System.out.println(" Add Book Succesfully ");
		}

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
		System.out.println("| 6. Read book from object file ");
		System.out.println("| 7. End Process | ");
		System.out.println(" ++ ----------------------- ++ ");
	}

	// Action Select Choice Menu (Switch - case)
	public static void SelectActionMenu(int choice) {
		switch (choice) {
		case 1:
			System.out.println(" 1. Add book ");
			System.out.println(" Enter your quality book : ");
			int quality = scanner.nextInt();
			featureAddBook(quality);
			break;
		case 2:
			System.out.println(" 2. Sort by author name ");
			bookManagement.arrangeByAuthorName();
			break;
		case 3:
			System.out.println(" 3. Get All Information Book ");
			bookManagement.displayBookList();
			break;
		case 4:
			System.out.println(" 4. Save book object file");
			bookManagement.saveFileObject();
			break;
		case 5:
			System.out.println(" 5. Save book text file ");
			bookManagement.saveTextFile();
			break;
		case 6:
			System.out.println(" 6. Read book from file ");
			bookManagement.readFileObject();
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
