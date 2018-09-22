package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a 1ª nota, peso 2:");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 2ª nota, peso 3:");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 3ª nota, peso 5:");
		double nota3 = Double.parseDouble(teclado.nextLine());

		double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);
		System.out.printf("A média do aluno é %.2f.\n", media);

		teclado.close();

	}

}
