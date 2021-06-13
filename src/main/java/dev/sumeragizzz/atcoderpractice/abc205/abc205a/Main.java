package dev.sumeragizzz.atcoderpractice.abc205.abc205a;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		BigDecimal a = new BigDecimal(scanner.next());
		BigDecimal b = new BigDecimal(scanner.next());

		BigDecimal ans = b.divide(BigDecimal.valueOf(100), 6, RoundingMode.DOWN).multiply(a);
		DecimalFormat formatter = new DecimalFormat("0.######");
		System.out.println(formatter.format(ans));
	}

}
