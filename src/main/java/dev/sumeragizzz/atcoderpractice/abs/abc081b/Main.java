package dev.sumeragizzz.atcoderpractice.abs.abc081b;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\R");

		@SuppressWarnings("unused")
		int n = scanner.nextInt();
		List<Integer> a = Stream.of(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

		int count = 0;
		for (; !a.stream().filter(ai -> ai % 2 != 0).findAny().isPresent();) {
			for (int i = 0; i < a.size(); i++) {
				a.set(i, a.get(i) / 2);
			}
			count++;
		}

		System.out.println(count);
	}

}
