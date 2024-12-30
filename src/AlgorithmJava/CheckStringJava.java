package AlgorithmJava;

public class CheckStringJava {

	public static boolean checkPalidromesString(String checkedString) {
		boolean checked = true;
		int input = checkedString.length();

		for (int i = 0; i < input / 2; i++) {
			if (checkedString.charAt(i) != checkedString.charAt(input - i - 1)) {
				checked = false;
				break;
			}
		}
		return checked;
	}

	public static String convertStringReverse(String checkedString) {

		// abcdef -> fedcba => 0 1 2 3 4 5
		int input = checkedString.length();

		// Create new String
		StringBuilder sb = new StringBuilder();

		// Check length String
		for (int i = 0; i < input; i++) {
			sb.append(checkedString.charAt(input - 1 - i));
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		// Ex1: Check palidromes String
		System.out.println(checkPalidromesString("acbbca"));

		// Ex2: ConvertStringReverse
		System.out.println(convertStringReverse("adelc"));
	}
}
