package lab02;

import java.util.Scanner;

public class Baitap2 {

	public static void giaiptbac1(int b, int c) {
		if (b == 0 && c == 0) {
			System.out.println("phuong trinh vo so nghiem ");
		} else if (b == 0 && c != 0) {
			System.out.println("phuong trinh vo nghiem ");
		} else {
			double k = -c / b;
			System.out.println("Ket qua cua x :" + k);
		}
	}

	public static void main(String[] args) {
		System.out.println("Baitap 2 Lab 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a :");
		int a = scanner.nextInt();
		System.out.println("Nhap b :");
		int b = scanner.nextInt();
		System.out.println("Nhap c :");
		int c = scanner.nextInt();

		if (a == 0) {
//			if (a == 0 && b == 0) {
//				System.out.println("phuong trinh vo so nghiem ");
//
//			} else if (a == 0 && b != 0) {
//				System.out.println("phuong trinh vo nghiem ");
//			} else {
//				System.out.println("Ket qua cua x :" + -b / a);
//			}
			giaiptbac1(b, c);
		} else {
			double delta = b ^ 2 - 4 * a * c;
			System.out.println("delta " + delta);
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem ");
			} else if (delta == 0) {
				System.out.println("phung trinh co nghiem kep: x = " + -b / 4 * a);
			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng bien");
				System.out.println("Nghiem thu nhat : x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("Nghiem thu hai : x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
			}
		}
		scanner.close();
	}
}
