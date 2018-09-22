package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {

	public static void main(String[] args) {

		/*
		 * criando uma vari�vel de nome "teclado", tipo Scanner, que aponta para
		 * um objeto. o par�metro "system.in" monitora a entrada padr�o,
		 * geralmente teclado
		 */
		Scanner teclado = new Scanner(System.in);

		/*
		 * utilizando o scanner para ler o input, desaconselha
		 * nextInt/nextDouble/nextFloat pois ignora espa�o e quebra de linha
		 * recomenda nextLine e ai converte no tipo desejado
		 */
		System.out.println("Ol�, informe seu nome:");
		String nome = teclado.nextLine();

		/*
		 * m�todos nextLine(), que inputa texto at� o enter e next(), que inputa
		 * at� espa�o, sempre String
		 */
		System.out.printf("Seu nome � %s.\n", nome);

		/*
		 * m�todo close() para fechar o recurso e liberar mem�ria
		 */
		teclado.close();
	}
}
