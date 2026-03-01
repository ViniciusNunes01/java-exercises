package exercicio_exceptions.application;

import java.util.Scanner;

import exercicio_exceptions.model.entities.Account;
import exercicio_exceptions.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double withdrawAmount = sc.nextDouble();
			account.withdraw(withdrawAmount);
			

			sc.close();
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
	}
}
