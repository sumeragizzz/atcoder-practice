package dev.sumeragizzz.atcoderpractice.abs.practicea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String s = scanner.next();

		System.out.format("%d %s%n", a + b + c, s);
	}

}
