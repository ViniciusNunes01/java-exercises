package lista06_arrays.Exercicio09;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		int isMaisVelho = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa: ", i + 1);
			System.out.printf("\nNome: ");
			nomes[i] = sc.nextLine();
			System.out.printf("Idade: ");
			idades[i] = sc.nextInt();
			if (idades[i] > isMaisVelho) {
				isMaisVelho = idades[i];
				count = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nomes[count]);

		sc.close();
	}

}
