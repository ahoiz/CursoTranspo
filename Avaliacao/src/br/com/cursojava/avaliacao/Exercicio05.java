package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int nota = 1;
		double menorNota = 11;
		double maiorNota = -1;

		while (nota <= 10) {

			System.out.printf("Digite a %dª nota:", nota);
			double notaValor = teclado.nextDouble();

			if (notaValor < menorNota) {

				menorNota = notaValor;

			}

			if (notaValor > maiorNota) {

				maiorNota = notaValor;

			}

			nota++;

		}

		System.out.printf("A menor nota foi %.2f e a maior nota foi %.2f.\n", menorNota, maiorNota);

		teclado.close();

	}

}
