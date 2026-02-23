package lista06_arrays.Exercicio11;

import java.util.Scanner;

import lista06_arrays.Exercicio10.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] alturas = new double[n];
		String[] generos = new String[n];
		double maiorAltura = 0.0;
		double menorAltura = 0.0;
		int homensCount = 0;
		int mulheresCount = 0;
		double somaAlturaMulheres = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.printf("\nAltura da %dª pessoa: ", i + 1);
			double altura = sc.nextDouble();
			alturas[i] = altura;

			if (i == 0) {
				menorAltura = altura;
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			sc.nextLine();
			System.out.printf("Gênero da %dª pessoa: ", i + 1);
			String genero = sc.nextLine();
			generos[i] = genero.toUpperCase();
			if (generos[i].charAt(0) == 'F') {
				mulheresCount++;
				somaAlturaMulheres += alturas[i];
			} else {
				homensCount++;
			}

		}

		System.out.printf("\nMenor altura = %.2f", menorAltura);
		System.out.printf("\nMaior altura = %.2f", maiorAltura);
		System.out.printf("\nMédia das alturas das mulheres = %.2f", somaAlturaMulheres / mulheresCount);
		System.out.printf("\nNúmero de homens = %d", homensCount);

		sc.close();

	}

}
