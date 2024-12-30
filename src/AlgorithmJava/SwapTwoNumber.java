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

	public static void findSecondMaxValue(int[] array) {

		int firstMaxValue = 0;
		int secondMaxValue = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstMaxValue) {
				firstMaxValue = array[i];
			} else {
				secondMaxValue = array[i];
			}

		}

		System.out.println(secondMaxValue);
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

		// Ex3: find max second value
		int[] arrNumberChecked1 = new int[5];
		arrNumberChecked1[0] = 10;
		arrNumberChecked1[1] = 20;
		arrNumberChecked1[2] = 30;
		arrNumberChecked1[3] = 40;
		arrNumberChecked1[4] = 50;
		findSecondMaxValue(arrNumberChecked1);

	}
}
