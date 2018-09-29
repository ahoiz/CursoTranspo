package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário:");
		double salario = Double.parseDouble(teclado.nextLine());
		String isento = salario <= 1800.00 ? " é" : " não é";
		System.out.printf("Você%s isento de Imposto de Renda!\n", isento);
		teclado.close();

	}

}
