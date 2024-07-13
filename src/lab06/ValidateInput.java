package lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {
	public static void main(String[] args) {
		// Regex number 
		Pattern pattern = Pattern.compile("\\d{12}");
	    Matcher matcher = pattern.matcher("0212131");
	    System.out.println("Input String matches regex - "+matcher.matches());
	    
	    // Regex email 
	    Pattern pattern2 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	    Matcher matcher1 = pattern2.matcher("hoen@gmail.com");
	    System.out.println("Input String matches regex - "+matcher1.matches());
	}
}
