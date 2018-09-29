package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int nota = 1;
		double menorNota = 11;

		while (nota < 11) {

			System.out.printf("Digite a %dª nota:", nota);
			double notaValor = teclado.nextDouble();

			if (notaValor < menorNota) {

				menorNota = notaValor;

			}

			nota++;

		}

		System.out.printf("A menor nota foi %.2f.\n", menorNota);

		teclado.close();

	}

}
