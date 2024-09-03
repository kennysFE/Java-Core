package Library_Management;

public class ExceptionInputDate extends Exception {
	// Atribute
	private String date;

	// Constructor
	public ExceptionInputDate(String date) {
		this.date = date;
	}

	// getMessage
	public String getMessage() {
		return " Date invalid: " + date + "";
	}

}
