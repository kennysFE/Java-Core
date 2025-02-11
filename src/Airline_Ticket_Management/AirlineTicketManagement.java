package Airline_Ticket_Management;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AirlineTicketManagement implements Comparator<AirlineTicket> {
	// Create list
	ArrayList<AirlineTicket> airlineList = new ArrayList<>();

	// Add airline ticket
	public void addAirlineTicket(AirlineTicket airlineTicket) {
		airlineList.add(airlineTicket);
	}

	// Get all information airline ticket list
	public void getAllInformation() {
		if (airlineList.size() > 0) {
			for (AirlineTicket ticket : airlineList) {
				System.out.println(ticket.toString());
			}
		} else {
			System.out.println(" Airline ticket not exist ");
		}
	}

	// Get information airline ticket by code flight
	public void getInformationByCodeFlight(String codeFlight) {
		if (airlineList.size() > 0) {
			for (AirlineTicket ticket : airlineList) {
				if (ticket.getCodeFlight().equals(codeFlight)) {
					System.out.println(ticket.toString());
					break;
				}
			}
		} else {
			System.out.println(" Airline ticket not exist ");
		}
	}

	// Method overide compare
	// * Method compareTo only must be used on type Object (example : String,
	// Interger, except : int, double )
	// * To use compare int, should using method Integer.compare, Double.compare

	@Override
	public int compare(AirlineTicket o1, AirlineTicket o2) {
		return Integer.compare(o1.getPriceTicket(), o2.getPriceTicket());
	}

	// Method arrange airlineticket by price
	public void arrangeAirlineTicketByPrice() {
		if (airlineList.size() > 0) {
			Collections.sort(airlineList, (o1, o2) -> Integer.compare(o2.getPriceTicket(), o1.getPriceTicket()));
			for (AirlineTicket ticket : airlineList) {
				System.out.println(ticket.toString());
			}
		} else {
			System.err.println(" Airline ticket not exist ");
		}
	}

	// method save file text
	public static void saveFile(String path, ArrayList<AirlineTicket> airlineList) {
		// Crete FileOutputStream
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(path, true);

//			String headerFormat = " Code Flight, Name Flight, Date Take Off, Baggage Sign , Price Ticket "
//					+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";

//			fos.write(headerFormat.getBytes("utf-8"));

			for (AirlineTicket ticket : airlineList) {
				fos.write((ticket.toString() + "\n ").getBytes("utf-8"));
			}

		} catch (FileNotFoundException e) {
			System.err.println(" File invalid ");
			e.getStackTrace();
		} catch (IOException e) {
			System.err.println(" Output invalid ");
			e.getStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					System.out.println(" Closed file error !");
					e2.getStackTrace();
				}
			}
		}
	}

	public void saveFileInformation(String path) {
		if (airlineList.size() > 0) {
			saveFile(path, airlineList);
		} else {
			System.err.println(" Airline ticket not exist ");
		}
	}

	public void saveFileByCode(String code) {
		if (code.equals("VJA") || code.equals("VNA") || code.equals("JET")) {
			ArrayList<AirlineTicket> airlineTicketByCode = new ArrayList<>();
			for (AirlineTicket ticket : airlineList) {
				if (ticket.getCodeFlight().substring(0, 3).equals(code)) {
					System.out.println(ticket.toString());
					airlineTicketByCode.add(ticket);
				}
			}
			System.out.println(" Save file sucessfuly ");
			saveFile(code, airlineTicketByCode);
		} else {
			System.err.println(" Code invalid or airline ticket not found , try it again ");
		}
	}

	public void saveFileSeachFlightByCode(String code) {
		if (airlineList.size() > 0) {
			ArrayList<AirlineTicket> airlineTicketByCode = new ArrayList<>();
			for (AirlineTicket ticketSearch : airlineList) {
				if (ticketSearch.getCodeFlight().equals(code)) {
					airlineTicketByCode.add(ticketSearch);
				}
			}
			saveFile(code, airlineTicketByCode);
			System.out.println(" Information of flght is saved ");
		} else {
			System.err.println(" Code invalid or airline ticket not found , try it again ");
		}
	}

	// method read file text
	public void readFile() {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader("AirlineTicket.txt");
			bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException ex) {
			System.err.println(" File not found ");
			ex.getStackTrace();
		} catch (IOException ex) {
			System.err.println(" Output invalid ");
			ex.getStackTrace();
		} finally {
			if (fileReader != null && bufferedReader != null) {
				try {
					fileReader.close();
					bufferedReader.close();
				} catch (Exception e2) {
					System.out.println(" Closed file error !");
					e2.getStackTrace();
				}
			}
		}

	}

	// method save file object
	public void saveFileObject() {

	}

	// method read file object
	public void readFileObject() {

	}

}
