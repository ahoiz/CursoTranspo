package br.com.cursojava.aula009.produto;

import java.util.List;
import java.util.Scanner;

public class RepositorioProdutoTeste {

	public static void main(String[] args) {

		testInserir();
		testListarTodos();
		testListarPorId();
		testAtualizar();
		testContar();
		testRemover();
		testContar();
		testBuscarPorFaixaPreco();
	}

	private static void testInserir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira o nome do produto:");
		String nome = teclado.nextLine();
		System.out.println("Insira o nome do produto:");
		String descricao = teclado.nextLine();
		System.out.println("Insira o nome do produto:");
		Double preco = Double.parseDouble(teclado.nextLine());
		Produto produto = new Produto(null, nome, descricao, preco);
		RepositorioProduto repositorio = new RepositorioProduto();

		repositorio.inserir(produto);
		System.out.println(produto);

	}

	private static void testListarTodos() {
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.buscarTodos();
		System.out.println("=============================");
		System.out.println("LISTAR TODOS");
		System.out.println("=============================");
		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}

	}

	private static void testListarPorId() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o id do produto desejado:");
		Integer id = Integer.parseInt(teclado.nextLine());
		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(id);
		System.out.println(produto);

	}

	private static void testAtualizar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe id do produto a ser alterado");
		Integer id = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe novo nome do produto");
		String nome = teclado.nextLine();
		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(id);
		produto.setNome(nome);
		repositorio.atualizar(produto);
		produto = repositorio.buscarPorId(1);
		System.out.println(produto);

	}

	private static void testRemover() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe id do produto a ser removido");
		Integer id = Integer.parseInt(teclado.nextLine());
		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(id);
		repositorio.remover(id);
		produto = repositorio.buscarPorId(id);
		System.out.println(produto);

	}

	private static void testContar() {
		RepositorioProduto repositorio = new RepositorioProduto();
		long quantidade = repositorio.contar();
		System.out.println(quantidade);

	}

	private static void testBuscarPorFaixaPreco() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor min dos produtos:");
		Double max = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o valor max dos produtos:");
		Double min = Double.parseDouble(teclado.nextLine());
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> produtos = repositorio.buscarPorFaixaPreco(max, min);
		for (Produto produto : produtos) {
			System.out.println(produto);
		}

	}

}
