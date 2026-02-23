package lista06_arrays.Exercicio02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			vetor[i] = num;
		}

		System.out.print("\nValores: ");
		for (int i = 0; i < n; i++) {

			System.out.printf("%.1f ", vetor[i]);
			soma += vetor[i];
		}
		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMEDIA = %.2f", soma / n);

		sc.close();

	}
}
