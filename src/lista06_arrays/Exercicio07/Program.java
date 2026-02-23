package lista06_arrays.Exercicio07;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();

		double[] vetor = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um número: ");
			double num = sc.nextDouble();
			vetor[i] = num;
			soma += vetor[i];
		}

		System.out.printf("\nMEDIA DO VETOR = %.3f", soma / n);
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < (soma / n)) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}
}
