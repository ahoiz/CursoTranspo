package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploConversaoDados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		String textoIdade = teclado.nextLine();
		System.out.printf("Sua idade atual é %s, sua idade daqui 20 anos será ...\n", textoIdade);
		int idade = Integer.parseInt(textoIdade);
		// int idade = Integer.parseInt(teclado.nextLine());
		int idadeFutura = idade + 20;
		String textoIdadeFutura = Integer.toString(idadeFutura);
		System.out.printf("Sua idade atual é %s, sua idade daqui 20 anos será %s.\n", textoIdade, textoIdadeFutura);

		teclado.close();

	}

}
