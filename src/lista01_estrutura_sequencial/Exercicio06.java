package lista01_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		final double pi = 3.14159;

		double areaTriangulo = (a * c) / 2;
		double areaCirculo = pi * (c * c);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = (b * b);
		double areaRetangulo = (a * b);

		System.out.printf("\nTRIANGULO: %.3f ", areaTriangulo);
		System.out.printf("\nCIRCULO: %.3f ", areaCirculo);
		System.out.printf("\nTRAPEZIO: %.3f ", areaTrapezio);
		System.out.printf("\nQUADRADO: %.3f ", areaQuadrado);
		System.out.printf("\nRETANGULO: %.3f ", areaRetangulo);

		sc.close();

	}

}
