package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine();
		
		if (palavra.contains("l") || palavra.contains("L")) {
			System.out.println("Cont�m a letra L.");
		} else {
			System.out.println("N�o cont�m a letra L.");
		}
		teclado.close();

	}

}
