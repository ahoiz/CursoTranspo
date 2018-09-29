package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = teclado.nextLine();
		String outra = "";
		int contador = 0;

		while (contador < 4) {
			System.out.println(outra);
			outra += palavra;
			contador++;
		}

		teclado.close();

	}

}
