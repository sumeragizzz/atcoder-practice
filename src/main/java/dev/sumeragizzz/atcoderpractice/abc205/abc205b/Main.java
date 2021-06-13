package dev.sumeragizzz.atcoderpractice.abc205.abc205b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		boolean[] flags = new boolean[n];
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			if (flags[a - 1]) {
				System.out.println("No");
				return;
			}
			flags[a - 1] = true;
		}
		System.out.println("Yes");
	}

}
