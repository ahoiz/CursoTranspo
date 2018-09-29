package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome = teclado.nextLine();
		int qtdeChar = nome.length();
		System.out.printf("Seu nome tem %d caracters\n", qtdeChar);
		teclado.close();

	}

}
