package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número:");
		int numero = teclado.nextInt();
		if (numero % 2 == 0) {

			System.out.println("Este número é par");

		} else {

			System.out.println("Este número é ímpar");

		}

		teclado.close();

	}

}
