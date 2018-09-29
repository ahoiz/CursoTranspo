package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número:");
		double numero = teclado.nextDouble();
		double numQuintaPot = Math.pow(numero, 5);
		System.out.println(numQuintaPot);
		teclado.close();

	}

}
