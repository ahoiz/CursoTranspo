package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a 1ª nota:");
		double notaUm = Double.parseDouble(teclado.nextLine());

		System.out.println("Digite a 2ª nota:");
		double notaDois = Double.parseDouble(teclado.nextLine());

		System.out.println("Digite a 3ª nota:");
		double notaTres = Double.parseDouble(teclado.nextLine());

		double media = (notaUm + notaDois + notaTres) / 3;

		if (media >= 7) {

			System.out.println("Média: " + media + " Aprovado");

		} else {

			System.out.println("Média: " + media + " Reprovado");

		}

		teclado.close();

	}

}
