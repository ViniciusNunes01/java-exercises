package lista05_introducao_POO.Exercicio03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();

		Student aluno = new Student(nome, nota1, nota2, nota3);

		System.out.printf("\nFINAL GRADE = %.2f", aluno.getNotaFinal());
		if (aluno.getNotaFinal() >= 60.00) {
			System.out.println("\nPASS");
		} else {
			System.out.println("\nFAILED");
			System.out.printf("MISSING %.2f POINTS", 60.00 - aluno.getNotaFinal());
		}

		sc.close();
	}

}
