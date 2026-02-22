package lista02_estrutura_condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		if (horaInicial < horaFinal) {
			System.out.printf("O JOGO DUROU %d HORA(S)", horaFinal - horaInicial);
		} else {
			System.out.printf("O JOGO DUROU %d HORAS(S)", 24 - horaFinal - horaInicial);
		}
		
		sc.close();
	}

}
