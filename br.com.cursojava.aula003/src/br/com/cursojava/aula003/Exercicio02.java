package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu sal�rio:");
		double salario = Double.parseDouble(teclado.nextLine());
		String isento = salario <= 1800.00 ? " �" : " n�o �";
		System.out.printf("Voc�%s isento de Imposto de Renda!\n", isento);
		teclado.close();

	}

}
