package Airline_Ticket_Management;

public class ExceptionCheckNumber extends Exception {
	// Atribute
	private int checkNumber;

	// Constructor
	public ExceptionCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}

	// getMessage
	public String getMessage() {
		return " Data invalid: " + checkNumber + "";
	}

}
