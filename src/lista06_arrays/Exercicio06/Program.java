package lista06_arrays.Exercicio06;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		System.out.println("\nDigite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			vetorA[i] = num;
		}

		System.out.println("\nDigite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			vetorB[i] = num;
		}

		System.out.println("\nVETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}

	}

}
