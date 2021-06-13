package dev.sumeragizzz.atcoderpractice.abc205.abc205d;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();

		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}

		for (int i = 0; i < q; i++) {
			long k = scanner.nextLong();

			long index = 0;
			long value = 0;
			for (long j = 1; j <= n + k; j++) {
				int search = Arrays.binarySearch(a, j);
				if (search < 0) {
					index++;
				}
				if (index == k) {
					value = j;
					break;
				}
			}

			System.out.println(value);
		}
	}

}
