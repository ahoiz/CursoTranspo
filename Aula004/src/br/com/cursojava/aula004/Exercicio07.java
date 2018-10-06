package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int primeiroNum;
		int segundoNum;

		System.out.println("Informe um número");
		primeiroNum = teclado.nextInt();

		do {
			System.out.println("Informe um número maior que o anterior");
			segundoNum = teclado.nextInt();
			if (segundoNum <= primeiroNum) {
				System.out.println("Número inválido\n");
			}
		} while (segundoNum <= primeiroNum);
		
		System.out.printf("Números entre %d e %d:\n", primeiroNum, segundoNum);
		for (int i = primeiroNum + 1; i < segundoNum; i++) {
			
			System.out.print(i + " ");
		}
		teclado.close();

	}

}
