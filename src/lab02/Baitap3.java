package lab02;

import java.util.Scanner;

public class Baitap3 {
	public static void main(String[] args) {
		System.out.println("Baitap 3 Lab 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so dien su dung  :");
		int sodien = scanner.nextInt();

		if (sodien >= 0 && sodien < 100) {
			System.out.println("So tien dien phai tra: " + sodien * 1000);
		} else {
			System.out.println("So tien dien phai tra: " + (100 * 1000 + (sodien - 100) * 1500));
		}
		scanner.close();
	}
}
