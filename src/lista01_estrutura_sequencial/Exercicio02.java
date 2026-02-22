package lista01_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final double pi = 3.14159;
		double raio = sc.nextFloat();

		System.out.printf("A = %.4f", pi * (raio * raio));

		sc.close();
	}

}
