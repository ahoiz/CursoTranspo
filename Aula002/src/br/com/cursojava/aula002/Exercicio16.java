package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		String opcao1 = "1 - Depositar";
		String opcao2 = "2 - Sacar";
		String opcao3 = "3 - Verificar Saldo";

		Scanner teclado = new Scanner(System.in);
		System.out.printf("%s \n%s \n%s \n", opcao1, opcao2, opcao3);

		int opcaoEscolhida = teclado.nextInt();

		if (opcaoEscolhida == 1) {

			System.out.println("Voc� Escolheu a op��o 'Depositar'.");

		} else if (opcaoEscolhida == 2) {

			System.out.println("Voc� Escolheu a op��o 'Sacar'.");

		} else if (opcaoEscolhida == 3) {

			System.out.println("Voc� Escolheu a op��o 'Verificar Saldo'.");

		} else {
			System.out.println("Op��o inv�lida.");
		}

		teclado.close();

	}

}
