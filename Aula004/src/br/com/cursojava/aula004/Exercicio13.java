package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[10];
		String maiorNome = "";

		for (int i = 0; i < 10; i++) {
			System.out.printf("Insira o %dº nome:\n", i + 1);
			nomes[i] = teclado.nextLine();
			if (nomes[i].length() > maiorNome.length()) {

				maiorNome = nomes[i];

			}
		}
		System.out.printf("Maior nome: %s\n", maiorNome);

		teclado.close();

	}

}
