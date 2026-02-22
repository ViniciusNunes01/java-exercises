package lista03_estrutura_while;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tipoCombustivel = sc.nextInt();
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;

		while (tipoCombustivel != 4) {

			if (tipoCombustivel == 1) {
				alcool++;
				tipoCombustivel = sc.nextInt();
			} else if (tipoCombustivel == 2) {
				gasolina++;
				tipoCombustivel = sc.nextInt();
			} else if (tipoCombustivel == 3) {
				diesel++;	
				tipoCombustivel = sc.nextInt();
			} else {
				System.out.println("CÓDIGO INVÁLIDO");
				tipoCombustivel = sc.nextInt();
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("ALCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);

		sc.close();
	}
}
