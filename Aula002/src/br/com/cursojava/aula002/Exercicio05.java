package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		int idade = Integer.parseInt(teclado.nextLine());

		int idadeEmDias = idade * 365;

		System.out.printf("Sua idade em dias é %d \n", idadeEmDias);

		teclado.close();
	}

}
