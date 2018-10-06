package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.printf("Insira o %dº nome:\n", i + 1);
			nomes[4 - i] = teclado.nextLine();
		}

		for (String listarNomes : nomes) {
			System.out.println(listarNomes);

		}
		teclado.close();
	}

}
