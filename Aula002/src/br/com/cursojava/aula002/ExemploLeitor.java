package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {

	public static void main(String[] args) {

		/*
		 * criando uma variável de nome "teclado", tipo Scanner, que aponta para
		 * um objeto. o parâmetro "system.in" monitora a entrada padrão,
		 * geralmente teclado
		 */
		Scanner teclado = new Scanner(System.in);

		/*
		 * utilizando o scanner para ler o input, desaconselha
		 * nextInt/nextDouble/nextFloat pois ignora espaço e quebra de linha
		 * recomenda nextLine e ai converte no tipo desejado
		 */
		System.out.println("Olá, informe seu nome:");
		String nome = teclado.nextLine();

		/*
		 * métodos nextLine(), que inputa texto até o enter e next(), que inputa
		 * até espaço, sempre String
		 */
		System.out.printf("Seu nome é %s.\n", nome);

		/*
		 * método close() para fechar o recurso e liberar memória
		 */
		teclado.close();
	}
}
