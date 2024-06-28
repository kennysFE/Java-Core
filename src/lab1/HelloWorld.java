package lab1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world with java");
		System.out.println("so thu nhat là 1 ");
		int a = 6;
		int b = 15;
		int c = a + b;
		c = 100;
		System.out.println("sum: " + c);

		// Scanner : build layout user can enter data

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name = scanner.nextLine();
		System.out.println("Your age is: ");
		int age = scanner.nextInt();
		System.out.println("My name is " + name + ", age = " + age);
		scanner.close();

	}
}
