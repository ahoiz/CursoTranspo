package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();
		int qtdeLetra = nome.length();

		if (qtdeLetra >= 3) {

			System.out.println("O nome " + nome + " é válido!");

		} else {

			System.out.println("Nome inválido!!!!");

		}

		teclado.close();

	}

}
