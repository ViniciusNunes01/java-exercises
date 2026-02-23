package lista06_arrays.Exercicio01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			vetor[i] = num;
		}

		System.out.println("Números negativos: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}
}
