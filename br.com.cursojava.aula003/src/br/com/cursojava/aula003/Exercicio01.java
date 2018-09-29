package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		int idade = teclado.nextInt();
		String aptoParaVotar = idade >= 16 ? "já" : "não";
		System.out.printf("Você %s pode votar!\n", aptoParaVotar);
		teclado.close();

	}

}
