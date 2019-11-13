package dev.sumeragizzz.atcoderpractice.abs.abc083b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int total = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (char ch : Integer.toString(i).toCharArray()) {
				sum += Character.getNumericValue(ch);
			}
			if (sum >= a && sum <= b) {
				total += i;
			}
		}

		System.out.println(total);
	}

}
