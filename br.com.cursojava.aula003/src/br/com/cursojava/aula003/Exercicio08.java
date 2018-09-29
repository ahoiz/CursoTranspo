package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		String frase = teclado.nextLine();
		String fraseTrimmed = frase.trim();
		String[] palavras = fraseTrimmed.split(" ");
		System.out.println(palavras[0]);
		teclado.close();
	}

}
