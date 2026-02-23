package lista06_arrays.Exercicio03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] pessoas = new Person[n];
		double somaAlturas = 0;
		int menos16Anos = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("\nDados da %dª pessoa\n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			if (idade < 16) {
				menos16Anos++;
			}

			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			somaAlturas += altura;
			sc.nextLine();

			pessoas[i] = new Person(nome, idade, altura);
		}

		double mediaAlturas = somaAlturas / n;
		System.out.printf("\nAltura média: %.2f", mediaAlturas);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", ((double) menos16Anos / n) * 100);
		System.out.println();
		for (int i = 0; i < n; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}

		sc.close();
	}

}
