package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int qtdeNotas = 1;
		double somaNotas = 0;
		double notaValor = 0;

		while (qtdeNotas <= 20) {

			System.out.printf("Digite a %dª nota:", qtdeNotas);
			notaValor = teclado.nextDouble();
			somaNotas += notaValor;
			qtdeNotas++;

		}

		double media = somaNotas / 20;

		System.out.printf("A média das notas é: %.2f ", media);
		teclado.close();

	}

}
