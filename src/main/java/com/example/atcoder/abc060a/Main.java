package com.example.atcoder.abc060a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();

		if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
