package br.com.cursojava.ex01;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	List<Produto> produtos = new ArrayList<Produto>();

	public void criarProduto(String nome, double preco, String descricao) {

		Produto novo = new Produto(nome, preco, descricao);
		produtos.add(novo);

	}

	public void removerProduto(Produto nome) {
		produtos.remove(produtos.indexOf(nome));
	}

	public Produto getProduto(String nome) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(nome)) {
				return produtos.get(i);
			}

		}
		return null;

	}

	public boolean contemProduto(String nome) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}

	public void listarProdutos() {

		if (produtos.size() > 0) {
			System.out.println(produtos);
		} else {
			System.out.println("Não existem produtos cadastrados");
		}

	}

	public void removerTodos() {

		produtos.removeAll(produtos);

	}

}
