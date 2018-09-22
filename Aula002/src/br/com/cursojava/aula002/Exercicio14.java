package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a idade do atleta:");
		double idade = Double.parseDouble(teclado.nextLine());

		if (idade >= 18) {

			System.out.println("M�dia " + idade + ", Categoria Adulto");

		} else if (idade >= 14) {

			System.out.println("M�dia " + idade + ", Categoria Juvenil");

		} else if (idade >= 12) {

			System.out.println("M�dia " + idade + ", Categoria Infanto Juvenil");

		} else if (idade >= 9) {

			System.out.println("M�dia " + idade + ", Categoria Infantil");

		} else {

			System.out.println("M�dia " + idade + ", Categoria Mirim");

		}

		teclado.close();

	}

}
