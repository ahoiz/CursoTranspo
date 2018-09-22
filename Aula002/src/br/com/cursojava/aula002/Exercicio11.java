package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		double idade = Double.parseDouble(teclado.nextLine());

		if (idade >= 18) {

			System.out.println("Bora dirigir piá!!");

		} else {

			System.out.println("Muito novo pra dirigir...");

		}

		teclado.close();

	}

}
