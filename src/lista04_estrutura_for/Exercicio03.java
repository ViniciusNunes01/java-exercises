package lista04_estrutura_for;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double val1 = 0;
		double val2 = 0;
		double val3 = 0;

		for (int i = 0; i < n; i++) {

			val1 = sc.nextDouble();
			val2 = sc.nextDouble();
			val3 = sc.nextDouble();

			System.out.printf("%.2f", ((val1 * 2) + (val2 * 3) + (val3 * 5)) / (2 + 3 + 5));
		}

		sc.close();
	}

}
