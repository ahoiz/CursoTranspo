package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine();
		System.out.println(palavra.toUpperCase().trim());
		System.out.println(palavra.toLowerCase().trim());
		teclado.close();

	}

}
