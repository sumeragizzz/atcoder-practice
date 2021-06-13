package dev.sumeragizzz.atcoderpractice.abc205.abc205c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (c % 2 == 0) {
			a = Math.abs(a);
			b = Math.abs(b);
		}

		if (a == b) {
			System.out.println("=");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println(">");
		}
	}

}
