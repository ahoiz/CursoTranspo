package br.com.cursojava.aula010.contato;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula010.utils.JPAUtil;

public class RepositorioContato {

	public List<Contato> buscarTodos() {
		List<Contato> lista = null;
		EntityManager em = JPAUtil.createEntityManager();

		// repare que no select utilizou nome da classe (Contato) e nao da
		// tabela (contatos)
		TypedQuery<Contato> query = em.createQuery("Select c from Contato c", Contato.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}

	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		contato = em.find(Contato.class, id);
		em.close();
		return contato;
	}

	public Contato buscarPorTelefone(String telefone) {
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		// : na query indic que é um parâmetro, setado em seguinda com
		// setParameter
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where c.telefone = :telefone",
				Contato.class);
		query.setParameter("telefone", telefone);
		try {
			contato = query.getSingleResult();
		} catch (Exception e) {
			contato = null;
		}
		return contato;
	}

	public Contato buscarPorNome(String nome) {
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		// : na query indic que é um parâmetro, setado em seguinda com
		// setParameter
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where upper(c.nome) like upper(:nome)",
				Contato.class);
		query.setParameter("nome", "%" + nome + "%");
		try {
			contato = query.getSingleResult();
		} catch (Exception e) {
			contato = null;
		}
		return contato;
	}

	public Contato salvar(Contato contato) {
		if (contato != null) {
			if (contato.getId() == null) {
				return inserir(contato);
			} else {
				return atualizar(contato);
			}
		}
		return contato;
	}

	private Contato inserir(Contato contato) {		
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
		return contato;

	}

	private Contato atualizar(Contato contato) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		contato = em.merge(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}
	
	public void remover(Contato contato) {
		EntityManager em = JPAUtil.createEntityManager();		
		em.getTransaction().begin();
		em.remove(em.merge(contato));
		em.getTransaction().commit();
		em.close();		
		
	}

	// método main para testes
	public static void main(String[] args) {

		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorNome("silva");
		System.out.println(contato);
		
		repositorio.remover(contato);

		// TESTE buscarTodos
		// List<Contato> todos = repositorio.buscarTodos();
		// for (Contato contato : todos) {
		// System.out.println(contato);
		// }

		// TESTE buscarPorId
		// Contato contato = repositorio.buscarPorId(1);
		// System.out.println(contato);

		// Contato contato = new Contato();
		// contato.setNome("Bragrinho");
		// contato.setEmail("b@teste.com");
		// contato.setTelefone("4799998888");
		// EntityManager em = JPAUtil.createEntityManager();
		// Contato contato = em.find(Contato.class, 1); // 1 é o id
		// em.close(); // desattacha o objeto
		// em = JPAUtil.createEntityManager();
		// em.getTransaction().begin();
		// contato.setNome("Bagrinho da Silva Brasil");
		// contato = em.merge(contato);
		// em.persist(contato);
		// em.getTransaction().commit();
		// em.close();
		// JPAUtil.closeEmf();

	}

}
