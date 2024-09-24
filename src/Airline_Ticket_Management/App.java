package Airline_Ticket_Management;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);
	public static boolean running = true;
	public static AirlineTicketManagement airlineTicketList = new AirlineTicketManagement();

	// Exception choice select menu
	public static int checkChoice(int choice) throws ExceptionCheckNumber {
		if (choice < 0 || choice > 7) {
			throw new ExceptionCheckNumber(choice);
		}
		return choice;
	}

	// Exception priceTicket
	public static int checkPriceTicket(int priceTicket) throws ExceptionCheckNumber {
		if (priceTicket < 0) {
			throw new ExceptionCheckNumber(priceTicket);
		}
		return priceTicket;
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

	// Feature add airline ticket
	public static void addAirlineTicket(int quality) {
		for (int i = 1; i <= quality; i++) {
			System.out.println(" - Enter code flight " + i + ":");
			String codeFlight = scanner.nextLine();

			System.out.println(" - Enter name flight " + codeFlight + ":");
			String nameFlight = scanner.nextLine();

			String dateTakeOff;

			while (true) {
				try {
					System.out.println(" - Enter date take Off " + " dd/MM/yyyy " + codeFlight + " : ");
					dateTakeOff = scanner.nextLine();
					try {
						if (isValidDateFormat(dateTakeOff, "dd/MM/yyyy")) {
							break;
						} else {
							throw new Exception();
						}
					} catch (Exception e) {
						e.getStackTrace();
						System.out.println(" Pls enter true format date take off (dd/MM/yyyy) ");
					}
				} catch (Exception e) {
					e.getStackTrace();
				}
			}

			System.out.println(" - Enter baggage signed " + codeFlight + ": ");
			String baggagesign = scanner.nextLine();

			int priceTicket;
			while (true) {
				try {
					System.out.println(" - Enter price  " + codeFlight + ": ");
					priceTicket = scanner.nextInt();
					try {
						checkPriceTicket(priceTicket);
						break;
					} catch (ExceptionCheckNumber e) {
						System.err.println(e.getMessage());
					}
				} catch (Exception e) {
					scanner.next();
					System.err.println(" Price must be number, try it again ! ");
				}
			}

			scanner.nextLine();
			airlineTicketList
					.addAirlineTicket(new AirlineTicket(codeFlight, nameFlight, dateTakeOff, baggagesign, priceTicket));
			System.out.println(" Add airline ticket succesfully ");
		}
		airlineTicketList.getAllInformation();
	}

	// Menu App
	public static void menuApplication() {
		System.out.println(" >> -- Airline Ticket Management -- << ");
		System.out.println(" ++ ----------------------- ++ ");
		System.out.println("| 1. Enter your information flight | ");
		System.out.println("| 2. Save information flight | ");
		System.out.println("| 3. Read information flight | ");
		System.out.println("| 4. Sort information flight by format decrease price ticket | ");
		System.out.println("| 5. Get information by each code flight | ");
		System.out.println("| 6. Save information format code flight | ");
		System.out.println("| 7. End process | ");
		System.out.println(" ++ ----------------------- ++ ");
	}

	// Select action menu
	public static void selectActionMenu(int choice) {
		switch (choice) {
		case 1:
			System.out.println("| 1. Enter your information flight | >>> ");
			System.out.println(" Enter your quality information flight ");
			int quality = scanner.nextInt();
			scanner.nextLine();
			addAirlineTicket(quality);
			break;

		case 2:
			System.out.println("| 2. Save information flight | >>> ");
			airlineTicketList.saveFileInformation("AirlineTicket.txt");
			break;

		case 3:
			System.out.println("| 3. Read information flight | >>> ");
			airlineTicketList.readFile();
			break;

		case 4:
			System.out.println("| 4. Sort information flight by format decrease price ticket | >>> ");
			airlineTicketList.arrangeAirlineTicketByPrice();
			break;

		case 5:
			// Save file each flight
			System.out.println("| 5. Get information by code flight | >>> ");
			System.out.println(" Enter your code flight ");
			String codeFlight = scanner.nextLine();
			airlineTicketList.getInformationByCodeFlight(codeFlight);
			airlineTicketList.saveFileSeachFlightByCode(codeFlight);
			break;

		case 6:
			// Save file by code flight
			System.out.println("| 6. Save information format code flight | >>> ");
			System.out.println(" Enter your code airline, you want to save file ");
			String code = scanner.nextLine();
			airlineTicketList.saveFileByCode(code);
			break;

		case 7:
			System.out.println("| 7. End process | >>> ");
			System.exit(0);
			break;

		default:
			System.out.println(" - Invalid choice, Try enter again ");
			break;
		}
	}

	// App
	public static void main(String[] args) {
		while (running) {
			menuApplication();
			int choice;
			while (true) {
				try {
					System.out.print(" Your choice : ");
					choice = scanner.nextInt();
					scanner.nextLine();
					try {
						checkChoice(choice);
						break;
					} catch (ExceptionCheckNumber e) {
						System.err.println(e.getMessage());
						e.getStackTrace();
					}
				} catch (Exception e) {
					System.err.println(" >>> Must be number, try it again ! ");
					e.getStackTrace();
					e.getMessage();
					scanner.nextLine();
				}
			}

			selectActionMenu(choice);
		}

		scanner.close();
	}
}
