package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int codigo = 0;

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			codigo = Integer.parseInt(teclado.nextLine());
			switch (codigo) {
			case 1:
				System.out.println("Escolheu a opção Cadastrar Produto\n");
				break;
			case 2:
				System.out.println("Escolheu a opção Listar Produtos\n");
				break;
			case 3:
				System.out.println("Escolheu a opção Remover Produto\n");
				break;
			case 4:
				System.out.println("Executando Logoff\n");
				break;
			default:
				System.out.println("Opção inválida\n");
			}
		} while (codigo != 4);

		teclado.close();

	}

}
