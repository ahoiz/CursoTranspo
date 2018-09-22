package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua altura:");
		double altura = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe seu peso:");
		double peso = Double.parseDouble(teclado.nextLine());

		double imc = peso / Math.pow(altura, 2);

		System.out.printf("Seu IMC é %.2f \n", imc);

		teclado.close();

	}

}
