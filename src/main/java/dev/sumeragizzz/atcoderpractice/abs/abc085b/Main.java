package dev.sumeragizzz.atcoderpractice.abs.abc085b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for (int i = 0, n = scanner.nextInt(); i < n; i++) {
			set.add(scanner.nextInt());
		}
		System.out.println(set.size());
	}

}
