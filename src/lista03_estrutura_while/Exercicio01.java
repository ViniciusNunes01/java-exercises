package lista03_estrutura_while;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		final int senha = 2002;
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		while (valor != senha) {
			System.out.println("Senha inválida");
			valor = sc.nextInt();
		}
		System.out.println("Acesso permitido");

		sc.close();
	}
}
