package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digita a 1ª nota:");
		double nota1 = Double.parseDouble(teclado.nextLine());

		System.out.println("Digita a 2ª nota:");
		double nota2 = Double.parseDouble(teclado.nextLine());

		System.out.println("Digita a 3ª nota:");
		double nota3 = Double.parseDouble(teclado.nextLine());

		System.out.println("Digita a 4ª nota:");
		double nota4 = Double.parseDouble(teclado.nextLine());

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 9) {

			System.out.println("Média " + media + ", Conceito A");

		} else if (media >= 8) {

			System.out.println("Média " + media + ", Conceito B");

		} else if (media >= 6) {

			System.out.println("Média " + media + ", Conceito C");

		} else if (media >= 5) {

			System.out.println("Média " + media + ", Conceito D");

		} else {

			System.out.println("Média " + media + ", Insuficiente");

		}
		
		teclado.close();

	}

}
