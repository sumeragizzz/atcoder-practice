package dev.sumeragizzz.atcoderpractice.abs.abc85c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		int y = Integer.parseInt(scanner.next());

		for (int i = 0, imax = y / 10_000; i <= imax; i++) {
			for (int j = 0, jmax = (y - 10_000 * i) / 5_000; j <= jmax; j++) {
				int k = n - i - j;
				if (10_000 * i + 5_000 * j + 1_000 * k == y) {
					System.out.format("%d %d %d%n", i, j, k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}
