package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		String[] nomes = new String[10];
		double mediaNotas = 0;
		String[] nomeENota;

		for (int i = 0; i < 10; i++) {

			System.out.printf("Insira o nome e a nota do %dº aluno, respectivamente, separados por espaço:\n", i + 1);
			nomeENota = teclado.nextLine().split(" ");
			nomes[i] = nomeENota[0];
			notas[i] = Double.parseDouble(nomeENota[1]);
			mediaNotas += notas[i] / 10;

		}

		System.out.printf("Relação de alunos com notas maiores que a média (%.2f):\n", mediaNotas);

		for (int i = 0; i < 10; i++) {

			if (notas[i] > mediaNotas) {

				System.out.printf("%s Nota: %.2f\n", nomes[i], notas[i]);

			}

		}
		teclado.close();

	}

}
