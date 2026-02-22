package lista02_estrutura_condicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Total: R$ " + 4.00 * quantidade);
			break;
		case 2:
			System.out.println("Total: R$ " + 4.50 * quantidade);
			break;
		case 3:
			System.out.println("Total: R$ " + 5.00 * quantidade);
			break;
		case 4:
			System.out.println("Total: R$ " + 2.00 * quantidade);
			break;
		case 5:
			System.out.println("Total: R$ " + 1.50 * quantidade);
			break;
		}
		sc.close();
	}
}
