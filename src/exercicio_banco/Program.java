package exercicio_banco;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double initialDeposit = 0;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter account name: ");
		String name = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char yesOrNo = sc.next().charAt(0);
		if (yesOrNo == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
		}

		Account account = new Account(number, name, initialDeposit);

		System.out.println("\nAccount data:");
		System.out.print(account);

		System.out.println();
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.print(account);

		System.out.println();
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.print(account);

		sc.close();
	}
}
