package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		String frase = teclado.nextLine().trim();
		String fraseMetadeLower = frase.substring(0, frase.length() / 2 + 1).toLowerCase();
		String fraseMetadeUpper = frase.substring(frase.length() / 2 + 1).toUpperCase();
		String fraseFormatada = fraseMetadeLower + fraseMetadeUpper;
		System.out.println(fraseFormatada);

		teclado.close();

	}

}
