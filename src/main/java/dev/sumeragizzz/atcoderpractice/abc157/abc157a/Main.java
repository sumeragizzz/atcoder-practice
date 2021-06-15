package dev.sumeragizzz.atcoderpractice.abc157.abc157a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n / 2 + n % 2);
	}
}
