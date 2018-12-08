package br.com.cursojava.aula010.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.cursojava.aula010.produto.Produto;
import br.com.cursojava.aula010.utils.JPAUtil;

public class RepositorioProduto {

	public Produto inserir(Produto produto) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}

	public Produto salvar(Produto produto) {
		if (produto != null) {
			if (produto.getId() == null) {
				return inserir(produto);
			} else {
				return atualizar(produto);
			}
		}
		return produto;
	}

	public long contar() {
		long qtde = 0;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("Select COUNT p from Produto p", Produto.class);
		qtde = query.getFirstResult();
		em.close();
		return qtde;

	}

	public Produto atualizar(Produto produto) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		produto = em.merge(produto);
		em.getTransaction().commit();
		em.close();
		return produto;

	}

	public void remover(Produto produto) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(produto));
		em.getTransaction().commit();
		em.close();
	}

	public void removerPorId(Integer id) {
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, id);
		em.getTransaction().begin();
		em.remove(em.merge(produto));
		em.getTransaction().commit();
		em.close();
	}

	public List<Produto> buscarTodos() {
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("Select p from Produto p", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}

	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}

	public Produto buscarPorNome(String nome) {
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("select p from Produto p where upper(p.nome) like upper(:nome)",
				Produto.class);
		query.setParameter("nome", "%" + nome + "%");
		try {
			produto = query.getSingleResult();
		} catch (Exception e) {
			produto = null;
		}
		return produto;
	}

	public List<Produto> buscarPorFaixaPreco(Double precoMax, Double precoMin) {
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em
				.createQuery("Select p from Produto p WHERE p.preco BETWEEN :precoMax AND :precoMin", Produto.class);
		query.setParameter("precoMax", precoMax);
		query.setParameter("precoMin", precoMin);
		lista = query.getResultList();
		em.close();
		return lista;

	}

	public static void main(String[] args) {

		RepositorioProduto repositorio = new RepositorioProduto();

		// System.out.println(repositorio.buscarPorId(4));

		// Produto produto = new Produto();
		// produto.setNome("Prod1");
		// produto.setPreco(1.23);
		//
		// Produto produto2 = new Produto();
		// produto2.setNome("Prod2");
		// produto2.setPreco(10.23);
		//
		// Produto produto3 = new Produto();
		// produto3.setNome("Prod3");
		// produto3.setPreco(5.23);
		//
		// Produto produto4 = new Produto();
		// produto4.setNome("Prod4");
		// produto4.setPreco(8.23);
		//
		// repositorio.inserir(produto);
		// repositorio.inserir(produto2);
		// repositorio.inserir(produto3);
		// repositorio.inserir(produto4);

		// teste remover
		// repositorio.removerPorId(2);
		// repositorio.removerPorId(6);

		// List<Produto> todos = repositorio.buscarPorFaixaPreco(1.0, 6.0);
		// for (Produto prod : todos) {
		// System.out.println(prod);
		// }
	}

}
