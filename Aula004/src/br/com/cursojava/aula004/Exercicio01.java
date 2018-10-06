package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int idade;

		do {

			System.out.println("Informe sua idade");
			idade = teclado.nextInt();

			/*
			 * if (idade >= 0) {
			 * System.out.printf("A idade informada foi %d anos.\n", idade);
			 * break; } else {
			 * 
			 * System.out.println("Idade inválida\n");
			 * 
			 * }
			 * 
			 * } while (true);
			 */

			if (idade < 0) {
				System.out.println("Idade inválida!.");
			}
		} while (idade < 0);
		
		System.out.printf("Sua idade é %d!.\n", idade);

		teclado.close();

	}

}
