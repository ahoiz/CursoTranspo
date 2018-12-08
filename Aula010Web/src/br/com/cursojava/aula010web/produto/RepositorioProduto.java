package br.com.cursojava.aula010web.produto;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.cursojava.aula010web.utils.JPAUtil;

public class RepositorioProduto {
	
	public List<Produto> buscarTodos() {
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("Select p from Produto p", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
		
	}
	public Produto buscarPorId (Integer id) {
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}
	
	public Produto salvar() {
		
		return null;
		
	}
	
	public Produto remover() {
		return null;
	}

}
