package exercicio_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (x == matriz[i][j]) {
					System.out.printf("\nPosition %d, %d: ", i, j);

					// Left
					if (j - 1 < 0) {
						System.out.printf("\nLeft: Does not exist");
					} else {
						System.out.printf("\nLeft: %d", matriz[i][j - 1]);
					}

					// Right
					if (j + 1 == coluna) {
						System.out.printf("\nRight: Does not exist");
					} else {
						System.out.printf("\nRight: %d", matriz[i][j + 1]);
					}

					// Up
					if (i - 1 < 0) {
						System.out.printf("\nUp: Does not exist");
					} else {
						System.out.printf("\nUp: %d", matriz[i - 1][j]);
					}

					// Down
					if (i + 1 == linha) {
						System.out.printf("\nDown: Does not exist");
					} else {
						System.out.printf("\nDown: %d", matriz[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
