package lista02_estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("NÚMERO POSITIVO");
		} else if (numero < 0) {
			System.out.println("NÚMERO NEGATIVO");
		} else {
			System.out.println("NÚMERO É ZERO");
		}

		sc.close();
	}

}
