package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int fatorial = 1;
		int numero;

		do {
			System.out.println("Informe um número entre 1 e 20");
			numero = teclado.nextInt();
			if (numero < 1 || numero > 20) {
				System.out.println("Número fora do range!\n");
			}

		} while (numero < 1 || numero > 20);

		for (int i = numero; i > 0; i--) {

			fatorial *= i;

		}
		System.out.println(fatorial);
		teclado.close();

	}

}
