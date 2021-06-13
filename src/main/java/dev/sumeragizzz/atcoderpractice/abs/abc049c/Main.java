package dev.sumeragizzz.atcoderpractice.abs.abc049c;

import java.util.List;
import java.util.Scanner;

public class Main {

	static final List<String> TOKENS = List.of("dream", "dreamer", "erase", "eraser");

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();

		System.out.println(recursive(s, 0) ? "YES" : "NO");
	}

	static boolean recursive(String s, int index) {
		for (String token : TOKENS) {
			if (s.substring(index).equals(token)) {
				return true;
			}
			if (s.startsWith(token, index) && recursive(s, index + token.length())) {
				return true;
			}
		}
		return false;
	}

}
