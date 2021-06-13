package dev.sumeragizzz.atcoderpractice.abs.abc086c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int beforeT = 0;
		int beforeX = 0;
		int beforeY = 0;
		for (int i = 0, n = scanner.nextInt(); i < n; i++) {
			int t = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			int elapedTime = t - beforeT;
			int moved = Math.abs(x - beforeX) + Math.abs(y - beforeY);


			if (moved > elapedTime || (elapedTime - moved) % 2 != 0) {
				System.out.println("No");
				return;
			}

			beforeT = t;
			beforeX = x;
			beforeY = y;
		}
		System.out.println("Yes");
	}

}
