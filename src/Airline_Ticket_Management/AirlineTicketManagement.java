package Airline_Ticket_Management;

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
			Collections.sort(airlineList, (o1, o2) -> Integer.compare(o1.getPriceTicket(), o2.getPriceTicket()));
			for (AirlineTicket ticket : airlineList) {
				System.out.println(ticket.toString());
			}
		} else {
			System.out.println(" Airline ticket not exist ");
		}
	}

}
