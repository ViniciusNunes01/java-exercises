package lista04_estrutura_for;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				double div = (double) num1 / num2;
				System.out.printf("%.1f", div);
			}
		}

		sc.close();
	}

}
