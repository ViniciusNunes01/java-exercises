package lista05_introducao_POO.ExercicioEstatico;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();

		CurrencyConverter converter = new CurrencyConverter(dollarPrice, quantity);

		System.out.printf("Amount to be paid in reais = %.2f", converter.getEmReais());

		sc.close();
	}

}
