package Library_Management;

import java.text.SimpleDateFormat;
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

	// Exception Check Price
	public static int checkPrice(int price) throws ExceptionPrice {
		if (price < 0) {
			throw new ExceptionPrice(price);
		}
		return price;
	}

	// Exception Check FormatDate

	public static boolean isValidDateFormat(String dateStr, String format) {
		// Tạo đối tượng SimpleDateFormat với định dạng mong đợi
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		// Đặt chế độ không dễ dãi (strict) để kiểm tra định dạng chính xác
		sdf.setLenient(false);

		try {
			// Cố gắng phân tích chuỗi ngày tháng
			sdf.parse(dateStr);
			return true; // Nếu không gặp lỗi, định dạng là hợp lệ
		} catch (Exception e) {
			return false; // Nếu gặp lỗi, định dạng là không hợp lệ
		}
	}

	// Feature back Menu

	public static void featureBackMenu() {
		while (true) {
			System.out.println(" You want to back menu ? [Y/n]");
			String action = scanner.next();
			if (action.equals("Y") || action.equals("y")) {
				break;
			} else if (action.equals("N") || action.equals("n")) {
				System.out.println(" -> continue ");

			} else {
				System.out.println(" Your enter not correct ! ");
			}
		}
	}

	// feature Add Book
	public static void featureAddBook(int quality) {
		for (int i = 1; i <= quality; i++) {
			System.out.println(" - Enter book name " + i + ":");
			String bookName = scanner.nextLine();
			System.out.println(" - Enter author name " + bookName + ":");
			String authorName = scanner.nextLine();
			String publishDate;

			while (true) {
				try {
					System.out.println(" - Enter publish date " + " dd/MM/yyyy " + bookName + " : ");
					publishDate = scanner.nextLine();
					try {
						if (isValidDateFormat(publishDate, "dd/MM/yyyy")) {
							break;
						} else {
							throw new Exception();
						}
					} catch (Exception e) {
						System.out.println(" error format");
					}
				} catch (Exception e) {
					System.out.println("error");
				}
			}

			System.out.println(" - Enter manufacturer name " + bookName + ": ");
			String manufacturerName = scanner.nextLine();
			int price;
			while (true) {
				try {
					System.out.println(" - Enter price  " + bookName + ": ");
					price = scanner.nextInt();
					try {
						checkPrice(price);
						break;
					} catch (ExceptionPrice e) {
						System.out.println(e.getMessage());
					}
				} catch (Exception e) {
					scanner.next();
					System.out.println(" Price must be number, try it again ! ");
				}
			}
			scanner.nextLine();
			bookManagement.addBook(new Book(bookName, authorName, publishDate, manufacturerName, price));
			System.out.println(" Add Book Succesfully ");
		}
		// Saving Book on file
//		while (true) {
//			System.out.println(" You want to save book on your file (object file and text file) ? [Y/n]");
//			String action = scanner.next();
//			if (action.equals("Y") || action.equals("y")) {
//				bookManagement.saveFileObject();
//				bookManagement.saveTextFile();
//				break;
//			} else if (action.equals("N") || action.equals("n")) {
//				break;
//			} else {
//				System.out.println(" Your enter not correct ! ");
//			}
//		}

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
			System.out.println(" Enter your quality : ");
			int quality = scanner.nextInt();
			scanner.nextLine();
			featureAddBook(quality);
			featureBackMenu();
			break;
		case 2:
			System.out.println(" 2. Sort by author name ");
			bookManagement.arrangeByAuthorName();
			featureBackMenu();
			break;
		case 3:
			System.out.println(" 3. Get All Information Book ");
			bookManagement.displayBookList();
			featureBackMenu();
			break;
		case 4:
			System.out.println(" 4. Save book object file");
			bookManagement.saveFileObject();
			featureBackMenu();
			break;
		case 5:
			System.out.println(" 5. Save book text file ");
			bookManagement.saveTextFile();
			featureBackMenu();
			break;
		case 6:
			System.out.println(" 6. Read book from file ");
			bookManagement.readFileObject();
			featureBackMenu();
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
