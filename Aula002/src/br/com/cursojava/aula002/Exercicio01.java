package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a 1ª nota:");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 2ª nota:");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a 3ª nota:");
		double nota3 = Double.parseDouble(teclado.nextLine());

		double media = (nota1 + nota2 + nota3) / 3;
		String textoMedia = Double.toString(media);
		System.out.printf("A média do aluno é %s.\n", textoMedia);

		teclado.close();

	}
}
