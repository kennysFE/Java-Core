package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>(); 
		
		while (true) {
			System.out.println("Nhap gia tri cua mang: ");
			Double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();
			System.out.println("Nhap them gia tri (Y/N)");
			String n = scanner.nextLine();
			if (n.equals("N") || n.equals("n")) {
				break;
			}
		}
		double sum = 0;
		
		for (int i = 0; i < list.size(); i ++) {
			sum = sum + list.get(i);
		}
		System.out.println("Check mang :" + list.toString());
		
		System.out.println("Tong cua cac gia tri trong mang la :" + sum);
		
		scanner.close();
	}
}	
