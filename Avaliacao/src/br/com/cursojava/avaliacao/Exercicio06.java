package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		int idade = teclado.nextInt();

		if (idade <= 12) {

			System.out.println("Criança");

		} else if (idade <= 17) {

			System.out.println("Adolescente");

		} else if (idade <= 24) {

			System.out.println("Jovem");

		} else if (idade <= 59) {

			System.out.println("Adulto");

		} else {

			System.out.println("Idoso");

		}

		teclado.close();

	}

}
