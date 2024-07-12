package lab06;

import java.util.Scanner;

public class Lab06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap username va password: ");
		System.out.printf("Username :");
		String username = scanner.nextLine();
		System.out.printf("Password :");
		String password = scanner.nextLine();
		System.out.println("Thong tin user bao gom : " + "Tai khoan"+ username + " " + "Mat khau" + password);
		if (username.equals("Admin@gmail.com") && password.length() >= 6 ) {
			System.out.println("Valid Data");
		}
		scanner.close();
	}
}
