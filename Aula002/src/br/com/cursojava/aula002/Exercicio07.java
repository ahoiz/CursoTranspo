package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe qualquer numero:");
		double numero = Double.parseDouble(teclado.nextLine());
		double numeroElevado2 = Math.pow(numero, 2);
		
		System.out.printf("%.1f elevado ao quadrado é %.1f.\n", numero, numeroElevado2);

		teclado.close();

	}

}
