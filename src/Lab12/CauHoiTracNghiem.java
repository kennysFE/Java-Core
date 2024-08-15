package Lab12;

import java.util.Scanner;

public class CauHoiTracNghiem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Lenh tiep tuc vong lap trong java la gi ");
			System.out.println("1. countineu");
			System.out.println("2. break ");
			System.out.println(" Nhan q de thoat ");
			String luachon = scanner.nextLine();

			if (luachon.equals("1")) {
				System.out.println("Ban da tra loi dung");
				break;
			} else if (luachon.equals("2")) {
				System.out.println("Ban da tra loi sai");
				break;
			} else if (luachon.equals("q")) {
				break;
			} else {
				System.out.println("vui long chon dap an ");
			}
		}
		scanner.close();
	}
}
