package AlgorithmJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumberJava {

	public static void main(String[] args) {

		// Ex1: 1,-3,5,-7,9,-11
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Ex1: Enter max value n = ? ");
		int n = scanner.nextInt();
		ArrayList<Integer> arrayPositiveNumber = new ArrayList<>();
		ArrayList<Integer> arrayNumberChecked = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				arrayPositiveNumber.add(i);
			}
		}

		System.out.println(" Array " + arrayPositiveNumber);

		for (int i = 0; i < arrayPositiveNumber.size(); i++) {
			if (arrayPositiveNumber != null && i % 2 == 0) {
				arrayNumberChecked.add(arrayPositiveNumber.get(i) * -1);
			} else {
				arrayNumberChecked.add(arrayPositiveNumber.get(i));
			}
		}

		System.out.println(" Array checked " + arrayNumberChecked);

		// Ex2: 1,2, 3,5,8,13,21,...

		System.out.println(" Ex2: Enter max value n = ? ");
		int n2 = scanner.nextInt();

		ArrayList<Integer> arrNumber = new ArrayList<>();
		for (int i = 0; i <= n2; i++) {
			if (arrNumber.size() < 2) {
				arrNumber.add(i + 1);
			} else {
				arrNumber.add(arrNumber.get(i - 1) + arrNumber.get(i - 2));
			}
		}

		System.out.println(" Ex2: New Array " + arrNumber.toString());

		scanner.close();
	}
}
