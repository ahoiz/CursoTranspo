package br.com.cursojava.avaliacao;

public class Exercicio08 {

	public static void main(String[] args) {

		int numero = 1;
		int divisor = 0;
		int modulo = 0;

		while (numero <= 50) {

			divisor = 50;
			modulo = 0;
			while (divisor >= 1) {

				if (numero % divisor == 0) {
					modulo++;
				}
				divisor--;

			}

			if (modulo == 2) {

				System.out.printf("O número %d é primo!\n", numero);
			}

			numero++;

		}

	}

}
