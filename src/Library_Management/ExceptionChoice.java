package Library_Management;

public class ExceptionChoice extends Exception {
	// Atribute
	private int choice;

	// Constructor
	public ExceptionChoice(int choice) {
		this.choice = choice;
	}

	// getMessage
	public String getMessage() {
		return " Choice invalid: " + choice + "";
	}
}
