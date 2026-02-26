package exercicio_heranca_polimorfismo.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicio_heranca_polimorfismo.entities.ImportedProduct;
import exercicio_heranca_polimorfismo.entities.Product;
import exercicio_heranca_polimorfismo.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		sc.nextLine();

		List<Product> products = new ArrayList<Product>();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data: ");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (option == 'i') {

				sc.nextLine();
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();

				Product importedProduct = new ImportedProduct(name, price, customsFee);
				products.add(importedProduct);

			} else if (option == 'u') {

				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.nextLine();

				LocalDate date = LocalDate.parse(manufactureDate, formatter);

				Product usedProduct = new UsedProduct(name, price, date);
				products.add(usedProduct);

			} else {

				Product product = new Product(name, price);
				products.add(product);

			}
		}

		System.out.println();
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}
}
