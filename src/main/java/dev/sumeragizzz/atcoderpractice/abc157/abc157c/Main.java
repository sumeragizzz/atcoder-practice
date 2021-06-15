package dev.sumeragizzz.atcoderpractice.abc157.abc157c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] s = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			s[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}
		outer: for (int ans = 0; ans < 1000; ans++) {
			String str = Integer.toString(ans);
			if (str.length() != n) {
				continue;
			}

			for (int i = 0; i < m; i++) {
				int ss = Integer.parseInt(str.substring(s[i] - 1, s[i]));
				if (ss != c[i]) {
					continue outer;
				}
			}
			System.out.println(ans);
			return;
		}
		System.out.println(-1);
	}
}
