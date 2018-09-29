package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome = teclado.nextLine();
		int qtdeLetras = nome.trim().length();
		if (qtdeLetras < 3) {

			System.out.println("Nome inválido");

		} else {

			System.out.printf("Bem vindo(a) %s.\n", nome.trim());

		}
		teclado.close();

	}

}
