package exercicio_classe_abstrata.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicio_classe_abstrata.entities.Pessoa;
import exercicio_classe_abstrata.entities.PessoaFisica;
import exercicio_classe_abstrata.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double healthCare = sc.nextDouble();
				pessoas.add(new PessoaFisica(name, anualIncome, healthCare));

			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				pessoas.add(new PessoaJuridica(name, anualIncome, numberEmployees));
			}
		}

		System.out.println();
		Double totalTaxes = 0.0;
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
			totalTaxes += pessoa.imposto();
		}
		System.out.printf("TOTAL TAXES: %.2f", totalTaxes);

		sc.close();
	}

}
