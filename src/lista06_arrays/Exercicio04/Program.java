package lista06_arrays.Exercicio04;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] vetor = new int[n];
		int isPar = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um número: ");
			int num = sc.nextInt();
			vetor[i] = num;
			if (vetor[i] % 2 == 0) {
				isPar++;
			}
		}

		System.out.println("\nNÚMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
			}
		}
		System.out.println();
		System.out.printf("\nQUANTIDADE DE PARES: %d", isPar);

		sc.close();
	}

}
