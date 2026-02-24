package exercicio_enum_composicao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exercicio_enum_composicao.entities.Client;
import exercicio_enum_composicao.entities.Order;
import exercicio_enum_composicao.entities.OrderItem;
import exercicio_enum_composicao.entities.Product;
import exercicio_enum_composicao.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter cliente data: ");
		System.out.print("\nName: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		String birthString = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birthString, formatter);

		Client client = new Client(name, email, birthDate);

		System.out.println();
		System.out.println("Enter order Data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(LocalDate.now(), status, client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			System.out.println("Enter #" + (i + 1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();

			Product produto = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, produto);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}

}
