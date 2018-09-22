package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento:");
		int anoDeNascimento = teclado.nextInt();

		if (anoDeNascimento % 400 == 0) {

			System.out.printf("O ano %d trata-se de ano bissexto\n", anoDeNascimento);

		} else if (anoDeNascimento % 4 == 0 && anoDeNascimento % 100 != 0) {

			System.out.printf("O ano %d trata-se de ano bissexto\n", anoDeNascimento);

		} else {

			System.out.printf("O ano %d não é bissexto!\n", anoDeNascimento);

		}

		teclado.close();

	}

}
