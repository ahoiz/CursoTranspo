package br.com.cursojava.ex01;

import java.util.Scanner;

public class Cadastro {

	Scanner teclado = new Scanner(System.in);
	Controller controller = new Controller();

	public void mostrarMenu() {
		System.out.println("####### MENU PRINCPAL #######");
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produtos");
			System.out.println("4 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != 4);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			removerProdutos();
			break;
		case 4:
			sair();
			break;
		default:
			mostrarOpcaoInvalida();
		}

	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("####### CADASTRAR NOVO PRODUTO #######");
		System.out.println("Informe o nome do produto:");
		String nome = teclado.nextLine();
		System.out.println("Informe o preço do produto:");
		double preco = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a descrição do produto:");
		String descricao = teclado.nextLine();
		controller.criarProduto(nome, preco, descricao);
		System.out.println("##############");
	}

	private void listarProdutos() {
		System.out.println("####### LISTAR PRODUTOS #######");
		controller.listarProdutos();
		System.out.println("##############");

	}

	private void removerProdutos() {
		String subOpcao = "";
		do {
			System.out.println("a - Remover Produto");
			System.out.println("b - Remover todos os produtos");
			System.out.println("c - Sair");
			subOpcao = teclado.nextLine().toLowerCase();
			tratarSubOpcaoRemover(subOpcao, teclado);
		} while (subOpcao != "c");

	}

	private void tratarSubOpcaoRemover(String subOpcao, Scanner teclado2) {
		switch (subOpcao) {
		case "a":
			removerProduto();
			break;
		case "b":
			removerTodosProdutos();
			break;
		case "c":
			sairRemover();
			break;
		default:
			mostrarOpcaoInvalida();
		}

	}

	private void sairRemover() {
		System.out.println("Saindo do menu");
		mostrarMenu();
	}

	private void removerTodosProdutos() {		
		controller.removerTodos();
		System.out.println("Todos os produtos removidos");

	}

	private void removerProduto() {
		System.out.println("Informe o produto a ser removido:");
		String nome = teclado.nextLine();
		Produto produto = controller.getProduto(nome);		
		if (controller.contemProduto(nome)) {
			controller.removerProduto(produto);
			System.out.println("Produto \"" + nome + "\" removido com sucesso!!");
		} else {
			System.out.println("Produto \"" + nome + "\" não encontrado!");
		}

	}

	private void mostrarOpcaoInvalida() {
		System.out.println("Você digitou uma opção inválida.");
	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso Sistema.");
	}

}
