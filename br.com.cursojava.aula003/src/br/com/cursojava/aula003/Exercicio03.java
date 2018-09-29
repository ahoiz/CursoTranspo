package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println(
				"Selecione uma opção:\n1 - Cadastrar Produto\n2 - Listar Produtos\n3 - Pesquisar Produtos\n4 - Remover Produto\n5 - Sair");
		int opcao = Integer.parseInt(teclado.nextLine());
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção Cadastrar Produto.");
			break;
		case 2:
			System.out.println("Você escolheu a opção Listar Produtos.");
			break;
		case 3:
			System.out.println("Você escolheu a opção Pesquisar Produtos.");
			break;
		case 4:
			System.out.println("Você escolheu a opção Remover Produto.");
			break;
		case 5:
			System.out.println("Obrigado por utilizar nossos terminais de atendimento!");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		teclado.close();

	}

}
