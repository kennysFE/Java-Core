package Airline_Ticket_Management;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
			System.out.println(" Airline ticket not exist ");
		}
	}

	// method save file text
	public void saveFile() {
		if (airlineList.size() > 0) {
			// Crete FileOutputStream
			FileOutputStream fos = null;

			try {
				fos = new FileOutputStream("AirlineTicket.txt", true);

				String headerFormat = " Code Flight, Name Flight, Date Take Off, Baggage Sign , Price Ticket "
						+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";

				fos.write(headerFormat.getBytes("utf-8"));

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
		} else {
			System.out.println(" Airline ticket not exist ");
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

}
