package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double maiorNota = -1;
		double menorNota = 11;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Insira a %dª nota:\n", i + 1);
			notas[i] = Double.parseDouble(teclado.nextLine());
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
			if (notas[i] < menorNota) {
				menorNota = notas[i];
			}
		}

		for (double listarNotas : notas) {
			System.out.println(listarNotas);
		}
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);

		teclado.close();

	}

}
