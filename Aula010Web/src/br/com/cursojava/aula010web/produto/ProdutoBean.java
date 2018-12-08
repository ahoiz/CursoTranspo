package br.com.cursojava.aula010web.produto;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutoBean {
	
	private FacadeProduto facade = new FacadeProduto();
	private List<Produto> produtos = new ArrayList<>();
	
	public List<Produto> getProduto() {
		if(produtos == null || produtos.isEmpty()) {
			produtos = facade.carregarProdutos();
		}
		return produtos;
	}
	
	

}
