package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a 1� nota:");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 2� nota:");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 3� nota:");
		double nota3 = Double.parseDouble(teclado.nextLine());

		double media = (nota1 + nota2 + nota3) / 3;
		String textoMedia = Double.toString(media);
		System.out.printf("A m�dia do aluno � %s.\n", textoMedia);

		teclado.close();

	}
}
