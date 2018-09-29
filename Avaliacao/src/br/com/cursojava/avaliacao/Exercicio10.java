package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		int idade = teclado.nextInt();
		System.out.println("Informe sua altura:");
		double altura = teclado.nextDouble();
		System.out.println("Informe seu peso:");
		double peso = teclado.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 17) {

			System.out.printf("");

		} else if (imc <= 18.49) {

			System.out.printf("Abaixo do peso");

		} else if (imc <= 24.99) {

			System.out.printf("Peso normal");

		} else if (imc <= 29.99) {

			System.out.printf("Acima do peso");

		} else if (imc <= 34.99) {

			System.out.printf("Obesidade nivel I.");

		} else if (imc <= 39.99) {

			System.out.printf("Obesidade nivel II.");

		} else {

			System.out.printf("Obesidade mórbida");

		}

		teclado.close();

	}

}
