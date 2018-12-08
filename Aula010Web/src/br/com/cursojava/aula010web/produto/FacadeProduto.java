package br.com.cursojava.aula010web.produto;

import java.util.List;

public class FacadeProduto {
	
	private RepositorioProduto repositorio = new RepositorioProduto();

	public List<Produto> carregarProdutos() {
		return repositorio.buscarTodos();
	}

}
