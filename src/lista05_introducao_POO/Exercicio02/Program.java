package lista05_introducao_POO.Exercicio02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();

		Employee emp = new Employee(name, grossSalary, tax);

		System.out.println();
		System.out.println(emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);

		sc.close();
	}

}
