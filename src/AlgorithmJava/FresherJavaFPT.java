package AlgorithmJava;

import java.util.Scanner;

// Interview question fresher java fpt Da Nang

/**
 * Cộng các số chia hết cho 5 trong mảng
 * 
 * Tìm số lớn nhất số nhỏ nhất trong mảng
 * 
 * Kiểm tra số nguyên tố
 */
public class FresherJavaFPT {

	public static void SumDevideFive(int quality) {

		Scanner scanner = new Scanner(System.in);

		int[] arrNumberChecked = new int[quality];

		double sum = 0;

		for (int i = 0; i < quality; i++) {
			System.out.println(i + ">>>");
			arrNumberChecked[i] = scanner.nextInt();
			if (arrNumberChecked[i] % 5 == 0) {
				sum = sum + arrNumberChecked[i];
			}
		}

		System.out.println(" Sum divide file :" + " >>> " + sum);
		scanner.close();

	}

	public static void minMaxValueInArrays(int quality) {

		// 3 4 5 9 8 10 1

		// 10 4 5 6 7 2 3

		Scanner scanner = new Scanner(System.in);

		int[] arrNumberChecked = new int[quality];

		int max = 0;

		int min = 0;

		for (int i = 0; i < quality; i++) {
			System.out.println(i + ">>>");
			arrNumberChecked[i] = scanner.nextInt();

		}

		for (int i1 = 0; i1 < quality; i1++) {

			if (i1 == 0) {
				min = arrNumberChecked[i1];
			}

			if (arrNumberChecked[i1] > max) {
				max = arrNumberChecked[i1];
			}

			if (arrNumberChecked[i1] < min) {
				min = arrNumberChecked[i1];
			}
		}

		System.out.println(" Array : " + arrNumberChecked.toString());
		System.out.println(" Min value :" + " >>> " + min);
		System.out.println(" Max value :" + " >>> " + max);
		scanner.close();

	}

	public static void KiemTraSoNguyenTo(int n) {

		if (n == 1) {
			System.out.println(n + " khong phai la so nguyen to ");
		}

		if (n % 2 == 0) {
			System.out.println(n + " khong phai la so nguyen to ");
		}

		if (n > 2 && n % 2 != 0) {

			int check = 0;

			for (int i = 3; i <= n; i++) {

				if (n % i == 0) {
					check++;
				}
			}

			if (check > 1) {
				System.out.println(n + " khong phai la so nguyen to ");
			} else {
				System.out.println(n + " la so nguyen to ");
			}

		}

	}

	public static void main(String[] args) {

		// Ex1: Cộng các số chia hết cho 5 trong mảng
		// SumDevideFive(5);

		// Ex2:
		// minMaxValueInArrays(9);

		// Ex3
		KiemTraSoNguyenTo(8);
	}
}
