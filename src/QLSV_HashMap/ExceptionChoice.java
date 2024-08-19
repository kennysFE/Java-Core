package QLSV_HashMap;

public class ExceptionChoice extends Exception {
	private int choice;

	public ExceptionChoice(int choice) {
		this.choice = choice;
	}

	public String getMessage() {
		return " Choice not invalid: " + choice + "";
	}
}
