package lab02;

import java.util.Scanner;

public class Baitap1 {
	public static void main(String[] args) {
		System.out.println("Baitap 1 Lab 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a :");
		int a = scanner.nextInt();
		System.out.println("Nhap b :");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem ");

		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem ");
		} else {
			System.out.println("Ket qua cua x :" + -b / a);
		}
		scanner.close();
	}
}
