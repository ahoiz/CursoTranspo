package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um n�mero:");
		int numero = teclado.nextInt();
		if (numero % 2 == 0) {

			System.out.println("Este n�mero � par");

		} else {

			System.out.println("Este n�mero � �mpar");

		}

		teclado.close();

	}

}
