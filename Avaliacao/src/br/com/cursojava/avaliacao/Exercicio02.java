package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		int idade = teclado.nextInt();
		int idadeFutura = idade + 20;
		System.out.printf("Sua idade será %d daqui a 20 anos.\n", idadeFutura);
		teclado.close();

	}

}
