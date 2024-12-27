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

	public static void main(String[] args) {

		// Ex1: Check palidromes String
		System.out.println(checkPalidromesString("acbbca"));
	}
}
