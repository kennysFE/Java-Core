package lab1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello world with java");
//		System.out.println("so thu nhat là 1 ");
//		int a = 6;
//		int b = 15;
//		int c = a + b;
//		c = 100;
//		System.out.println("sum: " + c);

		// Scanner : build layout user can enter data

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Your name is: ");
//		String name = scanner.nextLine();
//		System.out.println("Your age is: ");
//		int age = scanner.nextInt();
//		System.out.println("My name is " + name + ", age = " + age);
//		scanner.close();
//		
		//
//		System.out.println("Nhap vao so tien");
//		Scanner scanner = new Scanner(System.in);
//
//		int tax = scanner.nextInt();
//		if (tax < 10) {
//			System.out.println("khong dong thue ");
//		} else if (10 <= tax && tax <= 15) {
//			System.out.println("thue 10%");
//		} else if (15 <= tax && tax <= 30) {
//			System.out.println("thue 20%");
//		} else {
//			System.out.println("thue 50%");
//		}
//		scanner.close();

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lua chon cua ban la :");
		int value = scanner.nextInt();

		switch (value) {
		case 1:
			System.out.println("ban da lua chon phep cong ");
			break;
		case 2:
			System.out.println("ban da lua chon phep true ");
			break;
		default:
			System.out.println("ban da lua chon thoat chuong trinh");
			System.exit(0);
		}

		scanner.close();
	}
}
