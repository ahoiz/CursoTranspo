package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro:");
		int numero = Integer.parseInt(teclado.nextLine());

		if (numero % 2 == 0) {

			System.out.println("O n�mero " + numero + " � par");

		} else {

			System.out.println("O n�mero " + numero + " � �mpar");

		}

		teclado.close();

	}

}
