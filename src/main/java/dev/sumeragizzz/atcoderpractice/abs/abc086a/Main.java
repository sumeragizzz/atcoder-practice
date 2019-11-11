package dev.sumeragizzz.atcoderpractice.abs.abc086a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(((a * b) % 2 == 0) ? "Even" : "Odd");
	}

}
