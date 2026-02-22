package lista01_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int numeroHorasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();

		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f ", numeroHorasTrabalhadas * valorPorHora);

		sc.close();
	}

}
