package lista04_estrutura_for;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		int numero = 0;
		int in = 0;
		int out = 0;

		for (int i = 0; i < valor; i++) {

			numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
