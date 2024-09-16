package Airline_Ticket_Management;

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

	// Feature add airline ticket
	public static void addAirlineTicket(int quality) {
		for (int i = 1; i <= quality; i++) {
			System.out.println(" - Enter code flight " + i + ":");
			String codeFlight = scanner.nextLine();

			System.out.println(" - Enter name flight " + codeFlight + ":");
			String nameFlight = scanner.nextLine();

			System.out.println(" - Enter date take Off " + " dd/MM/yyyy " + codeFlight + " : ");
			String dateTakeOff = scanner.nextLine();

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
		System.out.println("| 5. Get information by code flight | ");
		System.out.println("| 6. End process | ");
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
			break;

		case 3:
			System.out.println("| 3. Read information flight | >>> ");
			break;

		case 4:
			System.out.println("| 4. Sort information flight by format decrease price ticket | >>> ");
			break;

		case 5:
			System.out.println("| 5. Get information by code flight | >>> ");
			break;

		case 6:
			System.out.println("| 6. End process | >>> ");
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
					selectActionMenu(choice);
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
					scanner.nextLine();
				}
			}

		}

		scanner.close();
	}
}
