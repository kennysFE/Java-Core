package AlgorithmJava;

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

		// 4 2 5 6 10 9 8 3

		int firstMaxValue = 0; // 4 4 5 6 10 10 10
		int secondMaxValue = 0;// 0 2 4 5 6 9 8

		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstMaxValue) {
				secondMaxValue = firstMaxValue;
				firstMaxValue = array[i];
			} else if (array[i] > secondMaxValue) {
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
//		List<Integer> arrNumberChecked = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			arrNumberChecked.add(i);
//		}
//		onlyOddNumber(arrNumberChecked);

		// Ex3: find max second value
		int[] arrNumberChecked1 = new int[5];
		arrNumberChecked1[0] = 10;
		arrNumberChecked1[1] = 32;
		arrNumberChecked1[2] = 60;
		arrNumberChecked1[3] = 10;
		arrNumberChecked1[4] = 10;
//		arrNumberChecked1[5] = 30;
		System.out.println(arrNumberChecked1);
		findSecondMaxValue(arrNumberChecked1);

	}
}
