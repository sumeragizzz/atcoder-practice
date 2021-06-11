package dev.sumeragizzz.atcoderpractice.abs.abc85c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String[] in = scanner.nextLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int y = Integer.parseInt(in[1]);

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					if (i + j + k > n) {
						break;
					}
					if (i + j + k == n &&
							(i * 10_000 + j * 5_000 + k * 1_000 == y)) {
						System.out.format("%d %d %d%n", i, j, k);
						return;
					}
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}
