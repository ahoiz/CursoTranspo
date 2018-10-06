package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double mediaNotas = 0;

		for (int i = 0; i < 10; i++) {

			System.out.printf("Insira a %dª nota:\n", i + 1);
			notas[i] = Double.parseDouble(teclado.nextLine());
			mediaNotas += notas[i] / 10;

		}

		System.out.printf("Relação de notas e se estão abaixo da média (%.2f):\n", mediaNotas);

		for (double listarNotas : notas) {
			if (listarNotas <= mediaNotas) {
				System.out.println(listarNotas + " <- Abaixo da média!");
			} else {
				System.out.println(listarNotas);
			}
		}

		teclado.close();

	}

}
