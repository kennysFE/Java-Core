package lab02;

import java.util.Scanner;

public class Baitap4 {

	public static void bai1() {
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
			double c = -b / a;
			System.out.println("Ket qua cua x :" + c);
		}
		scanner.close();
	}

	public static void bai2() {
		System.out.println("Baitap 2 Lab 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a :");
		int a = scanner.nextInt();
		System.out.println("Nhap b :");
		int b = scanner.nextInt();
		System.out.println("Nhap c :");
		int c = scanner.nextInt();

		if (a == 0) {
			if (a == 0 && b == 0) {
				System.out.println("phuong trinh vo so nghiem ");

			} else if (a == 0 && b != 0) {
				System.out.println("phuong trinh vo nghiem ");
			} else {
				System.out.println("Ket qua cua x :" + -b / a);
			}
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

	public static void bai3() {
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

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tinh nang ban chon la :");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			bai1();
			break;
		case 2:
			bai2();
			break;
		case 3:
			bai3();
			break;
		default:
			System.out.println("Thoat chuong trinh thanh cong");
			System.exit(0);
			break;
		}

		scanner.close();
	}
}
