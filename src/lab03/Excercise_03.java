package lab03;

import java.util.Arrays;
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra bang cuu chuong :");
		int a = scanner.nextInt();
		System.out.println("Bang cua chuong " + a);
		for (int i = 1; i < 11; i++) {
			System.out.printf(" %d x %d = %d ", a, i, a * i);
		}

		scanner.close();
	}

	public static void KiemtraMang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu trong mang ");
		int a = scanner.nextInt();
		int[] array = new int[a];
		System.out.println("Nhap cac phan tu trong mang " + a);
		for (int i = 0; i < a; i++) {
			System.out.printf("Nhap phan tu thu %d = ", i + 1);
			array[i] = scanner.nextInt();
		}
		System.out.println("Mang ban da nhap la : " + Arrays.toString(array));
		System.out.println("===================================");
		Arrays.sort(array);
		System.out.println("Mang duoc sap xếp lai như sau : " + Arrays.toString(array));
		System.out.println("===================================");

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}
		System.out.println("Gia tri lon nhat cua mang :" + max);
		System.out.println("===================================");

		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			min = Math.min(min, array[i]);
		}
		System.out.println("Gia tri nho nhat cua mang :" + min);
		scanner.close();
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
