package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nome = "";
		String parar = "";
		int qtdeChar = 0;

		while (true) {
			System.out.println("Digite seu nome de usuário:");
			nome = teclado.nextLine();
			if (nome.equals(parar)) {
				break;
			}
			qtdeChar = nome.length();
			System.out.printf("Seu nome de usuário é: %s\nContém %d caracteres.\n\n", nome, qtdeChar);

		}

		System.out.println("Programa Encerrado");

		teclado.close();

	}

}
