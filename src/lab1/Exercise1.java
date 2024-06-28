package lab1;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		1.1

		System.out.println("Your name :");
		String name = scanner.nextLine();
		System.out.println("Your age :");
		String age = scanner.nextLine();
		System.out.println("Your name :" + name + " Your age : " + age);

//		1.2 
		System.out.println("Length of Rectangle");
		int length = scanner.nextInt();
		System.out.println("Width of Rectangle");
		int width = scanner.nextInt();
		System.out.println("Area of Rectangle :" + (length + width) * 2);
		System.out.println("min side :" + Math.min(length, width));

//		1.3
		System.out.println("Side :");
		int side = scanner.nextInt();
		System.out.println("Volume " + Math.pow(side, 3));

		scanner.close();
	}
}
