package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe uma palavra:");
		String palavra = teclado.nextLine().toUpperCase();
		String print = "";

		for (int i = 0; i < palavra.length(); i++) {
			print += palavra.charAt(i);
			System.out.println(print);
		}

		teclado.close();

	}

}
