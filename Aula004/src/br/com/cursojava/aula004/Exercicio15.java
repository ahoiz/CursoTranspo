package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] produtos = new double[10];

		for (int i = 0; i < 10; i++) {

			System.out.printf("Insira o valor do %dº produto:\n", i + 1);
			produtos[i] = Double.parseDouble(teclado.nextLine()) * 0.9;

		}

		System.out.println("Valores dos produtos após 10% de desconto:");

		for (double listarProdutos : produtos) {

			System.out.printf("%.2f\n",listarProdutos);

		}

		teclado.close();

	}

}
