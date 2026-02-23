package lista06_arrays.Exercicio08;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();

		double[] vetor = new double[n];
		double soma = 0;
		int countSoma = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um número: ");
			double num = sc.nextDouble();
			vetor[i] = num;
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				countSoma++;
			}
		}

		if (countSoma == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			System.out.printf("\nMÉDIA DOS PARES = %.1f", soma / countSoma);
		}

		sc.close();
	}

}
