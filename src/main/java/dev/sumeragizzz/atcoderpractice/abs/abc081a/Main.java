package dev.sumeragizzz.atcoderpractice.abs.abc081a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String value = scanner.next();

		int count = 0;
		for (char c : value.toCharArray()) {
			if (c == '1') {
				count++;
			}
		}
		System.out.println(count);
	}

}
