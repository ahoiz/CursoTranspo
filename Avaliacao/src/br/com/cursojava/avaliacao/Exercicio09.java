package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do produto:");
		double valorOriginal = teclado.nextDouble();
		double percDesconto = 0;
		double valorDesconto = 0;
		double valorFinal = 0;

		if (valorOriginal <= 1800) {

			percDesconto = 11;

		} else if (valorOriginal <= 2500) {

			percDesconto = 15;

		} else {

			percDesconto = 18;

		}

		valorDesconto = valorOriginal * percDesconto / 100;
		valorFinal = valorOriginal - valorDesconto;

		System.out.printf("O desconto dado foi de R$%.2f (%.2f%%). Valor líquido é R$%.2f.\n", valorDesconto,
				percDesconto, valorFinal);

		teclado.close();

	}

}
