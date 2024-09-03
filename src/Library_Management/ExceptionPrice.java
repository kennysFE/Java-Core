package Library_Management;

public class ExceptionPrice extends Exception {
	// Atribute 
	private int price; 
	
	// Constructor 
	public ExceptionPrice(int price) {
		this.price = price;
	}
	
	// getMessage
		public String getMessage() {
			return " Price invalid: " + price + "";
		}
}
