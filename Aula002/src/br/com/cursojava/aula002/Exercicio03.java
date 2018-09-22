package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do produto:");
		double valor = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o % de desconto aplicado:");
		double desconto = Double.parseDouble(teclado.nextLine());

		double valor2 = valor * (1 - (desconto / 100));

		System.out.printf("O valor do produto é de %.2f após desconto de %.2f %%\n", valor2, desconto);

		teclado.close();

	}

}
