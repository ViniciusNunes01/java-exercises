package lista04_estrutura_for;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fat = 1;

		for (int i = n; i >= 1; i--) {
			fat *= i;
		}

		System.out.println("FATORIAL: " + fat);

		sc.close();
	}

}
