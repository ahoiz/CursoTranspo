package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a 1ª nota:");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 2ª nota:");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 3ª nota:");
		double nota3 = Double.parseDouble(teclado.nextLine());

		double maior1 = Math.max(nota1, nota2);
		double maior2 = Math.max(maior1, nota3);
		double menor1 = Math.min(nota1, nota2);
		double menor2 = Math.min(menor1, nota3);
		System.out.printf("A maior nota é %.2f e a menor é %.2f.\n", maior2, menor2);

		teclado.close();

	}

}
