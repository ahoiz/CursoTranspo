package br.com.cursojava.avaliacao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe uma palavra:");
		String palavra = teclado.nextLine();
		String palavraInversa = "";
		int counter = palavra.length();

		while (counter > 0) {

			palavraInversa += palavra.substring(counter - 1, counter);
			counter--;
		}

		System.out.println(palavraInversa);
		teclado.close();

	}

}
