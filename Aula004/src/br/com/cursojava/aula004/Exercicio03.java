package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe uma palavra: ");
		String palavra = teclado.nextLine();
		String palavraInversa = "";
		int contador = palavra.length() - 1;

		if (contador > -1) {
			do {

				palavraInversa += palavra.charAt(contador);
				contador--;

			} while (contador >= 0);
		}
		System.out.println(palavraInversa);
		teclado.close();

	}

}
