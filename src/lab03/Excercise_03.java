package lab03;

import java.util.Scanner;

public class Excercise_03 {

	public static void KiemTraSNT() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri can kiem tra : ");
		int a = scanner.nextInt();
		System.out.println("Gia tri ban nhap la " + a);
		if (a <= 1) {
			System.out.printf("%d khong phai la so nguyen to", a);
		} else {
			int temp = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp > 0) {
				System.out.printf("%d khong phai la so nguyen to", a);
			} else {
				System.out.printf("%d la so nguyen to", a);
			}
		}
		scanner.close();
	}

	public static void KiemTraBCC() {

	}

	public static void KiemtraMang() {

	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Kiem tra so nguyen to |");
		System.out.println("| 2. kiem tra bang cuu chuong |");
		System.out.println("| 3. Kiem tra gia tri lon nhat, nho nhat, sap xep 1 mang du lieu |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tinh nang ban chon la: ");
		int tinhNang = scanner.nextInt();

		switch (tinhNang) {
		case 1:
			System.out.println("| 1. Kiem tra so nguyen to |");
			KiemTraSNT();
			break;
		case 2:
			System.out.println("| 2. kiem tra bang cuu chuong |");
			KiemTraBCC();
			break;
		case 3:
			System.out.println("| 3. Kiem tra gia tri lon nhat, nho nhat, sap xep 1 mang du lieu | |");
			KiemtraMang();
			break;
		default:
			System.out.println("| Ket thuc chuong trinh |");
			break;
		}
		;

		scanner.close();
	}
}
