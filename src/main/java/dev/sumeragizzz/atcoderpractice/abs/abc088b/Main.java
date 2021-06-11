package dev.sumeragizzz.atcoderpractice.abs.abc088b;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		var a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}
		a.sort(Comparator.reverseOrder());

		int alice = 0;
		int bob = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += a.get(i);
			} else {
				bob += a.get(i);
			}
		}

		System.out.println(alice - bob);
	}

}
