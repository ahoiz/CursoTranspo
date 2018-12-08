package br.com.cursojava.aula010web.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAUtil {

	public static EntityManagerFactory emf;

	public static EntityManagerFactory getEmf() {
		if (emf == null || !emf.isOpen()) {
			emf = Persistence.createEntityManagerFactory("aula010");
		}
		return emf;
	}

	public static EntityManager createEntityManager() {
		return getEmf().createEntityManager();
	}

	public static void closeEmf() {
		if (emf != null && emf.isOpen()) {
			emf.close();
		}
	}
	
	// main para testar se funcionou
	public static void main(String[] args) {
		EntityManager em = createEntityManager();
		Query query = em.createNativeQuery("select count(*) from contatos");
		Object result = query.getSingleResult();
		System.out.println(result);
		em.close();
		closeEmf();
		
	}

}
