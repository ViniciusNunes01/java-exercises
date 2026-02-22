package lista05_introducao_POO.Exercicio01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rectangle width and height");
		double widht = sc.nextDouble();
		double height = sc.nextDouble();

		Rectangle rect = new Rectangle(widht, height);

		System.out.printf("\nAREA = %.2f ", rect.area());
		System.out.printf("\nPERIMETER = %.2f ", rect.perimeter());
		System.out.printf("\nDIAGONAL = %.2f ", rect.diagonal());

		sc.close();
	}

}
