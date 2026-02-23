package lista06_arrays.Exercicio10;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Student[] alunos = new Student[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("\nDigite o nome do %dº aluno: ", i + 1);
			String nome = sc.nextLine();
			System.out.printf("Digite a primeira nota do %dº aluno: ", i + 1);
			double nota1 = sc.nextDouble();
			System.out.printf("Digite a segunda nota do %dº aluno: ", i + 1);
			double nota2 = sc.nextDouble();

			alunos[i] = new Student(nome, nota1, nota2);
		}

		System.out.println();
		System.out.println("ALUNOS APROVADOS: ");
		for (int i = 0; i < n; i++) {
			if ((alunos[i].getNota1() + alunos[i].getNota2()) / 2 >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}

		sc.close();
	}

}
