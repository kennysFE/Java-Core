package lab03;

import java.util.Arrays;

public class Array_core {
	public static void main(String[] args) {
		int[] clubs = { 11, 22, 4, 16, 7 };
		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}

		System.out.println("array " + Arrays.toString(clubs));
	}
}
