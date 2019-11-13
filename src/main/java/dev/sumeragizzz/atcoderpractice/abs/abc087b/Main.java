package dev.sumeragizzz.atcoderpractice.abs.abc087b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();

		int count = 0;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					if ((500 * i + 100 * j + 50 * k) == x) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}

}
