package lista01_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigoPeca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();

		int codigoPeca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();

		double valorPagar = (numeroPeca1 * valorUnitarioPeca1) + (numeroPeca2 * valorUnitarioPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

		sc.close();
	}

}
