package AlgorithmJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumberJava {

	public static void main(String[] args) {

		// Ex1: 1,-3,5,-7,9,-11

		// Ex2: 1,2, 3,5,8,13,21,...
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter max value n = ? ");
		int n = scanner.nextInt();

		ArrayList<Integer> arrNumber = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			if (arrNumber.size() < 2) {
				arrNumber.add(i + 1);
			} else {
				arrNumber.add(arrNumber.get(i - 1) + arrNumber.get(i - 2));
			}
		}

		System.out.println(arrNumber.toString());
		scanner.close();
	}
}
