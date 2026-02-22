package lista02_estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("NÚMERO É PAR");
		} else {
			System.out.println("NÚMERO É ÍMPAR");
		}

		sc.close();
	}
}