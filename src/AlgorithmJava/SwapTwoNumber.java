package AlgorithmJava;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoNumber {

	public static void onlyOddNumber(List<Integer> arrListNumber) {

		for (Integer numberChecked : arrListNumber) {
			if (numberChecked % 2 != 0) {
				System.out.print(numberChecked);
			}
		}
	}

	public static void main(String[] args) {
		// Ex1: Swap two number not using variable thrild
		int a = 10;
		int b = 20;
		a = a + b; // a = 30
		b = a - b; // b = 10
		a = a - b; // a = 20

		System.out.println(" a = " + a + " b = " + b);

		// Ex2: onlyOddNumber
		List<Integer> arrNumberChecked = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrNumberChecked.add(i);
		}
		onlyOddNumber(arrNumberChecked);
	}
}
